class Student
{
    int rollno;
    String name;
    int marks;
}

public class Array {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 01;
        s1.name = "Mayur";
        s1.marks = 100;

        Student s2 = new Student();
        s2.rollno = 02;
        s2.name = "Shubham";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 03;
        s3.name = "Sagar";
        s3.marks = 95;

        Student students[] = new Student[3]; //Holds student references
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length;i++)
        {
            System.out.println(students[i].name +" : " +students[i].marks);
        }
    }
    
}
