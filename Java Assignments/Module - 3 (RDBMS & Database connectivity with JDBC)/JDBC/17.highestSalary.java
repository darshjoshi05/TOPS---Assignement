// Find the highest sal of EMP table

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class seventeen {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT MAX(SALARY) AS Highest_Salary FROM EMPLOYEE;");

            if (!data.next()) {
                System.out.println("No data found");
                return;
            }

            while (data.next()) {
                System.out.println(data.getInt("Highest_Salary"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}