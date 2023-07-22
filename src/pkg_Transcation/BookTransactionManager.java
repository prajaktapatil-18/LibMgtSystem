package pkg_Transcation;

import personIdenty.Student;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BookTransactionManager {

    ObjectOutputStream out_book_transaction = null;
    ObjectInputStream in_book_transaction = null;

    File book_transaction_file = null;
    ArrayList<BookTransaction> book_transaction_list = null;

    public BookTransactionManager() {
        book_transaction_file = new File("student.dat");
        book_transaction_list = new ArrayList<BookTransaction>();
        if (book_transaction_file.exists()) {
            try {
                in_book_transaction = new ObjectInputStream(new FileInputStream(book_transaction_file));
                book_transaction_list = (ArrayList<BookTransaction>) in_book_transaction.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean issueBook(int roll_no, int isbn) {
        int totalBookIssue = 0;


        for (BookTransaction book_transaction : book_transaction_list) {
            if ((book_transaction.getRoll_no() == roll_no) && (book_transaction.getReturn_date()==null))
            totalBookIssue += 1;
            if (totalBookIssue >= 3) {
                return false;
            }
            String issue_date = new SimpleDateFormat("dd-mm-yyyy").format(new Date());
            book_transaction = new BookTransaction(isbn, roll_no, issue_date, null);
            book_transaction_list.add(book_transaction);

            return false;
        }
        return false;
    }
    public boolean returnBook(int rollNo,int isbn){
        for (BookTransaction book_transaction : book_transaction_list){
            if ((book_transaction.getRoll_no() == rollNo) && (book_transaction.getReturn_date()==null) && (book_transaction.getIsbn()==isbn)){
                String return_date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
            book_transaction.setReturn_date(return_date);
            return true;
        }
        }
       return false;
    }


public void showAll(){
        for (BookTransaction book_transaction : book_transaction_list){
            System.out.println(book_transaction);
        }



}

}