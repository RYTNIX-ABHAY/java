package assignment;

import java.util.Scanner;

public class Que {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the number :");
        int x= in.nextInt();
        if( x % 2 ==0){
            System.out.println("even");
        }
 else {
    System.out.println("odd");
 }
    }
}
