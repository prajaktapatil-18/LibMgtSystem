package pkg_main;

import Book.BookManager;
import personIdenty.Student;
import personIdenty.StudentManager;
import pkg_Transcation.BookTransactionManager;
import pkg_exception.StudentNotFound;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice = 0;
        Scanner scan = new Scanner(System.in);
        BookManager bm = new BookManager();
        StudentManager sm = new StudentManager();
        BookTransactionManager btm = new BookTransactionManager();

        do {
            System.out.println("Enter 1 if student\nEnter 2 if librian\n Enter 3 if u want to exit");
            choice = scan.nextInt();

            if (choice == 1) {
                System.out.println("Enter your roll no");
                int rollNo = scan.nextInt();
                try {
                    Student s = sm.get(rollNo);
                    if (s == null) {
                        throw new StudentNotFound();
                    }
                    int studChoice;

                    do {
                        System.out.println("Enter 1 to view all books\n Enter 2  to search book by ISBN\n Enter 3 to list books by subject\nenter 4 for issue a book\n enter 5 by return a book\n Enter 99 to exit");

                        studChoice = scan.nextInt();

                        switch (studChoice) {
                            case 1:
                                System.out.println("View all selected");
                                break;
                            case 2:
                                System.out.println("search by ISBN selected");
                                break;
                            case 3:
                                System.out.println("search by subject");
                                break;
                            case 4:
                                System.out.println("issual of book");
                                break;

                            case 5:
                                System.out.println("Return a bokk ");
                                break;
                            case 99:
                                System.out.println("Thank you for using library");
                                break;
                            default:
                                System.out.println("Invalid choice");


                        }

                    } while (studChoice != 99);

                } catch (StudentNotFound snfe) {
                    System.out.println(snfe);

                }

            } else if (choice == 2) {
                int lib_choice;
                do {
                    System.out.println("Enter 11 to view all student\nenter 12 to print all students by roll numbers\n enter 13 to register a student\n enter 14 to update a student\n enter 15 to delete aa student");
                    System.out.println("Enter 21 to view all books\nenter 22 to print all book by isbn\n enter 23 to add a book\n enter 24 to update a book\n enter 25 to delete aa book");
                    System.out.println("Enter 31 to see all transaction");
                    System.out.println("Enter 99 to exit");

                    lib_choice = scan.nextInt();

                    switch (lib_choice) {
                        case 11:
                            System.out.println("all student record");
                            sm.viewStudent();
                            break;
                        case 12:
                            System.out.println("Enter roll number to fetch students ");
                            int get_roll = scan.nextInt();
                            Student st = sm.get(get_roll);
                            if (st == null) {
                                System.out.println("student not found/ not match rollno");
                            } else {
                                System.out.println(st);
                            }
                            break;

                        case 13:
                            System.out.println("Enter student details");
                            String name;
                            String email;
                            int phoneNumber;
                            String dob;
                            String address;
                            int rollNo;
                            int standard;
                            String division;
                            scan.nextLine();
                            System.out.println("Enter your name");
                            name = scan.nextLine();
                            System.out.println("enter your email");
                            email = scan.nextLine();
                            System.out.println("enter your phone number");
                            phoneNumber = scan.nextInt();
                            System.out.println("enter your date of birth");
                            dob = scan.nextLine();
                            System.out.println("enter your address");
                            address = scan.nextLine();
                            System.out.println("enter your roll no");
                            rollNo = scan.nextInt();
                            System.out.println("enter your standard");
                            standard = scan.nextInt();

                            scan.nextLine();

                            System.out.println("enter your division");
                            division = scan.nextLine();

                            Student student = new Student(name, email, phoneNumber, dob, address, rollNo, standard, division);
                            sm.addStudent(student);
                            System.out.println("student is added");
                            break;
                        case 14:
                            System.out.println("enter your roll no to modify the record");
                            int modify_rollN;
                            modify_rollN = scan.nextInt();
                            student = sm.get(modify_rollN);
                            try {
                                if (student == null) {
                                    throw new StudentNotFound();

                                    scan.nextLine();

                                    System.out.println("Enter your name");
                                    name = scan.nextLine();
                                    System.out.println("enter your email");
                                    email = scan.nextLine();
                                    System.out.println("enter your phone number");
                                    phoneNumber = scan.nextInt();
                                    System.out.println("enter your date of birth");
                                    dob = scan.nextLine();
                                    System.out.println("enter your address");
                                    address = scan.nextLine();

                                    System.out.println("enter your standard");
                                    standard = scan.nextInt();

                                    scan.nextLine();

                                    System.out.println("enter your division");
                                    division = scan.nextLine();

                                }


                            } catch (StudentNotFound snf) {
                                System.out.println(snf);
                            }
                            break;

                        case 15:
                            System.out.println("enter the roll no u want to delete record");
                            int delete_rollno;
                            delete_rollno = scan.nextInt();
                            if (sm.deleteStudent(delete_rollno)) {
                                System.out.println("student recoerd is remove");
                            } else {
                                System.out.println("no record with given roll no");
                            }
                            break;
                        case 99:
                            System.out.println("thank you ");
                            break;
                        default:
                            System.out.println("invalid choice");

                    }
                } while (lib_choice != 99);
            }}
            while (choice != 3);



        }
    }

