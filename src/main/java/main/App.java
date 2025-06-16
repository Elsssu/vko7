package main;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää kirja");
            System.out.println("2) Listaa kaikki kirjat");
            System.out.println("3) Lainaa fiktiokirja");
            System.out.println("4) Palauta fiktiokirja");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:

                        break;
                    case 2:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }

        }
        sc.close();
	}

}
