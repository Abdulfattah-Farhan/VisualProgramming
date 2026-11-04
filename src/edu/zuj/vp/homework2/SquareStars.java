package edu.zuj.vp.homework2;

import java.util.Scanner;

public class SquareStars {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Stars Number : ");
        int num = s.nextInt();
        if (num > 0) {

            for (int i = 0; i < num; i++) {

                for (int j = 0; j < num; j++) {
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
