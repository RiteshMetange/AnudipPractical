public class largestarray {
    public static void main(String[] args) {
        int[] array = {10, 25, 5, 42, 17};
        int largest = array[0];

        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
            secondLargest = largest;
            largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
            secondLargest = array[i];
            }
        }
        System.out.println("Second largest number in the array is: " + secondLargest);

        System.out.println("Largest number in the array is: " + largest);
    }
}
