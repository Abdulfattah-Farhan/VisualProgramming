package edu.zuj.vp.homework3;

import java.util.Scanner;

public class ArrayReadMethod {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int count = readCount();

        if (count > 0) {

            int[] array = fillIntArray(count);

            System.out.println("Max : " + findMax(array));
            System.out.println("Min : " + findMin(array));
            System.out.println("Sum : " + getSum(array));
            System.out.println("Avg : " + getAvg(array));

        } else {
            System.out.println("Please enter a valid count greater than 0.");
        }

        scan.close();
    }

    public static int readCount() {
        System.out.print("Enter Numbers Count : ");
        return scan.nextInt();
    }

    public static double getAvg(int[] arr) {
        int sum = getSum(arr);
        return (double) sum / arr.length;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int[] fillIntArray(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter int " + (i + 1) + " : ");
            array[i] = scan.nextInt();
        }
        return array;
    }

}
