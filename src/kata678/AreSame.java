package kata678;

import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null || a.length != b.length) {
            return false;
        }

        for (int i = 1; i <= b.length; i++) {
            double tempDouble = Math.sqrt(b[i - 1]);
            if ((int) tempDouble != tempDouble) {
                return false;
            }
            b[i - 1] = (int) tempDouble;
            a[i - 1] = Math.abs(a[i - 1]);
        }

        return Arrays.equals(Arrays.stream(a).sorted().toArray(),
                             Arrays.stream(b).sorted().toArray());
    }
}
