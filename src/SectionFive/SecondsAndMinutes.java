package SectionFive;

public class SecondsAndMinutes {

    private static final String INVALID = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(3800));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59 )) {
            return INVALID;
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h ";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m ";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + minutesString + secondsString;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID;
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }

}
