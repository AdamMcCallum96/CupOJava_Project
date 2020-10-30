<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/home.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="headerClass">
<nav class="navClass">
<ul class="navUL">
<li class="navItem"><a class="navLink" href="okaylol">Transit Schedules</a></li>
<li class="navItem"><a class="navLink" href="">Fares</a></li>
<li class="navItem"><a class="navLink" href="">Service Changes</a></li>
<li class="navItem"><a class="navLink" href="/login">Sign in</a></li>
<li class="navItem"><a class="navLink" href="/register">Register</a></li>
</ul>
</nav> 
	<c:if test="${loggedIn == true}">
			
		<nav class="navClass">
		<ul class="navUL">
		<li class="navItem"><p class="navlink">Signed in as ${username}</p></li>
		<li class="navItem-account"><a class="navLink" href="">My Account</a></li>
		<li class="navItem-account"><a class="navLink" href="/logout">Sign Out</a></li>
</ul>
</nav>
		
	</c:if>

</div>
</body>
</html>