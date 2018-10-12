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
<title>Insert title here</title>

</head>
<body>
<jsp:include page="head.jsp"/>

<div class="mycontainer container">
	      <div class="row">
			  <div class="col-md-8">
			  <jsp:include page="strategyList.jsp"/>
			      <%-- <div class="o_button">
                                  
			      </div>
			      <hr style="border:1px dashed #c6d8e6">
			      <div id="show"><!--分割线上面的内容-->
						<article style="display: inline-block;width: 90%;" class="newdongtai">
							<span class="caogao glyphicon glyphicon-edit"></span>推荐攻略
						</article>
						<aside style="display: inline-block;" class="caogao">
							<span class="glyphicon glyphicon-cog"></span>设置
					    </aside>
			      </div>
			      <hr style="border:1px solid #c6d8e6 "> 
		  			
		  			
		  		  <c:forEach var="post" items="${postList}">
		  		        <div id="tiezi"><!--一个帖子全部内容-->
		    			     <article  style="display: inline-block;">
		    				      <div><!--话题发起人头像-->
		    					      <img alt="head" src="${post.image}" width="45px" height="45px" />
		    				      </div>
			    				  <!-- <div>关注这个帖子的人数
			    					<button type="button" class="btn btn-default btn-sm" style="background-color: #EFF6FA;margin-top:4px">999</button>
			    				  </div> -->
		    				</article>
		    				<aside style="display: inline-block;vertical-align: top;">
		    					<div><!--相关的话题-->
		    						<!-- <div class="topic">
			    					    <font style="font-family: '宋体';color: darkgray;">来自话题：</font><a>
				    					<font style="font-family: '宋体';color: darkgray;">中国古代四大美女</font></a>
				    					<a><font style="font-family: '宋体';color: #2255a7;">关注话题</font></a>
		    						</div> -->
			    					<!-- <div class="dislike">
			    					    <span class="glyphicon glyphicon-remove"></span>
			    					</div> -->
		    					</div>
			    				<div><!--问题-->
			    					<a href="comment.do?post_id=${post.id}"><font style="font-family: '微软雅黑';">${post.title}</font></a>
			    				</div>
			    				<div id=""><!--作者的昵称和签名-->
			    					<a><strong style="color:#333">${post.account}</strong></a>
			    				</div>
			    				<div>
			    					<article style="display: inline-block;">
			      						<img src="${post.image}" style="width: 100PX;height: 112PX;">
			                    	</article>
			                    	<aside style="display: inline-block;vertical-align: top;position: absolute;"><!--标题-->
			                    		   <div style="height: 100px;overflow: hidden;color: black;">
			                    			  ${post.content} 
			                                 <a class="toggle-expand" href="#">显示全部</a> 
			                               </div>
			                    	</aside>
			    				</div>
			    				<div id="last_font"><!--最后一行小字-->
			    					<ul>
			    						<li id="small_word">
			    						   <a><span class="collection glyphicon glyphicon-plus"><font id="small_words">关注问题</font></span>
			    						   <input type="hidden" name="post_id" value="${post.id}"/></a>
			    						</li>
			    						<li id="small_word">
			    						   <a><span class="glyphicon glyphicon-comment"></span><font id="small_words">评论${post.comment}条</font></a>
			    						</li>
			    						<li id="small_word">
			    						   <a><span class="glyphicon glyphicon-thumbs-up"></span><font id="small_words">感谢</font></a>
			    						</li>
			    						<li id="small_word">
			    						   <a><font id="small_words">作者保留权利</font></a>
			    						</li>
			    					</ul>
			    				</div>
		    			   </aside>
		    		     </div>
		    		     <hr style="border:1px solid #c6d8e6 ">
		  		  </c:forEach> --%>
		  		 
			  </div>
			  
			  
			  <div class="my col-md-4">
			  <br>
				     <!-- <div class="my4_img">
	  					<img src="images/guanggao.jpg" style="border-radius: 15px;"/>
	  				 </div> -->
				     <div class="my4_img">
	  					<img src="images/findhotel.jpg" style="border-radius: 15px;"/>
	  				 </div>
		  			<!-- <div class="right_small">
		  				<ul>
		  					<li><a><span class="glyphicon glyphicon-bookmark"></span> &nbsp; <font>我的收藏</font></a></li>
		  					<li><a><span class="glyphicon glyphicon-comment"></span> &nbsp;  <font>我回答的问题</font></a></li>
		  					<li><a><span class="glyphicon glyphicon-ok"></span>&nbsp;   <font>我关注的问题</font></a></li>
		  				</ul>
		  			</div> -->
		  			<hr style="border:1px solid #c6d8e6 ">
                     <%-- <div class="panel panel-default">
						  <div class="panel-heading">热门话题</div>
						  <div class="panel-body">
						     <c:forEach var="topic" items="${topicList}">
						        <div class="col-md-2">
						    	      <a href="postPage.do?topic_id=${topic.id}"><img src="images/${topic.logo}"></a>
						    	  </div>
						    	  <div class="col-md-10">
						    	     <div class="col-md-7">
						    	        <strong>${topic.name}</strong>
						    	     </div> 
						    	     <div class="gz col-md-5">
						    	         <c:forEach var="care" items="${careList}">
						    	                <c:if test="${care.topic_id == topic.id }">
						    	                     <span class="attent glyphicon glyphicon-plus">已关注</span>
						    	                </c:if>
						    	         </c:forEach>
						    	         <a class="gz" href="#">
						    	             <span class="care glyphicon glyphicon-plus" style="color:#428bca">关注</span>
						    	             <input type="hidden" name="topic_id" value="${topic.id}"/>
						    	         </a>
						    	        <form action="/zhihu/addCare.do" method="post">
						    	           <a class="gz">
						    	             <input type="hidden" name="topic_id" value="${topic.id}"/>
						     	             <button type="submit" id="addgz" class="btn btn-link">
						    	                 <span class="glyphicon glyphicon-plus"></span>关注
						    	             </button>
						    	              <button type="button" id="yetgz" class="btn btn-link" style="display:none">已关注</button>
						    	           </a>
						    	        </form>
						    	     </div>
						    	     <div style="margin-left:5px;"><p>${topic.description}</p></div>
						    	  </div> 
						     </c:forEach>
					  	  </div>
					</div> --%>
                     		  			
              </div>
		  </div>
	 </div>



</body>
</html>