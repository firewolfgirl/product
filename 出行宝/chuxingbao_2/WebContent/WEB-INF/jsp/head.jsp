<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- bootstrap的起步 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body> 
    <!-- 导航栏    navbar-fixed-top-->
	<nav class="navbar  navbar-fixed-top" role="navigation" style="background-color:#c6d8e6">
	  <div class="container">
	  
	     <div class="navbar-header">
	      	<a class="navbar-brand" href="#"><font size="6" color="white">出行宝</font></a>
	     </div>
	     
		 <!-- <form class="navbar-form navbar-left" role="search">
	        <div class="form-group">
	          <input type="text" class="form-control" placeholder="Search">
	        </div>
        	<button type="submit" class="btn btn-success">
        	   <span class="glyphicon glyphicon-search"></span>
			</button>
          </form> -->  
	    
		   <ul class="nav navbar-nav navbar-left">
		       <li><a href="userLogin.do?account=${account}&password=${password}"><font color="white">首页</font></a></li>
		        <li><a href="#"><font color="white">酒店</font></a></li>
		        <li><a href="#"><font color="white">火车票</font></a></li>
		        <li><a href="#"><font color="white">汽车票</font></a></li>
		        <li><a href="airTicket.do"><font color="white">机票</font></a></li>
		        <li><a href="#"><font color="white">门票</font></a></li>
		        <li><a href="strategy.do"><font color="white">攻略</font></a></li>
		   </ul>

	     	<form class="navbar-form navbar-right" role="search">
	      	    <a href="personInfo.do"><img alt="Brand" src="head/${userInfo.head}" width="30px" height="30px" />
		      	<font size="3" color="white">${userInfo.account}</font></a>
	      	</form>
	      	
	      	 <!-- <form class="navbar-form navbar-right" role="search" action="askPage.do">
		      	<button type="submit" class="btn btn-primary" >提问</button>
	      	</form> -->
	   </div>
	 </nav>
	 
</body>
</html>