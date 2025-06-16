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
        if (!(this instanceof FictionBook)) {
            System.out.println("Kirjaa " + title + " ei enään ole lainattavissa!");
            return;
        if(copies <= 0){
            System.out.println("Kirjaa " + title + " ei enään ole lainattavissa!");
        
        }else if( copies > 0){
            copies--;
            System.out.println("Kirja " + title + " on nyt lainattu.");
            borrowed++;
        }
        
    
    }

    public void returnBook(){
        if( borrowed <=0){
            System.out.println("Kirja " + title + " ei ole lainassa.");
        }else{
            borrowed--;
            System.out.println("Kirja " + title + " on palautettu.");
        }
        copies++;
    }

    public int copyAmount(){
        int copyAmount = copies;
        return copyAmount;
    }
    
    public String getTitle(){
        return title;
    }
}

