public class mathematics {

    static int squrt = 2;

    static void display() {
        System.out.println(Math.sqrt(squrt));
    }

    static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        mathematics.display();
        System.out.println(mathematics.square(10));
    }
}
