/**
 * 
 */
function validate(form)
{
	var result=true;
	var usname=document.mform.username.value;
	var pswdr=document.mform.pwd.value;
	alert(usname);
	alert(pswdr);
	if(usname=="")
		{
		alert("Enter Username");
		result=false;
		}
	if(pswdr=="")
	{
	alert("Enter Password");
	result=false;
	}
	return result;
}