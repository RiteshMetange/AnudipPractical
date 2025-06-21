import java.util.*;

public class search {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of  aaray : ");
        int size = sc.nextInt();
        int ar[] = new int[size];

        System.out.print("enter the elements in aaray :");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.print("enter the number to be searched :");
        int key = sc.nextInt();
        int index = -1;
                    
        for (int i = 0; i < size; i++) {                       // main logic 
            if (ar[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(" Number "+ key +" found at index :"+index);
        }
        else{
            System.out.println("not found at location  ");
        }

        sc.close();

    }

}
