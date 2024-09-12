// Display all the details of the emps who’s Comm. Is more than their Sal?

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class seven {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT * FROM EMPLOYEE WHERE COMMISSION > SALARY;");

            while (data.next()) {
                System.out.println(
                        data.getInt("e_no") + " : " + data.getString("e_name") + " : " + data.getString("job") + " : "
                                + data.getInt("mgr") + " : " + data.getString("hire_date") + " : "
                                + data.getInt("salary")
                                + " : " + data.getInt("commission") + " : " + data.getInt("dept_no"));
            }

        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}