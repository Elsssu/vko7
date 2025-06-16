package main;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
 
    public void addBook(Book kirja){
        books.add(kirja);
    }

    public void listBooks(){
        int copyAmount = 0;
        for(Book book : books){
            book.displayInfo();
            copyAmount = copyAmount + book.copyAmount();
            if(book instanceof FictionBook){
                String bookType = ((FictionBook)book).categorize();
                System.out.println("Kirjan kategoria: " + bookType);
            }else if(book instanceof NonFictionBook){
                String bookType = ((NonFictionBook)book).categorize();
                System.out.println("Kirjan kategoria: " + bookType);
            }
        }
        System.out.println("Kirjojen määrä kirjastossa: " + copyAmount);
    }    
}
