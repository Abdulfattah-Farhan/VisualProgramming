package edu.zuj.vp.homework3;

import java.util.Random;

public class ArrayReadRandom {

    public static void main(String[] args) {

        Random rand = new Random();

        int count = rand.nextInt(50) + 1;

        int max = Integer.MIN_VALUE, sum = 0, min = Integer.MAX_VALUE;
        int[] array = new int[count];

        System.out.print("Generated Numbers: ");
        for (int i = 0; i < count; i++) {
            array[i] = rand.nextInt(100) + 1;
            System.out.print(array[i] + " ");
            sum += array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println();

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("Sum : " + sum);
        System.out.println("Avg : " + ((double) sum / count));
    }
}
