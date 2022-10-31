import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkingWithDates {
    public static void main(String[] args) {
        // задание даты (вариант 1)
        LocalDate tomBirthday = LocalDate.of(2001, 1, 30);
        // задание даты (вариант 2)
        LocalDate katyBirthday = LocalDate.parse("2003-05-30");
        // задание даты (вариант 3)
        LocalDate jackBirthday = LocalDate.parse("30.10.2005", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        // ВЫВОД ДАТ:
        
        // Том:
        System.out.println(tomBirthday); // 2001-01-30
        // форматирование даты
        System.out.println(tomBirthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))); // 30.01.2001
        
        // Кэти:
        System.out.println(katyBirthday); // 2003-05-30
        // форматирование даты
        System.out.println(katyBirthday.getDayOfMonth() + " " + katyBirthday.getDayOfWeek() + " " + katyBirthday.getMonthValue());
        // 30 FRIDAY 5
        System.out.println(katyBirthday.getDayOfMonth() + " " + katyBirthday.getDayOfWeek() + " " + katyBirthday.getMonth());
        // 30 FRIDAY MAY
        System.out.println(katyBirthday.format(DateTimeFormatter.ofPattern("dd LLL EE"))); // 30 май пт
        
        // Джек:
        System.out.println(jackBirthday); // 2005-10-30

        // СРАВНЕНИЕ ДАТ:
        // что раньше?
        System.out.println(tomBirthday.isBefore(katyBirthday)); // true

        // РАЗНИЦА ДАТ В ДНЯХ:
        System.out.println(tomBirthday.toEpochDay() - katyBirthday.toEpochDay()); // -850

        // ДАТА НАСТУПАЮЩАЯ СПУСТЯ ОПРЕДЕЛЁННОЕ ВРЕМЯ (например 3 месяца):
        System.out.println(jackBirthday.plusMonths(3)); // 2006-01-30
    }
}
