package com.capgemini.com;

import java.util.Scanner;

public class Employee {
	int [] array= new int [8];
    private int empNum;
    private double empSal;
    void Test1(int e, double s){
        empNum = e;
        empSal = s;
    }

    public int getEmpNum(){
        return empNum;
    }
    public double getSalary(){
        return empSal;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Please enter your employee number:");
        int e = sc.nextInt();
        System.out.printf("Please enter your salary:");
        double s= sc.nextInt();
    }

}
