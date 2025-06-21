import java.util.*;

public class evenodd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        
        System.out.println("enter 5 numbers : ");
        for(int i=0;i<5;i++){
            System.out.print("Number "+ (i+1)+" : ");
            n[i]=sc.nextInt();
        }

        
        System.out.println("Even numbers");
        for(int i=1;i<5;i++){
            if(n[i]%2==0){
                System.out.println(n[i]);
            }
        }

        System.out.println("odd numbers");
        for(int i=1;i<5;i++){
            if(n[i]%2!=0){
                System.out.println(n[i]);
            }
        }

        sc.close();
    }
}