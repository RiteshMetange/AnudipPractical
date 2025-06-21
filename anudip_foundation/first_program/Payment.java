abstract class process {
    abstract void process_payment(Double a);
}

class cardpayment extends process {
    @Override
    void process_payment(Double a) {
        System.out.println("the card payment" + a);
    }

}

class upipayment extends process {
    @Override
    void process_payment(Double a) {
        System.out.println("the UPI payment" + a);
    }

}

public class Payment {

    public static void main(String[] args) {
        process obj = new cardpayment();
        process obj2 = new upipayment();
        obj.process_payment(12.12);
        obj2.process_payment(112.34);

    }

}