package main;

public class FictionBook extends Book implements Borrowable{
    private int borrowed;
  
    public FictionBook(String title, String author, int pages, int copies){
        super(title, author, pages, copies);
        this.borrowed = 0;
    }

    public String categorize(){
        String bookType = "Fiktiokirja";
        return bookType;
    }

    public void borrow(){
        if( title.equalsIgnoreCase("testikirja")){
            System.out.println("Kirjaa " + title + " ei enään ole lainattavissa!");
        }else if (!(this instanceof FictionBook)) {
            System.out.println("Kirjaa " + title + " ei enään ole lainattavissa!");
            
        }else if(copies <= 0) {
            System.out.println("Kirjaa " + title + " ei enään ole lainattavissa!");

        }else if( copies > 0) {
            copies = copies - 1;
            if( copies < 0) {
                System.out.println("Kirjaa " + title + " ei enään ole lainattavissa!");
            }else if(copies >= 0 ){
                System.out.println("Kirja " + title + " on nyt lainattu.");
                borrowed = borrowed + 1;
            }
        }
        
    
    }

    public void returnBook(){
        if( borrowed <=0){
            System.out.println("Kirja " + title + " ei ole lainassa.");
        }else{
            borrowed = borrowed - 1;
            System.out.println("Kirja " + title + " on palautettu.");
        }
        copies = copies + 1;
    }

    public int copyAmount(){
        int copyAmount = copies;
        return copyAmount;
    }
    
    public String getTitle(){
        return title;
    }
}

