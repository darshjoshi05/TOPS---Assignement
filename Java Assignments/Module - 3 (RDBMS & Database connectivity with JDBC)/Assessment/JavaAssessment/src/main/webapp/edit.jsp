<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <form action="/JavaAssessment/update" method="get">
      <input type="hidden" name="id" value="${product.id}" />
      Name:
      <input type="text" name="name" value="${product.name}" /><br /><br />
      Price:
      <input type="text" name="price" value="${product.price}" /><br /><br />
      Quantity:
      <input
        type="text"
        name="quantity"
        value="${product.quantity}"
      /><br /><br />
      Company:
      <input
        type="text"
        name="company"
        value="${product.company}"
      /><br /><br />

      <input type="submit" value="Update" /><br /><br />
    </form>
    <a href="index.jsp">Home</a>
  </body>
</html>
