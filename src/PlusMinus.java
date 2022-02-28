import java.util.ArrayList;

public class PlusMinus {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);

        float plus = 0;
        float zero = 0;
        float minus = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                plus++;
            } else if (arr.get(i) == 0) {
                zero++;
            } else {
                minus++;
            }
        }

        plus = plus / arr.size();
        minus = minus / arr.size();
        zero = zero / arr.size();

        String plusString = plus + "00000";
        String zeroString = zero + "00000";
        String minusString = minus + "00000";

        // System.out.println("plus =" + plus);
        // System.out.println("zero =" + zero);
        // System.out.println("minus =" + minus);

        System.out.println(String.format("%.6f", plus));
        System.out.println(String.format("%.6f", minus));
        System.out.println(String.format("%.6f", zero));
    }
}
