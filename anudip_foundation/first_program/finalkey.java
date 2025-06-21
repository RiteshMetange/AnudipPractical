// class Vehicle {
//     final void speed() {
//         System.out.println("Speed limit: 120 km/h");
//     }
// }

// class Car extends Vehicle {
//     @Override
//     void speed() {
//         System.out.println("Speed limit: 150 km/h");
//     }
// }

// final class TwoWheeler {
//     void speed() {
//         System.out.println("Speed limit: 100 km/h");
//     }
// }

// class Bike extends TwoWheeler {
//     // Cannot override speed() method here as TwoWheeler is final
// }

// public class finalkey {
//     public static void main(String[] args) {
//         final int constantValue = 10;
//         // constantValue = 20; // Will cause a compilation error if uncommented as final keywordmakes a variable immutable/constant
//         System.out.println("The constant value is: " + constantValue);
//     }
// }