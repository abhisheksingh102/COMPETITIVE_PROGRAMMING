/*  Java program to print Even length words in a String
Given a string str, write a Java program to print all words with even length in the given string.

Examples:

Input: s = "This is a java language"
Output: This
        is
        java
        language

Input: s = "i am GFG"
Output: am     */

import java.util.Scanner;

//public class EvenLengthWords {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        String a[]=str.split(" ");
//        for(String w: a)
//        {
//            if(w.length()%2==0)
//                System.out.println(w);
//        }
//
//    }
//}

//or

public class EvenLengthWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String a[] = str.split(" ");
        for (String w : str.split(" ")) {
            if (w.length() % 2 == 0)
                System.out.println(w);
        }

    }
}



