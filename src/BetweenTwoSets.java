import java.util.ArrayList;
import java.util.Collections;

public class BetweenTwoSets {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        Collections.addAll(A, 2, 6);
        ArrayList<Integer> B = new ArrayList<>();
        Collections.addAll(B, 24, 36);

        // System.out.println(A);
        // System.out.println(B);

        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            boolean ok = true;
            for (int j = 0; j < A.size() && ok == true; j++) {
                if (i % A.get(j) != 0) {
                    ok = false;
                }
            }
            for (int j = 0; j < B.size() && ok == true; j++) {
                if (B.get(j) % i != 0) {
                    ok = false;
                }

            }
            if (ok)
                cnt++;
        }
        System.out.println(cnt);
    }

}
