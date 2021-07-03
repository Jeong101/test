<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../layout/header.jsp"%>
<div class="container">
<form action="/auth/regist" method="POST">
<div class="form-group">
		<label for="userid">UserId:</label> 
		<input type="text" class="form-control" placeholder="Enter id" name="userid"/>
	</div><div class="form-group">
		<label for="address">Address:</label>
		<input type="text" class="form-control" placeholder="Enter address" name="address"/>
	</div>
	<div class="form-group">
		<label for="email">Email address:</label>
		<input type="email" class="form-control" placeholder="Enter email" name="email"/>
	</div>
	<div class="form-group">
		<label for="password">Password:</label> 
		<input type="password" class="form-control" placeholder="Enter password" name="password"/>
	</div>

	<button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
<%@include file="../layout/footer.jsp"%>

