<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Voting System</title>
<link rel="stylesheet" type="text/css" href="style.css"> 
</head>
<%@ include file="navbar.jsp"%> 
<body>
	<div class="form-container">
		<form action="voterLogin" method="post">
			<h3>Enter Your Voter Card Number</h3>
			<label for="voter_card_number" class="form-elements form-label">
			<b>Voter ID</b>
			</label>
			<input name="voter_card_number" id="voter_card_number" class="form-elements form-input" type="text"/>
			<br>
			<button type="submit" class="form-elements form-button" >Login</button>
			<br>
			<a href="adminLogin.jsp" class="index-a">Admin</a>
		</form>
	</div>	
</body>
</html>