<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/module/head.jsp"%>

<!DOCTYPE html>
<head>
	<style type="text/css">
		body{
			background-image: url(static/img/login_background.jpg);
			background-repeat:no-repeat;  
			width:100%;
			height:100%;
			background-size:100% 100%;
			overflow-x:hidden;
			overflow-y:hidden;
			margin:0 auto;
		}
		form{
			width:40%;
			position: relative;
			left: 30%;
			top: 30%
		}
		lable{
			text-align: left;
		}
	</style>
</head>
<body>
	<form class="form-horizontal" role="form">
		<div class="form-group">
			<label for="userLoginname" class="col-md-2 control-label">用户名</label>
			<div class="col-md-8">
				<input type="text" class="form-control" id="userLoginname"
					placeholder="用户名">
			</div>
		</div>
		<br>
		<div class="form-group">
			<label for=""userPassword"" class="col-md-2 control-label">密码</label>
			<div class="col-md-8">
				<input type="password" class="form-control" id="userPassword"
					placeholder="密码">
			</div>
		</div>
		<br>
		<div class="form-group">
			<div class="col-md-offset-4 col-md-3">
				<button type="submit" class="btn btn-primary btn-block">登陆</button>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-4 col-md-3 text-center">
				<a type="button" class="btn btn-link" href="redirect/regist"><span style="color:rgb(0,255,0);">注册账号</span></a>
			</div>
		</div>
	</form>

</body>

</html>
