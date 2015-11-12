/**
 * Created by lucas on 12/11/2015.
 */
public class Initializer {

    public static void main(String [] args) {

        // Hashing Section
        Hashing hashClass = new Hashing();
        hashClass.addName("Lucas");
        hashClass.addName("Jack");
        hashClass.addName("Gustavo");
        hashClass.addName("James");
        hashClass.addName("Nichola");

        hashClass.addValue(10);
        hashClass.addValue(55);
        hashClass.addValue(2);
        hashClass.addValue(56);
        hashClass.addValue(8);
        hashClass.addValue(23);
        hashClass.addValue(54);
        hashClass.addValue(11);

        // Unhashes the array.
        hashClass.restoreArray();

        System.out.println("Hashed Array\n");
        hashClass.printHashedArrays();
        System.out.println("\n\n");

        System.out.println("Restored Array\n");
        hashClass.printRestoredArrays();
        System.out.println("\n\n");

        // Sorting section
        Sorting sortingClass = new Sorting(hashClass.getOriginalValuesArray());

        sortingClass.sort();
        sortingClass.printValues();

        // Searching section
        Searching searchClass = new Searching();

        searchClass.searchValue(sortingClass.getSortedArray(), 54);
        searchClass.searchValue(sortingClass.getSortedArray(), 27);
    }
}
