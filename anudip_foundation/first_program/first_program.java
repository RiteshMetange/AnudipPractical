
import java.util.*;

public class first_program {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of star :");
        a = sc.nextInt();

        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // stars using while loops 
        int i = 0;
        while (i < a) {
            int j = 0;
            while (j <= i) {
                j++;
                System.out.print("*");
            }
            i++;
            System.out.println("");

        }
        sc.close();
    }
}