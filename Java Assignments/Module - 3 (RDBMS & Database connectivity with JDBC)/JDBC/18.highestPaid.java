// Find details of highest paid employee

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class eighteen {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch
                    .executeQuery("SELECT * FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE);");

            if (!data.next()) {
                System.out.println("No data found");
                return;
            }

            while (data.next()) {
                System.out.println(
                        data.getInt("e_no") + " : " + data.getString("e_name") + " : " + data.getInt("salary"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}