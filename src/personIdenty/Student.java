package personIdenty;

public class Student  extends Person{
    private int rollNo;
    private int standard;
    private String division;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }
    public String getDivision(){
        return division;

    }

    public Student(String name, String email, int phoneNumber, String dob, String address, int rollNo, int standard, String division) {
        super(name, email, phoneNumber, dob, address);
        this.rollNo = rollNo;
        this.standard = standard;
        this.division = division;
    }
public Student(){
        super();
}
    public void setDivision(){
        this.division= division;

    }
}
