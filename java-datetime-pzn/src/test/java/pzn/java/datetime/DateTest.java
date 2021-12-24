package pzn.java.datetime;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTest {
  @Test
  void testTimeMilis(){
    var date = new Date(System.currentTimeMillis());
    System.out.println(date);
  }
}
