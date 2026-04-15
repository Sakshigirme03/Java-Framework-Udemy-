//Created a class with variable and in main class created objects of the class and stored them in a array and then printed them using enhanced for loop


class Students{
    int rollNo;
    String name;
    int marks;
}

public class StringArray{
    public static void main(String[]args){
        Students s1= new Students();
        s1.name="Sakshi";
        s1.rollNo= 14;
        s1.marks=100;

        Students s2= new Students();
        s2.name="Gayatri";
        s2.rollNo=1;
        s2.marks=95;

        Students student[]=new Students[2];
        student[0]=s1;
        student[1]=s2;

        for(Students n: student){
            System.out.println("Roll no : "+n.rollNo+", name : "+n.name+" , Marks: "+n.marks);
        }

    }
}