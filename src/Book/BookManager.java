package Book;
import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class BookManager {
    ObjectOutputStream out_book = null;
    ObjectInputStream in_book = null;


    File book_file = new File("Books.date");
    ArrayList<Books> book_list = null;

    public BookManager() {
        book_list = new ArrayList<Books>();
        if (book_file.exists()) {
            try {
                in_book = new ObjectInputStream(new FileInputStream(book_file));
                book_list = (ArrayList<Books>) in_book.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    public void listBookBySubject(String subject){
        for (Books book :book_list){
            if (book.getSubject().equals(subject))
                System.out.println(book);

        }
    }
    public void addBook(Books book) {
        book_list.add(book);
    }

    public void viewAllBooks() {
        for (Books book : book_list)
        System.out.println(book);
    }

    public Books searchByIsbn(int search_isbn) {
        for (Books book : book_list) {
            if (book.getIsbn() == search_isbn) {
                return book;
            }
        }
        return null;

    }

    public boolean deleteBook(int delete_isbn) {
        ListIterator<Books> book_iterator = (ListIterator<Books>) book_list.iterator();
        while (book_iterator.hasNext()){
           Books book  = book_iterator.next();
           if (book.getIsbn() == delete_isbn){
               book_list.remove(book);
               return true;
           }

        }
        return false;


    }

}