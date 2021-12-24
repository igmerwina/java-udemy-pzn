package pzn.java.datetime;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationTest {
  @Test
  void get(){
    Duration duration = Duration.ofHours(24);

    System.out.println(duration.toDays());
    System.out.println(duration.toHours());
    System.out.println(duration.toSeconds());
    System.out.println(duration.toMillis());
    System.out.println(duration.toNanos());
  }

  @Test
  void between(){
    Duration dur = Duration.between(LocalDateTime.now(), LocalDateTime.now().plusHours(2));
    System.out.println(dur.toHours());

    Duration dur2 = Duration.between(LocalDateTime.now().plusHours(10), LocalDateTime.now());
    System.out.println(dur2.toHours());
  }
}
