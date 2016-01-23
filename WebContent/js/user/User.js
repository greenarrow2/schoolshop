function valiUserName(){
	var userName = $('#RegForm_UserName').val();
	if(userName==""||userName == null){
		$('#RegForm_UserName_em_').text("请输入用户名！");
		return false;
	}else{
	 var userName =	$('#RegForm_UserName').val();
		$.post('../../front/user/userNameVerification.htm',{userName:userName},function (result){
			$('#RegForm_UserName_em_').text(result.obj);
		},'json');
	}
}

function valiEmail(){
	var email = $('#RegForm_Email').val();
	if(email==""||email == null){
		$('#RegForm_Email_em_').text("请输入邮箱！");
		return false;
	}else{
		var valiEmail = /^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\.[a-zA-Z]{2,3}$/;
		            if(!valiEmail.test(email))
		            {
		                $('#RegForm_Email_em_').text("请输入有效的E_mail！");
		                return false;
		           }else{
		        	   
		        	   $('#RegForm_Email_em_').text("");
		           }
		
	}
}
function valiPassword(){
	var password = $('#RegForm_Password').val();
	if(password==""||password == null){
		$('#RegForm_Password_em_').text("请输入密码！");
		return false;
	}else{
		$('#RegForm_Password_em_').text("");
	}
}

function valiRePassword(){
	var password = $('#RegForm_Password').val();
	var rePassword = $('#RegForm_RePassword').val();
	if(password==""||password == null){
		$('#RegForm_Password_em_').text("请输入密码！");
		if(rePassword==""||rePassword == null){
			$('#RegForm_RePassword_em_').text("请输入确认密码！");
			return false;
		}else{
			$('#RegForm_RePassword_em_').text("");
		}
	}else{
		if(rePassword==""||rePassword == null){
			$('#RegForm_RePassword_em_').text("请输入确认密码！");
			return false;
		}else{
			if(password == rePassword){
				$('#RegForm_RePassword_em_').text("两次输入密码一致！");
			}else{
				$('#RegForm_RePassword_em_').text("两次输入密码不一致！");
				return false;
			}
			
		}
	}
}
function checkForm(){
	if(valiUserName()&&valiEmail()&&valiRePassword()){
		return true;
	}else{
		return false;
	}
}