<!DOCTYPE HTML>
<%@page import="org.bsns.server.controller.BoardControllerTest"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$('#btn').click(function (){
		$.ajax({
		url: "http://localhost:8080/listTest.do",
		type: "Get",
		contentType: "application/json; charset=UTF-8",
		dataType: "json",
		success/: function (result) {
			alert("successful : " + result);
	// 			var JSONData = eval("(" + result + ")");
	
	// 			document.write("<p>" + result + "</p>");
			}
		});
	}
}
</script>
<title>Board List Test</title>
</head>
<body>
Board List Test 입니다.
<input type="button" value="클릭1" id="btn">
</body>
</html>