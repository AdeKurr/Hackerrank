import java.util.ArrayList;

public class MatchingString {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("ab");
        strings.add("ab");
        strings.add("abc");
        System.out.println(strings);

        ArrayList<String> queries = new ArrayList<String>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");
        System.out.println(queries);

        // Answer starts
        ArrayList<Integer> result = new ArrayList<Integer>();
        int amount = 0;

        String s = "";
        String q = "";
        for (int i = 0; i < strings.size(); i++) {
            s = s + strings.get(i);
            for (int j = 0; j < queries.size(); j++) {
                q = q + queries.get(i);
                if (s.equals(q)) {
                    amount++;
                }
                result.add(j, amount);
                amount = 0;
            }

        }
        System.out.println(result);
    }
}
