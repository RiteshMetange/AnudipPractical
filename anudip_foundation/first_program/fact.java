import java.util.Scanner;

public class fact {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");

        try {

            int number = sc.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("the nuber is negative so fact caanot be found ");
            }
            int result = factorial(number);
            System.out.println("the factorial of " + number + " is : " + result);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Enter a number.Invalid Input ");
        } finally {
            sc.close();
        }

    }
}