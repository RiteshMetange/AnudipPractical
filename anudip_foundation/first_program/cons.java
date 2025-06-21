// cons.java
public class cons {

    String m,n;
    cons(String m,String n) {       // parameterize cons
        this.m=m;
        this.n=n;
    }

    cons(cons c){        // copy cons
        this.m=c.m;
        this.n=c.n;
    }           

    void display(){
        System.out.println(m+" "+n);
    }


            public static void main(String[] args) {
        cons obj = new cons("ritesh" , "sweta");
        
        cons copy= new cons(obj);
        copy.display();
    }
}