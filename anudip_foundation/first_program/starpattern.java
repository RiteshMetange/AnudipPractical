public class starpattern {

    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 1; i <= 4; i++) { // check it later
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // new
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = 5; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n");












    
    }

}
