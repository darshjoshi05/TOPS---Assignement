// List the Emps who’s Sal is same as FORD or SMITH in desc order of Sal.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class fourteen {
    public static void main(String[] args) {

        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery(
                    "SELECT * FROM EMPLOYEE WHERE SALARY IN (SELECT SALARY FROM EMPLOYEE WHERE E_NAME IN ('FORD', 'SMITH')) ORDER BY SALARY DESC;");

            while (data.next()) {
                System.out.println(data.getString("e_name") + " : " + data.getInt("salary"));
            }

        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}