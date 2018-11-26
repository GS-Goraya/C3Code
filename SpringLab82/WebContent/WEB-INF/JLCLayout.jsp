<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>

<body>
<table width="90%" height="90%">
<tr height="10%">
<td colspan="3" bgcolor="red" align="center">
<tiles:insertAttribute name="HEADER"/>
</td></tr>
<tr height="80%">
<td width="20%" bgcolor="#c3d599" align="left">
<tiles:insertAttribute name="LMENU"/>
</td>
<td width="80%" bgcolor="#c3d599" align="center">
<tiles:insertAttribute name="BODY"/>
</td>
</tr>
<tr height="10%">
<td colspan="3" bgcolor="red" align="center">
<tiles:insertAttribute name="FOOTER"/>
</td></tr>
</table>
</body>
</html>