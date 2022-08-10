<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${donut.name}</h1>
		<p>Calories: ${donut.calories}</p>
		<p>Extras:</p>
			<ul>
			<c:forEach var="extra" items="${donut.extras}">
				<li>${extra}</li>
			</c:forEach>
			</ul>
	<a href="/">Home</a>	
</body>
</html>