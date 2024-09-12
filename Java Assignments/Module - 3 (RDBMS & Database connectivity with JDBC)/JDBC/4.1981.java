// List the emps who joined before 1981

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class four {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT * FROM EMPLOYEE WHERE HIRE_DATE < '1981-01-01';");

            while (data.next()) {
                System.out.println(
                        data.getString("e_name") + " : " + data.getString("job") + " : " + data.getString("hire_date"));
            }

        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}