package pzn.java.datetime;

import org.junit.jupiter.api.Test;
import org.xml.sax.helpers.AttributesImpl;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LegacyTest {

  /**
   * Konversi dari legacy yang baru
   * harus dibuat instant dlu biar baru
   */
  @Test
  void testLegacy(){
    Date date = new Date();
    Instant instant = date.toInstant();
    System.out.println(instant);
    System.out.println(date);

    Calendar calendar = Calendar.getInstance();
    Instant calInstant = calendar.toInstant();
    System.out.println(calInstant);
    System.out.println(calendar);

    TimeZone tz = TimeZone.getDefault();
    System.out.println(tz);
    ZoneId zoneId = tz.toZoneId();
    System.out.println(zoneId);
  }

  /**
   * Konversi dari legacy yang baru
   * harus dibuat instant dlu biar baru
   */
  @Test
  void testNewToLegacy(){
    ZonedDateTime zdt = ZonedDateTime.now();
    Date date = Date.from(zdt.toInstant());
    Calendar cal = GregorianCalendar.from(zdt);
    ZoneId zoneId = ZoneId.systemDefault();
    TimeZone tz = TimeZone.getTimeZone(zoneId);

    System.out.println(zdt + "\n" + date + "\n" + cal + "\n" + zoneId + "\n" + tz);
  }
}
