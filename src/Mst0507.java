public class Mst0507 {
    public static void main(String[] args) {

    }
    public int exchangeBits(int num) {
        int res = 0;
        for (int i=0;i<16;i++){
            switch (num&3){
                case 0:{
                    break;
                }
                case 1:{
                    res+=2<<i*2;
                    break;
                }
                case 2:{
                    res+=1<<i*2;
                    break;
                }
                case 3:{
                    res+=3<<i*2;
                    break;
                }
                default:{}
            }
            num>>=2;
        }
        return res;
    }
}
