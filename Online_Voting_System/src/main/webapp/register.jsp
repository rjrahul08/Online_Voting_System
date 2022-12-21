<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file="navbar.jsp"%> 
<body>
	<div class="form-container">
		<form action="RegisterUser" method="post">
			<label for="name" class="form-element"><b>Name :</b></label>
			<br>
			<input id="name" name="name" class="form-elements form-input" type="text"/>
			<br>
			<label for="number" class="form-elements"><b>Number :</b></label>
			<br>
			<input id="number" name="number" class="form-elements form-input" type="number"/>
			<br>
			<label for="email" class="form-elements"><b>Email ID:</b></label>
			<br>
			<input id="email" name="email" class="form-elements form-input" type="email"/>
			<br>
			<label for="address" class="form-elements"><b>Address :</b></label>
			<br>
			<input id="address" name="address" class="form-elements form-input" type="text"/>
			<br>
			<label for="voter_card_number" class="form-elements"><b>Voter Card Number :</b></label>
			<br>
			<input id="voter_card_number" name="voter_card_number" class="form-elements form-input" type="text"/>
			<br>
			<label for="dob" class="form-elements"><b>Date of Birth :</b></label>
			<br>
			<input id="dob" name="dob" class="form-elements form-input" type="text"/>
			<br>
			<div>
				<button type="submit" class="form-elements form-button"> Register</button>
				<button type="reset" class="form-elements form-button">Reset</button>
			</div>
		</form>
	</div>
</body>
</html>