//Method overloading is a feature in Java where multiple methods have the same name but different parameters (different number, type, or order of parameters).


class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public double add(int a, double b){
        // we took double as the return type cause when we add double and int it gives us double
        return a+b;
    }
}

public class methodOverloading {
    public static void main(String []args){
        Calculator obj= new Calculator();
        System.out.println(" 5+3: "+ obj.add(5,3));
        System.out.println(" 5+3+20: "+ obj.add(5,3,20));
        System.out.println(" 5.3+3.2: "+ obj.add(5.3,3.2));
        System.out.println(" 5+3.8: "+ obj.add(5,3.8));
        

    }
}
