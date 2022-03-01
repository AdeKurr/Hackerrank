import java.util.ArrayList;
import java.util.Collections;

public class SubarrayDivision {
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        // Collections.addAll(s, 1, 2, 1, 3, 2);
        // int d = 3;
        // int m = 2;

        Collections.addAll(s, 4);
        int d = 4;
        int m = 1;

        int result = 0;
        int tempSum = 0;

        for (int i = 0; i < s.size() - m + 1; i++) {
            tempSum = 0;
            for (int j = i; j < m + i; j++) {
                tempSum += s.get(j);
            }
            if (tempSum == d) {
                result++;

            }
        }

        System.out.println(result);

        // CONTEKAN

        // int result = 0;

        // for (int i = 0; i < s.size()-m+1; i++) {
        // int tmpSum = 0;
        // for (int j = i; j < i + m; j++) {
        // tmpSum += s.get(j);
        // }
        // if (tmpSum == d) {
        // result++;
        // }
        // }
        // System.out.println(result);

        // USAHA GAGAL

        // int count = 0;

        // for (int i = 0; i < s.size(); i++) {

        // }
        // System.out.println(count);
    }
}
