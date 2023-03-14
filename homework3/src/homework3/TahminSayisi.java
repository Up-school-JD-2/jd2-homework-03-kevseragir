package homework3;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class TahminSayisi {

	

	public static void main(String[] args) {
		int i = 0;
		int sayi;
		int sayac = 0;

		Oyuncu[] oyuncu = new Oyuncu[3];
		
		for (int i1 = 0; i1 < 3; i1++) {

			String oyuncu1[] = { "1.oyuncu", "2.oyuncu", "3.oyuncu" };

			Scanner scan = new Scanner(System.in);
			Random rastgele = new Random();
			int rastgeleSayi = 1 + rastgele.nextInt(99);

			System.out.println(" 1 ile 100 arasında sayi giriniz: ");

			do {
			
				sayi = scan.nextInt();
				if (sayi > rastgeleSayi) {
					System.out.println("Too hıgh, try again");
				} else if (sayi < rastgeleSayi) {
					System.out.println("Too low, try again");
				}
				sayac++;
			}

			while (sayi != rastgeleSayi);

			i++;

			System.out.println("Tebrikler! " + i + ". oyuncu " + sayac + ".denemede sayıyı buldunuz.");
		

			Oyuncu o = new Oyuncu();
			o.oyuncuAdi = i + 1 + ". oyuncu";
			o.denemeSayi = sayac;
			
			sayac = 0;
		}
		for(Oyuncu oyuncu1:oyuncu) {
			
		}

	}
}


