public class just {
    int i = 1;

    public void doex(int num){

        do
        {
            System.out.println(num*i);
            i++;
        }while(i<=10);

    }

    
    public static void main(String[] args) {

        just j= new just();
        j.doex(10);

    }
}