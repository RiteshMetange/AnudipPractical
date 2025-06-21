
    public class armstrong {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber, remainder, result = 0;

        // Count number of digits
        int n = 0, temp = number;
        while (temp != 0) {
            temp /= 10;
            ++n;
        }

        // Calculate Armstrong sum
        result = 0;
        originalNumber = number;
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

        scanner.close();
    }
}
