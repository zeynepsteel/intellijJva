package InstanceHomework;
/*Create a Class called Students
        Create three  variables  studentName , studentID  and  numberOfStudents
        Create three objects of the Students Class
        Set the value for  studentName , studentID and increment  the numberOfStudents for each object
        Print out  total number of students*/
public class Student{

    String studentName;  int studentID;static int numberOfStudents=45;

    public static void main(String[] args) {
        Student s1=new Student();
        s1.studentID=1;
        s1.studentName="zeyno";
        Student.numberOfStudents++;
        Student s2=new Student();
        s2.studentID=1;
        s2.studentName="zeyno";
        Student.numberOfStudents++;
        Student s3=new Student();
        s3.studentID=1;
        s3.studentName="zeyno";
        Student.numberOfStudents++;
        System.out.println("number of student is "+Student.numberOfStudents);
    }

}
