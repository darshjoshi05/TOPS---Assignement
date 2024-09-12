// List the Enames those are starting with ‘S’ and with five characters.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class ten {

    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();
            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT E_NAME FROM EMPLOYEE WHERE E_NAME LIKE 'S____';");

            while (data.next()) {
                System.out.println(data.getString("e_name"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}