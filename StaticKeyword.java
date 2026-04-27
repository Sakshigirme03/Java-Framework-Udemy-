class Human{
    static int age;
    int hight;
    public void ShowInfo(){
        System.out.println("Age : "+ age+",Hight : "+ hight);
    } 

}

public class StaticKeyword {
    public static void main(String []args){

        Human obj= new Human();
        Human.age= 15;
        obj.hight=155;
        obj.ShowInfo();
        Human obj1= new Human();
        Human.age=20;
        obj1.hight=122;
        obj1.ShowInfo();
        System.out.println(" Value of static variable age changed from 15 to 20 ");
        obj.ShowInfo();


    }
}
