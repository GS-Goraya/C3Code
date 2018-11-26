<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring"
    uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<body>
<h1><spring:messages code="jlc.header" text="welcome to jlc "/></h1>
<h1><spring:messages code="jlc.body" text="welcome to jlc "/></h1><br/><br/>
<h3>Langauge:<a href="?langugae=en">English</a>
             <a href="?langugae=hi">Hindi</a>
</h3>
</body>
</html>