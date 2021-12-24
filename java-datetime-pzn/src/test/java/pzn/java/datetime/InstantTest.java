package pzn.java.datetime;

import org.junit.jupiter.api.Test;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class InstantTest {
  @Test
  void testInstant() throws Throwable{
    Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

    Instant instant = clock.instant();
    System.out.println(instant);

    Thread.sleep(2_000);

    Instant instant2 = clock.instant();
    System.out.println(instant2);
  }
}
