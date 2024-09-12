// Add column Pin with bigint data type in table student.

import java.sql.Connection;
import java.sql.PreparedStatement;

class twentyFour {
    public static void main(String[] args) {
        try {
            Connection con = department.getConnection();

            PreparedStatement insert = con.prepareStatement("ALTER TABLE STUDENT ADD PIN BIGINT;");
            if (insert.executeUpdate() == 1) {
                System.out.println("Column added successfully");
            } else {
                System.out.println("Column addition failed");
            }

        } catch (Exception e) {
            System.out.println("Database connection failed");
            e.printStackTrace();
        }
    }
}