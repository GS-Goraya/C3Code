<%@ taglib prefix="jlc" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
<h2>Course Information</h2>
<ul><jlc:forEach var="cou" items="${CLIST}">
<li><h1>${cou}</h1>
</jlc:forEach></body>
</html>