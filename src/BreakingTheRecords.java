import java.util.ArrayList;
import java.util.Collections;

public class BreakingTheRecords {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        Collections.addAll(scores, 3, 0, 21, 36, 10, 28, 35, 5, 24, 42);

        int minimum = 0;
        int maximum = 0;
        int countMin = 0;
        int countMax = 0;
        minimum = scores.get(0);
        maximum = scores.get(0);

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < minimum) {
                minimum = scores.get(i);
                countMin++;
            }

            if (scores.get(i) > maximum) {
                maximum = scores.get(i);
                countMax++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        Collections.addAll(result, countMax, countMin);

        System.out.println(result);
    }

}
