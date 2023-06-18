package dizilerleasalsayibulma;

import java.util.Scanner;

public class deneme {
	public static void main(String[] args) {

		System.out.println("ASAL SAYI BULMA UYGULAMASINA HOS GELDINIZ");
		System.out.println("******************************************");
		int asalToplam = 0,asalOlmayanToplam = 0;
		String asalSayilar = "",asalOlmayanSayilar = ""; 
        boolean asalMi = false;

		Scanner scanner = new Scanner(System.in);
	 	System.out.println("dizinin eleman sayisini giriniz :");
		int diziUzunluk = scanner.nextInt();
		scanner.nextLine(); // enter karakterini bosa cıkarmaaaaaak ıcın
		int[] sayilar = new int[diziUzunluk];

		for (int i = 0; i < sayilar.length; i++) {
			System.out.print("dizinin " + i + ". index degerini giriniz : ");
			sayilar[i] = scanner.nextInt();
			scanner.nextLine(); // enter karakterini bosa cıkarmaaaaaak ıcın

		}

		for (int sayi : sayilar) {
			for (int j = 2; j < sayi; j++) {
				if (sayi % 2 == 0) {
					asalOlmayanToplam += 1;
					asalOlmayanSayilar += String.valueOf(sayi) + " ";
					break;
				} else {
					asalMi = true;
				}
			}
			if (asalMi) {
				asalToplam += 1;
				asalSayilar += String.valueOf(sayi) + " ";
				asalMi = false;
			}
		}

		System.out.println("ASAL BILGILERI");
		System.out.println("asal toplam = " + asalToplam + " asal Sayilar = " + asalSayilar);
		System.out.println("----------------------------------------------------------");

		System.out.println("ASAL OLMAYAN BILGILERI");
		System.out.println(
				"asal olmayan toplam =  " + asalOlmayanToplam + " Asal Olmayan Sayilar =" + asalOlmayanSayilar);
		scanner.close();
	}
}
