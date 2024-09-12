// List the Empno, Ename, Sal, Daily sal of all emps in the asc order of Annsal.

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

class five {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            Statement fetch = con.createStatement();
            ResultSet data = fetch.executeQuery("SELECT E_NO, E_NAME, SALARY FROM EMPLOYEE;");

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