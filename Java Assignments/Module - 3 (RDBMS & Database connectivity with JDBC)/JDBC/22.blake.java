// List the emps whose sal greater than Blake’s sal.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class twentyTwo {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery(
                    "SELECT * FROM EMPLOYEE WHERE SALARY > (SELECT SALARY FROM EMPLOYEE WHERE E_NAME = 'BLAKE');");

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