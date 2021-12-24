package pzn.java.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
  @Test
  void testLocalDate(){
    LocalDate local = LocalDate.now();
    LocalDate localDate = LocalDate.of(1992, Month.OCTOBER, 28);
    System.out.println(local);
    System.out.println(localDate);
  }

  @Test
  void testWith(){
    LocalDate loc = LocalDate.now();
    LocalDate locWith = loc.withYear(1992).withMonth(2);
    System.out.println(locWith);
  }

  @Test
  void testAddition(){
    LocalDate loc = LocalDate.now();
    LocalDate locWith = loc.plusYears(2).plusMonths(2);
    System.out.println(locWith);
  }

  @Test
  void testGetDateDetail(){
    LocalDate loc = LocalDate.now();
    System.out.println(loc.getYear());
    System.out.println(loc.getMonth());
    System.out.println(loc.getDayOfMonth());
  }
}
