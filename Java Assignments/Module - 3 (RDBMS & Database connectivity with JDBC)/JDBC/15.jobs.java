// List the emps whose jobs same as SMITH or ALLEN

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class fifteen {
    public static void main(String[] args) {

        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT * FROM EMPLOYEE WHERE JOB IN ('SMITH', 'ALLEN');");

            if (!data.next()) {
                System.out.println("No records found");
                return;
            }

            while (data.next()) {
                System.out.println(data.getString("e_name") + " : " + data.getString("job"));
            }

        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}