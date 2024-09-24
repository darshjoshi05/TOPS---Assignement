<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <form action="/JavaAssessment/add" method="get">
      Name: <input type="text" name="name" /><br /><br />
      Price: <input type="text" name="price" /><br /><br />
      Quantity: <input type="text" name="quantity" /><br /><br />
      Company: <input type="text" name="company" /><br /><br />
      <input type="submit" value="Add" /><br /><br />
    </form>
    <a href="index.jsp">Home</a>
  </body>
</html>
