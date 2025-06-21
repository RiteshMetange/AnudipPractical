import java.util.*;

public class funtions {

    static Scanner sc = new Scanner(System.in);          // inside class 

    public static int demo(Scanner sc) {                 // never inside method
        int a = sc.nextInt();
        int b = sc.nextInt();
        return a + b;
    }

    public static void main(String[] args) {
      //Scanner sc = new Scanner(System.in);                          // inside main 
        int result = demo(sc);
        System.out.println(result);
        sc.close();

    }

}
