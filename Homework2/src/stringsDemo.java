
public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "  Bugün hava çok güzel.  ";
		
		System.out.println("Eleman sayisi: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("Yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B")); //case sensitive
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.endsWith("B"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a")); //metin de arar
		System.out.println(mesaj.lastIndexOf("a"));
		
		
		System.out.println(mesaj.replace(" ", "-")); //orjinal mesajı değiştirmez
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));
		
		for (String kelime: mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
		
		
		

	}

}
