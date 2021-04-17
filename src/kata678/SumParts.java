package kata678;

public class SumParts {
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        int elementsSum = 0;
        for (int i = ls.length - 1; i >= 0; i--) {
            elementsSum += ls[i];
            result[i] = elementsSum;
        }
        return result;
    }
}
