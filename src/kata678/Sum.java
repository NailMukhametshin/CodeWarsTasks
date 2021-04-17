package kata678;

public class Sum {
    public int GetSum(int a, int b) {
        if (a > b) {
            int c;
            c = a;
            a = b;
            b = c;
        }
        int result = b;
        while (a != b) {
            result += a;
            a++;
        }
        return result;
    }
}
