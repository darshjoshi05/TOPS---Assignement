<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <a href="index.jsp">Home</a>

    <table border="1">
      <tr>
        <td>Id</td>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Email</td>
        <td>Mobile</td>
        <td>Gender</td>
        <td>Password</td>
      </tr>

      <c:forEach var="student" items="${students}">
        <tr>
          <td>${student.id}</td>
          <td>${student.firstName}</td>
          <td>${student.lastName}</td>
          <td>${student.email}</td>
          <td>${student.mobile}</td>
          <td>${student.gender}</td>
          <td>${student.password}</td>
          <td><a href="edit.jsp?id=${student.id}">Edit</a></td>
          <td><a href="delete.jsp?id=${student.id}">Delete</a></td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
