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

            String url = "jdbc:mysql://localhost:3306/pratice";
            String user = "root";
            String password = "darsh@123joshi";

            return DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            System.out.println("Unable to connect to database " + e);
            return null;
        }
    }

    // insert
    public static void insert(Product product) {
        try {
            Connection con = connect();

            String query = "INSERT INTO products (name, category, model, price, description, imageName) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insert = con.prepareStatement(query);

            insert.setString(1, product.getName());
            insert.setString(2, product.getCategory());
            insert.setString(3, product.getModel());
            insert.setInt(4, product.getPrice());
            insert.setString(5, product.getDescription());
            insert.setString(6, product.getImageName());

            if (insert.executeUpdate() == 1) {
                System.out.println("Insert Successful");
            }

        } catch (Exception e) {
            System.out.println("Insert Exception " + e);
        }
    }

    // get all
    public static List<Product> getAll() {
        try {
            Connection con = connect();
            List<Product> products = new ArrayList<>();
            String query = "SELECT * FROM products";

            PreparedStatement fetch = con.prepareStatement(query);
            ResultSet data = fetch.executeQuery();

            while (data.next()) {
                Product product = new Product();
                product.setId(data.getInt("id"));
                product.setName(data.getString("name"));
                product.setCategory(data.getString("category"));
                product.setModel(data.getString("model"));
                product.setPrice(data.getInt("price"));
                product.setDescription(data.getString("description"));
                product.setImageName(data.getString("imageName"));
                products.add(product);
            }

            return products;
        } catch (Exception e) {
            System.out.println("Get all exception " + e);
            return null;
        }
    }

    // get one
    public static Product getOne(int id) {
        try {
            Connection con = connect();
            Product product = new Product();
            String query = "SELECT * FROM products WHERE id = ?";

            PreparedStatement fetch = con.prepareStatement(query);
            fetch.setInt(1, id);
            ResultSet data = fetch.executeQuery();

            if (data.next()) {
                product.setId(data.getInt("id"));
                product.setName(data.getString("name"));
                product.setCategory(data.getString("category"));
                product.setModel(data.getString("model"));
                product.setPrice(data.getInt("price"));
                product.setDescription(data.getString("description"));
                product.setImageName(data.getString("imageName"));
            }
            return product;
        } catch (Exception e) {
            System.out.println("Get one exception " + e);
            return null;
        }
    }

    // update
    public static void update(Product product) {
        try {
            Connection con = connect();
            String query = "UPDATE products SET name = ?, category = ?, model = ?, price = ?, description = ?, imageName = ? WHERE id = ?";
            PreparedStatement update = con.prepareStatement(query);

            update.setString(1, product.getName());
            update.setString(2, product.getCategory());
            update.setString(3, product.getModel());
            update.setInt(4, product.getPrice());
            update.setString(5, product.getDescription());
            update.setString(6, product.getImageName());
            update.setInt(7, product.getId());

            if (update.executeUpdate() == 1) {
                System.out.println("Update Successful");
            }

        } catch (Exception e) {
            System.out.println("Update exception " + e);
        }
    }

    // delete
    public static void delete(int id) {
        try {
            Connection con = connect();
            String query = "DELETE FROM products WHERE id = ?";

            PreparedStatement delete = con.prepareStatement(query);
            delete.setInt(1, id);

            if (delete.executeUpdate() == 1) {
                System.out.println("Delete Successful");
            }
        } catch (Exception e) {
            System.out.println("Delete exception " + e);
        }
    }

}
