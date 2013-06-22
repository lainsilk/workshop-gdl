<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Hiiiii</title>
</head>
<div style="width: 600px; border: 2px solid skyblue;">
	<div style="background-color: skyblue; color: white;">
		<b>Action Selection</b>
	</div>
	<br>
	<center>
		<h1 style="font-size: 85px; margin: 0px;">Lain</h1>
	</center>
	<center>
		<h3 style="margin: 0px;">Bank</h3>
	</center>

	<s:form action="options" style="padding: 10px;">
		<s:select label="Please Choose an Option"
			list="#{'1':'CloseLoan','2':'New Loan','3':'Payment','4':'Display'}"
			name="option"></s:select>
		<s:textfield name="RFCsend" label="RFC" />
		<s:submit value="Search" />


	</s:form>
</div>
</body>
</html>