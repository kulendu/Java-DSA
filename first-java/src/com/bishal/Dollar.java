package com.bishal;
import java.util.Scanner;
// 8. Input currency in rupee and output in dollar.

public class Dollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter currency in rupee to convert into dollar: ");
        double currency = input.nextDouble();
        System.out.println("Rs " + currency + " = " + 0.013*currency + " dollars");
    }
}
