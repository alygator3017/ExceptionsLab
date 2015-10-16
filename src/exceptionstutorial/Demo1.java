package exceptionstutorial;

/**
 *
 * @author Alyson
 */
public class Demo1 {

    public void processArray() throws ArrayIndexOutOfBoundsException {
        int[] ints = {1, 2};

        int x = 0;
        int index = 3;

        x = ints[index];
        if(index < 0 || index > ints.length - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        System.out.println("Array value is " + x);

        System.out.println("Current value of x is: " + x);
        System.out.println("All Done");
    }
}
