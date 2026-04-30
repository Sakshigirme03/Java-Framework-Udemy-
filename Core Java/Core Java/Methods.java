//A method in Java is a block of code that performs a specific task and runs only when it is called.


class Animal{
    public void Cat(){
        System.out.println("Meows");
    }
    public String Dog(int n){
        if(n>=1000){
            return "Breed";
        }
        return "Street dog ";
    }

}

class Math{
    public int Add(int a,int b){
        return a+b;
    }

    public int Div(int a,int b){
    return a/b;
    }

}

public class Methods{

    public static void main(String []args){
        Animal obj= new Animal();
        obj.Cat();
        String Max= obj.Dog(2430);
        System.out.println(Max);
        Math obj1=new Math();
        System.out.println("div of 4 and 2 :"+obj1.Div(4,2)+", Addition of 56,28: "+ obj1.Add(56,28));
    }
}