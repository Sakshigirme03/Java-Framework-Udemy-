class A {
    public void show(){
        System.out.println("in show original..");
    }
}

public class AnonymousInnerClass03{
    public static void main(String [] args){
        A obj= new A();
        obj.show();
        A obj1 = new A(){
            public void show(){
                System.out.println("In show new..");
            }
        };
        obj1.show();
    }
}