package co.com.mrsoft.test.java10;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import static java.util.TimeZone.LONG;

/**
 * Examples of Additional Unicode Language-Tag Extensions.
 */
public class Example3 {
    public static void main(String[] args) {
        Locale locale = Locale.forLanguageTag("de-DE-u-cu-usd-fw-wed-tz-uslax");

        Currency currency = Currency.getInstance(locale);
        Calendar calendar = Calendar.getInstance(locale);
        DayOfWeek firstDayOfWeek = DayOfWeek.of((calendar.getFirstDayOfWeek() + 5) % 7 + 1);

        DateFormat dateFormat = DateFormat.getTimeInstance(LONG, locale);
        String time = dateFormat.format(new Date());

        System.out.println("currency       = " + currency);
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("time           = " + time);
    }
}
