import java.util.*;
class human{
    public human(){
        System.out.println("Its a constructor");
    }

    private int age =10;
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }

    public void show(){
        System.out.println("Human walks");
    }

}

class animal extends human{
    public animal(){
        System.out.println("Animal class constructor");
        System.out.println("Using encapsulation to get age from parent class ," +super.getAge());
    }
    public void show() {
        super.show();
    }

}

public class hiee {

    public static int add( int a, int b){
    return a+b;
}
    public static void main(String [] args){
        animal A= new animal();
        A.show();
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello , enter first number :");
        int n= sc.nextInt();
        System.out.println("Enter second number : ");
        int m= sc.nextInt();
        System.out.println("Addition is :" + add(n,m));
        sc.close();
    }
}
