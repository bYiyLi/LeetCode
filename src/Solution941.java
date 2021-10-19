public class Solution941 {
    public static void main(String[] args) {

    }
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        while (index+1<arr.length&&arr[index]<=arr[index+1]){
            index++;
        }
        if (index==0||arr[index]==arr[0]){
            return false;
        }
        int t=index;
        while (index+1<arr.length&&arr[index]>=arr[index+1]){
            index++;
        }
        if (index!=arr.length-1||arr[t]==arr[index]){
            return false;
        }
        return true;
    }
}
