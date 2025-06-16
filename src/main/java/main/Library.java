package main;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
 
    public void addBook(Book kirja){
        books.add(kirja);
    }

    public void listBooks(){
        for(Book book : books){
            System.out.println();
        }
    }    
}
