package com.company;

import java.util.Scanner;

public class CWH_Methods {
    static int sum(int n1,int n2){
        var a = n1;
        var b = n2;

        int i = a + b;
        return i;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter Two Numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The Sum of Two Number is "+ sum(num1,num2));
    }

}
