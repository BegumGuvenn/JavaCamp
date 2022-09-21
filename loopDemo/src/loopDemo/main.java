package loopDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //For
        for (int i = 2; i < 10; i += 2) {

            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");


        // While
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
            //sayacı belirtmezsem sonsuz döngüye giriyor :)
            //infinity loop
        }
        System.out.println("While döngüsü bitti");


        //Do-while
        int j =1;
        do{
            System.out.println(j);
            j+=2;

        } while (j < 10);
        System.out.println(" Do-While döngüsü bitti");
        //Şart uymazsa bile çalışır.




	}

}
