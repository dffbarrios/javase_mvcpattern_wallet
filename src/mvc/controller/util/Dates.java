package mvc.controller.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Diego SNP3004EX
 */
public class Dates {
    public static int getCurrentDateIntFormat(){
        
        Calendar calendar = new GregorianCalendar();
 
        int year       = calendar.get(Calendar.YEAR);
        int month      = calendar.get(Calendar.MONTH);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH); // Jan = 0, not 1
        //int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
        //int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        //int weekOfMonth= calendar.get(Calendar.WEEK_OF_MONTH);

        //int hour       = calendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute     = calendar.get(Calendar.MINUTE);
        int second     = calendar.get(Calendar.SECOND);
        int millisecond= calendar.get(Calendar.MILLISECOND);
        
        String intDate = Integer.toString(year) + Integer.toString(month) + Integer.toString(dayOfMonth) 
                + Integer.toString(hourOfDay) + Integer.toString(minute) + Integer.toString(second)
                + Integer.toString(millisecond);
        
        return Integer.parseInt(intDate);
    }
}
