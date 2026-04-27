class Human{
    Human(){
        System.out.println("Inside constructor");
    }
    public void display(){
        System.out.println("outside constructor");
    }
}


public class Constructor {
    public static void main(String []args){
        Human obj= new Human();
        obj.display();
        Human obj1= new Human();

    }
}
