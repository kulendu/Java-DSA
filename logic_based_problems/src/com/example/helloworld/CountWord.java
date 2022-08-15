package com.example.helloworld;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sequence: ");

        int sequence = in.nextInt();
        System.out.println("The sequence is: " + sequence);

        int last_no = in.nextInt();

        System.out.println("Enter the no to be check the occurence: ");
        int check_no = in.nextInt();
        int count = 0;

        while(sequence>0){
            last_no = sequence % 10;    // To get the last digit of the sequence
            if(last_no == check_no){
                count ++;
            }
            sequence = sequence/10;     // To restore the sequence and start again w/o the last digit
        }

        System.out.println(check_no + " is present " + count + " times");
    }
}
