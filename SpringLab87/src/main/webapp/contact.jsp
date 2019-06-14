<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@ page isELIgnored="false"%>
<style >
.error{color:red}
</style>

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css">

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
	<h1 align="center">
		<c:out value="${MSG} "></c:out>
	</h1>
	<spring:form action="addcontact.jlc" method="POST"
		commandName="contact" >
		<spring:hidden path="contactId"/>
		<table align="center">
		
			<tr>
				<td align="center" colspan="2"><h1>ADD NEW CONTACT</h1></td>
			</tr>
			
				<tr><td>Contact Name</td>
				<td> <spring:input path="contactName" /> </td>
           <td><spring:errors path="contactName" cssClass="error"/> </td>
				</tr>
				
			<tr>
				<td>Contact Email</td>
				<td><spring:input path="contactEmail" /></td>
			</tr>
			<tr>
				<td>Contact Phone</td>
				<td><spring:input path="contactPhone" /></td>
			</tr>
			<tr>
			
				<td align="center" colspan="2"><input type="submit"
					value="ADD Contact"></td>
			</tr>
		</table>
	</spring:form>
	
	
	
						
</body>
</html>