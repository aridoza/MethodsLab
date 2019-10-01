package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //System.out.println(divide152By(3));
        System.out.println(maxOfTwoNumbers(12, 10));
        System.out.println(maxOfThree(4, 5, 3));
        System.out.println(isCharacterAVowel('b'));
        System.out.println(numberOfArgs("hello", "hi", 7, 'a', 99.999));
        System.out.println(reverseString("jag testar"));
        System.out.println(findLongestWord(new String[] {"hello", "bear", "coffee", "constantinople"}));
        System.out.println(filterLongWords(new String[] {"hello", "computer", "bear", "cherry"}, 5));
    };

//    public static float divide152By(int num) {
//        return 152f / num;
//    }

    public static int maxOfTwoNumbers(int num1, int num2) {
        int finalNum = num1 > num2 ? num1 : num2;
        return finalNum;
    };

    public static int maxOfThree(int num1, int num2, int num3) {
        int finalNum = num1 > num2
                ? num1 > num3 ? num1 : num3
                : num2 > num3 ? num2 : num3;
        return finalNum;
    };

    public static Boolean isCharacterAVowel(char someChar) {
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u', 'y'};
        for (char letter : vowels) {
            if (someChar == letter) {
                return true;
            }
        }
        return false;
    }

    public static int numberOfArgs(Object... args) {
        return args.length;
    }

    public static String reverseString(String someStr) {
        return new StringBuilder(someStr).reverse().toString();
    }

    public static int findLongestWord(String[] words) {
        int longestWordLength = 0;

        for (String word : words) {
            if (word.length() > longestWordLength) {
                longestWordLength = word.length();
            }
        }
        return longestWordLength;
    }

    public static ArrayList<String> filterLongWords(String[] words, int i) {
        ArrayList<String> filteredWords = new ArrayList<String>();

        for (String word : words) {
            if (word.length() > i) {
                // push into the filteredWords array
                filteredWords.add(word);
            }
        }
        return filteredWords;
    }
}
