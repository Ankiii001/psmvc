<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PS Bank Application</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h2>Please Fill Up The Form Details</h2>
	<form:form action="saveAccount" modelAttribute="account">
		<table>
			<tr>
				<td>Account No :</td>
				<td><form:input path="accountNo" size="30" /> <form:errors
						path="accountNo" cssClass="error"></form:errors>
						<b><font color="red">${message}</font></b></td>
			</tr>
			<tr>
				<td>Account Holder Name :</td>
				<td><form:input path="accountHolderName" size="30" /> <form:errors
						path="accountHolderName" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Account Balance :</td>
				<td><form:input path="balance" size="30" /> <form:errors
						path="balance" cssClass="error"></form:errors></td>

			</tr>
			<tr>
				<td>Date Of Birth :</td>
				<td><form:input size="30" path="dateOfBirth" /> <form:errors
						path="dateOfBirth" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>Account Holder type :</td>
				<td><form:select path="accountType">
						<form:option value="">Select Account Type</form:option>
						<form:option value="SAVINGS">SAVINGS</form:option>
						<form:option value="CURRENT">CURRENT</form:option>
					</form:select> <form:errors path="accountType" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td>psCode :</td>
				<td><form:input path="psCode" size="30" /> <form:errors
						path="psCode" cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save Account" name="btnSubmit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>