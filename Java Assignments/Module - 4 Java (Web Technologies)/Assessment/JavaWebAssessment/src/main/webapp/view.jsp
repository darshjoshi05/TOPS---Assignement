<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <a href="add.jsp">Add</a>
    <a href="/JavaWebAssessment/view">View</a>

    <table border="1" width="100%">
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Category</th>
        <th>Model</th>
        <th>Price</th>
        <th>Description</th>
        <th>Image</th>
      </tr>

      <c:forEach items="${products}" var="product">
        <tr>
          <td>${product.id}</td>
          <td>${product.name}</td>
          <td>${product.category}</td>
          <td>${product.model}</td>
          <td>${product.price}</td>
          <td>${product.description}</td>
          <td>${product.imageName}</td>

          <td>
            <form action="/JavaWebAssessment/edit" method="get">
              <input type="hidden" name="id" value="${product.id}" />
              <input type="submit" value="Edit" />
            </form>
          </td>

          <td>
            <form action="/JavaWebAssessment/delete" method="get">
              <input type="hidden" name="id" value="${product.id}" />
              <input type="submit" value="Delete" />
            </form>
          </td>
        </tr>
      </c:forEach>
    </table>
  </body>
</html>
