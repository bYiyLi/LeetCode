public class LcpSolution33 {
    public static void main(String[] args) {
        System.out.println(storeWater(new int[]{1,3},new int[]{6,6}));
    }
    public static int storeWater(int[] bucket, int[] vat) {
        int base = 0;
        int temMaxN = 0;
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i]==0&&vat[i]!=0){
                bucket[i]=1;
                base++;
            }
            if (vat[i]!=0){
                int i1 = vat[i] / bucket[i];
                if (vat[i] % bucket[i] != 0){
                    i1++;
                }
                temMaxN = Math.max(temMaxN,i1);
            }
        }
        int maxN=temMaxN;
        for (int nowN=1;nowN<=temMaxN;nowN++){
            int tem = nowN;
            for (int n=0;n< vat.length;n++){
                if(vat[n]!=0){
                    int i = vat[n] / nowN;
                    if (vat[n]%nowN!=0) {
                        i++;
                    }
                    if (i-bucket[n]>0){
                        tem+=i-bucket[n];
                    }
                }
            }
            maxN = Math.min(tem,maxN);
        }
        return maxN+base;
    }
}
