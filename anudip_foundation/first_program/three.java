import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("ennter choice : ");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.print("hi");
                break;

            case 2:
                System.out.print("namste");
                break;

            case 4:
                System.out.print("hello");
                break;

            default:
                System.out.println("\ninvalid choice");
        }
        sc.close();

    }
}
