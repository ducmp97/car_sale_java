<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng ký tài khoản</title>
</head>
<body>
	<div align="center">
		<h1>Đăng ký tài khoản</h1>
		<h2>${message}</h2>
		<form action="signup" method="post">
			<table style="with: 50%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="userName" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fullName" /></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<tr>
					<td>Phone number</td>
					<td><input type="text" name="phone" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
			</table>
			<input type="submit" value="submit" name="signup" />
		</form>
		<a href="login.jsp">Quay lại trang đăng nhập</a>
	</div>
	<script type="text/javascript">
		function openPage() {
			window.location.href = pageURL;
		}
	</script>
</body>
</html>