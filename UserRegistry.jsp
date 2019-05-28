<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script type="text/javascript" src="RegstnValdn.js"></script>
<link href="RegStyleSheet.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<!--  <script type="text/javascript">
function validate()
{
	
var fname=document.myform.fname.value;
alert(fname);
var lname=document.myform.lname.value;
if(fname=="" && lname=="")
	{
	document.myform.fname.focus();
	alert("Eneter your first Name")
	document.myform.lname.focus();
	return false;
	}

}

</script> -->
</head>
<form name="myform" action="UserRegServlet"
	onsubmit="return validate(this)" method="post" class="form-horizontal">
	<body onload="pgeld()">
		<jsp:include page="topnav.jsp"/>
		<br>
		<br>
		<label id="lbl">${info}</label>
		
		<div class="stylediv" id="regdiv">
		<h2>Enter your details below to register yourself</h2>
			<table>
				<tr>
					<td>First Name:* <input type="text" name="fname" >&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error'
							style='color: red; margin-bottom: 20px; display: none;'>Enter
							your first name</div> <br> <br></td>
				</tr>

				<tr>
					<td >Last Name:* <input type="text" name="lname" >&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error1'
							style='color: red; margin-bottom: 20px; display: none;'>Enter
							your last name</div> <br> <br></td>
				</tr>

				<tr>
					<td>Gender:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="gendr" value="Male">Male&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input
						type="radio" name="gendr" value="Female">Female&nbsp;&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error2'
							style='color: red; margin-bottom: 20px; display: none;'>Please
							select one of the values</div> <br> <br></td>
				</tr>
				<tr>
					<td>Email id:*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text"
						name="emailid" >&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error3'
							style='color: red; margin-bottom: 20px; display: none;'>Enter
							your Email id</div> <br> <br></td>
				</tr>

				<tr>
					<td>Address:*&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="address" >
						&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error4'
							style='color: red; margin-bottom: 20px; display: none;'>Enter
							your Address</div> <br> <br></td>
				</tr>

				<tr>
					<td>Country:* &nbsp;&nbsp; <select id="country" name="cntry" >
							<option value="">--Select--</option>
							<option value="Uzbekistan">Uzbekistan</option>
							<option value="India">India</option>
							<option value="United States of America">United States
								of America</option>
							<option value="United Kingdom">UK</option>
							<option value="United Arab Emirates">UAE</option>
							<option value="Canada">Canada</option>
							<option value="Brazil">Brazil</option>
							<option value="Mexico">Mexico</option>
							<option value="Denmark">Denmark</option>
							<option value="Pakistan">Pakistan</option>
							<option value="Iran">Iran</option>
					</select>&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error5'
							style='color: red; margin-bottom: 20px; display: none;'>Please
							select the country</div> <br> <br></td>
				</tr>
				<tr>
					<td>Pincode:*&nbsp;&nbsp; <input type="text" name="pcode" >&nbsp;&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error6'
							style='color: red; margin-bottom: 20px; display: none;'>Enter
							your Pincode</div></td>
					<td><div class='msg-error' id='msg-error6a'
							style='color: red; margin-bottom: 20px; display: none;'>Should
							not exceed 6 digits</div> <br> <br></td>
				</tr>

				<tr>
					<td>Username: <input type="text" name="uname" >&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error7'
							style='color: red; margin-bottom: 20px; display: none;'>Enter
							Username</div> <br> <br></td>
				</tr>

				<tr>
					<td>Password: <input type="password" name="pswd" >&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error8'
							style='color: red; margin-bottom: 20px; display: none;'>Enter
							your password</div> <br> <br></td>
				</tr>

				<tr>
					<td>Re-enter Password: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="pswd1" >&nbsp;&nbsp;
					</td>
					<td><div class='msg-error' id='msg-error9'
							style='color: red; margin-bottom: 20px; display: none;'>Re-enter
							your password</div>
						<br>
					<br></td>
					<td>
						<div class='msg-error' id='msg-error9a'
							style='color: red; margin-bottom: 20px; display: none;'>Passwords
							does not match</div>
					</td>
				</tr>
				<br>
				<br>

				</td>
				</tr>

				<tr>

					<td><input type="submit" id="submtbtn" name="submt"
						style='color: white; background-color: indigo; height: 50px; width: 200px; '
						value="SIGN UP"></td>
				</tr>


			</table>
		</div>

	</body>
</form>
</html>