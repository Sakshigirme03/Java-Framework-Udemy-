class Demo{
    public Demo(){
        System.out.println("Inside constructor");
    }

    public void show(){
        System.out.println("Inside show method");
    }

}

public class anonymousObj {
    public static void main(String []args){

        new Demo().show(); // using anonymous obj 
        // anonymous obj can be used only once whereas if we create obj using normal method it can be reused
        Demo obj = new Demo();   // using normal obj creation
        obj.show();

    }
}

