package personIdenty;

import javax.xml.namespace.QName;
import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class StudentManager {
    ObjectOutputStream out_student = null;
    ObjectInputStream in_student = null;

    File student_file = null;
    ArrayList<Student> student_list = null;

    public StudentManager() {
        student_file = new File("student.date");
        student_list = new ArrayList<Student>();
        if (student_file.exists()) {
            try {
                in_student = new ObjectInputStream(new FileInputStream(student_file));
                student_list = (ArrayList<Student>) in_student.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void addStudent(Student student) {
        student_list.add(student);
    }

    public Student get(int roll) {
        for (Student student : student_list)
            if (student.getRollNo() == roll) {
                return student;
            }
        return null;
    }


    public void viewStudent() {
        for (Student student : student_list)
            System.out.println(student);
    }

    public boolean deleteStudent(int delete_rollNo) {
        ListIterator<Student> student_iterator = (ListIterator<Student>) student_list.iterator();

        while (student_iterator.hasNext()) {
            Student student = student_iterator.next();
            if (student.getRollNo() == delete_rollNo) {
                student_list.remove(student);
                return true;
            }
        }
        return false;


      public boolean updateStudent(int update_roll,String name, String )


            ListIterator<Student> student_iterator = (ListIterator<Student>) student_list.iterator();

            while (student_iterator.hasNext()) {
                Student student = student_iterator.next();
                if (student.getRollNo() == update_roll) {
                    student.setAddress(student.address);
                    student.setDivision(div);
                    student.setDob(student.dob);
                    student.setEmail(student.email);
                    student.setName(student.name);
                    student.setPhoneNumber(student.phoneNumber);
                    student.setStandard(std);
return true;
                }

            }
            return false;
        }
    }
}