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
    <form
      action="/JavaWebAssessment/update"
      method="post"
      enctype="multipart/form-data"
    >
      <input type="hidden" name="id" value="${product.id}" />
      Name:
      <input type="text" name="name" value="${product.name}" /><br /><br />
      Category:
      <input
        type="text"
        name="category"
        value="${product.category}"
      /><br /><br />
      Model:
      <input type="text" name="model" value="${product.model}" /><br /><br />
      Price:
      <input type="text" name="price" value="${product.price}" /><br /><br />
      Description:
      <input
        type="text"
        name="description"
        value="${product.description}"
      /><br /><br />
      Image: <input type="file" name="imageName" /><br /><br />
      <input type="submit" value="Submit" /><br /><br />
    </form>
  </body>
</html>
