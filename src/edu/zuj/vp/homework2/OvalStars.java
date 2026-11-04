package edu.zuj.vp.homework2;

import java.util.Scanner;

public class OvalStars {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Stars Number : ");
        int num = scan.nextInt();

        if (num > 0) {
            int currentStar = (num % 2 == 0) ? 2 : 1;

            while (currentStar <= num) {
                int sideSpace = (num - currentStar) / 2;

                for (int s = 0; s < sideSpace; s++) {
                    System.out.print(" ");
                }

                for (int st = 0; st < currentStar; st++) {
                    System.out.print("*");
                }
                System.out.println();
                currentStar += 2;
            }

            int bottomSpace = 1;
            for (int i = num - 2; i >= 1; i -= 2) {
                for (int s = 0; s < bottomSpace; s++) {
                    System.out.print(" ");
                }

                for (int st = 0; st < i; st++) {
                    System.out.print("*");
                }
                System.out.println();
                bottomSpace++;
            }

        } else {
            System.out.println("Please enter a positive number.");
        }
        scan.close();
    }
}
