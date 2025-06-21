import java.util.*;

public class prime {

    public static boolean fun(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :");
        int n = sc.nextInt();

        if (fun(n)) {
            System.out.print("the number : "+n+" is prime number");
        } else {
            System.out.print("the number : "+n+" is not prime number");
        }
        sc.close();

    }

}
