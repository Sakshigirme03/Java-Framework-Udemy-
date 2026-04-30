class human{
    int age ;
    int hight;
    human(){
        System.out.println("Inside constructor");
    }
    human(int age){
        System.out.println(age);
    }
}


public class constructorOverloading {
    public static void main(String[]args){

        human obj= new human();
        obj.age=15;
        obj.hight=20;
        human obj2= new human(25);

    }
}
