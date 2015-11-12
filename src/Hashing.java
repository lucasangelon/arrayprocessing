import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 12/11/2015.
 */
public class Hashing {

    // Declaring the arrays and the constant through which the hashing will operate.
    private final int VARIATE_CONSTANT = 25;
    private List<String> originalNames;
    private List<String> hashedNames;
    private List<String> restoredArray;

    private List<Integer> originalValues;
    private List<Integer> hashedValues;
    private List<Integer> restoredValues;

    public Hashing() {
        instantiateArrays();
    }

    private void instantiateArrays() {
        // Instantiating arrays.
        originalNames = new ArrayList<String>();
        hashedNames = new ArrayList<String>();
        restoredArray = new ArrayList<String>();

        originalValues = new ArrayList<Integer>();
        hashedValues = new ArrayList<Integer>();
        restoredValues = new ArrayList<Integer>();
    }

    public void addName(String name) {
        originalNames.add(name);

        String hashedName = "";

        // Hashing data. Caesar Shift.
        for (int i = 0; i < (name.length()); i++) {
           // Get the int value for the character.
           int character = (int) name.charAt(i);

           // Add the variation to the int value retrieved.
           int newCharacter = character + VARIATE_CONSTANT;

           // Cast it to a char and add it to the "hashedName".
           hashedName = hashedName + (char) newCharacter;
        }

        // Adds the hashed name to the new array.
        hashedNames.add(hashedName);
    }

    public void addValue(int value) {
        originalValues.add(value);

        int hashedValue = 0;

        // Add the constant to the value in order to "hash" it.
        hashedValue = value + VARIATE_CONSTANT;

        // Add it to the array.
        hashedValues.add(hashedValue);
    }

    // Adds the data to a new array to display the "unhashing" process.
    public void restoreArray() {

        // Strings
        for (String hashedName : hashedNames) {

            String restoredName = "";

            for (int i = 0; i < (hashedName.length()); i++) {
                int character = (int) hashedName.charAt(i);

                int oldCharacter = character - VARIATE_CONSTANT;
                restoredName = restoredName + (char) oldCharacter;
            }

            restoredArray.add(restoredName);
        }

        // Integers
        for (int hashedValue : hashedValues) {

            int restoredValue = 0;

            restoredValue = hashedValue - VARIATE_CONSTANT;

            restoredValues.add(restoredValue);
        }
    }

    public void printOriginalArrays() {
        System.out.println("Strings\n\n");
        originalNames.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Values\n\n");
        originalValues.forEach(System.out::println);
        System.out.println("\n");
    }

    public void printHashedArrays() {
        System.out.println("Strings\n\n");
        hashedNames.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Values\n\n");
        hashedValues.forEach(System.out::println);
        System.out.println("\n");
    }

    public void printRestoredArrays() {
        System.out.println("Strings\n\n");
        restoredArray.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Values\n\n");
        restoredValues.forEach(System.out::println);
        System.out.println("\n");
    }

    public List<Integer> getOriginalValuesArray() {
        return this.originalValues;
    }
}
