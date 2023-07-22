package pkg_exception;

public class StudentNotFound extends Exception{


    public StudentNotFound(){

    }

    @Override
    public String toString() {
        return "StudentNotFound exception is generated";
    }
}
