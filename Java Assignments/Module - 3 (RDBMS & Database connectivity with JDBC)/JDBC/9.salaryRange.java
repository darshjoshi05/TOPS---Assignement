// List the emps Who Annual sal ranging from 22000 and 45000.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class nine {

    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch
                    .executeQuery("SELECT * FROM EMPLOYEE WHERE SALARY BETWEEN 22000 AND 45000;");

            if (!data.next()) {
                System.out.println("No data found");
                return;
            }

            while (data.next()) {
                System.out.println(data.getString("e_name") + " : " + data.getInt("salary"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}