package StudentDetails;

import BikeDetails.BikeImpl;
import BikeDetails.BikeInterface;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentUI
{
    Scanner sc = new Scanner(System.in);
    StudentInterface studentInterface = new StudentImpl();
    public void menu() throws SQLException, ClassNotFoundException {
        int menuList = 0;
        do{
            System.out.println("Select any option");
            System.out.println("1.Add Student");
            System.out.println("2.StudentsList");
            System.out.println("3.Student Detail");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");
            menuList = sc.nextInt();
            switch (menuList) {
                case 1:
                    addStudent();
                    System.out.println("Student detail registered successfully");
                    break;
                case 2:
                    showStudent();
                    System.out.println("Printed students details");
                    break;
                case 3:
                    getStudentRollNumber();
                    System.out.println("Printed student details");
                    break;
                case 4:
                    deleteStudentDetail();
                    System.out.println("deleted student details");
                    break;
                case 5:
                    System.out.println("Thank you for Using");
                    break;
            }
        } while (menuList != 5);

    }

    private void deleteStudentDetail() throws SQLException, ClassNotFoundException {
        System.out.print("Enter Student Roll Number which want to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        studentInterface.deleteStudent(id);
        System.out.println("Successfully deleted entry for student roll number " +id);
    }

    private void getStudentRollNumber() throws SQLException, ClassNotFoundException {
        System.out.print("Enter Student Roll Number : ");
        int id = sc.nextInt();
        sc.nextLine();

        Student student = studentInterface.studentDetails(id);

        if (student.getRollNumber() == 0) {
           System.out.println("Details not found.");
        } else {
            System.out.println("Student Details: ");
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("First Name: " + student.getFirstName());
            System.out.println("Last Name: " + student.getLastName());
            System.out.println("Phone Number: " + student.getPhoneNumber());
            System.out.println("Age: " + student.getAge());
        }
    }

    public void addStudent() throws SQLException, ClassNotFoundException {
        System.out.println("Enter the number of students:");
        int noOfStudents = sc.nextInt();
        for (int i = 1; i <= noOfStudents; i++)
        {
            System.out.println("Enter the rollNumber of student:");
            int rollNumber = sc.nextInt();
            System.out.println("Enter the firstName of student:");
            String firstName = sc.next();
            System.out.println("Enter the lastName of student:");
            String lastName = sc.next();
            System.out.println("Enter the phoneNumber of student:");
            int phoneNumber = sc.nextInt();
            System.out.println("Enter the age of student:");
            int age = sc.nextInt();
            Student student = new Student(rollNumber,firstName, lastName,phoneNumber,age);
            studentInterface.createstudentInfo(student);
        }
        }
        public void showStudent() throws SQLException, ClassNotFoundException {
            for (Student student : studentInterface.showStudent()) {
                System.out.println(student.getRollNumber() + " "+ student.getFirstName() + " "+ student.getLastName() + " "+ student.getPhoneNumber() + " "+ student.getAge());
            }
        }
    }

