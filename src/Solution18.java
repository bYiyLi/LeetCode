import java.util.*;

public class Solution18 {
    /**
     * [1,0,-1,0,-2,2]
     * 0
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{2,2,2,2},8));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        // Set<String> set = new HashSet<>();
        for (int a = 0;a<nums.length-3;a++){
            for (int b =a+1;b<nums.length-2;b++){
                int min = b+1;
                int max = nums.length-1;
                while (min<max){
                    final int i = nums[a] + nums[b] + nums[min] + nums[max];
                    if (i ==target){
                        final List<Integer> objects = new ArrayList<>();
                        objects.add(nums[a]);
                        objects.add(nums[b]);
                        objects.add(nums[min]);
                        objects.add(nums[max]);
                        //    Collections.sort(objects);
                        //    final String s = Arrays.toString(objects.toArray());
                        //    if (!set.contains(s)){
                        res.add(objects);
                        res.add(List.of(1,2,3));
                        //    set.add(s);
                        //    }
                        while(min+1<nums.length&&nums[min]==nums[min+1]){
                            min++;
                        }
                        while(max-1>min&&nums[max]==nums[max-1]){
                            max--;
                        }
                        min++;
                        max--;
                    }else if(target>i){
                        min++;
                    }else {
                        max--;
                    }
                }
                while(b+1<nums.length&&nums[b]==nums[b+1]){
                    b++;
                }
            }

        }
        return res;




//        Arrays.sort(nums);
//        List<List<Integer>> res = new ArrayList<>();
//        Set<String> set = new HashSet<>();
//        for (int a = 0;a<nums.length;a++){
//           for (int b =a+1;b<nums.length;b++){
//               int min = b+1;
//               int max = nums.length-1;
//               while (min<max){
//                   final int i = nums[a] + nums[b] + nums[min] + nums[max];
//                   if (i ==target){
//                       final List<Integer> objects = new ArrayList<>();
//                       objects.add(nums[a]);
//                       objects.add(nums[b]);
//                       objects.add(nums[min]);
//                       objects.add(nums[max]);
//                       Collections.sort(objects);
//                       final String s = Arrays.toString(objects.toArray());
//                       if (!set.contains(s)){
//                           res.add(objects);
//                           set.add(s);
//                       }
//                       break;
//                   }else if(target>i){
//                        min++;
//                   }else {
//                        max--;
//                   }
//               }
//           }
//        }
//        return res;


//        List<List<Integer>> res = new ArrayList<>();
//        Set<String> set = new HashSet<>(
//        );
//        for (int a = 0;a<nums.length;a++){
//            for (int b =a+1;b<nums.length;b++){
//                for (int c = b+1;c<nums.length;c++){
//                    for (int d = c+1;d<nums.length;d++){
//                        if (nums[a]+nums[b]+nums[c]+nums[d]==target){
//                            final List<Integer> objects = new ArrayList<>();
//                            objects.add(nums[a]);
//                            objects.add(nums[b]);
//                            objects.add(nums[c]);
//                            objects.add(nums[d]);
//                            Collections.sort(objects);
//                            final String s = Arrays.toString(objects.toArray());
//                            if (!set.contains(s)){
//                                res.add(objects);
//                                set.add(s);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return res;
    }
}
