<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <a href="add.jsp">Add</a><br /><br />
    <a href="/JavaWebAssessment/view">View</a><br /><br />

    <form
      action="/JavaWebAssessment/add"
      method="post"
      enctype="multipart/form-data"
    >
      Name: <input type="text" name="name" /><br />
      <br />
      Category: <input type="text" name="category" /><br /><br />
      Model: <input type="text" name="model" /><br /><br />
      Price: <input type="text" name="price" /><br /><br />
      Description: <input type="text" name="description" /><br /><br />
      Image: <input type="file" name="imageName" /><br /><br />
      <input type="submit" value="Submit" /><br /><br />
    </form>
  </body>
</html>
