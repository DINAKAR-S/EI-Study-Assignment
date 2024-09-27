package utils;

import java.util.regex.Pattern;

public class TimeValidator {
    private static final Pattern TIME_PATTERN = Pattern.compile("^([01]?\\d|2[0-3]):[0-5]\\d$");

    public static void validateTime(String time) {
        if (!TIME_PATTERN.matcher(time).matches()) {
            throw new IllegalArgumentException("Invalid time format. Expected HH:MM.");
        }
    }
}
