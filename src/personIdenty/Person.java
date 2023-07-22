package personIdenty;

import java.util.regex.Pattern;

abstract public class Person {
    protected String name;
    protected String email;
    protected int phoneNumber;
    protected String dob;
    protected String address;

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {

        boolean isValidDob = Pattern.matches("\\d{2}-\\d{2}-\\d{4}",dob);
        if (isValidDob)
        this.dob = dob;
        else this.dob="01-06-2005";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person(String name, String email, int phoneNumber, String dob, String address) {
        this.setName(name);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.setDob(dob);
        this.address = address;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {

        boolean isValidName = Pattern.matches("[a-zA-Z]+", name);
        if (isValidName)
            this.name = name;
        else this.name="default name";

    }
    public Person() {
    }
}
