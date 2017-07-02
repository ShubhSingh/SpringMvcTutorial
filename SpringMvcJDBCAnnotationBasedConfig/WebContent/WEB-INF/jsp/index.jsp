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
<title>HomePage</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/files/css/style.css">
</head>
<body>
	<h4>HomePage: List of Employee Addresses in TestSchema
		Employee_Address table</h4>
	<hr />
	<a href="${pageContext.request.contextPath}/addEmployeeAddress">Add Employee Address</a>
	<p/>
	<table border="1" align="left">
		<tr>
			<th>Employee Id</th>
			<th>Street Name</th>
			<th>City Name</th>
			<th>State Name</th>
			<th>Pin Code</th>
		</tr>
		<c:forEach items="${addresses}" var="address">
			<tr>
				<td>${address.empId}</td>
				<td>${address.streetName}</td>
				<td>${address.cityName}</td>
				<td>${address.stateName}</td>
				<td>${address.pinCode}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>