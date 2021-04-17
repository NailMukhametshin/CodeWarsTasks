package kata678;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {
    public static String[] solution(String s) {
        char[] chars = s.toCharArray();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (i <= chars.length - 2) {
                strings.add(chars[i] + "" + chars[i + 1]);
                i++;
            } else {
                strings.add(chars[i] + "_");
            }
        }
        return strings.toArray(new String[0]);
    }
}
