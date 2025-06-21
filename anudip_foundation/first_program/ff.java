import java.util.*;

public class ff {

    public void get(String name) {
        System.out.println(name);
    }

    public static void main(String arg) {
        ff obj = new ff();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String n = sc.next();
        obj.get(n);

        sc.close();
    }
}
