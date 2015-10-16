package exceptionstutorial;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Alyson
 */
public class Demo2 {
    public Date formatDate(String sDate)throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy");
        return sdf.parse(sDate);
    }
}
