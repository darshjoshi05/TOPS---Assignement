// List the emps who are either ‘CLERK’ or ‘ANALYST’ in the Desc order.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class eight {

    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch
                    .executeQuery("SELECT * FROM EMPLOYEE WHERE JOB = 'CLERK' OR JOB = 'ANALYST' ORDER BY JOB DESC;");

            while (data.next()) {
                System.out.println(data.getString("e_name") + " : " + data.getString("job"));
            }
        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}