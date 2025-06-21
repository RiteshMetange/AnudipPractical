class one{ 
    String name; 
    int age; 

    void printinfo(String name, int age){ 
        this.name = name; 
        this.age= age;
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);

    }
    void printinfo(int age){ 
        System.out.println("age : "+this.age);
    }
}

public class poly {
    public static void main(String[] args) {
        one s1 = new one(); 
        s1.printinfo("Piyush", 18);
        s1.printinfo(18);
    }
    }
// }only possible method must be overriden not overloaded not static or private method scalablity