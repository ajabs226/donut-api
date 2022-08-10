<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Donuts</title>
</head>
<body>
	<table>
		<tr>
			<th>Donut Name</th>
		</tr>
			<c:forEach var="donut" items="${donuts}">
			<tr>
				<td><a href="/donutInfo?id=${donut.id}">${donut.name}</a></td>
			<tr>	
			</c:forEach>
		
	</table>

</body>
</html>