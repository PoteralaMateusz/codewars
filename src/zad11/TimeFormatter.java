package zad11;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        Map<String, Integer> time = new HashMap<>();
        time.put("s", LocalTime.MIN.plusSeconds(seconds).getSecond());
        time.put("m", LocalTime.MIN.plusSeconds(seconds).getMinute());
        time.put("h", LocalTime.MIN.plusSeconds(seconds).getHour());
        int counter = (int) time.values().stream().filter(integer -> integer == 0).count();

        return "";
    }

    public static void main(String[] args) {

        System.out.println(TimeFormatter.formatDuration(121));
    }
}
