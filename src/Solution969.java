import java.util.ArrayList;
import java.util.List;

public class Solution969 {
    public static void main(String[] args) {
        System.out.println(pancakeSort(new int[]{3,2,4,1}));
    }
    public static List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int L = arr.length-1;
        while (true){
            int nowIndex = 0;
            int nowMax = arr[nowIndex];
            for (int now = 0;now<=L;now++){
                if (nowMax<arr[now]){
                    nowMax = arr[now];
                    nowIndex = now;
                }
            }
            if (nowIndex>0){
                swap(arr,0,nowIndex);
                list.add(nowIndex+1);
            }
            swap(arr,0,L);
            list.add(L+1);
            L--;
            if (L<1){
                break;
            }
        }
        return list;
    }
    static void swap(int[] arr,int r,int l){
        while (r<l){
            int tem = arr[r];
            arr[r] = arr[l];
            arr[l] = tem;
            r++;
            l--;
        }
    }
}

