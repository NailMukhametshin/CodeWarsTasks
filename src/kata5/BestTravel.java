package kata5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BestTravel {
    public static Integer chooseBestSum(int distance, int townsQuantity, List<Integer> ls) {
        List<Integer> distancesList = new ArrayList<>();
        if (ls.size() < townsQuantity) {
            return null;
        }
        for (int i = 0; i < ls.size(); i++) {
            for (int j = 0; j < ls.size(); j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 0; k < ls.size(); k++) {
                    if (j == k || i == k) {
                        continue;
                    }
                    distancesList.add(ls.get(i) + ls.get(j) + ls.get(k));
                }
            }
        }
        Collections.sort(distancesList);

        if (distancesList.get(0) > distance) {
            return distancesList.get(0);
        }

        if (distancesList.get(distancesList.size() - 1) < distance) {
            return distancesList.get(distancesList.size() - 1);
        }

        for (int i = 0; i < distancesList.size(); i++) {
            if (distancesList.get(i) > distance) {
                return distancesList.get(i - 1);
            }
        }
        return 0;
    }
}
