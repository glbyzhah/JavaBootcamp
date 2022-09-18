
public class miniProjeAsalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 1;
		
		if (number < 2) {
			System.out.println("Geçersiz.");
		}
		
		for (int i = 2; i < number; i++) {
			
			if (number != 2 & number % i == 0) {
				System.out.println(number + " asal sayı değildir");
				break;
			}
			else {
				System.out.println(number + " asal sayıdır");
				break;
			}
		}
	}

}
