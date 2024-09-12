<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registration Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 50px;
        }
        form {
            width: 300px;
            margin: 0 auto;
        }
        label {
            font-weight: bold;
        }
        input[type="text"], input[type="number"], textarea {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
            box-sizing: border-box;
        }
        input[type="radio"] {
            margin: 0 10px 0 0;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .view-button {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            padding-top: 10px;
            margin-top: 10px; 
            border: none;
            cursor: pointer;
        }
        .view-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <h2>Registration Form</h2>

    <form action="/RegistrationForm/submit" method="post">
        <label for="id">ID:</label>
        <input type="number" id="id" name="id" required><br><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male" required>
        <label for="male">Male</label>

        <input type="radio" id="female" name="gender" value="Female" required>
        <label for="female">Female</label><br><br>

        <label for="address">Address:</label>
        <textarea id="address" name="address" rows="4" required></textarea><br><br>

        <label for="contact">Contact:</label>
        <input type="text" id="contact" name="contact" required><br><br>

        <input type="submit" value="Register">
    </form>

	<form action="/RegistrationForm/view" method="get">
        <button class="view-button">View</button>
    </form>
</body>
</html>
