// Find all the emps who earn the minimum Salary for each job wise in ascending order

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class twentyOne {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch
                    .executeQuery("SELECT JOB, MIN(SALARY) FROM EMPLOYEE GROUP BY JOB ORDER BY MIN(SALARY) ASC;");

            while (data.next()) {
                System.out.println(data.getString("JOB") + " : " + data.getInt("MIN(SALARY)"));
            }

        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}