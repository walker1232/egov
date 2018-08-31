<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>

	<div id="content"style="margin: auto" align="center">
		<form id="login_form" name="login_form" >
			<font color="black">아이디: </font><input type="text" name="memID" required>
			<font color="black">비밀번호: </font><input type="text" name= "password" required>
			<input id="login_submit" type="button" value="Login">
		</form>
	</div> <!-- content end -->
	
<script>
	var form = $('#login_form');
	$('#login_submit').click(function(){
	        form.action ="${ctx}/member/login";
	        form.method ="post";  /* get으로 하면 노출됨 */
	        form.submit();
	});
	
	

</script>
	