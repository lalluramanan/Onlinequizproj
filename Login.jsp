<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="RegStyleSheet.css" type="text/css" rel="stylesheet" />
<script type="text/javascript" src="loginval.js"></script>
</head>
<body>
	<form name="mform" onsubmit="return validate(this)" action="usverify" method="post">
	<jsp:include page="topnav.jsp"/><br><br><br><br><br><br>
	<div class="usname">
		<table>
			
			<tr>
			
				<td>USERNAME&nbsp;&nbsp;&nbsp;<input type="text" name="username" placeholder="Enter username"><br><br>
				</td>
			</tr>
			<tr>
				<td>PASSWORD&nbsp;&nbsp;&nbsp;<input type="password" name="pwd" placeholder="Enter password"><br><br>
				</td>
			</tr>
			<tr><td style='color:red;font-size:15px'>${mess}</td></tr>
			<tr>
				<td><input type="submit" value="Sign In" class="subtn"></td>
			</tr>
			<tr>
			<td> <a href="#">Forget Password</a></td></tr>
			<tr><td> If you are not a member please <a href="UserRegistry.jsp">SIGN UP</a></td></tr>
		</table>
</div>


	</form>

</body>
</html>