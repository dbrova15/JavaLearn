package com.company;

public class Student {
    Integer NumberTicet;
    String Name;
    String Surname;
    Integer Curse;
    double AverMath;
    double AverEconom;
    double AverForeign;
}


class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.NumberTicet = 1;
        s1.Name = "Vasya";
        s1.Surname = "Ivanov";
        s1.Curse = 2;
        s1.AverMath = 8.0;
        s1.AverEconom = 8.8;
        s1.AverForeign = 7.8;

        Student s2 = new Student();
        s2.NumberTicet = 2;
        s2.Name = "Kolya";
        s2.Surname = "Petrov";
        s2.Curse = 3;
        s2.AverMath = 9.1;
        s2.AverEconom = 9.5;
        s2.AverForeign = 8.9;

        Student s3 = new Student();
        s3.NumberTicet = 3;
        s3.Name = "Sasha";
        s3.Surname = "Bodrov";
        s3.Curse = 4;
        s3.AverMath = 6.9;
        s3.AverEconom = 7.1;
        s3.AverForeign = 6.7;

        System.out.println("Name: " + s1.Name + " Surname: " + s1.Surname + " Average grade: " + AverGrade(s1));
        System.out.println("Name: " + s2.Name + " Surname: " + s2.Surname + " Average grade: " + AverGrade(s2));
        System.out.println("Name: " + s3.Name + " Surname: " + s3.Surname + " Average grade: " + AverGrade(s3));
    }

    static double AverGrade(Student s) {
        return (s.AverEconom + s.AverForeign + s.AverMath) / 3;
    }

}