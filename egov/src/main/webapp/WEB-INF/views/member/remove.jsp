<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
	<div id="content" align="center">
		<form id="remove_form">
			<font color="black">비밀번호 재입력: </font><input type="text" name="pass">
			<input type="hidden" name="memID" value="${user.memID}"/>
			<input id="remove_submit" type="button" value="delete">
		</form>
		
	</div> <!-- content end -->
	
<script>
	
</script>