
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int aKg, eKg, dKg, mKg, pKg;
        double aFiyat = 2.14, eFiyat = 3.67, dFiyat = 1.11, mFiyat = 0.95, pFiyat = 5, toplamTutar;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Armut kac kilo ? ");
        aKg = scanner.nextInt();
        System.out.print("Elma kac kilo ? ");
        eKg = scanner.nextInt();
        System.out.print("Domates kac kilo ? ");
        dKg = scanner.nextInt();
        System.out.print("Muz kac kilo ? ");
        mKg = scanner.nextInt();
        System.out.print("Patlican kac kilo ? ");
        pKg = scanner.nextInt();
        
        toplamTutar = aKg*aFiyat + eKg*eFiyat + dKg*dFiyat + mKg*mFiyat + pKg*pFiyat;
        
        System.out.println("Toplam Tutar : " + toplamTutar);
        
    }
}
