package het5_2;

import java.util.Scanner;

public class MusicShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soundDisk sDisk[] = new soundDisk[3];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<sDisk.length; i++) {
            System.out.println("Kerem az " + i + ". hanglemez eloadoját");
            String eloado = sc.next();
            System.out.println("Kerem az " + i + ". hanglemez cimet");
            String cim = sc.next();
            System.out.println("Kerem az " + i + ". hanglemez hosszat");
            int hossz = sc.nextInt();

            sDisk[i]= new soundDisk(eloado,cim,hossz);
        }

        sc.close();

        for(soundDisk hanglemez : sDisk) {
            System.out.println(hanglemez.toString());
        }

    }

}
