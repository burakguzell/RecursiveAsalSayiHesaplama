import java.util.Scanner;

public class Main {

    static void asal(int n) {
        int counter = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(n + " sayısı ASALDIR !");
        } else {
            System.out.println(n + " sayısı ASAL değildir !");
        }
    }

    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();

        asal(n);
    }
}
