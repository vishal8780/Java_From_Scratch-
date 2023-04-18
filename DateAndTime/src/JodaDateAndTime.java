import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class JodaDateAndTime {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.now();
        int year=localDate.getYear();
        int  month=localDate.getMonthValue();
        int day=localDate.getDayOfMonth();
        System.out.println(day + "/" + month + "/"+ year );
        LocalTime time=LocalTime.now();
        int hour=time.getHour();
        int minute=time.getMinute();
        int second= time.getSecond();
        System.out.println(hour+"/"+minute+"/"+second);


    }
}
