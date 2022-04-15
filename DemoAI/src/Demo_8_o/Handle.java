
package Demo_8_o;

import java.awt.Point;
import java.util.Random;


public class Handle {
     private static Point[] points = {
         new Point(1, 1), new Point(1, 2), new Point(1, 3),
         new Point(2, 1), new Point(2, 2), new Point(2, 3),
         new Point(3, 1), new Point(3, 2), new Point(3, 3),
     };
//      private int heristic1(int a[][]){
//        int h = 0, tmp = 0;
//        for(int i = 1; i <= 3; i++){
//            for(int j = 1; j <= 3; j++){
//                if(a[i][j] != tmp){
//                    h++;
//                }
//                tmp++;
//            }
//        }
//        return h;
//    }
     public static int herictis2( int a[][]){
        int h = 0, d = 0;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(a[i][j] != 0){
                   d = Math.abs(i-points[a[i][j]].x) + Math.abs(j-points[a[i][j]].y);
                   h += d;
                }
            }
        }
        return h;
    }
    public static int herictis( int a[][]){
        int h = 0, tmp = 0;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(a[i][j] != tmp){
                    h++;
                }
                tmp++;
            }
        }
        return h;
    }
    public static int[][] copy(int[][] a){
        int[][] b = new int[5][5];
        for(int i = 0; i <= 4; i++){
            for(int j = 0; j <= 4; j++){
                b[i][j] = a[i][j];
            }
        }
        return b;
    }
    public static boolean isEqual(int a[][], int b[][]){
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
    public static int[][] new_matric(){
        int[][] a = {{-1, -1, -1, -1, -1}, 
                    {-1, 0, 1, 2, -1},
                    {-1, 3, 4, 5, -1},
                    {-1, 6, 7, 8, -1},
                    {-1, -1, -1, -1, -1}
                    };
        Random rd = new Random();
        int x = 1, y = 1;
        for(int i = 0; i < 100; i++){
            int next = rd.nextInt(4);
            //System.out.println(next);
            if(next == 0){
               if(a[x-1][y] != -1){
               int tmp = a[x-1][y];
               a[x-1][y] = 0;
               a[x][y] = tmp;
               x -= 1;
            }
            }
            if(next == 1){
                if(a[x+1][y] != -1){
                int tmp = a[x+1][y];
                a[x+1][y] = 0;
                a[x][y] = tmp;
                x += 1;
            }
            }
            if(next == 2){
                if(a[x][y+1] != -1){
                int tmp = a[x][y+1];
                a[x][y+1] = 0;
                a[x][y] = tmp;
                y += 1;
            }
            }
            if(next == 3){
                if(a[x][y-1] != -1){
                int tmp = a[x][y-1];
                a[x][y-1] = 0;
                a[x][y] = tmp;
                y -= 1;
            }
            }
        }
        return a;
    }
}
