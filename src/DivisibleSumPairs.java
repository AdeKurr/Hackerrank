import java.util.ArrayList;
import java.util.Collections;


public class DivisibleSumPairs {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        Collections.addAll(ar, 1, 3, 2, 6, 1, 2);
        int n = 6;
        int k = 3;

        Collections.sort(ar);
        // [1, 1, 2, 2, 3, 6]
        int totalPairs = 0;

        for (int i = 0; i < n; i++) {
            int first = ar.get(i);
            for (int j = i + 1; j < n; j++) {
                int second = ar.get(j);
                int addition = first + second;
                if (addition % k == 0) {
                    totalPairs++;
                }
            }
        }
        System.out.println(totalPairs);
    }
}
