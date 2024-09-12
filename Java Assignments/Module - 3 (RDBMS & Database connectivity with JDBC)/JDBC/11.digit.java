// List the emps whose Empno not starting with digit 78.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class eleven {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT * FROM EMPLOYEE WHERE E_NO NOT LIKE '78%';");

            while (data.next()) {
                System.out.println(
                        data.getInt("e_no") + " : " + data.getString("e_name"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}
