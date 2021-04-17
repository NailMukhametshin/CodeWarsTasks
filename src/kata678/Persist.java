package kata678;

class Persist {
    public static int persistence(long n) {
        int result = 0;

        while (n / 10 >= 1) {
            result += 1;
            int temp = 1;
            while (n / 10 >= 1) {
                temp *= n % 10;
                n = n / 10;
            }
            temp = (int) (temp * (n % 10));
            n = temp;
        }

        return result;
    }
}
