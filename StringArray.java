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

        for(int i=0;i<student.length;i++){
            System.out.println("Roll n0 : "+student[i].rollNo+", name : "+student[i].name+" , Marks: "+student[i].marks);
        }

    }
}