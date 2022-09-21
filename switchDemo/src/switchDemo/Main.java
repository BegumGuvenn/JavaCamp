package switchDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade =  "A";

        switch (grade) {
            case "A":
                System.out.println(" Mükemmel : Geçtiniz");
                break;
            case "B":
            case "C":
                System.out.println("İyi : Geçtiniz");
                break;
            case "D":
                System.out.println("Fena değil : Geçtiniz");
            case "F":
                System.out.println("Malesef Kötü : Kaldınız");
                break;
            default:
                System.out.println("GEÇERSİZ NOT GİRDİNİZ !!!");
               
        }

	}

}
