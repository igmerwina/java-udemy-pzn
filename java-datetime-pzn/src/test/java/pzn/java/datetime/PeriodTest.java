package pzn.java.datetime;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {
  @Test
  void testBetween(){
    Period period = Period.between(LocalDate.of(1992, Month.OCTOBER, 28), LocalDate.now());
    System.out.println(period);
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
  }
}
