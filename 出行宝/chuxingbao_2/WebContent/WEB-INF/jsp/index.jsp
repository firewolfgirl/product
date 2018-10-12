<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script type="text/javascript" charset="utf-8" src="./ueditor.config.js"></script>
<script type="text/javascript" charset="utf-8" src="./ueditor.all.min.js"></script>
<script type="text/javascript" charset="utf-8"	src="./lang/zh-cn/zh-cn.js"></script>

<style type="text/css">
.mycontainer{
  margin-top:65px;
}
   body{
     color:#222;
     background-color:#EEF6FC;
   }
   a{
     cursor:pointer;
   }
   a:hover{
			text-decoration: none;
   }
   nav{
      margin:0 auto;
      box-shadow: 0px 1px 2px rgba(0,0,0,0.25);
   }
   .myicon{
    color: #999;
   }
   .caogao{
     color:#c1a799;
   }
   #show{
      margin-top:10px;
   }
   .newdongtai{
     color: #7f6666;
   }
   .dislike{
      float:right;
      color:#c1a799;
   }
   #last_font a{
     color: darkgray;
   }
   #last_font a:hover{
     color: #698ebf;
   }
   #last_font li{
   display: inline-block;
   list-style: none;
   margin-right:4px;
   font-size:13px;
   }
   .right_small a{
     color: darkgray;
   }
   .right_small li{
     list-style: none;
      margin-top:10px;
      font-size:13px;
   }
   .right_small a:hover {
    color: #259;
    background: #eff6fa;
    border-radius: 3px;
    text-decoration: none;
    }
    .my4_img{
       margin-left:40px;
    }
    .gz{
      color:darkgray;
      font-size:14px;
    }
}
   
</style>
<script type="text/javascript">
   $(function(){
	   
	   var attent = $(".attent");
	   if(attent.length > 0){
		   $(".attent").next().hide();
	   }
	   
	   $(".care").click(function(){
		   $.ajax({
			   url:"addCare.do",
			   type:"post",
			   data:{
				   topic_id:$(this).next().val()
			   },
			   success:function(data){//回调函数
				   alert(data);
			   }
		   });
	   });
	   
	   $(".collection").click(function(){
		   $.ajax({
			   url:"collection.do",
			   type:"post",
			   data:{
				   post_id:$(this).next().val()
			   },
			   success:function(data){//回调函数
				   alert(data);
			   }
		   });
	   });
	   
   });
</script>
<title>出行宝首页</title>
</head>
<body>
    <jsp:include page="head.jsp"/>
	 <!-- 正文 -->
	 <!-- <div class="searchgroup">
	 <form class="navbar-form navbar-left" role="search">
	        <div class="form-group">
	          <input type="text" class="form-control" placeholder="Search">
	        </div>
        	<button type="submit" class="btn btn-success">
        	   <span class="glyphicon glyphicon-search"></span>
			</button>
     </form> 
     </div> -->
	 <jsp:include page="carousel.jsp"/>
	

</body>
</html>