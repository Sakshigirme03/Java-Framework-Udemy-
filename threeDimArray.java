import java.util.*;

public class threeDimArray {
    public static void main(String[] args){
        int num[][][]=new int[3][3][3];
        for(int i=0;i<3;i++){
            System.out.println("Layer no: "+(i+1)+" : ");
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    num[i][j][k]=(int)(Math.random() * 10);
                    System.out.print(num[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
