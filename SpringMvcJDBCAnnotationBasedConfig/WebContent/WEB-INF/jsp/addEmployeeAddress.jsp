<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Using Spring Form Elements -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!-- Using JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Address Page</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
	<table>
		<form:form modelAttribute="employeeAddress"
			action="addEmployeeAddress">
			<tr>
				<td>City Name : <form:input path="cityName" /> 
				<form:errors path="cityName" cssStyle="color:red" />
				</td>
			</tr>
			<tr>
				<td>Street Name : <form:input path="streetName" /> 
				<form:errors path="streetName" cssStyle="color:red" />
				</td>
			</tr>
			<tr>
				<td>State Name : <form:input path="stateName" /> 
				<form:errors path="stateName" cssStyle="color:red" />
				</td>
			</tr>
			<tr>
				<td>Pin Code : <form:input path="pinCode" /> 
				<form:errors path="pinCode" cssStyle="color:red" />
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</form:form>
		<tr>
		</tr>
	</table>
</body>
</html>