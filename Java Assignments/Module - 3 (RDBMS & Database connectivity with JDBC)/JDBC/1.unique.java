// Select unique job from EMP table.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class one {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();
            if (con == null) {
                throw new SQLException("Failed to establish connection to database");
            }

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT DISTINCT JOB FROM EMPLOYEE");

            while (data.next()) {
                System.out.println(data.getString("job"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}