public class practice {

    public static void main(String[] args) {
        int n = 5;
        // 5 x 5 star pattern
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(" x ");
            }
            System.out.println();
        }

        System.out.println("\n");
        // increasing Triangle Pattern
        /* 
                *
                **
                ***
                ****
                *****
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" x ");
            }
            System.out.println();
        }

        System.out.println("\n");

        // decreasing triangle
        /*
         ******
         ****
         **
         *
          
         */
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" x ");
            }
            System.out.println();

        }

        System.out.println("\n");

        for (int i = 1; i <= n; i++) { // rows i=1 | i=2....
            for (int j = 1; j <= (n - i); j++) { // space j=4 | j=3.... (1-5 = 4 spaces)
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) { // star k=1 | k=2....
                System.out.print("x");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("x ");
            }

            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

}
