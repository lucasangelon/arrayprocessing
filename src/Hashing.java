import java.util.ArrayList;
import java.util.List;

/**
 * Created by lucas on 12/11/2015.
 */
public class Hashing {

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

        // Hashing data.
        for (int i = 0; i < (name.length()); i++) {
           int character = (int) name.charAt(i);

           int newCharacter = character + VARIATE_CONSTANT;
           hashedName = hashedName + (char) newCharacter;
        }

        // Adds the hashed name to the new array.
        hashedNames.add(hashedName);
    }

    public void addValue(int value) {
        originalValues.add(value);

        int hashedValue = 0;

        hashedValue = value + VARIATE_CONSTANT;

        hashedValues.add(hashedValue);
    }

    public void restoreArray() {
        // Creating a new array to restore the data.

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

    public void getOriginalNames() {
        System.out.println("Strings\n\n");
        originalNames.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Values\n\n");
        originalValues.forEach(System.out::println);
        System.out.println("\n");
    }

    public void getHashedNames() {
        System.out.println("Strings\n\n");
        hashedNames.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Values\n\n");
        hashedValues.forEach(System.out::println);
        System.out.println("\n");
    }

    public void getRestoredArray() {
        System.out.println("Strings\n\n");
        restoredArray.forEach(System.out::println);
        System.out.println("\n");

        System.out.println("Values\n\n");
        restoredValues.forEach(System.out::println);
        System.out.println("\n");

    }
}
