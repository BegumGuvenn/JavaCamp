
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] [] sehirler =new String[3] [3];

		sehirler[0][0]="İstanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Kırklareli";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Edirne";
		sehirler[1][2]="Muğla";
		sehirler[2][0]="İzmir";
		sehirler[2][1]="Balıkesir";
		sehirler[2][2]="Sinop";

		for (int i =0; i<=2;i++){
		    System.out.println("--------------------");
		   for (int j =0; j<=2;j++){
		     System.out.println(sehirler[i] [j]);
		   }
		}
	}

}
