package club.elliotsewell;

public class TimeUtil {

    public static String toStringFormat(long timeInMillis) {
        // Format Key: days:minutes:hours:seconds
        String string;
        int SECOND = 1000;
        int MINUTE = SECOND * 60;
        int HOUR = MINUTE * 60;
        int DAY = HOUR * 24;

        long days = (int) (timeInMillis / DAY);
        long hours = (int) ((timeInMillis % DAY) / HOUR);
        long minutes = (int) ((timeInMillis % HOUR) / MINUTE);
        long seconds = (int) ((timeInMillis % HOUR) / SECOND);

        if (days > 0) {
            string = "" + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.";
        } else {
            string = "" + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.";
        }
        return string;
    }

}
