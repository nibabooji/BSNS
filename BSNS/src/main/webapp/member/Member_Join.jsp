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

<title>ȸ������ ������</title>
</head>
<body>
	<form id="member_join" action="/create.do">
		<fieldset>
			<legend>ȸ������</legend>
			<ol>
				<li>
					<label id="name">�̸�</label>
					<input id="name" name="name" type="text" placeholder="�̸�"  autofocus>
				</li>
				<li>
					<label id="name">Email</label>
					<input id="email" name="email" type="email" placeholder="example@domain.com" required>
				</li>
				<li>
					<label id="name">��й�ȣ</label>
					<input id="password" name="password" type="password" placeholder="���� ,����  6�ڸ� �̻�" >
				</li>
				<li>
					<label id="name">��й�ȣ Ȯ��</label>
					<input id="passwordConfirm" type="password" placeholder="��й�ȣ Ȯ��" >
				</li>
				<li>
					<label id="name">�μ�</label>
					<select id="dept" name="dept">
						<option value="">:::: ���� ::::</option>
						<option value="0">����</option>
						<option value="1">������</option>
						<option value="2">�λ�</option>
						<option value="3">�ѹ�</option>
					</select>
				</li>
				<li>
					<label id="name">��å</label>
					<select id="position" name="position">
						<option value="">:::: ���� ::::</option>
						<option value="0">���</option>
						<option value="1">�븮</option>
						<option value="2">����</option>
						<option value="3">����</option>
					</select>
				</li>
			</ol>
		</fieldset>
		<fieldset>
			<button type="submit" >ȸ������</button>
		</fieldset>
	</form>
</body>
</html>

					
					
					
					
					
					