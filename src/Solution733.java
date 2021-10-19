public class Solution733 {
    public static void main(String[] args) {
        System.out.println(floodFill(new int[][]{{0,0,0},{0,1,1}},1,1,1));
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        floodFill(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    public static void floodFill(int[][] image, int sr, int sc,int oldColor, int newColor) {
        if (oldColor==newColor){
            return;
        }
        final int h = image.length;
        final int w = image[0].length;
        if (sr<0||sr>=h||sc<0||sc>=w){
            return;
        }
        if (image[sr][sc] == oldColor){
            image[sr][sc]=newColor;
            floodFill(image,sr-1,sc,oldColor,newColor);
            floodFill(image,sr+1,sc,oldColor,newColor);
            floodFill(image,sr,sc-1,oldColor,newColor);
            floodFill(image,sr,sc+1,oldColor,newColor);
        }
    }
}
