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

<title>个人中心</title>
<style type="text/css">
.mycontainer{
  margin-top:65px;
}
    body{
      font-family:"微软雅黑";
    }
    a:hover{
      text-decoration:none;
    }
   .name{
    font-weight: 800;
    color: #222;
   }
   .duty {
    padding-top: 8px;
    font-size: 14px;
    word-wrap: normal;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    }
    .icon{
      color:#259;
      font-size:13px;
      margin-top:8px;
      font-family:"微软雅黑";
    }
    .pingjia{
       color:#666;
    }
    .mybottom{
       background:#e7e7e7;
    }
    .juli{
        margin-right:25px;
    }
    .item{
      float:left;
      padding: 2px 30px 8px 0;
    }
    .gz_people{
       border-left: 1px solid #eee;
       padding-left: 20px;
     }
    .second {
    clear:both;
    font-size: 14px;
    font-weight: 700;
    color: #666;
    padding-top: 10px;
    border-top: 1px solid #eee;
    border-bottom: 1px solid #eee;
    padding-bottom: 10px;
}
    .thrid{
       padding: 10px;
       border-bottom: 1px solid #eee;
       color: #999; 
    }
</style>

<script type="text/javascript">
			$(function(){
				$("#userHead").click(function(){
					$("#btn_file").click();
					$("#btn_file").on("change",function(){
						var objUrl = getObjectURL(this.files[0]);
						if(objUrl){
							$("#userHead").attr("src",objUrl);
						}
					});
				});
			});
			function getObjectURL(file){
				var url = null;
				if(window.createObjectURL != undefined){
					url=window.createObjectURL(file);
				}else if(window.URL != undefined){
					url=window.URL.createObjectURL(file);
				}else if(window.webkitURL != undefined){
					url=window.webkitURL.createObjectURL(file);
				}
				return url;
			}
</script>

</head>
<body>
   <jsp:include page="head.jsp"/>
   <div class="mycontainer container">
       <div class="row">
		  <div class="col-md-8">
		       <div class="panel panel-default">
				  <div class="panel-body">
					     <div class="col-md-3">
					        <%--  <form action="/zhihu_m/upLoadHead.do" method="post" enctype="multipart/form-data">
					             <input type="file" name="file" id="btn_file" style="display:none"/>
					             <img src="head/${userInfo.head }" id="userHead" width="100px" height="100px"/>
					             <br/>
					             <input type="submit" class="btn btn-success" value="保存头像"/>
					         </form> --%>
					     </div>
					     <div class="col-md-9">
					          <a href="#"><span class="name">${userInfo.account}</span></a>
					          <p>居住地：${userInfo.address }</p>
					          <%-- <p>职业：${userInfo.job }</p>
					          <p>教育程度：${userInfo.education }</p>
					          <p>积分：${userInfo.credits }</p>
					          <p>自我介绍：${userInfo.introduction}</p> --%>
					     	  <!-- <div class="icon">
						         <span class="glyphicon glyphicon-map-marker">&nbsp;</span>填写居住地&nbsp;|
						         <span><a>填写行业</a></span>
							     </div>
							     <div class="icon">
							          <span class="glyphicon glyphicon-briefcase">&nbsp;</span>填写工作信息
							     </div>
							     <div class="icon">
							         <span class="glyphicon glyphicon-arrow-right">&nbsp;</span>填写详细资料
							     </div>
							     <div class="icon" style="margin-bottom:8px">
							         <span class="glyphicon glyphicon-tag">&nbsp;</span>填写个人简介
							     </div> -->
					        <button type="button" class="btn btn-success" data-toggle="modal" data-target="#myModal">完善我的资料</button>
					     </div>
					     
					     <!-- <div class="pingjia col-md-8">
					         <span class="info-title">获得</span>
					         <span class="glyphicon glyphicon-thumbs-up"></span>&nbsp;0&nbsp;赞同
					         <span class="glyphicon glyphicon-heart"></span>&nbsp;0&nbsp;感谢
					     </div> -->
				  </div>
				  <div class="panel-footer">
				      <span class="juli glyphicon glyphicon-home"></span>
				      <span>提问</span>&nbsp;<span class="juli">0</span>
				      <span>回答</span>&nbsp;<span class="juli">0</span>
				      <span>文章</span>&nbsp;<span class="juli">0</span>
				      <span>收藏</span>&nbsp;<span>0</span>
				  </div>
				</div>
				
				<!-- 最新动态 -->
				<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">最新动态</h3>
				  </div>
				  <%-- <div class="panel-body">
				      <div>
				                    关注了问题<br/>
				           <c:forEach var="entry" items="${mapPost}">
						        <c:forEach var="post" items="${entry.value}">
						           <a href="comment.do?post_id=${post.id}">${post.title}</a>
						           <br/>
						        </c:forEach>
						  </c:forEach>
				      </div>
				      <hr/>
				  </div> --%>
				</div>
				
				
				
		  </div>
		  <div class="col-md-4">
		      <div class="frist">
				     <a class="item" href="#">
						 <span class="guanzhu">关注了</span><br>
						 <strong>0</strong><label> 人</label>
				     </a>
				      <a class="item gz_people" href="#">
						<span class="people">关注者</span><br>
						<strong>0</strong><label> 人</label>
				      </a>
		     </div>
             <div class="second">
				<div>
				    关注了 <a class="link" href="#"><strong>${count} 个话题</strong></a>
				</div>
				 <div>
				    <c:forEach var="entry" items="${map}">
				        <c:forEach var="topicl" items="${entry.value}">
				            <a><img src="images/${topicl.logo}" width="34px" height="34px"></a>
				        </c:forEach>
				    </c:forEach>
				 </div>
             </div>
             <div class="thrid">
                <div class="section-inner">
					<span class="look">个人主页被 <strong>3</strong> 人浏览</span>
				</div>
             </div>
	   </div>
       
   </div>
   </div>
    <!--  模态框-->
   <div class="modal fade"  id="myModal">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title">修改个人信息</h4>
	      </div>
	      <div class="modal-body">
	        <form method="post" action="modifyUser.do">
	           <div class="form-group"> 
	               <input type="text" class="form-control" name="nickname" placeholder="请输入账号" value="${userInfo.nickname }">
	           </div>
	           <div class="form-group"> 
	               <input type="text" class="form-control" name="address" placeholder="请输入居住地" value="${userInfo.address }">
	           </div>
	           <div class="form-group"> 
	               <input type="text" class="form-control" name="job" placeholder="请输入职业" value="${userInfo.job }">
	           </div>
	           <div class="form-group"> 
	               <input type="text" class="form-control" name="education" placeholder="请输入教育程度" value="${userInfo.education }">
	           </div>
	           <div class="form-group"> 
	               <input type="text" class="form-control" name="introduction" placeholder="请输入个人简介" value="${userInfo.introduction}">
	           </div>
	           <div class="modal-footer">
			        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
			        <button type="submit" class="btn btn-primary">确定</button>
	      		</div>
	         </form>
	      </div>
	      
	    </div><!-- /.modal-content -->
	  </div><!-- /.modal-dialog -->
	</div><!-- /.modal -->
</body>
</html>

