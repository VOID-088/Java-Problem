

public class ReverseArray {

    public static void main(String[] args) {
        
        // Here is our input array. You can change these numbers to test it.
        int[] arr = {10, 20, 30, 40, 50};

        // Let's print a message to make the output clear.
        System.out.println("Array in reverse order:");

        // This is the core logic.
        // We start our loop at the last element of the array (arr.length - 1).
        // We continue as long as our index 'i' is 0 or more.
        // In each step, we decrease 'i' by 1 (i--).
        for (int i = arr.length - 1; i >= 0; i--) {
            
            // Print the element at the current index, followed by a space.
            System.out.print(arr[i] + " ");
        }
    }
}
