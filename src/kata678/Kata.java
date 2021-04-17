package kata678;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String result = "(xxx) xxx-xxxx";

        for (int number : numbers) {
            result = result.replaceFirst("x", String.valueOf(number));
        }
        return result;
    }
}