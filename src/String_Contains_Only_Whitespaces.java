/*  Program to check if a String in Java contains only whitespaces
Given a string str, the task is to check if this string contains only whitespaces or some text, in Java.

Examples:

Input: str = "              "
Output: True

Input: str = "GFG"
Output: False       */

import java.util.Scanner;

public class String_Contains_Only_Whitespaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        if(s.trim().isEmpty())
            System.out.println("True");
        else
            System.out.println("False");


    }
}
