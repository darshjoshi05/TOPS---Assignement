import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class employee {
    public static void main(String[] args) {

        Integer[] employee_no = { 7369, 7499, 7521, 7566, 7654, 7698, 7782, 7788, 7839, 7844, 7876, 7900, 7902, 7934 };

        String[] employee_name = { "Smith", "Allen", "Ward", "Jones", "Martin", "Blake", "Clark", "Scott", "King",
                "Turner", "Adams", "James", "Ford", "Miller" };

        String[] job = { "Clerk", "Salesman", "Salesman", "Manager", "Salesman", "Manager", "Manager", "Analyst",
                "President", "Salesman", "Clerk", "Clerk", "Analyst", "Clerk" };

        Integer[] mgr = { 7902, 7698, 7698, 7839, 7698, 7839, 7839, 7566, 0, 7698, 7788, 7698, 7566, 7782 };

        String[] hire_data = { "1980-12-17", "1981-02-20", "1981-02-22", "1981-04-02", "1981-09-28", "1981-05-01",
                "1981-06-09", "1987-06-11", "1981-11-17", "1981-08-09", "1987-07-13", "1981-03-12", "1981-03-12",
                "1982-01-23" };

        Integer[] salary = { 800, 1600, 1250, 2975, 1250, 2850, 2450, 3000, 5000, 1500, 1100, 950, 3000, 1300 };

        Integer[] commission = { 0, 300, 500, 0, 1400, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

        Integer[] dept_no = { 20, 30, 30, 20, 30, 30, 10, 20, 10, 30, 20, 30, 20, 10 };

        try {
            Connection con = department.getConnection();
            if (con == null) {
                throw new SQLException("Failed to establish connection to database");
            }
            PreparedStatement insert = con.prepareStatement(
                    "INSERT INTO EMPLOYEE(e_no, e_name, JOB, MGR, HIRE_DATE, SALARY, COMMISSION, DEPT_NO) VALUES(?,?,?,?,?,?,?,?)");

            for (int i = 0; i < employee_no.length; i++) {
                insert.setInt(1, employee_no[i]);
                insert.setString(2, employee_name[i]);
                insert.setString(3, job[i]);
                insert.setInt(4, mgr[i]);
                insert.setString(5, hire_data[i]);
                insert.setInt(6, salary[i]);
                insert.setInt(7, commission[i]);
                insert.setInt(8, dept_no[i]);
                if (insert.executeUpdate() == 1) {
                    System.out.println("Data " + i + " inserted successfully");
                }
            }
        } catch (Exception e) {
            System.out.println("Failed to insert data");
            e.printStackTrace();
        }
    }
}