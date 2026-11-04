package edu.zuj.vp.homework2;

import java.util.Scanner;

public class HoriStars {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Stars Number : ");
        int numberOfStars = s.nextInt();

        if (numberOfStars > 0) {
            for (int i = 0; i < numberOfStars; i++) {
                System.out.print("*");
            }

            System.out.println();
        } else {
            System.out.println("Please enter a positive number.");
        }

        s.close();
    }
}
