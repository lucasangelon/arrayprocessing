/**
 * Created by lucas on 12/11/2015.
 */
public class Initializer {

    public static void main(String [] args) {

        // Hashing Section
        Hashing hashClass = new Hashing();

        // Adding to the String Array, extra bit.
        hashClass.addName("Lucas");
        hashClass.addName("Jack");
        hashClass.addName("Gustavo");
        hashClass.addName("James");
        hashClass.addName("Nichola");

        // Adding to the Integer Array.
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

        // Prints hashed arrays.
        System.out.println("Hashed Array\n");
        hashClass.printHashedArrays();
        System.out.println("\n\n");

        // Prints restored arrays.
        System.out.println("Restored Array\n");
        hashClass.printRestoredArrays();
        System.out.println("\n\n");

        // Sorting section
        Sorting sortingClass = new Sorting(hashClass.getOriginalValuesArray());

        // Sorts values and prints them.
        sortingClass.sort();
        sortingClass.printValues();

        // Searching section
        Searching searchClass = new Searching();

        // Searches for a value that exists within the array and one that does not.
        searchClass.searchValue(sortingClass.getSortedArray(), 54);
        searchClass.searchValue(sortingClass.getSortedArray(), 27);

        // Ends the application.
        System.out.println("Closing application.");
        System.exit(0);
    }
}
