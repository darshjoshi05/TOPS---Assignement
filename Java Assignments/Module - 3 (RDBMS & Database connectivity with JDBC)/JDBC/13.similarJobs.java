// List the Emps of Deptno 20 who’s Jobs are same as Deptno10.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class thirteen {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery(
                    "SELECT * FROM EMPLOYEE WHERE DEPT_NO = 20 AND JOB IN (SELECT JOB FROM EMPLOYEE WHERE DEPT_NO = 10);");

            while (data.next()) {
                System.out.println(
                        data.getString("e_name") + " : " + data.getString("job") + " : " + data.getInt("dept_no"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}