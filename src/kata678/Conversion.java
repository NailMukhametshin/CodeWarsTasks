package kata678;

public class Conversion {
    public static String romeConverter(int iterNumber, int number) {
        String one = "";
        String five = "";
        String ten = "";
        String result = "";
        switch (iterNumber) {
            case 3:
                one = "C";
                five = "D";
                ten = "M";
                break;
            case 2:
                one = "X";
                five = "L";
                ten = "C";
                break;
            case 1:
                one = "I";
                five = "V";
                ten = "X";
                break;
        }
        switch (number) {
            case 1:
                result = one;
                break;
            case 2:
                result = result.concat(one).concat(one);
                break;
            case 3:
                result = result.concat(one).concat(one).concat(one);
                break;
            case 4:
                result = result.concat(one).concat(five);
                break;
            case 5:
                result = five;
                break;
            case 6:
                result = result.concat(five).concat(one);
                break;
            case 7:
                result = result.concat(five).concat(one).concat(one);
                break;
            case 8:
                result = result.concat(five).concat(one).concat(one).concat(one);
                break;
            case 9:
                result = result.concat(one).concat(ten);
                break;
            case 10:
                result = ten;
                break;
        }
        return result;
    }

    public static String solution(int n) {
        String result = "";
        for (int i = 1; i <= 3; i++) {
            result = romeConverter(i, n % 10) + result;
            n = n / 10;
        }

        for (int i = 1; i <= n % 10; i++) {
            result = "M" + result;
        }

        return result;
    }
}