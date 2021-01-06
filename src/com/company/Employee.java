package com.company;

public class Employee {
    Integer id = 1;
    String Surname = "Petrov";
    Integer age = 30;
    static double salary = 1200;
    String department = "IT";

    void dableSalary() {
        salary *= 2;
    }
}


class EmployeeTest {
    public static void main(String[] args) {

        Employee empl1 = new Employee();
        Employee empl2 = new Employee();

        empl1.dableSalary();
        System.out.println("New salary: " + empl1.salary);

        empl2.dableSalary();
        System.out.println("New salary: " + empl2.salary);
    }
}