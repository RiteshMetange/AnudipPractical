public class whileloop {

    public static void main(String[] args) {

        int n = 0;
        while (n < 10) {
            System.out.print("\t" + n);
            n++;
            System.out.print("\t" + n + "\n");

        }

        int i = 1;
        while (i <= 5) {

            int j = 1;
            while (j <= i) {

                System.out.print(" x ");
                j++;
            }
            System.out.println("");
            i++;
        }

        do {
            int j = 1;
            do {
                System.out.print(" x ");
                j++;

            } while (j <= i);

            System.out.println("");
            i++;
        } while (i <= 5);

        int k = 1;
        do {
            System.out.println("heelo");
            k++;

        } while (k <= 10);

        

        

    }
}
