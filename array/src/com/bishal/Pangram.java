//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.
package com.bishal;
import java.util.*;

public class Pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Character> set = new ArrayList<>();
        String str;
        System.out.println("Enter a string to check if it is a pangram: ");
        str = in.next();
        boolean isPangram = checkPengram(str);
        if(isPangram) {
            System.out.println("The string is a pangram");
        } else {
            System.out.println("The string is not a pangram");
        }
    }

    static boolean checkPengram(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));

        }
        if(set.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}
