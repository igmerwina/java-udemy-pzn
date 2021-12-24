package pzn.java.datetime;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneTest {
  @Test
  void testTimeZone(){
    TimeZone tz = TimeZone.getDefault();
    System.out.println(tz.getID() + "\n");

    String[] availableId = TimeZone.getAvailableIDs();
    Arrays.asList(availableId).forEach(zone -> {
      System.out.println(zone);
    });
  }

  @Test
  void getGmt(){
    Date date = new Date();
    System.out.println(date.toString());
    System.out.println(date.toGMTString());
  }
}
