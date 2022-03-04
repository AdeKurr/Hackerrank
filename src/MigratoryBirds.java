import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MigratoryBirds {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1, 4, 4, 4, 5, 3);

        int [] count = new int [5];
        int maxFreqValue = 0;
        int freqId = 0;

        for (int i = 0; i<arr.size(); i++){
            int index = arr.get(i);
            count[index - 1]++;
            System.out.println(Arrays.toString(count));
            
        }

        System.out.println(Arrays.toString(count));
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxFreqValue) {
                maxFreqValue = count[i];
                freqId = i + 1;
            }
        }
        
        System.out.println(freqId);
    }
}
