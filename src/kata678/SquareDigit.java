package kata678;

public class SquareDigit {
    public int squareDigits(int n) {
        String resultDigitAsString = "";
        if (n == 0) {
            resultDigitAsString = "0";
        }
        while (n >= 1) {
            resultDigitAsString = (int) Math.pow(n % 10, 2) + resultDigitAsString;
            n = n / 10;
        }
        return Integer.parseInt(resultDigitAsString);
    }
}
