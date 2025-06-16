package main;

public class NonFictionBook extends Book {
 
    
    public NonFictionBook(String title, String author, int pages, int copies){
        super(title, author, pages, copies);
    }

    public String categorize(){
        String bookType = "Tietokirja";
        return bookType;
    }
    public int copyAmount(){
        int copyAmount = copies;
        return copyAmount;
    }
}   

