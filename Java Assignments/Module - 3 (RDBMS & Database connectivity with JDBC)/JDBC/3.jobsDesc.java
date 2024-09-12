// Display all the unique job groups in the descending order?

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class three {

    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT DISTINCT JOB FROM EMPLOYEE ORDER BY JOB DESC;");

            while (data.next()) {
                System.out.println(data.getString("job"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}