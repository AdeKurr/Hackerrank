import java.util.ArrayList;
import java.util.Collections;

public class MiniMaxSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // Answer start
        int min = 0;
        int max = 0;
        
        Collections.sort(arr);

        for (int i = 0; i < 4; i++) {
            min = min + arr.get(i);
        }

        for (int i = arr.size()-1; i > 0; i--) {
            max = max + arr.get(i);
        }

        System.out.println(min + " " + max);
    }
}
