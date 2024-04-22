package exercise;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class FindMaxAscendingString {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String string = myScanner.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> charList = new LinkedList<>();
            charList.add(string.charAt(i));
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) > charList.getLast()){
                    charList.add(string.charAt(j));
                }
            }

            if (charList.size() > maxString.size()){
                maxString.clear();
                maxString.addAll(charList);
            }
            charList.clear();
        }
        for (Character ch : maxString){
            System.out.println(ch);
        }
        System.out.println();
    }
}
