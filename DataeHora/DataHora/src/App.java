
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
//Biblioteca utilizada para trabalhar com data e hora 
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Exibe Data Atual
        LocalDate d01 = LocalDate.now();
        // Exibe Data Atual e hora
        LocalDateTime d02 = LocalDateTime.now();
        // Exibe data e hora no padram GMT(Global Moment Time)
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-03-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-03-20T01:30:26");
        Instant d06 = Instant.parse("2022-12-05T01:30:26Z");
        OffsetDateTime d07 = OffsetDateTime.parse("2022-12-05T01:30:26-03:00");
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        LocalDate d10 = LocalDate.of(2022, 07, 10);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30, 0);
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toInstant());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
        // toString transforma objeto
        // toInstant adiciona o fuso horario desejado
        // dos Tipos
        // LocalDate,LocalDateTime,Instant em Texto
    }
}
