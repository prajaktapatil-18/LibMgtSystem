package personIdenty;

public class Librarian extends Person {

    private int id;
    private String doj;

    public Librarian(String name, String email, int phoneNumber, String dob, String address, int id, String doj) {
        super(name, email, phoneNumber, dob, address);
        this.id = id;
        this.doj = doj;

    }
        @Override
        public String toString () {
            return "Librarian{" +
                    "id=" + id +
                    ", doj='" + doj + '\'' +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", dob='" + dob + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
public Librarian(){
        super();
}

    }
