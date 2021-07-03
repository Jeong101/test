<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp" %>
<form action="/auth/login" method="POST">
<div class="form-group">
		<label for="userid">UserId:</label> 
		<input type="text" class="form-control" placeholder="Enter id" name="userid" required="required"/>
	<
		<label for="password">Password:</label> 
		<input type="password" class="form-control" placeholder="Enter password" name="password" required="required"/>
	</div>
	<button type="submit" class="btn btn-primary">Submit</button>
	</form>
<%@include file="../layout/footer.jsp"%>