import java.util.Scanner;

public class BCA {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan tinggi segitiga:");
        int inputUser = input.nextInt();
        System.out.println("Masukkan jumlah segitiga:");
        int repetition = input.nextInt();
        

        for (int i = 0; i < inputUser; i++) {
            for (int rep = 0; rep < repetition; rep++) {
                for (int space = inputUser; space > i + 1; space--) {
                    System.out.print(" ");
                } 
                for (int num = 0; num < (i * 2) + 1; num++) {
                    System.out.print("#");
                }
                for (int space = inputUser; space > i; space--) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        input.close();
    }
}
