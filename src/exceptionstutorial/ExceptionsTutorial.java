package exceptionstutorial;

//import java.text.ParseException;
//import java.util.Date;

/**
 *
 * @author Alyson
 */
public class ExceptionsTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Demo2 demo = new Demo2();
//        try {
//            demo.formatDate("12/12");
//        } catch(Exception e){
//            System.out.println(e);
//        }
        
        Demo1 demo = new Demo1();
        try{
            demo.processArray();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        
    }

}
