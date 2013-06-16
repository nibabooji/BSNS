<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang = "ko">
<head>
	<title>반응형 웹 디자인 테스트</title>
	<script type="text/javascript" src="/jquery-1.7.2.min.js"></script>
	<script type="text/javascript">
	$(window).load(function(){

// 		$('#tb_Board').append('<tr><td>' + 'test' + '</td></tr>');
			
			
		$.ajax({
			url: "http://localhost:7474/listTest.do",
			type: "Get",
			contentType: "application/json; charset=UTF-8",
			dataType: "json",
			success: function (result) {
// 		 		alert("successful : " + result);
// 			 	var JSONData = eval("(" + result + ")");
				$('#main_content').append('<ul id="content_list"></ul>');
				for(var i = 0; i < result.length; i++){
					
					$('#content_list').append('<li>' + result[i].number + '</li>');
					$('#content_list').append('<li>' + result[i].email + '</li>');
					$('#content_list').append('<li>' + result[i].content + '</li>');
					$('#content_list').append('<li>' + result[i].date.month + "/" + result[i].date.date + '</li>');
					$('#content_list').append('<hr>');
					
					
// 					document.write("<tr>");
// 					document.write("<td>" + result[i].number + "</td>");
// 					document.write("<td>" + result[i].content + "</td>");
// 					document.write("<td>" + result[i].date.month + "/" + result[i].date.date + "</td>");
// 					document.write("<td>" + result[i].email + "</td>");
// 					document.write("</tr>");
				}
			}
		});

	});
	</script>
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<style>
	    @media screen and (max-width:340px){
	    	#layer1{
	    		background-color: #F0FFFF;
	    		width: 200px;
	    		min-height: 50px;
	    		margin-bottom: 0px;
	    	}
	    	#layer2{
	    		background-color: #E0FFFF;
	    		width: 500px;
	    		min-height: 980px;
	    	}
	    	#layer3{
	    		background-color: #F0F8FF;
	    		width: 200px;
	    		min-height: 50px;
	    	}
	    	ul{
	    		list-style-type: none;
	    		list-style-position: outside;
	    	}
	    	#content{
	    		margin: 0 auto;
	    		width: 900px;
	    		text-align: left;
	    	}
	    	#content-align{
	    		width:100%;
	    		text-align: center;
	    	}
	    }
	    @media screen and (min-width:341px) and (max-width:1023px){
	    	ul{
	    		list-style-type: none;
	    		list-style-position: outside;
	    	}
	    	#layer1{
	    		background-color: #F0FFFF;
	    		width: 200px;
	    		min-height: 50px;
	    	}
	    	#layer2{
	    		background-color: #E0FFFF;
	    		width: 500px;
	    		min-height: 980px;
	    	}
	    	#layer3{
	    		background-color: #F0F8FF;
	    		width: 200px;
	    		min-height: 50px;
	    	}
	    	#content{
	    		margin: 0 auto;
	    		width: 900px;
	    		text-align: left;
	    	}
	    	#content-align{
	    		width:100%;
	    		text-align: center;
	    	}
	    }
	    @media screen and (min-width:1024px){
	   		ul{
	    		list-style-type: none;
	    		list-style-position: outside; 
	    	}
	    	#layer1{
	    		float: left;
	    		background-color: #F0FFFF;
	    		width: 200px;
	    		min-height: 50px;
	    	}
	    	#layer2{
	    		float: left;
	    		background-color: #E0FFFF;
	    		width: 500px;
	    		min-height: 980px;
	    	}
	    	#layer3{
	    		float: left;
	    		background-color: #F0F8FF;
	    		width: 200px;
	    		min-height: 50px;
	    	}
	    	#content{
	    		margin: 0 auto;
	    		width: 900px;
	    		text-align: left;
	    	}
	    	#content-align{
	    		width:100%;
	    		text-align: center;
	    	}
	    }
	</style>
</head>
<body>
	<div id="content-align">
		<div id="content">
		<div id="layer1"></div>
		<div id="layer2">
		 	<div id="main_content">
		 	</div>
		</div>
		<div id="layer3"></div>
		</div>
	</div>
</body>
</html>