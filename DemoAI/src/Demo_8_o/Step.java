
package Demo_8_o;

import java.util.ArrayList;

public class Step implements Comparable<Step>{
    private int[][] a;
    private int h, g, f;
    private int[][] parent;
    private String parentString;
    public Step(){
        
    }
   
    public String getParentString() {
        return parentString;
    }
    public Step(int a[][], int g, int parent[][], String s){
        this.a = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
               this.a[i][j] = a[i][j];
            }
        }
        this.h = Handle.herictis2(a);
        this.g = g;
        this.f = h+g;
        this.parent = parent;
        this.parentString = s;
        
    }
    public boolean isEnd(){
          if(this.h == 0) return true;
          else return false;
    }
    public ArrayList<Step> next(){
        ArrayList<Step> res = new ArrayList<>();
        // tim vi tri o trong
        int i_cur = 0, j_cur = 0;
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                if(this.a[i][j] == 0){
                    i_cur = i; j_cur = j;
                    break;
                }
            }
        }
        //System.out.println("i cur = " + i_cur + " j_cur = " + j_cur);
        // xet dich len tren
        if(a[i_cur-1][j_cur] != -1 && parentString != "down"){
            int[][] temp = Handle.copy(a);
            int tmp = temp[i_cur-1][j_cur];
            temp[i_cur-1][j_cur] = 0;
            temp[i_cur][j_cur] = tmp;
            res.add(new Step(temp, g+1, a, "up"));
        }
        // xet dich xuong duoi
        if(a[i_cur+1][j_cur] != -1 && parentString != "up"){
           int[][] temp = Handle.copy(a);
            int tmp = temp[i_cur+1][j_cur];
            temp[i_cur+1][j_cur] = 0;
            temp[i_cur][j_cur] = tmp;
            res.add(new Step(temp, g+1, a, "down"));
        }
        // xet chuyen sang phai
        if(a[i_cur][j_cur+1] != -1 && parentString != "right"){
            int[][] temp = Handle.copy(a);
            int tmp = temp[i_cur][j_cur+1];
            temp[i_cur][j_cur+1] = 0;
            temp[i_cur][j_cur] = tmp;
            res.add(new Step(temp, g+1, a, "left"));
        }
        // xet chuyen sang trai
        if(a[i_cur][j_cur-1] != -1 && parentString != "left"){
            int[][] temp = Handle.copy(a);
            int tmp = temp[i_cur][j_cur-1];
            temp[i_cur][j_cur-1] = 0;
            temp[i_cur][j_cur] = tmp;
            res.add(new Step(temp, g+1, a, "right"));
        }
        return res;
    }
    public int[][] getA() {
        return a;
    }
    public void print_matric(){
        System.out.println("Buoc truoc: " );
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(parent[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("f = " + f + " g = " + g + " h = " + h);
        System.out.println("Buoc sau: " + parentString);
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    @Override
    public int compareTo(Step s) {
        if(this.f < s.f) return -1;
        else if (this.f > s.f) return 1;
        else {
            if(g > s.g) return -1;
            else if(g < s.g) return 1;
            else return 0;
        }
    }
    public boolean equals(Step s){
        if(g == s.g){
            if(Handle.isEqual(a, s.a)) return true;
        }
        return false;
    }
}
