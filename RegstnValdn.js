 /**
 * 
 */

function pgeld()
{
document.myform.fname.focus();
var value=document.getElementById("lbl").textcontent;
if(value!="" && value!=null)
{alert(value);}
if(value=='Signedup')
	{
	document.getElementById("regdiv").style.display=none;
	}
}

function validate(form)
{
	var result= true;
var fname=document.myform.fname.value;

var lname=document.myform.lname.value;
var gender=document.getElementsByName("gendr");
var emaild=document.myform.emailid.value;
var address=document.myform.address.value;

var country=document.myform.cntry.value;
//alert(country);
var picode=document.myform.pcode.value;
//alert(picode);
//alert(picode.length);

var uname=document.myform.uname.value;
//alert(uname);
var pswd=document.myform.pswd.value;
//alert(pswd);
var repswd=document.myform.pswd1.value;
//alert(repswd);
if(fname=="") 
	{
	document.getElementById('msg-error').style.display='block';
	//alert("Enter your first Name");
	document.myform.fname.focus();
	result=false;
	
	}
else
	{
	document.getElementById('msg-error').style.display='none';
	}
if(lname==""){
	//alert("Enter your last Name");
	document.myform.lname.focus();
	document.getElementById('msg-error1').style.display='block';
	result=false;
	}
else
{
document.getElementById('msg-error1').style.display='none';
}
if(gender[0].checked==false && gender[1].checked==false)
{
document.getElementById('msg-error2').style.display='block';
result=false;
}
else
{
document.getElementById('msg-error2').style.display='none';
}

if(emaild=="") 
	{
	document.getElementById('msg-error3').style.display='block';
	//alert("Enter your first Name");
	document.myform.emailid.focus();
	result=false;
}
else
{
document.getElementById('msg-error3').style.display='none';
}
if(address=="") 
{
document.getElementById('msg-error4').style.display='block';
//alert("Enter your first Name");
document.myform.address.focus();
result=false;
}
else
{
document.getElementById('msg-error4').style.display='none';
}
if(country=="") 
{
document.getElementById('msg-error5').style.display='block';
//alert("Enter your first Name");
//document.myform.emailid.focus();
result=false;
}
else
{
document.getElementById('msg-error5').style.display='none';
}
if(picode=="")
{
document.getElementById('msg-error6').style.display='block';
//alert("Enter your first Name");
document.myform.pcode.focus();
result=false;
}
else
{
document.getElementById('msg-error6').style.display='none';
}
if(picode.length>6) 
{
document.getElementById('msg-error6a').style.display='block';
//alert("Enter your first Name");
//document.myform.pcode.value="";
document.myform.pcode.focus();
result=false;
}
else
{
document.getElementById('msg-error6a').style.display='none';
}
if(uname=="")
	{
	//alert("Enter your userName");
	document.getElementById('msg-error7').style.display='block';
	
	//document.myform.pcode.value="";
	document.myform.uname.focus();
	result=false;
	}
else{
	//alert("It is not empty");
	document.getElementById('msg-error7').style.display='none';
}

if(pswd=="")
{
document.getElementById('msg-error8').style.display='block';
//alert("Enter your first Name");
//document.myform.pcode.value="";
document.myform.pswd.focus();
result=false;
}
else
{
document.getElementById('msg-error8').style.display='none';
}
if(repswd=="")
{
document.getElementById('msg-error9').style.display='block';
//alert("Enter your first Name");
//document.myform.pcode.value="";
document.myform.pswd1.focus();
result=false;
}
else
{
document.getElementById('msg-error9').style.display='none';
}
if(pswd!=repswd&& repswd!="")
	{
	document.getElementById('msg-error9a').style.display='block';
	return false;
	}
else
{
document.getElementById('msg-error9a').style.display='none';
}
if(result==false)
	{
	return false;
	}
else
	{
	return true;
	}

	// subbtn=document.getElementById("submtbtn");
	//subbtn.addEventListener('click', function(e){if(result==false){e.preventDefault}}, false);
}
	
	
