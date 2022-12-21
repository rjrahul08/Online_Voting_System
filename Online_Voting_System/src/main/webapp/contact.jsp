<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Us</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file="navbar.jsp"%> 
<body>
	<div class="form-container">
		<form action ="ContactUs" method="post">
			<label for="name" class="form-elements"><b>Name</b></label>
			<br>
			<input id="name" name="name" class="form-elements form-input" type="text"/>
			<br>
			<label for="number" class="form-elements"><b>Number</b></label>
			<br>
			<input id="number" name="number" class="form-elements form-input" type="number"/>
			<br>
			<label for="email"  class="form-elements"><b>Email ID</b></label>
			<br>
			<input id="email" name ="email" class="form-elements form-input" type="email"/>
			<br>
			<label for="comment" class="form-elements"><b>Comments</b></label>
			<br>
			<input id="comment" name="comment" class="form-elements form-input"></input>
			<br>
			<button type="submit" class="form-elements form-button">Submit</button>
			<button type="reset" class="form-elements form-button">Reset</button>
		</form>
	</div>
</body>
</html>