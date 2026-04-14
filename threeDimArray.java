import java.util.*;

//used random function to create 3D array and displayed it 
//jagged array

public class threeDimArray {
    public static void main(String[] args){
        int num[][][]=new int[3][][];
        num[0]=new int[6][4];
        num[1]=new int[2][3];
        num[2]=new int[4][1];
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                for(int k=0;k<num[i][j].length;k++){
                    num[i][j][k]=(int)(Math.random() * 10);
                }  
            }
        }
        int layer=0;

        for(int n[][]: num){
            System.out.println("Layer :"+(layer+1));
            for(int m[]:n){
                for(int val:m){
                    System.out.print(val+" ");
                }
                System.out.println();
            }
            layer++;
            System.out.println();
        }
        
    }
}
