package StudentDetails;

import BikeDetails.BikeUI;

import java.sql.SQLException;

public class StudentMain {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        StudentUI studentUI = new StudentUI();
        studentUI.menu();
    }
}