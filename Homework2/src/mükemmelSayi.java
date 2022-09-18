
public class mükemmelSayi {

	public static void main(String[] args) {
		
		int sayi = 7;
		int bolenTotal = 0;
		for (int i = 1; i < sayi; i++) {
			if (sayi % i == 0) {
				bolenTotal += i;
			}
		}
		if (sayi == bolenTotal) {
			System.out.println("Mükemmel Sayıdır.");
		}
		else {
			System.out.println("Mükemmel Sayı değildir.");
		}

	}

}
