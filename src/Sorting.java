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
        inputArray = new int[values.size()];

        for (int i = 0; i < values.size(); i++) {
            inputArray[i] = values.get(i);
        }
    }

    public void sort() {
        this.array = inputArray;
        this.length = inputArray.length;
        this.temporaryMergeArray = new int[length];
        mergeSort(0, length - 1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Sorting the left side of the array.
            mergeSort(lowerIndex, middle);

            // Sorting the right side of the array.
            mergeSort(middle + 1, higherIndex);

            // Merging both partitions.
            mergePartitions(lowerIndex, middle, higherIndex);
        }
    }

    private void mergePartitions(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            temporaryMergeArray[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (temporaryMergeArray[i] <= temporaryMergeArray[j]) {
                array[k] = temporaryMergeArray[i];
                i++;
            } else {
                array[k] = temporaryMergeArray[j];
                j++;
            }

            k++;
        }

        while (i <= middle) {
            array[k] = temporaryMergeArray[i];
            k++;
            i++;
        }
    }

    public void printValues() {

        System.out.println("Printing the Array sorted with the Merge Algorithm.");
        for (int i:inputArray) {
            System.out.println(i);
        }
    }
}
