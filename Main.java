import java.util.Scanner;
// Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        long n, total1 = 1, r, total2 = 1, total3 = 1, min, comb;
        Scanner input = new Scanner(System.in);
        System.out.print("n Degerini Giriniz :");
        n = input.nextInt();

        System.out.print("r Degeri giriniz :");
        r = input.nextInt();
        min = (n - r);
        for (int nfak = 1; nfak <= n; nfak++) {
            total1 *= nfak;
        }
        for (int rfak = 1; rfak <= r; rfak++) {
            total2 *= rfak;
        }
        for (int nminrfak = 1; nminrfak <= min; nminrfak++) {
            total3 *= nminrfak;
        }
        comb = (total1 / (total2 * total3));
        System.out.print("Kombinasyon Cevabi :" + comb);
    }
}