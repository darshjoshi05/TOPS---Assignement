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
    <form action="update" method="get">
      First Name :
      <input
        type="text"
        name="firsName"
        value="${student.firstName}"
      /><br /><br />
      Last Name :
      <input
        type="text"
        name="lastName"
        value="${student.lastName}"
      /><br /><br />
      Email :
      <input type="text" name="email" value="${student.email}" /><br /><br />
      Mobile :
      <input type="text" name="mobile" value="${student.mobile}" /><br /><br />
      Gender :
      <input type="text" name="gender" value="${student.gender}" /><br /><br />
      Password :
      <input
        type="text"
        name="password"
        value="${student.password}"
      /><br /><br />
      <input type="submit" value="Submit" /><br /><br />
    </form>

    <a href="index.jsp">Home</a>
  </body>
</html>
