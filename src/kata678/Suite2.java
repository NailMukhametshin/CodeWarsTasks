package kata678;

import java.util.Arrays;

public class Suite2 {

    public static String game(long n) {
        long[] longs;

        if (n == 0) {
            longs = new long[]{0};
        } else {
            if (n * n % 2 == 0) {
                longs = new long[]{(long) (Math.pow(n, 2) / 2)};
            } else {
                longs = new long[]{(long) Math.pow(n, 2), 2};
            }
        }

        return Arrays.toString(longs);
    }
}