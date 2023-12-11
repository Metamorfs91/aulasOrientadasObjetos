import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        LocalDate date01 = LocalDate.parse("2022-07-20");
        LocalDateTime date02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant date03 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("data = " + date01);
        System.out.println("data = " + date01.format(ftm1));
        System.out.println("data = " + ftm1.format(date01));
        System.out.println("data = " + date01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
