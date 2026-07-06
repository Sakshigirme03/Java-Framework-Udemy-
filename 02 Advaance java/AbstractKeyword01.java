abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Car plays music");
    }
}

class Jaguar extends Car{
    public void drive(){
        System.out.println("Jaguar drive ..");
    }
}

class AbstractKeyword01{
    public static void main(String [] args){
        Car obj = new Jaguar();
        obj.drive();
        obj.playMusic();
    }

}