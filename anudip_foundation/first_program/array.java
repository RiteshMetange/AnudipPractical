import java.util.*;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[10];

        for (int i = 1; i<=10; i++) {
            ar[i] = sc.nextInt();
        }


        for (int i = 1; i <= 10; i++)
            System.out.println(ar[i]);

        sc.close();
    }
}