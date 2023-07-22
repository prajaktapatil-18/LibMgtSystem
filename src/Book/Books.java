package Book;

public class Books {

     private String bookName;
     private  int isbn;
     private String authour;
     private String publisher;
     private int edition;
     private String subject;
     private int quantity;


     public int getIsbn(){
         return isbn;
     }
public void setIsbn(int isbn){
         this.isbn= isbn;
}

public String getBookName(){
        return  bookName;
}
public void setBookName(String bookName){
         this.bookName= bookName;

}
public String getAuthour(){
         return authour;

}
public void setAuthour(String authour){
         this.authour= authour;
}
public String getPublisher(){
         return  publisher;

}
public void setPublisher(String publisher){
         this.publisher= publisher;
}
public int getEdition(){
         return edition;
}

public void setEdition(int edition){
         this.edition= edition;
}
public String getSubject(){
         return subject;
}
public void setSubject(String subject){
         this.subject=subject;
}
public int  getQuantity(){
         return quantity;

}
public void setQuantity(int quantity){
         this.quantity= quantity;
}

    public Books(String bookName, int isbn, String authour, String publisher, int edition, String subject, int quantity) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.authour = authour;
        this.publisher = publisher;
        this.edition = edition;
        this.subject = subject;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookName='" + bookName + '\'' +
                ", isbn=" + isbn +
                ", authour='" + authour + '\'' +
                ", publisher='" + publisher + '\'' +
                ", edition=" + edition +
                ", subject='" + subject + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Books(){
super();
}

}
