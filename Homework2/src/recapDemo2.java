
public class recapDemo2 {

	public static void main(String[] args) {
		
		double[] myList = {1.2, 1.3, 4.3, 5.6};
		
		double total = 0;
		double max = myList[0];
		for (int i = 0; i < myList.length; i++) {
			if (max < myList[i]) {
				max = myList[i];
			}
			total = total + myList[i];
			System.out.println(myList[i]);
			
		}
		System.out.println("Toplam: " + total);
		System.out.println("En Büyük Sayı: " + max);
	}

}
