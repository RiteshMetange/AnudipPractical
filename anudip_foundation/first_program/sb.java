public class sb {
    public static void main(String[] args) {

        // // 1. reverse()
        // StringBuilder sb1 = new StringBuilder("hello java");
        // sb1.reverse();
        // System.out.println("reverse(): " + sb1); // avaj olleh

        // // 2. append()
        // StringBuilder sb2 = new StringBuilder("hello");
        // sb2.append(" java");
        // System.out.println("append(): " + sb2); // hello java

        // // 3. delete(start, end)
        // StringBuilder sb3 = new StringBuilder("hello java");
        // sb3.delete(5, 10);
        // System.out.println("delete(5,10): " + sb3); // helloa

        // // 4. replace(start, end, str)
        // StringBuilder sb4 = new StringBuilder("hello");
        // sb4.replace(2, 4, "ritesh");
        // System.out.println("replace(6,4): " + sb4); //

        // // 5. insert(offset, str)
        // StringBuilder sb5 = new StringBuilder("hello");
        // sb5.insert(0, " java");
        // System.out.println("insert :" + sb5); // java hello

        // // 6. deleteCharAt(index)
        // StringBuilder sb6 = new StringBuilder("hello");
        // sb6.deleteCharAt(1);
        // System.out.println("deleteCharAt(1): " + sb6); // hllo

        // // 7. charAt(index)
        // StringBuilder sb7 = new StringBuilder("hello");
        // char ch = sb7.charAt(1);
        // System.out.println("charAt(1): " + ch); // e

        // // 8. setCharAt(index, char)
        // StringBuilder sb8 = new StringBuilder("hello");
        // sb8.setCharAt(0, 'X');
        // System.out.println("setCharAt(0,'H'): " + sb8); // Hello

        // // 9. length()
        // StringBuilder sb9 = new StringBuilder("hello");
        // System.out.println("length(): " + sb9.length()); // 5

        // // 10. setLength(newLength)
        // StringBuilder sb10 = new StringBuilder("hello java");
        // sb10.setLength(4);
        // System.out.println("setLength(5): " + sb10); // hell


        // reversing the sting using loop
        String str = "ritesh";
        String reverse = "";
        char ch;

        for (int i = 0; i < str.length(); i++) {

            ch = str.charAt(i);          // extract the each charcter 

            reverse = ch + reverse;
        }

        System.out.println(reverse);
    }
}
