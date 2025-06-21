
public class conditional {

    public static void main(String[] args) {
        int a = 30;
        int b = 10;
        int c = 20;

        if (a > b && a > c) {
            System.out.println("a is greater than b and c");
        } else if (b > a && b > c) {
            System.out.println("b is greater than a and c");
        }
        else
        {
            System.err.println("C is greater");
        }
    }
}