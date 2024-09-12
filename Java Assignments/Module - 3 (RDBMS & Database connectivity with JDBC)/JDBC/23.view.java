// Create view v1 to select ename, job, dname, loc whose deptno are same.

import java.sql.Connection;
import java.sql.PreparedStatement;

class twentyThree {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            PreparedStatement update = con.prepareStatement("CREATE VIEW v1 AS SELECT E_NAME, JOB FROM EMPLOYEE;");

            if (update.executeUpdate() == 1) {
                System.out.println("View created successfully");
            } else {
                System.out.println("View creation failed");
            }

        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}