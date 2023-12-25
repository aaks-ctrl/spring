<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Details</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() { //when the page is loaded successfully
		console.log("Hello1")
		$("#id").change(function() { //when the id field is changed
			console.log("Hello")
			$.ajax({
				url : "validateEmail",
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {
					console.log("Error : " + responseText);
					$("#errMsg".text(responseText));
					if (responseText != "") {
						$("#id").focus();
					}
				}
			})
		})
	});
</script>
</head>
<body>
	<form action="registerUser" method="post">
		<p>
			ID : <input type="text" name="id" id="id" /> <span id="errMsg"></span>
		</p>
		<p>
			Name : <input type="text" name="name" />
		</p>
		<p>
			Email : <input type="text" name="email" /> <input type="submit"
				name="register" />
		</p>
	</form>

	<br /> ${result}
</body>
</html>