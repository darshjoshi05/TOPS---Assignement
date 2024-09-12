// Find the total sal given to the MGR

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class nineteen {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch
                    .executeQuery("SELECT SUM(SALARY) AS TOTAL_SAL FROM EMPLOYEE WHERE MGR IS NOT NULL;");

            if (!data.next()) {
                System.out.println("No data found");
                return;
            }

            while (data.next()) {
                System.out.println("HELLO");
                System.out.println(data.getInt("TOTAL_SAL"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}