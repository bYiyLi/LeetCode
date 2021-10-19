public class Solution1860 {
    public static void main(String[] args) {

        System.out.println(memLeak(2,2));
    }
    public static int[] memLeak(int memory1, int memory2) {
        int time = 1;
        while (true){
            if (memory1>=memory2){
                if (memory1>=time){
                    memory1-=time;
                }else {
                    return new int[]{time,memory1,memory2};
                }
            }else {
                if (memory2>=time){
                    memory2-=time;
                }else {
                    return new int[]{time,memory1,memory2};
                }
            }
            time++;
        }
    }
}
