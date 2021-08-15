package com.bishal;
import java.util.Scanner;

//10. Take integer inputs till the user enters 0 and print the largest number from all.

public class LargestContinuous {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[40];
        int i = 1;
        System.out.println("Enter integers to find the largest of all and enter 0 to stop");
        int num = input.nextInt();
        intArray[0] = num;
        while(num != 0) {
            System.out.println("Enter integers to find the largest of all and enter 0 to stop");
            num = input.nextInt();
            intArray[i] = num;
            i++;
        }
        int largest = intArray[0];
        for(int x=0; x<i+1; x++) {
            if(largest < intArray[x]) {
                largest = intArray[x];
            }
        }
        System.out.println(largest + " is the largest integer");
    }
}
