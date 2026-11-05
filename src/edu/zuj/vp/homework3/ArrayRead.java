package edu.zuj.vp.homework3;

import java.util.Scanner;

public class ArrayRead {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Numbers Count : ");
        int count = s.nextInt();

        if (count > 0) {

            int max = Integer.MIN_VALUE, sum = 0, min = Integer.MAX_VALUE;
            int[] array = new int[count];

            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + " : ");
                array[i] = s.nextInt();
                sum += array[i];

                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i] < min) {
                    min = array[i];
                }

            }

            System.out.println("Max : " + max);
            System.out.println("Min : " + min);
            System.out.println("Sum : " + sum);
            System.out.println("Avg : " + ((double) sum / count));

        } else {
            System.out.println("Please enter a count greater than 0.");
        }

        s.close();
    }
}
