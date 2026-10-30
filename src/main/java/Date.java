import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(formatter));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(formatter1));

        System.out.println(now.getDayOfWeek() + ", " + now.getMonth() + " " + now.getDayOfMonth() + ", " + now.getYear() );
        System.out.println(now.getDayOfWeek() + ", " + now.getMonth() + " " + now.getDayOfMonth() + ", " + now.getYear() + " " + now.getHour() + ":" + now.getMinute() );
    }
}
