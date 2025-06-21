public class countdigits {

    public static void main(String[] args) {

        int count = 0;
        int digit = 3331;

        while (digit > 0) {
            digit = digit / 10;
            ++count;

        }
        System.out.println("the size of digit is :" + count);
    }

}
