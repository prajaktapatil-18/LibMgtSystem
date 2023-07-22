package pkg_Transcation;

public class BookTransaction {
    private int isbn;
    private  int roll_no;
    private String issue_date;
    private String return_date;



    public BookTransaction(int isbn,int roll_no, String issue_date,String return_date ){
        this.isbn= isbn;
        this.roll_no= roll_no;
        this.issue_date= issue_date;
        this.return_date= return_date;


    }

    public int getIsbn(){
      return isbn;

    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    public int getRoll_no(){
        return roll_no;
    }


    public void setRoll_no(int rollNo){
        this.roll_no =rollNo;

    }

    public String getIssue_date(){
        return  issue_date;
    }
    public void setIssue_date(String  issue_date){
        this.issue_date= issue_date;
    }

    public String getReturn_date(){
        return return_date;
    }
    public void setReturn_date(String return_date){
        this.return_date= return_date;
    }
    public BookTransaction(){
        super();
    }

    @Override
    public String toString() {
        return "BookTransaction{" +
                "isbn=" + isbn +
                ", roll_no=" + roll_no +
                ", issue_date='" + issue_date + '\'' +
                ", return_date='" + return_date + '\'' +
                '}';
    }
}
