class Human{
    static int age;
    int hight;
    public static int StaticMethod(){
        age = age+10;
        return age;
    }
    public void Display(){
        System.out.println("age : "+age+" , hight : "+hight);
    }
}

public class StaticMethod{
    public static void main(String[]args) {
        Human obj= new Human();
        Human.age=20;
        obj.hight=156;
        Human.StaticMethod();
        obj.Display();

        Human obj1= new Human();
        Human.age=15;
        obj1.hight=120;
        Human.StaticMethod();
        obj1.Display();

        System.out.println();
        System.out.println("Value of age changing in obj 30 to obj1 25 to agin obj1 to 25 cause of static function");
        obj1.Display();
    
}

}