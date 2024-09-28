<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enter student information</title>
</head>
<body>
	<h1>Enter student information</h1>
	
	<form action="/StudentInfo/add" method="post">
	<label for="firstName">
		<input type="text" name="firstName" required>
	</label>
	
	<label for="lastName">
		<input type="text" name="lastName" required>
	</label>
	
	<label for="email">
		<input type="text" name="email" required>
	</label>
	
	<label for="mobile">
		<input type="number" name="mobile" required>
	</label>
	
	<label for="gender">
		<input type="text" name="gender" required>
	</label>
	
	<label for="password">
		<input type="text" name="password" required>
	</label>
	
	<input type="submit" value="add">
	</form>
	
	<form action="/StudentInfo/view" method="post">
		<input type="submit" value="View">
	</form>
</body>
</html>