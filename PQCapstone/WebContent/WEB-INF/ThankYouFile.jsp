<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>CSS Animated Fireworks | The Art of Web</title>
	<link rel="stylesheet" type="text/css" href="/css-fireworks.css">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
	
<body>

<h2>The Thank You Page </h2>

<div id="stage"><!-- the action happens here --></div>

<script type="text/javascript" src="/css-fireworks.js"></script>
<hr></hr>
<p></p>
<br>

<h1>Thank you for your time and cooperation in filling out this form.</h1>
<p align="center">
</p>
<h3>Here is the information you entered:></h3>
<p align="center">
</p>
<hr><hr/>

	<label>First Name:</label>
	<span>${user.first_Name}</span><br>
	<label> Last Name:</label>
	<span>${user.last_Name}</span><br>
	<label> Email Address:</label>
	<span>${user.email.Address}</span><br>
	<label> Contact Phone Number:</label>
	<span>${user.contact.PhoneNumber}</span><br>
	<p>To change information or to enter new information click on Return 
	button shown below.</p>
<hr><hr/>

<form action=""method="get">
	<input type="hidden"  name="action"  value="register">
	<input type="submit"  value="Return">
</form>	

</body>
</html>