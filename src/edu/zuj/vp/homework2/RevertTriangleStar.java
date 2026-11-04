package edu.zuj.vp.homework2;

import java.util.Scanner;

public class RevertTriangleStar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Stars Number : ");
        int num = s.nextInt();

        if (num > 0) {

            for (int i = num; i > 0; i--) {

                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        s.close();
    }
}
