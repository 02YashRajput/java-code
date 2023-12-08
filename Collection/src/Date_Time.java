import java.time.*;
public class Date_Time {

    public static void main(String[] args) {
        // java.util.ArrayList <Integer> list = new java.util.ArrayList<Integer>();
        // java.util.Date dt = new java.util.Date();
        // long time = dt.getTime();
        // System.out.println(dt);
        // System.out.println(time);
        // java.sql.Date date = new java.sql.Date(time);
        // System.out.println(date);
        

        // LocalTime lt = LocalTime.now();
        // System.out.println(lt);
        // System.out.println(lt.getSecond());
        // System.out.println(lt.getMinute());
        // System.out.println(lt.getHour());
        // System.out.println(lt.getNano());


        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getChronology());
        
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.getEra());
        System.out.println(ld.getMonthValue());
        System.out.println(ld.getDayOfWeek());
    }
}
