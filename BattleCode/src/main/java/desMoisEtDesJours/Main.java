package desMoisEtDesJours;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void combien(String d1, String d2){
        LocalDate date1 = LocalDate.parse(d1, formatter);
        LocalDate date2 = LocalDate.parse(d2, formatter);

        long days1 = ChronoUnit.DAYS.between(date1, date1.withDayOfMonth(date1.lengthOfMonth())) + 1;
        long months = ChronoUnit.MONTHS.between(date1, date2);
        long days2 = ChronoUnit.DAYS.between(date2.withDayOfMonth(1),date2) + 1;

        System.out.println(days1+"j_|_"+months+"m_|_"+days2+"j");
    }

    public static void main(String[] args){
        combien(args[0], args[1]);
    }
}
