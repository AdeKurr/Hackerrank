import java.util.ArrayList;

public class AppleOrange {
    public static void main(String[] args) throws Exception {
        // s = mulai lebar rumah
        // t = akhir lebar rumah
        // a = lokasi pohon apel
        // b = lokasi pohon jeruk
        // m array = banyaknya apel yang jatuh dan jaraknya
        // n array = banyaknya jeruk yang jatuh dan jaraknya

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        ArrayList<Integer> apples = new ArrayList<>();
        apples.add(-2);
        apples.add(2);
        apples.add(1);
        ArrayList<Integer> oranges = new ArrayList<>();
        oranges.add(5);
        oranges.add(-6);
        int appleCount = 0;
        int orangeCount = 0;

        for (int i = 0; i<apples.size(); i++){
            int dApples = apples.get(i)+a;
            if (dApples >= s && dApples <= t){
                appleCount++;
            }
        }

        for (int i = 0; i<oranges.size(); i++){
            int dOranges = oranges.get(i)+b;
            if (dOranges >= s && dOranges <= t){
                orangeCount++;
            }
        }
        System.out.println("Apple: "+appleCount);
        System.out.println("Orange: "+orangeCount);
    }
}
