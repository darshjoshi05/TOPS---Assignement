// List the details of the emps in asc order of the Dptnos and desc of Jobs?

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class two {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT * FROM EMPLOYEE ORDER BY DEPT_NO ASC, JOB DESC");

            while (data.next()) {
                System.out
                        .println(data.getInt("e_no") + " : " + data.getString("e_name") + " : " + data.getString("job")
                                + " : " + data.getInt("dept_no"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}