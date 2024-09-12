// Any jobs of deptno 10 those that are not found in deptno 20

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class sixteen {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery(
                    "SELECT * FROM EMPLOYEE WHERE DEPT_NO = 10 AND JOB NOT IN (SELECT JOB FROM EMPLOYEE WHERE DEPT_NO = 20);");

            while (data.next()) {
                System.out.println(data.getString("e_name") + " : " + data.getString("job"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}