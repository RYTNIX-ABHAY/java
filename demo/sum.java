package demo;

import java.util.Scanner;

public class sum {
    //sum of two numbers
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("sum is :" + sum);
    }
}