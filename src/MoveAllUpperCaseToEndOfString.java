/*Move all Uppercase char to the end of string
Given a string, move all Uppercase alphabets char to the end of the String.

Examples:

Input : Geeksforgeeks A Computer Science Portal for Geeks!!
Output : eeksforgeeks  omputer cience ortal for eeks!!GACSPG

Input : Hello India
Output : ehllo ndiaHI  */


import java.util.*;
public class MoveAllUpperCaseToEndOfString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();

        String upr="";
        String lwr="";
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                upr=upr+s.charAt(i);
            else
                lwr=lwr+s.charAt(i);
        }
        System.out.println(lwr+upr);
    }
}
