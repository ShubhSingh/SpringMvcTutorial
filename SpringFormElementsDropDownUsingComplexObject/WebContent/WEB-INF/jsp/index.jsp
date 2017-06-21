<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Using Spring Form Elements -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<h4>Submit your information</h4>
	<hr/>
	<form:form action="hello" modelAttribute="info">
	First Name: <form:input path="firstName"/>
	<p/>
	Last Name: <form:input path="lastName"/>
	<p/>
	Gender : <form:radiobuttons path="gender" items="${gender}"/>
	<p/>
	Country : <form:select path="country" items="${countries}">
			  	<%-- <form:options items="${countries}" /> --%>
			  </form:select>
	<p/>
	<input type="submit" value="Submit">
	</form:form>
</body>
</html>