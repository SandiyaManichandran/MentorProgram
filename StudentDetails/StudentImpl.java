package StudentDetails;
import java.sql.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import static StudentDetails.StudentDBConnection.getConnection;

public class StudentImpl implements StudentInterface
{
    private Connection connection;
    private static final String INSERT_QUERY = "INSERT INTO student(rollNumber, firstName, lastName, phoneNumber, age) values  (?, ?, ?,?,?)";
    private static final String SELECT_QUERY = "SELECT * FROM student WHERE rollNumber = ?";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM student";
    private static final String DELETE_QUERY = "DELETE FROM student WHERE rollNumber = ?";

    @Override
    public void createstudentInfo(Student student) throws SQLException, ClassNotFoundException {

        Connection conn = getConnection();
        PreparedStatement statement = conn.prepareStatement(INSERT_QUERY);
        statement.setInt(1, student.getRollNumber());
        statement.setString (2, student.getFirstName());
        statement.setString (3, student.getLastName());
        statement.setInt (4, student.getPhoneNumber());
        statement.setInt (5, student.getAge());
        statement.executeUpdate();
        System.out.println("Student details created successfully.");
    }

    @Override
    public List<Student> showStudent() throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        PreparedStatement statement = conn.prepareStatement(SELECT_ALL_QUERY);
        Statement statement1 = conn.createStatement();
//        ResultSet resultSet = statement1.executeQuery();
        ResultSet resultSet = statement1.executeQuery(SELECT_ALL_QUERY);

        List<Student> studentList = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student();
            student.setRollNumber(resultSet.getInt("rollnumber"));
            student.setFirstName(resultSet.getString("firstname"));
            student.setLastName(resultSet.getString("lastname"));
            student.setPhoneNumber(resultSet.getInt("phonenumber"));
            student.setAge(resultSet.getInt("age"));
            studentList.add(student);
        }
        return studentList;

    }
    @Override
    public Student studentDetails(int rollNumber) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        PreparedStatement statement = conn.prepareStatement(SELECT_QUERY);
        statement.setInt(1, rollNumber);
        ResultSet resultSet = statement.executeQuery();
        Student student = new Student();
        resultSet.next();
        //while (resultSet.next()) {
            student.setRollNumber(resultSet.getInt("rollnumber"));
            student.setFirstName(resultSet.getString("firstname"));
            student.setLastName(resultSet.getString("lastname"));
            student.setPhoneNumber(resultSet.getInt("phonenumber"));
            student.setAge(resultSet.getInt("age"));
    //}
        return student;
    }

    @Override
    public void deleteStudent(int rollNumber) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        PreparedStatement statement = conn.prepareStatement(DELETE_QUERY);
        statement.setInt(1, rollNumber);
        statement.executeUpdate();

    }

}
