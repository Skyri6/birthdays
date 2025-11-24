import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        int day = 1;
        int month = 1;
        int year = 1990;


        System.out.println(collectBirthdays(year, month, day));
    }

    public static String collectBirthdays(int year, int month, int day) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - EEE").localizedBy(new Locale("us"));
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(year,month,day);

        String addDate = "";
        int i = 0;



        while ( birthday.isBefore(now)) {
            addDate =  addDate + i++ + " - "   + formatter.format(birthday) +"\n";
            birthday = birthday.plusYears(1);


        }
        return addDate;
    }
}
