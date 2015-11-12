/**
 * Created by lucas on 12/11/2015.
 * Based on: http://www.java-tips.org/java-se-tips-100019/24-java-lang/1888-recursive-binary-search-implementation-in-java.html
 */
public class Searching {

    public void searchValue(int[] sortedArray, int value) {
        int index = search(sortedArray, 0, (sortedArray.length - 1), value);

        if (index == -1) {
            System.out.println("Value " + value + " not found in the array.");
        } else {
            System.out.println("Value " + value + " found at position " + (index + 1) + " in the array.");
        }
    }

    private int search(int[] sortedArray, int low, int high, int value) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (low < high) {
            if (sortedArray[mid] < value) {
                return search(sortedArray, mid + 1, high, value);
            } else if (sortedArray[mid] > value) {
                return search(sortedArray, low, mid - 1, value);
            } else {
                return mid;
            }
        }

        return -1;
    }
}
