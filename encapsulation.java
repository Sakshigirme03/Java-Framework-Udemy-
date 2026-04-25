class Human{
    private int age;

    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return age;
    }
}

public class encapsulation{
    public static void main(String[]args){
        Human obj= new Human();
        obj.setAge(25);
        System.out.println(obj.getAge());
    }
}