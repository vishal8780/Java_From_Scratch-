import java.util.Date;

public class DateandTime {
    public static void main(String[] args) {
        Date dt=new Date();
        System.out.println(dt);
       long newdate=dt.getTime();

        java.sql.Date dt1=new java.sql.Date(newdate);
        System.out.println(dt1);
    }
}
