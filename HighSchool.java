import java.io.*;
import java.util.*;
import java.lang.*;

class Person
{
    String name;
    String gender;;
    int age;
}


class Student extends Person
{
    String rollNo;
    double gpa;
}


class Teacher extends Person
{
    int salary;
    String subject;

    Teacher(int sal, String sub)
    {
        salary = sal;
        subject = sub;
    }

    void display()
    {
        System.out.println("Teacher's profile:\n"+name+"\n"+gender+"\n"+age+"\n"+salary+"\n"+subject);
    }
}


class CollegeStudent extends Student
{
    int year;
    String major;

    CollegeStudent(int y, String m)
    {
        year = y;
        major = m;
    }

    void display()
    {
        System.out.println("College student's profile:\n"+name+"\n"+gender+"\n"+age+"\n"+rollNo+"\n"+year+"\n"+major+"\n"+gpa);
    }
}


class HighSchool
{
    public static void main(String args[])
    {
       
        
        Teacher t = new Teacher(10084, "Maths & Computing");
        t.name = "Sonali";
        t.gender = "female";
        t.age = 20;
        t.display();

        System.out.println();

        CollegeStudent c = new CollegeStudent(2, "mnc");
        c.name = "priyaa";
        c.gender = "female";
        c.age = 20;
        c.rollNo = "IMH/10084/19";
        c.gpa = 10.0;
        c.display();
    }
}