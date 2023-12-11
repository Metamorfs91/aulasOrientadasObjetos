import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
    public static void main(String[] args) {
        LocalDate date01 = LocalDate.parse("2022-07-20");
        LocalDateTime date02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant date03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(date03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(date03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(date03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(date03, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("date01 = " + date01.getDayOfMonth());
        System.out.println("date01 = " + date01.getMonthValue());

        System.out.println("date02 = " + date02.getHour());
        System.out.println("date02 = " + date02.getMinute());

    }
}
