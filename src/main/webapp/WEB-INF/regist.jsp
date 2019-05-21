<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/module/head.jsp"%>
<!DOCTYPE html>
<body>
	<div class="container-fluid">
		<div class="admin-center" style="margin-top: 5%">
			<form class="form-horizontal" role="form" action="user/addUser">
				<div class="form-group col-md-6">
					<label for="userName" class="col-md-2 control-label">用户名</label>
					<div class="col-md-8">
						<input type="text" class="form-control" id="userName" name="userName"
							placeholder="用户名">
					</div>
				</div>
				<div class="form-group col-md-6">
					<label for=""userPhone"" class="col-md-2 control-label">手机</label>
					<div class="col-md-8">
						<input type="text" class="form-control" id="userPhone" name="userPhone"
							placeholder="手机">
					</div>
				</div>
				<div class="form-group col-md-6">
					<label for="userLoginname" class="col-md-2 control-label">账号</label>
					<div class="col-md-8">
						<input type="text" class="form-control" id="userLoginname" name="userLoginname"
							placeholder="账号">
					</div>
				</div>
				<div class="form-group col-md-6">
					<label for="userPassword" class="col-md-2 control-label">密码</label>
					<div class="col-md-8">
						<input type="text" class="form-control" id="userPassword" name="userPassword"
							placeholder="密码">
					</div>
				</div>
				<br>
				<div class="form-group">
					<div class="col-md-offset-4 col-md-3">
						<button type="submit" class="btn btn-primary btn-block">注册</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>

