package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Library library = new Library();
        FictionBook fictionbook = new FictionBook(null, null, 0, 0);
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Lisää kirja");
            System.out.println("2) Listaa kirjat");
            System.out.println("3) Lainaa fiktiokirja");
            System.out.println("4) Palauta fiktiokirja");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
                        String choiceString = sc.nextLine();
                        int choice = Integer.parseInt(choiceString);
                        System.out.println("Anna kirjan nimi:");
                        String title = sc.nextLine();
                        System.out.println("Anna kirjailijan nimi:");
                        String author = sc.nextLine();
                        System.out.println("Anna sivumäärä:");
                        String pagesString = sc.nextLine();
                        int pages = Integer.parseInt(pagesString);
                        System.out.println("Anna kirjojen määrä:");
                        String copiesString = sc.nextLine();
                        int copies = Integer.parseInt(copiesString);
                        
                        if(choice == 1){
                            FictionBook newFictionBook = new FictionBook(title, author, pages, copies);
                            library.addBook(newFictionBook);
                            System.out.println("Kirja lisätty kirjastoon!");
                        }else if(choice == 2){
                            NonFictionBook newNonFictionBook = new NonFictionBook(title, author, pages, copies);
                            library.addBook(newNonFictionBook);
                            System.out.println("Kirja lisätty kirjastoon!");
                        }else{
                            System.out.println("Virheellinen kirjatyyppi.");
                        }
                        break;
                    case 2:
                        library.listBooks();
                        break;
                    case 3:
                        System.out.println("Anna lainattavan kirjan nimi:");
                        int löytykö = 0;
                        String borrowName = sc.nextLine();
                        ArrayList<Book> books = library.getBooks();
                        for(Book book : books){
                            if(book instanceof FictionBook){
                                String title2 = book.getTitle();
                                if(title2.equals(borrowName)){
                                    ((Borrowable)book).borrow();
                                    löytykö = 1;
                                }            
                            }
                        }
                        if(löytykö == 0){
                            System.out.println("Kirjaa  " + borrowName + " ei enään ole lainattavissa!");
                        }
                        break;
                    case 4:
                        System.out.println("Anna palautettavan kirjan nimi:");
                        String returnName = sc.nextLine();
                        ArrayList<Book> books2= library.getBooks();
                        for(Book book : books2){
                            if(book instanceof Borrowable){
                                String title2 = ((FictionBook)book).getTitle();
                                if(title2.equals(returnName)){
                                    ((FictionBook)book).returnBook();
                                }            
                            }
                        }
                        
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
