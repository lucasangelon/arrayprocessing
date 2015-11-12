import java.util.List;

/**
 * Created by lucas on 12/11/2015.
 * Based on: http://java2novice.com/java-sorting-algorithms/merge-sort/
 */
public class Sorting {

    private int[] array;
    private int[] temporaryMergeArray;
    private int[] inputArray;
    private int length;

    public Sorting(List<Integer> values) {

        // Convert the list into an array for sorting/searching purposes.
        inputArray = new int[values.size()];

        for (int i = 0; i < values.size(); i++) {
            inputArray[i] = values.get(i);
        }
    }

    // Initializing the sort method.
    public void sort() {
        this.array = inputArray;
        this.length = inputArray.length;
        this.temporaryMergeArray = new int[length];
        mergeSort(0, length - 1);
    }

    // Merge Sort technique.
    private void mergeSort(int lowerIndex, int higherIndex) {

        // If there is data to sort.
        if (lowerIndex < higherIndex) {

            // Find the middle bit.
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Sorting the left side of the array.
            mergeSort(lowerIndex, middle);

            // Sorting the right side of the array.
            mergeSort(middle + 1, higherIndex);

            // Merging both partitions.
            mergePartitions(lowerIndex, middle, higherIndex);
        }
    }

    // Merging the partitions back together.
    private void mergePartitions(int lowerIndex, int middle, int higherIndex) {

        // Using the temporary array to merge the data.
        for (int i = lowerIndex; i <= higherIndex; i++) {
            temporaryMergeArray[i] = array[i];
        }

        // Defining the indexes.
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        // Merging until the indexes reach the middle index.
        while (i <= middle && j <= higherIndex) {

            if (temporaryMergeArray[i] <= temporaryMergeArray[j]) {
                // Merging onto the lower values of the array.
                array[k] = temporaryMergeArray[i];
                i++;
            } else {
                // Merging onto the higher values of the array.
                array[k] = temporaryMergeArray[j];
                j++;
            }

            // Counter insert items properly in the final array.
            k++;
        }

        // After everything has been sorted and merged, add it to a new array.
        while (i <= middle) {
            array[k] = temporaryMergeArray[i];
            k++;
            i++;
        }
    }

    // Prints the sorted array values.
    public void printValues() {

        System.out.println("Printing the Array sorted with the Merge Algorithm.");
        for (int i:inputArray) {
            System.out.println(i);
        }
    }

    // Returns the sorted array.
    public int[] getSortedArray() {
        return inputArray;
    }
}
