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
		url: "http://localhost:7474/listTest.do",
		type: "Get",
		contentType: "application/json; charset=UTF-8",
		dataType: "json",
		success: function (result) {
// 			alert("successful : " + result);
	// 			var JSONData = eval("(" + result + ")");
				document.write("<table>")
				document.write("<tr><td>글번호</td><td>내용</td><td>작성일</td><td>작성자</td></tr>")
				for(var i = 0; i < result.length; i++){
					document.write("<tr>");
					document.write("<td>" + result[i].number + "</td>");
					document.write("<td>" + result[i].content + "</td>");
					document.write("<td>" + result[i].date.month + "/" + result[i].date.date + "</td>");
					document.write("<td>" + result[i].email + "</td>");
					document.write("</tr>");
				}
				document.write("</table>")
			}
		});
	});
});
</script>
<title>Board List Test</title>
</head>
<body>
Board List Test 입니다.
<input type="button" value="클릭1" id="btn">
<table id="tb_Board">
</table>

<div id="test">

</div>

</body>
</html>