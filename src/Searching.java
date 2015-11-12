/**
 * Created by lucas on 12/11/2015.
 * Based on: http://www.java-tips.org/java-se-tips-100019/24-java-lang/1888-recursive-binary-search-implementation-in-java.html
 */
public class Searching {

    // Searches for a value in the array.
    public void searchValue(int[] sortedArray, int value) {
        int index = search(sortedArray, 0, (sortedArray.length - 1), value);

        // Display a message explaining the result.
        if (index == -1) {
            System.out.println("Value " + value + " not found in the array.");
        } else {
            System.out.println("Value " + value + " found at position " + (index + 1) + " in the array.");
        }
    }

    // Recursively search for a value within the array.
    private int search(int[] sortedArray, int low, int high, int value) {

        // Check if search parameters are valid.
        if (low > high) {
            return -1;
        }

        // Define the middle of the array.
        int mid = (low + high) / 2;

        // If there is a range to be searched in:
        if (low < high) {

            // If the value is lower than the middle value of the array,
            // search the lower values side.
            if (sortedArray[mid] < value) {
                return search(sortedArray, mid + 1, high, value);
            }

            // If the value is higher than the middle value of the array,
            // search the higher values side.
            else if (sortedArray[mid] > value) {
                return search(sortedArray, low, mid - 1, value);
            }

            // If it is the middle value.
            else {
                return mid;
            }
        }

        // If nothing is found, return -1 for the condition.
        return -1;
    }
}
