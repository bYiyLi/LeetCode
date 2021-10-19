import java.util.Arrays;

public class LCP41 {
    public static void main(String[] args) {
        System.out.println(flipChess(new String[]{"....X.","....X.","XOOO..","......","......"}));
    }
    public static int flipChess(String[] chessboard) {
        char[][] chars = new char[chessboard.length][chessboard[0].length()];
        for (int i = 0; i < chessboard.length; i++) {
            final char[] tem = chessboard[i].toCharArray();
            System.arraycopy(tem,0,chars[i],0,tem.length);
        }
        int res =0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                if (chars[i][j] == '.'){
                    int max=0;
                    int tem = 0;
                    {
                        for (int t = j-1;t>=0;--t){
                            if (chars[i][t] == 'O'){
                                tem++;
                            }else if(chars[i][t] == 'X'){
                                max+=tem;
                                tem=0;
                                break;
                            }else {
                                tem=0;
                                break;
                            }
                        }

                        for (int t = j+1;t<chars[i].length;++t){
                            if (chars[i][t] == 'O'){
                                tem++;
                            }else if(chars[i][t] == 'X'){
                                max+=tem;
                                tem=0;
                                break;
                            }else {
                                tem=0;
                                break;
                            }
                        }
                    }
                    {
                        for (int t = i-1;t>=0;--t){
                            if (chars[t][j] == 'O'){
                                tem++;
                            }else if(chars[t][j] == 'X'){
                                max+=tem;
                                tem=0;
                                break;
                            }else {
                                tem=0;
                                break;
                            }
                        }

                        for (int t = i+1;t<chars.length;++t){
                            if (chars[t][j] == 'O'){
                                tem++;
                            }else if(chars[t][j] == 'X'){
                                max+=tem;
                                tem=0;
                                break;
                            }else {
                                tem=0;
                                break;
                            }
                        }
                    }
                    res = Math.max(res,max);
                }
            }
        }
        return res;
    }
}
