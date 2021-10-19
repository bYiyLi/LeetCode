import java.util.*;

public class Solution31 {
//    public static void main(String[] args) {
//        nextPermutation(new int[]{2,3,1});
//    }
    public static void nextPermutation(int[] nums) {
        int index = nums.length-1;
        while (index>0){
            if (nums[index]>nums[index-1])
            {
                int tem = nums[index];
                nums[index] = nums[index - 1];
                nums[index - 1] = tem;
                Arrays.sort(nums,index,nums.length);
                return ;
            }
            index--;
        }
        Arrays.sort(nums);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestSeq(new int[]{7, 5, 9, 0, 2, 1, 3, 5, 7, 9, 1, 1, 5, 8, 8, 9, 7}, new int[]{1, 5, 9})));
    }
    public static int[] shortestSeq(int[] big, int[] small) {
        Map<Integer, Deque<Integer>> map = new HashMap<>();
        for (int i : small) {
            map.put(i,new ArrayDeque<>());
        }
        for (int i = 0; i < big.length; i++) {
            if (map.containsKey(big[i])){
                map.get(big[i]).addLast(i);
            }
        }
        int res[] = null;
        while (true){
            Deque<Integer> min = null;
            int minI = Integer.MAX_VALUE;
            Deque<Integer> max = null;
            int maxI = Integer.MIN_VALUE;
            for (Deque<Integer> tem : map.values()){
                if (tem.isEmpty()){
                    if (Objects.isNull(res)){
                        return new int[]{};
                    }
                    return res;
                }
                if (minI>tem.getFirst()){
                    minI = tem.getFirst();
                    min = tem;
                }
                if (maxI<tem.getFirst()){
                    maxI = tem.getFirst();
                    max = tem;
                }
            }
            if (Objects.isNull(res)){
                res=new int[]{min.getFirst(),max.getFirst()};
            }
            if (res[1]-res[0]>max.getFirst()-min.getFirst()){
                res[0] = min.getFirst();
                res[1] = max.getFirst();
            }
            min.removeFirst();
        }
//        return res;

//        int [] sIndex = new int[small.length];
//        int tem  = 0;
//        for(int n = 0; n<small.length;n++){
//            for(int j = 0; j<big.length;j++){
//                if(big[j]==small[n]){
//                    sIndex[n]=j;
//                    tem++ ;
//                    break;
//                }
//            }
//        }
//        if(tem != small.length){
//            return new int[]{};
//        }
//        int max = 0;
//        int min = 0;
//        for(int n = 0;n<sIndex.length;n++){
//            if(sIndex[min]>sIndex[n]){
//                min = n;
//            }
//            if(sIndex[max]<sIndex[n]){
//                max = n;
//            }
//        }
//
//        int res [] = new int[]{sIndex[min],sIndex[max]};
//        while(true){
//            a:{
//                int minIndex = 0;
//                for(int n = 0;n<sIndex.length;n++){
//                    if(sIndex[minIndex]>sIndex[n]){
//                        minIndex = n;
//                    }
//                }
//                for(int n = sIndex[minIndex]+1;n<big.length;n++){
//                    if(big[sIndex[minIndex]]==big[n]){
//                        sIndex[minIndex]=n;
//                        max = 0;
//                        min = 0;
//                        for(int j = 0;j<sIndex.length;j++){
//                            if(sIndex[min]>sIndex[j]){
//                                min = j;
//                            }
//                            if(sIndex[max]<sIndex[j]){
//                                max = j;
//                            }
//                        }
//                        if (res[1]-res[0]>sIndex[max]-sIndex[min]){
//                            res[0]=sIndex[min];
//                            res[1]=sIndex[max];
//                        }
//                        break a;
//                    }
//                }
//                return res;
//            }
//        }

    }
}
