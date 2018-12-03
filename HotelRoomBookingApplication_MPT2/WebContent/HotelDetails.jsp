<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel Booking Application</title>
</head>
<body>
<for:form action="book" modelAttribute="temp">
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Rating</th>
			<th>Rate</th>
			<th>Available Rooms</th>
	
	</tr>
	<c:forEach items="${temp}" var="list">
	<tr>
	
		<td>${list.id}</td>
		<td><a href="book">${list.name}</a></td>
		<td>${list.rating}</td>
		<td>${list.rate}</td>
		<td>${list.availableRooms}</td>
	</tr>
	</c:forEach>
	</table>
	</for:form><br>
	<b>Click a Hotel name to start Booking</b>
</body>
</html>