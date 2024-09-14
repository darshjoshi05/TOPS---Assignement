<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Data</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        button {
            padding: 5px 10px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        button.delete {
            background-color: #f44336;
        }
    </style>
</head>
<body>

    <h2>User Data</h2>
    <a href="index.jsp">Register</a>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Address</th>
            <th>Contact</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="person" items="${personList}">    
        <tr>
            <td>${person.id}</td>
            <td>${person.name}</td>
            <td>${person.gender}</td>
            <td>${person.address}</td>
            <td>${person.contact}</td>
            <td>
               	<form action="/RegistrationForm/Edit" method="post" style="display:inline;">
                    <input type="hidden" name="id" value="${person.id}">
                    <button type="submit">Edit</button>
                </form>

                
                <form action="/RegistrationForm/Delete" method="post" style="display:inline;">
                    <input type="hidden" name="id" value="${person.id}">
                    <button type="submit" class="delete">Delete</button>
                </form>
            </td>
        </tr>
      	</c:forEach>
    </table>
</body>
</html>
