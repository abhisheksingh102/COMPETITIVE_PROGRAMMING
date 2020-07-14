import java.util.Scanner;

public class String_Contains_WhiteSpaces_OrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        String  s=sc.nextLine();
        if(s.contains(" "))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
