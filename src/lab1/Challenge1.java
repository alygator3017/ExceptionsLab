package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using Java
 * Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong with
 * this program and use exception handling where appropriate to prevent the
 * program from crashing. In addition you must display a friendly error message
 * in a JOptionPane and ask the user to try again. (Yes, this violates the
 * Single Responsibility Principle, but for this lab, we'll overlook that.)
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();

        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        String lastName = null;
        try {
            lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException a) {
            System.out.println(a);
        }
    }

    /**
     * extracts the last name from the full name
     *
     * @param fullName - may not be null or empty, may not be more than 5 names
     * (?) must have a first name and a last name cannot prevent someone from
     * putting their name in backwards.
     * @return either nameParts -1 because it is an array or nameParts - 2 if it
     * has a suffix
     */
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName == null || fullName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null, please try again");
        }
        String[] nameParts = fullName.split(" ");
        String lastPart = nameParts[nameParts.length - 1].toLowerCase();
        if (nameParts.length > 5 || nameParts.length <= 1) {
            throw new IllegalArgumentException("Must have at least a first and a last name and no more than 5 names");

            //could be more options for suffix's
        } else if (lastPart.contains("jr.") || lastPart.contains("jr") || lastPart.contains("sr")
                || lastPart.contains("sr.") || lastPart.contains("ii") || lastPart.contains("iii") || lastPart.contains("iv")
                || lastPart.contains("ph.d.") || lastPart.contains("ph.d") || lastPart.contains("phd") || lastPart.contains("md")
                || lastPart.contains("m.d.")) {
            return nameParts[nameParts.length - 2];
        } else {
            return nameParts[nameParts.length - 1];
        }
    }

}
