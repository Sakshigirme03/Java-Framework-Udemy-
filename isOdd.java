public class isOdd{
    public static void isOdd(int n){
        if(n%2!=0){
            System.out.println("Is odd");
        }
        else {
            System.out.println("Not an odd no");
        }
    }

    public static void main(String[]args){
        isOdd(34);
        isOdd(33);
    }
}