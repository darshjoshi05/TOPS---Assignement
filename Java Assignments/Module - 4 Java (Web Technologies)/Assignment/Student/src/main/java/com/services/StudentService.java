package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentService {

    // connection
    public static Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "darsh@123joshi";

            return DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.println("Connection Error : " + e);
            return null;
        }
    }

    // insert
    public static void insert(Student student) {
        try {
            Connection con = connect();
            String query = "insert into student (firsName, lastName, email, mobile, gender, password) values (?, ?, ?, ?, ?, ?)";

            PreparedStatement insert = con.prepareStatement(query);
            insert.setString(1, student.getFirsName());
            insert.setString(2, student.getLastName());
            insert.setString(3, student.getEmail());
            insert.setString(4, student.getMobile());
            insert.setString(5, student.getGender());
            insert.setString(6, student.getPassword());

            if (insert.executeUpdate() > 0) {
                System.out.println("Data inserted successfully");
            }

        } catch (Exception e) {
            System.out.println("Insert Error : " + e);
        }
    }

    // get all
    public static List<Student> getAll() {
        try {
            Connection con = connect();
            String query = "select * from student";

            PreparedStatement fetch = con.prepareStatement(query);
            ResultSet data = fetch.executeQuery();

            List<Student> students = new ArrayList<>();

            while (data.next()) {
                Student student = new Student();
                student.setId(data.getInt("id"));
                student.setFirsName(data.getString("firsName"));
                student.setLastName(data.getString("lastName"));
                student.setEmail(data.getString("email"));
                student.setMobile(data.getString("mobile"));
                student.setGender(data.getString("gender"));
                student.setPassword(data.getString("password"));
                students.add(student);
            }

            return students;

        } catch (Exception e) {
            System.out.println("Fetch Error : " + e);
            return null;
        }
    }

    // get one
    public static Student getOne(int id) {
        try {
            Connection con = connect();
            String query = "select * from student where id = ?";

            PreparedStatement fetch = con.prepareStatement(query);
            fetch.setInt(1, id);
            ResultSet data = fetch.executeQuery();

            Student student = new Student();

            if (data.next()) {
                student.setId(data.getInt("id"));
                student.setFirsName(data.getString("firsName"));
                student.setLastName(data.getString("lastName"));
                student.setEmail(data.getString("email"));
                student.setMobile(data.getString("mobile"));
                student.setGender(data.getString("gender"));
                student.setPassword(data.getString("password"));
            }

            return student;

        } catch (Exception e) {
            System.out.println("Fetch Error : " + e);
            return null;
        }
    }

    // update
    public static void update(Student student) {
        try {
            Connection con = connect();
            String query = "update student set firsName = ?, lastName = ?, email = ?, mobile = ?, gender = ?, password = ? where id = ?";

            PreparedStatement update = con.prepareStatement(query);
            update.setString(1, student.getFirsName());
            update.setString(2, student.getLastName());
            update.setString(3, student.getEmail());
            update.setString(4, student.getMobile());
            update.setString(5, student.getGender());
            update.setString(6, student.getPassword());
            update.setInt(7, student.getId());

            if (update.executeUpdate() > 0) {
                System.out.println("Data updated successfully");
            }

        } catch (Exception e) {
            System.out.println("Update Error : " + e);
        }
    }

    // delete
    public static void delete(int id) {
        try {
            Connection con = connect();
            String query = "delete from student where id = ?";

            PreparedStatement delete = con.prepareStatement(query);
            delete.setInt(1, id);

            if (delete.executeUpdate() > 0) {
                System.out.println("Data deleted successfully");
            }

        } catch (Exception e) {
            System.out.println("Delete Error : " + e);
        }
    }
}
