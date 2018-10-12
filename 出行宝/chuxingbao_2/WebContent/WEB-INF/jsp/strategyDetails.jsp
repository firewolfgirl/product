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
<title>strategydetails</title>
<style type="text/css">
.mycontainer{
  margin-top:65px;
}
   .toggle-comment{
      color:#999;
      font-size:13px;
      margin-right:5px;
   }
   .author-name{
     font-weight: 700;
     color:black;
   }
   .bio{
     font-size:13px;
     color: darkgray;
   }
   .voters{
     font-size:12px;
     color: darkgray;
     margin-top:6px;
   }
   .smallicon{
     font-size:13px;
     color: darkgray;
     margin-right: 10px;
   }
   /* .comment_content{
     border: 1px solid #ddd;
    border-radius: 4px;
    box-shadow: 0px 1px 1px rgba(0,0,0,0.05);
    padding-top:5px;
   } */
   .gz_num{
      margin-top:5px;
   }
   
</style>
<script type="text/javascript">
   $(function(){
	   $(".mycomment").click(function(){
		   $(".comment_content").show();
		   $(".mycomment").hide();
		   $(".comment_show").show();
	   });
	   $(".comment_show").click(function(){
		   $(".comment_content").hide();
		   $(".mycomment").show();
		   $(".comment_show").hide();
		   
	   });
   });
</script>
</head>
<body>
    <jsp:include page="head.jsp"/>
    <div class="mycontainer container">
    <input type="hidden" name="post_id" id="post_id" value="${post.id}">
        <div class="row">
		  <div class="col-md-8">
		      <h3 class="title">
		       		<a href="#">${post.title}</a>
			    </h3>
			    <a name="addcomment" class="toggle-comment" href="#">
			      <span class="glyphicon glyphicon-comment"></span>${post.comment}条评论
			    </a>
			    <a name="zhuan" class="toggle-comment" href="#">
			      <span class="glyphicon glyphicon-share-alt"></span>转发
			    </a>
			    <hr/>
			    <div class="answers">
				   <a class="" href="#">查看全部 ${post.comment}个回答</a>
				</div>
				<hr/>
				<!-- 正文部分 -->
				<div class="answer"> 
				<!-- <button type="button" class="btn btn-lg btn-danger" data-toggle="popover"
				 title="Popover title" 
				 data-content="And here's some amazing content. It's very engaging. Right?">
				 xue</button> -->
				   <a class="author-name">${post.account}</a> 
				   <!-- <span class="bio">千万别跟我说你穷你买不起房所以你就凑合…</span> -->
				   <div class="voters">
				         <span class="js-voteCount">${post.readed}</span>&nbsp;人阅读
				   </div>
				 
                   <div>
                      <br><b>----------- 正文分割线 -------------</b>
                   </div>
                   <br/>
                   <div class="zm-editable-content clearfix">
					  <div class="zm-editable-content clearfix">
					    ${post.content}
                      </div>
					</div>
					
					<div class="icon">
					   <span class="smallicon">编辑于<fmt:formatDate value="${post.post_time}" pattern="yyyy-MM-dd HH:mm"/> </span>
					    <a name="addcomment" class="mycomment toggle-comment">
					      <span class="glyphicon glyphicon-comment"></span>${post.comment} 条评论
					    </a>
					    <a name="addcomment" class="comment_show"  style="display:none">
					      <span class="glyphicon glyphicon-comment"></span>收起评论
					    </a>
					    <a name="addcomment" class="toggle-comment" href="#">
					      <span class="glyphicon glyphicon-heart"></span>感谢
					    </a>
					     <a name="zhuan" class="toggle-comment" href="#">
					      <span class="glyphicon glyphicon-share-alt"></span>分享
					    </a>
					    <a name="zhuan" class="toggle-comment" href="#">
					      <span class="glyphicon glyphicon-bookmark"></span>收藏
					    </a>
					    <a name="zhuan" class="toggle-comment" href="#">没有帮助</a>
					    <a name="zhuan" class="toggle-comment" href="#">举报</a>
					</div>
					<hr/>
					<!-- 以下为评论区域 -->
					<div class="comment_content"  style="display:none">
					    <div class="panel panel-default">
						  <div class="panel-body">
						      <!--一条评论开始  -->
						      <c:forEach var="post" items="${posts}">
						         <div class="one">
								       <div class="col-md-1">
								          <img src="head/${userInfo.head}" width="30px" height="30px"/>
								       </div>
								       <div class="col-md-11">
								          <a href="#">${userInfo.nickname}</a>
								          <p>${post.content}</p>
								          <div>
								             <span class="smallicon">
								                <fmt:formatDate value="${post.comment_time}" pattern="yyyy-MM-dd HH:mm"/>
								             </span>
										    <a name="addcomment" class="toggle-comment" href="#">
										      <span class="glyphicon glyphicon-edit"></span>回复
										    </a>
										     <a name="zhuan" class="toggle-comment" href="#">
										      <span class="glyphicon glyphicon-thumbs-up"></span>赞
										    </a>
								          </div>
								       </div>
								  </div>
						      </c:forEach>
						     <%--  <c:forEach var="entry" items="${map}">
 						           <div class="one">
								       <div class="col-md-1">
								          <img src="head/${entry.value.head}" width="30px" height="30px"/>
								       </div>
								       <div class="col-md-11">
								          <a href="#">${entry.value.nickname}</a>
								          <p>${entry.key.content}</p>
								          <div>
								             <span class="smallicon">
								                <fmt:formatDate value="${entry.key.comment_time}" pattern="yyyy-MM-dd HH:mm"/>
								             </span>
										    <a name="addcomment" class="toggle-comment" href="#">
										      <span class="glyphicon glyphicon-edit"></span>回复
										    </a>
										     <a name="zhuan" class="toggle-comment" href="#">
										      <span class="glyphicon glyphicon-thumbs-up"></span>赞
										    </a>
								          </div>
								          <hr/>
								       </div>
								    </div> 
						      </c:forEach> --%>
						          <!--一条评论结束 -->
						          <!-- 分页 -->
					          <div>
					             <nav>
									<ul class="pagination">
									    <li class="disabled"><a href="#">&laquo;</a></li>
									    <%-- <c:forEach var = "page" begin="1" end = "${pages}" step="1">
									       <li class="myPage"><a href="#">${page}</a></li>
							            </c:forEach> --%>
									    <li><a href="#">&raquo;</a></li>
									</ul>
								  </nav>
					          </div>
					          <!-- 分页结束 -->
					          <hr/>
					          <!--  写下自己的评论-->
					          <form action="reply.do" method="post">
					             <textarea rows="3" cols="90" name="content" class="input-group"></textarea>
					             <input type="hidden" value="${post.id }" name="post_id"/>
					             <div style="float:right;margin-top:10px;"><button type="submit" class="btn btn-primary">评论</button></div>
					          </form>
					          
						  </div>
						</div>
					</div>
		         </div>
		         </div>
		  <div class="col-md-4">
             <button type="button" class="btn btn-success">关注问题</button>
		     <div class="gz_num">
			    <a href="#"><strong>19897</strong></a>人关注该问题
             </div>
             <hr/>
             <div class="author">
                <h4>关于作者</h4>
                <div>
                   <img src="images/head.jpg" width="50px" height="50px"/>
                   <a>${post.account}</a>
                   <button type="button" class="btn btn-success">关注ta</button>
                </div>
             </div>
		  </div>
		</div>
        
        
    </div>
</body>
</html>