class Animal{
    public void sound(){
        System.out.println("Animal makes sound ");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println("Dogs bark");
    }
}

public class methodOverriding{
    public static void main(String [] args){
        Animal A= new Dog();
        A.sound();
    }
}