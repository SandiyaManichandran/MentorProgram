package StudentDetails;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterface
{
    void createstudentInfo(Student student) throws SQLException, ClassNotFoundException;

    List<Student> showStudent() throws SQLException, ClassNotFoundException;
    Student studentDetails(int rollNumber) throws SQLException, ClassNotFoundException;

    void deleteStudent(int rollNumber) throws SQLException, ClassNotFoundException;
}
