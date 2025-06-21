import java.util.*;

public class forloop {

       public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.print("enter number for table : ");
        int n = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

        sc.close();
    } 
    
}
