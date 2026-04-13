import java.util.concurrent.Flow.Subscriber;

public class arrayCreation {

    public static void main(String []args){
        int num[]={2,2,6,4,4,7,8,1};
        int add=0;
        int prod=1;
        int max=num[0],min=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>max) max= num[i];
            if(num[i]<min) min= num[i];
            add+=num[i];
            prod*=num[i];
        }
        System.out.println("Unique nus=");
        for(int i=0;i<num.length;i++){
            boolean isUnique= true;
            for(int j=0;j<num.length;j++){
                 if(i !=j && num[i]==num[j]){
                    isUnique=false;
                    break;
                 }
            }
            if(isUnique){
                System.out.println(num[i]+ " ,");
            }
        }
        System.out.println("Additon = "+add+", Mul = "+prod+", min is = "+min+", max is = "+max);
    }
}
