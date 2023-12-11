import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {

        LocalDate date01 = LocalDate.parse("2022-07-20");
        LocalDateTime date02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant date03 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate PastWeekLocalDate = date01.minusDays(7);
        LocalDate NextWeekLocalDate = date01.plusDays(7);

        System.out.println("PastWeekLocalDate = " + PastWeekLocalDate);
        System.out.println("NextWeekLocalDate = " + NextWeekLocalDate);

        LocalDateTime PastWeekLocalDateTime = date02.minusDays(7);
        LocalDateTime NextweekLocalDateTime = date02.plusDays(7);

        System.out.println("PastWeekLocalDateTime = " + PastWeekLocalDateTime);
        System.out.println("NextWeekLocalDateTime = " + NextweekLocalDateTime);

        Instant PastWeekInstant = date03.minus(7, ChronoUnit.DAYS);
        Instant NextWeekInstant = date03.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + PastWeekInstant);
        System.out.println("NextWeekInstant = " + NextWeekInstant);

        Duration t1 = Duration.between(PastWeekLocalDateTime, date02);
        Duration t2 = Duration.between(PastWeekLocalDate.atTime(0, 0), date01.atTime(0, 0));
        Duration t3 = Duration.between(PastWeekInstant, date03);
        Duration t4 = Duration.between(date03, PastWeekInstant);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());

    }
}
