package day01;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 25, 30, 45, 60};
        int max = array[0]; // Assume first element as maximum

        // Iterate through the array to find the maximum element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + max);
    }
    
}
