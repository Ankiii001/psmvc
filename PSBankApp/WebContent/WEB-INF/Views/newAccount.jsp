<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><spring:message code="lbl.title"/></title>
</head>
<body>
	<h2>Create New Account</h2>
	<form:form action="saveAccount" modelAttribute="account">
		<table>
			<tr>
				<td><spring:message code="lbl.accountNo"></spring:message></td>
				<td><form:input path="accountNo" size="30"/></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.accountHolderName"></spring:message></td>
				<td><form:input path="accountHolderName" size="30"/></td>
			</tr>
			<tr>
				<td><spring:message code="lbl.balance"></spring:message></td>
				<td><form:input path="balance" size="30"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Create Account" name="btnSubmit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>