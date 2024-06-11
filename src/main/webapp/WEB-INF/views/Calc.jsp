<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Sum Calculator</h2>
	<form action="/calculate" method="POST">
		<label for="num1" id="num1label">Enter Number 1:</label>
		<input type="number" id="num1" name="num1"><br>
		<label for="num2" id="num2label">Enter Number 2:</label>
		<input type="number" id="num2" name="num2"><br>
		<input type="Submit">
	
	</form>
</body>
</html>