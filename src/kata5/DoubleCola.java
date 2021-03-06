package kata5;

public class DoubleCola {
    public static String WhoIsNext(String[] names, int n) {
        int temp = 0;
        int count = 1;
        for (int i = 1; n / (temp + names.length * i) >= 1; i *= 2) {
            temp = temp + names.length * i;
            count = i;
        }
        return names[(n - temp) / (count * 2)];
    }
}