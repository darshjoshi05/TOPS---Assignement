package com.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class Dao {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/javaassignment";
			String user = "root";
			String password = "#";
			
			Connection con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println("Database connection failed");
			e.printStackTrace();
			return null;
		}
	}
	
	public static String savePerson(Person person) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement("INSERT INTO PERSON VALUES (?, ?, ?, ?, ?)");
			
			insert.setInt(1, person.getId());
			insert.setString(2, person.getName());
			insert.setString(3, person.getGender());
			insert.setString(4, person.getAddress());
			insert.setInt(5, person.getContact());
			
			if (insert.executeUpdate() == 1) {
				return "data inserted";
			}
			
			return "data not inserted";
			
		} catch (SQLException e) {
			e.printStackTrace();
			return "data not inserted";
		}
	}
	
	public static List<Person> getAllData() {
		List<Person> persons = new ArrayList<Person>();
		
		try {
			
			Connection con = getConnection();
			PreparedStatement fetch = con.prepareStatement("SELECT * FROM PERSON");
			
			ResultSet data = fetch.executeQuery();
			
			while(data.next()) {
				Person person = new Person();
				
				person.setId(data.getInt(1));
				person.setName(data.getString(2));
				person.setGender(data.getString(3));
				person.setAddress(data.getString(4));
				person.setContact(data.getInt(5));
				
				persons.add(person);
			}
			
		} catch (Exception e) {
			System.out.println("Unable to fetch all data");
		}
		
		return persons;
	}

	public static void deletePerson(int id) {
		try {
			Connection con = getConnection();
			PreparedStatement delete = con.prepareStatement("DELETE FROM PERSON WHERE ID = ?");
			
			delete.setInt(1, id);
			if (delete.executeUpdate() == 1) {
				System.out.println("Data deleted");
			} else {
				System.out.println("Data not deleted");
			}
 		} catch (SQLException e) {
			System.out.println("Unable to delete data");
			e.printStackTrace();
		}
	}

	public static Person getUserById(int id) {
		Person person = new Person();
		
		try {
			Connection con = getConnection();
			
			PreparedStatement fetch = con.prepareStatement("SELECT * FROM PERSON WHERE ID = ?");
			fetch.setInt(1, id);
			ResultSet data = fetch.executeQuery();
			
			while (data.next()) {
				person.setId(data.getInt(1));
				person.setName(data.getString(2));
				person.setGender(data.getString(3));
				person.setAddress(data.getString(4));
				person.setContact(data.getInt(5));
			}
			
			return person;
			
		} catch (Exception e) {
			System.out.println("Unable to get user" + e);
			return null;
		}
	}

	public static String updatePerson(Person oldPerson) {
		try {
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement("UPDATE PERSON SET PERSON_NAME = ?, GENDER = ?, ADDRESS = ?, CONTACT = ? WHERE ID = ?");
			
			insert.setString(1, oldPerson.getName());
			insert.setString(2, oldPerson.getGender());
			insert.setString(3, oldPerson.getAddress());
			insert.setInt(4, oldPerson.getContact());
			insert.setInt(5, oldPerson.getId());
			
			if (insert.executeUpdate() == 1) {
				return "data updated";
			} else {
				return "data not updated";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return "data not updated in exception";
		}
	}
}
