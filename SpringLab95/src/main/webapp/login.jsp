<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>
<h1 align="center"> Welcome to java learning center</h1>
<h2 align="center">
<c:if test="${param.error ne null}">
<font color="red"><p>Invaild username and password</p></font>
</c:if>
<c:if test="${param.error !=null}">
<font color="red"><p>Invaild username and password</p></font>
</c:if>
<c:if test="${param.logout !=null}">
<font color="red"> <p> you have logged out sucessfully</p></font>
</c:if>
</h2>
<form name='loginForm' action="<c:url value='/login.jsp' />" method='POST'>
<table align="center">
<tr><td align="center" colspan="2">
<h2>Login with username and password</h2></td></tr>
<tr><td>Mera Username</td>
<td><input type='text' name='username' value=""></td>
</tr>
<tr><td>Password</td>
<td><input type='password' name='password' value=""></td>
</tr>
<tr>
<td align="center" colspan="2">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
 <input type="submit" value="LOGIN"></td>
 </tr>
</table>
</form>
<a href="index.jsp"><h2 align="center">Index Page </h2></a>

</body>
</html>