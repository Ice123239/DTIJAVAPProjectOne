package com.sau.tech;

import java.util.Scanner;

public class MyClass03 {
    public static void moin(String[] args){
        String empName;
        double empSalary, tax10;

        Scanner sc = new Scanner(System.in);

        System.out.print("Inp employee name");
        empName = sc.next();
        System.out.print("Input employee salary: ");
        empSalary = sc.nextDouble();
        System.out.print(---------------);

        tax10 = empSalary *10 /100;
        System.out.print("your name: " + empName);
        System.out.print("your salary: " + empSalary);
        System.out.print("TAX pay: " + tax10+ "Baht");

        System.out.print(---------------);
    }
}
