package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductService {

    // connection
    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/practice";
            String username = "root";
            String password = "darsh@123joshi";

            return DriverManager.getConnection(url, username, password);

        } catch (Exception e) {
            System.out.println("Unable to connect " + e);
            return null;
        }

    }

    // insert
    public static void insert(Product product) {
        try {
            String sql = "INSERT INTO product(name, price, quantity, company) VALUES(?, ?, ?, ?)";
            Connection con = connect();

            PreparedStatement insert = con.prepareStatement(sql);
            insert.setString(1, product.getName());
            insert.setInt(2, product.getPrice());
            insert.setInt(3, product.getQuantity());
            insert.setString(4, product.getCompany());

            if (insert.executeUpdate() == 1) {
                System.out.println("inserted successfully");
            }

        } catch (Exception e) {
            System.out.println("Unable to insert " + e);
        }
    }

    // get all
    public static List<Product> getAll() {
        try {
            String sql = "SELECT * FROM product";
            Connection con = connect();

            PreparedStatement fetch = con.prepareStatement(sql);
            ResultSet rs = fetch.executeQuery();

            List<Product> products = new ArrayList<>();

            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setCompany(rs.getString("company"));
                products.add(product);
            }

            return products;

        } catch (Exception e) {
            System.out.println("Unable to fetch " + e);
            return null;
        }
    }

    // get by id
    public static Product getById(int id) {
        try {
            String sql = "SELECT * FROM product WHERE id = ?";
            Connection con = connect();

            PreparedStatement fetch = con.prepareStatement(sql);
            fetch.setInt(1, id);
            ResultSet rs = fetch.executeQuery();

            Product product = new Product();
            if (rs.next()) {
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setPrice(rs.getInt("price"));
                product.setQuantity(rs.getInt("quantity"));
                product.setCompany(rs.getString("company"));
            }
            return product;

        } catch (Exception e) {
            System.out.println("Unable to fetch " + e);
            return null;
        }
    }

    // update
    public static void update(Product product) {
        try {
            String sql = "UPDATE product SET name = ?, price = ?, quantity = ?, company = ? WHERE id = ?";
            Connection con = connect();

            PreparedStatement update = con.prepareStatement(sql);
            update.setString(1, product.getName());
            update.setInt(2, product.getPrice());
            update.setInt(3, product.getQuantity());
            update.setString(4, product.getCompany());
            update.setInt(5, product.getId());

            if (update.executeUpdate() == 1) {
                System.out.println("updated successfully");
            }

        } catch (Exception e) {
            System.out.println("Unable to update " + e);
        }
    }

    // delete
    public static void delete(int id) {
        try {
            String sql = "DELETE FROM product WHERE id = ?";
            Connection con = connect();

            PreparedStatement delete = con.prepareStatement(sql);
            delete.setInt(1, id);

            if (delete.executeUpdate() == 1) {
                System.out.println("deleted successfully");
            }

        } catch (Exception e) {
            System.out.println("Unable to delete " + e);
        }
    }

}
