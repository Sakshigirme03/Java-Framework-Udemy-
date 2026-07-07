class A {

    public void config(){
        System.out.println("in config ..");
    }

    class B{
        public void show(){
            System.out.println("in show.. ");
        }
    }
}

public class InnerClass02 {
    public static void main(String[] args){
        A obj= new A();
        obj.config();
        A.B obj1= obj.new B();
        obj1.show();
    }
    
}
