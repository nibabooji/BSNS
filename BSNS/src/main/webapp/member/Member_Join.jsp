<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script type="text/javascript" src="/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="/js/jquery.validate.min.js"></script>
<script type="text/javascript" src="/js/formCheck.js"></script>
<link rel="stylesheet" href="/css/Member.join.css" type="text/css">

<title>회원가입 페이지</title>
</head>
<body>
	<form id="member_join" action="/create.do">
		<fieldset>
			<legend>회원가입</legend>
			<ol>
				<li>
					<label id="name">이름</label>
					<input id="name" name="name" type="text" placeholder="이름"  autofocus>
				</li>
				<li>
					<label id="name">Email</label>
					<input id="email" name="email" type="email" placeholder="example@domain.com" required>
				</li>
				<li>
					<label id="name">비밀번호</label>
					<input id="password" name="password" type="password" placeholder="영문 ,숫자  6자리 이상" >
				</li>
				<li>
					<label id="name">비밀번호 확인</label>
					<input id="passwordConfirm" type="password" placeholder="비밀번호 확인" >
				</li>
				<li>
					<label id="name">부서</label>
					<select id="dept" name="dept">
						<option value="">:::: 선택 ::::</option>
						<option value="0">개발</option>
						<option value="1">마케팅</option>
						<option value="2">인사</option>
						<option value="3">총무</option>
					</select>
				</li>
				<li>
					<label id="name">직책</label>
					<select id="position" name="position">
						<option value="">:::: 선택 ::::</option>
						<option value="0">사원</option>
						<option value="1">대리</option>
						<option value="2">주임</option>
						<option value="3">팀장</option>
					</select>
				</li>
			</ol>
		</fieldset>
		<fieldset>
			<button type="submit" >회원가입</button>
		</fieldset>
	</form>
</body>
</html>

					
					
					
					
					
					