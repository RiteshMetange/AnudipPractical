import java.util.*;

public class string {

    static void demo(String m, String n) {
        System.out.println("The String1 and String2 : " + m + " " + n);
        System.out.println();

    }

    static void lengthof(String m, String n) {
        System.out
                .println("length of first string : " + m.length() + " | " + " length of second string : " + n.length());
        System.out.println();
    }

    static void compareof(String m, String n) {
        System.out.println("The String1 compare to  String2 : " + m.compareTo(n));
        System.out.println();

    }

    static void substringfun(String m, String n) {
        try {
            System.out.println("The String1 Substring : " + m.substring(0, 5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first string : ");
        String a = sc.next();
        System.out.print("enter second string : ");
        String b = sc.next();

        demo(a, b);
        lengthof(a, b);
        compareof(a, b);
        substringfun(a, b);

        sc.close();
    }
}
