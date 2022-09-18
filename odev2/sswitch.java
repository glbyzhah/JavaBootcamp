
public class sswitch {

	public static void main(String[] args) {
		
		char grade = 'A';
		
		switch (grade) {
		    case 'A':
		    	System.out.println("Mükemmel : Geçtiniz");
		    	break;
		    case 'B':
		    case 'C':
		    	System.out.println("Çok Güzel : Geçtiniz");
		    	break;
		    case 'D':
		    	System.out.println("Fena Değil : Geçtiniz");
		    	break;
		    case 'F':
		    	System.out.println("Maalesef : Geçtiniz");
		    	break;
		    default:
		    	System.out.println("Geçersiz not girdiniz");
		}
	}

}
