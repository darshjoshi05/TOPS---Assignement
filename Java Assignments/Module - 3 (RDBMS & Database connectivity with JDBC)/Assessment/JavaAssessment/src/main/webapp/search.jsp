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
    Name:
    <input
      type="text"
      name="name"
      value="${product.name}"
      disabled
    /><br /><br />
    Price:
    <input
      type="text"
      name="price"
      value="${product.price}"
      disabled
    /><br /><br />
    Quantity:
    <input
      type="text"
      name="quantity"
      value="${product.quantity}"
      disabled
    /><br /><br />
    Company:
    <input
      disabled
      type="text"
      name="company"
      value="${product.company}"
    /><br /><br />

    <a href="index.jsp">Home</a>
  </body>
</html>
