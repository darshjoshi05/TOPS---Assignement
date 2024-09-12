import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class department {
    public static void main(String[] args) {
        try {
            int[] dept_no = { 10, 20, 30, 40 };
            String[] dept_name = { "Accounting", "Research", "Sales", "Operations" };
            String[] location = { "New York", "Dallas", "Chicago", "Boston" };

            Connection con = getConnection();
            if (con == null) {
                throw new SQLException("Failed to establish connection to database");
            }

            PreparedStatement insert = con
                    .prepareStatement("INSERT INTO DEPARTMENT(DEPT_NO, DEPT_NAME, LOCATION) VALUES(?,?,?)");

            for (int i = 0; i < dept_no.length; i++) {
                insert.setInt(1, dept_no[i]);
                insert.setString(2, dept_name[i]);
                insert.setString(3, location[i]);

                if (insert.executeUpdate() == 1) {
                    System.out.println("Data " + i + " inserted successfully");
                }
            }

        } catch (SQLException e) {
            System.out.println("Database connection failed(insert)");
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaassignment", "root",
                    "#");
            return con;

        } catch (Exception e) {
            System.out.println("Database connection failed(getConnection method)");
            e.printStackTrace();
            return null;
        }
    }
}