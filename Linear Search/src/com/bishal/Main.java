package com.bishal;
import java.util.Scanner;
//Linear search returns the index of the searched item and if the item is not found it returns -1

public class Main {

    public static void main(String[] args) {
	int[] arr = {1, 2, 3, 5, 9, 20};
	int target = 21;
	int index = linearSearch(arr, target);
	System.out.println(index);
    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
