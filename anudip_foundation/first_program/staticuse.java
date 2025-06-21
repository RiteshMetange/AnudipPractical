class Student {
    String name;
    int age;
    static String college = "MIT";

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + college);
    }
}

public class staticuse {
    public static void main(String[] args) {
        Student student1 = new Student("Ritesh", 20);
        Student student2 = new Student("Metange", 20);

        System.out.println("Before changing college: ");
        student1.displayInfo();
        student2.displayInfo();

        Student.college = "DY Patil";
        System.out.println("After changing college: ");
        student1.displayInfo();
        student2.displayInfo();
    }
}