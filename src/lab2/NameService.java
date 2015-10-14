package lab2;

/**
 * This class provides various services relating to name manipulation. No output
 * should be performed here.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {

    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;

    /**
     * Finds and returns the last name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null, please try again");
        }
        String[] nameParts = fullName.split(" ");
        String lastPart = nameParts[LAST_NAME_IDX];
//        if (nameParts.length > 2 || nameParts.length <= 1) {
//            throw new IllegalArgumentException("Must have at least a first and a last name and no more than 2 names");
//
//            //could be more options for suffix's
//        } else if (lastPart.contains("jr.") || lastPart.contains("jr") || lastPart.contains("sr")
//                || lastPart.contains("sr.") || lastPart.contains("ii") || lastPart.contains("iii") || lastPart.contains("iv")
//                || lastPart.contains("ph.d.") || lastPart.contains("ph.d") || lastPart.contains("phd") || lastPart.contains("md")
//                || lastPart.contains("m.d.")) {
//            throw new IllegalArgumentException("Please do not add suffix to last name, please try again ");
//        } else {
            return nameParts[LAST_NAME_IDX];
//        }
    }

    /**
     * Finds and returns the first name from within a full name. Caution: No
     * validation is performed.
     *
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null, please try again");
        }
        String[] nameParts = fullName.split(" ");
        if (nameParts.length > 2 || nameParts.length <= 1) {
            throw new IllegalArgumentException("Must have at least a first and a last name and no more than 2 names");
        }
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     *
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {

        String[] nameParts = name.split(" ");
        if (nameParts.length > 2 || nameParts.length <= 1) {
            throw new IllegalArgumentException("Must have at least a first and a last name and no more than 2 names, please try again");
        }
        int nameLength;
        nameLength = nameParts[FIRST_NAME_IDX].length() + nameParts[LAST_NAME_IDX].length();
        return nameLength;

    }

}
