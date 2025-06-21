
// check it later 
import java.util.*;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("enter number : ");
        int n = sc.nextInt();

        do {
            sum = sum + n;         // n is 5 so it will 5+4+2+3.....
            n--;
        } while (n > 0);
        System.out.print(sum);

        sc.close();

    }

}
