import java.util.Scanner;

public class TestJULO {
    public static void main(String[] args) throws Exception {
        // Scanner in = new Scanner(System.in);
        // System.out.println("insert your number:");
        // int input = in.nextInt();
        int input = 357300;
        int counter100k = 0;
        int counter50k = 0;
        int counter20k = 0;
        int counter10k = 0;
        int counter5k = 0;
        int counter2k = 0;
        int counter1k = 0;
        int counter500 = 0;
        int counter200 = 0;
        int counter100 = 0;

        while (input >= 100000) {
            input = input - 100000;
            counter100k++;
        }

        while (input >= 50000) {
            input = input - 50000;
            counter50k++;
        }

        while (input >= 20000) {
            input = input - 20000;
            counter20k++;
        }

        while (input >= 10000) {
            input = input - 10000;
            counter10k++;
        }

        while (input >= 5000) {
            input = input - 5000;
            counter5k++;
        }

        while (input >= 2000) {
            input = input - 2000;
            counter2k++;
        }

        while (input >= 1000) {
            input = input - 1000;
            counter1k++;
        }

        while (input >= 500) {
            input = input - 500;
            counter500++;
        }

        while (input >= 200) {
            input = input - 200;
            counter200++;
        }

        while (input >= 100) {
            input = input - 100;
            counter100++;
        }

        String result = ("");

        if (result.isEmpty()) {
            if (counter100k != 0) {
                result = result + "100000 = " + counter100k;
            }
        } else {
            if (counter100k != 0) {
                result = result + "\n" + "100000 = " + counter100k;
            }
        }

        if (result.isEmpty()) {
            if (counter50k != 0) {
                result = result + "50000 = " + counter50k;
            }
        } else {
            if (counter50k != 0) {
                result = result + "\n" + "50000 = " + counter50k;
            }
        }

        if (result.isEmpty()) {
            if (counter20k != 0) {
                result = result + "20000 = " + counter20k;
            }
        } else {
            if (counter20k != 0) {
                result = result + "\n" + "20000 = " + counter20k;
            }
        }

        if (result.isEmpty()) {
            if (counter10k != 0) {
                result = result + "10000 = " + counter10k;
            }
        } else {
            if (counter10k != 0) {
                result = result + "\n" + "10000 = " + counter10k;
            }
        }

        if (result.isEmpty()) {
            if (counter5k != 0) {
                result = result + "5000 = " + counter5k;
            }
        } else {
            if (counter5k != 0) {
                result = result + "\n" + "5000 = " + counter5k;
            }
        }

        if (result.isEmpty()) {
            if (counter2k != 0) {
                result = result + "2000 = " + counter2k;
            }
        } else {
            if (counter2k != 0) {
                result = result + "\n" + "2000 = " + counter2k;
            }
        }

        if (result.isEmpty()) {
            if (counter1k != 0) {
                result = result + "1000 = " + counter1k;
            }
        } else {
            if (counter1k != 0) {
                result = result + "\n" + "1000 = " + counter1k;
            }
        }

        if (result.isEmpty()) {
            if (counter500 != 0) {
                result = result + "500 = " + counter500;
            }
        } else {
            if (counter500 != 0) {
                result = result + "\n" + "500 = " + counter500;
            }
        }

        if (result.isEmpty()) {
            if (counter200 != 0) {
                result = result + "200 = " + counter200;
            }
        } else {
            if (counter200 != 0) {
                result = result + "\n" + "200 = " + counter200;
            }
        }

        if (result.isEmpty()) {
            if (counter100 != 0) {
                result = result + "100 = " + counter100;
            }
        } else {
            if (counter100 != 0) {
                result = result + "\n" + "100 = " + counter100;
            }
        }

        System.out.println(result);
    }
}