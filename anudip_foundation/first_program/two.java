import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
      int  b=obj.nextInt();
       int  a=obj.nextInt();

      
        int sum = a + b;
        int sub = a - b;
        int div = a / b;
        int mul = a * b;

        System.out.println("addtion :"+sum);
        System.out.println("Subtraction"+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("division : "+div);
         obj.close();
    }
   
}
