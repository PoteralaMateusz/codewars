package timeFormatter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        long years = seconds / 31536000;
        long value = seconds % 31536000;

        Duration duration = Duration.ofSeconds(value);
        long days = duration.toDaysPart();
        long hours = duration.toHoursPart();
        long min = duration.toMinutesPart();
        long sec = duration.toSecondsPart();
        years = years + days / 365;
        days = days % 365;

        List<String> timeFormat = new ArrayList<>();
        addToTimeFormat(years, "year", timeFormat);
        addToTimeFormat(days, "day", timeFormat);
        addToTimeFormat(hours, "hour", timeFormat);
        addToTimeFormat(min, "minute", timeFormat);
        addToTimeFormat(sec, "second", timeFormat);

        if (timeFormat.size() == 1) {
            return timeFormat.get(0);
        }

        if (timeFormat.size() == 2) {
            return timeFormat.get(0) + " and " + timeFormat.get(1);
        }

        if (timeFormat.size() == 3) {
            return timeFormat.get(0) + ", " + timeFormat.get(1) + " and " + timeFormat.get(2);
        }

        if (timeFormat.size() == 4) {
            return timeFormat.get(0) + ", " + timeFormat.get(1) + ", " + timeFormat.get(2) + " and " + timeFormat.get(3);
        }

        if (timeFormat.size() == 5) {
            return timeFormat.get(0) + ", " + timeFormat.get(1) + ", " + timeFormat.get(2) + ", " + timeFormat.get(3) + " and " + timeFormat.get(4);
        }

        return "?";
    }

    private static void addToTimeFormat(long value, String timeName, List<String> timeFormat) {
        if (value == 1) {
            timeFormat.add(value + " " + timeName);
        }
        if (value > 1) {
            timeFormat.add(value + " " + timeName + "s");
        }
    }

    public static void main(String[] args) {

        System.out.println(TimeFormatter.formatDuration(32536001));
    }
}
