import java.util.*;

public class twodarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of rows");
        int rows = sc.nextInt();
        System.out.print("enter size of cols");
        int col = sc.nextInt();

        int ar[][] = new int[4][4];
        System.out.println("enter 2d array elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                ar[i][j] = sc.nextInt();
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("enter the number to be searched :");
        int key = sc.nextInt();
        

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (ar[i][j] == key) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                } // end of if

            } // inner loop

            if (found) break;

        } // outer loop

        if (!found) System.out.println("not found");

        sc.close();
    }

}
