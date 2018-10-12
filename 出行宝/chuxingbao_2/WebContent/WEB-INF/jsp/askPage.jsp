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

<title>Insert title here</title>
<style type="text/css">
.mycontainer{
  margin-top:65px;
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
</style>
<script type="text/javascript">
    $(function(){
    	var topic_id;
		$(".dropdown-menu li a").click(function(){
			topic_id=$(this).parent("li").attr("id");
			alert(topic_id);
		});
    	$("#send").click(function(){
    		$.ajax({
    			url:"askQuestion.do",
    			type:"post",
    			data:{
    				topic_id: topic_id ,
    				title:$("#title").val(),
    			    content:UE.getEditor("editor").getContent()
    			},
    			dataType:"text",
    			success:function(data){
    				window.location.href="userLogin.do?account="+${account}+"&password="+${password};
    			}
    		});
    	});
    });
</script>
<!-- <script type="text/javascript">
			$(function(){
				var topic_id;
				$(".dropdown-menu li a").click(function(){
					topic_id=$(this).parent("li").attr("id");
					alert(topic_id);
				});
				$("#send").click(function(){
					$.ajax({
						url:"/Quora/askQuestion.do",
						type:"post",
						data:{
							topic_id:topic_id,
							title:$("#invi_title").val(),
						    content:UE.getEditor('editor').getContent()
						},
						dataType:"text",
						sucess:function(data){
							window.location.href="index.do";
						}
					});
				});
			});
		</script> -->

</head>
<body>
    <jsp:include page="head.jsp"/>
    <div class="mycontainer container">
       <div class="row">
		  <div class="col-md-8">
		     <!-- 提问区域 -->
		       <div class="row">
		  		  <div class="col-md-8">
		  		      <input type="text" class="form-control" id="title" placeholder="请输入标题"/><br/>
		  		  </div>
		  		  <div class="col-md-4">
		  		      <div class="dropdown">
				          <button class="btn btn-default dropdown-toggle" type="button"
				                 id="dropdownMenu1" data-toggle="dropdown">
				                                           选一个话题<span class="caret"></span>
				          </button>
				          <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
							  <c:forEach var="topic" items="${topicList }">
							  	<li role="presentation" id=${topic.id }>
							  	<a role="menuitem" tabindex="-1" href="#">${topic.name}</a></li>
							  </c:forEach>
						  </ul>
				          <%-- <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
				             <c:forEach var="topic" items="${topicList }">
					            <li role="presentation" id="${topic.id }">
								    <a role="menuitem" 	tabindex="-1" href="#">${topic.name}</a>
								</li>
				             </c:forEach>
				          </ul> --%>
			         </div> 
		  		  </div>
		  	   </div>
		  	   <script id="editor" type="text/plain" style="width: 750px; height: 300px;">
               </script>
               <button id="send" type="button" class="btn btn-primary" style="margin-left:300px;width:120px;margin-top:20px;">提交</button>
		  	   
		    
		  </div>
		  <div class="col-md-4">
	           <div class="my4_img">
  					<img src="images/guanggao.jpg" style="border-radius: 15px;"/>
  				 </div>
	  			<div class="right_small">
	  				<ul>
	  					<li><a><span class="glyphicon glyphicon-bookmark"></span> &nbsp; <font>我的收藏</font></a></li>
	  					<li><a><span class="glyphicon glyphicon-comment"></span> &nbsp;  <font>我回答的问题</font></a></li>
	  					<li><a><span class="glyphicon glyphicon-ok"></span>&nbsp;   <font>我关注的问题</font></a></li>
	  				</ul>
	  			</div>
		  </div>
       </div>
    </div>
    
    
    <script type="text/javascript">
		//实例化编辑器
		//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
		var ue = UE.getEditor('editor');

		function isFocus(e) {
			alert(UE.getEditor('editor').isFocus());
			UE.dom.domUtils.preventDefault(e)
		}
		function setblur(e) {
			UE.getEditor('editor').blur();
			UE.dom.domUtils.preventDefault(e)
		}
		function insertHtml() {
			var value = prompt('插入html代码', '');
			UE.getEditor('editor').execCommand('insertHtml', value)
		}
		function createEditor() {
			enableBtn();
			UE.getEditor('editor');
		}
		function getAllHtml() {
			alert(UE.getEditor('editor').getAllHtml())
		}
		function getContent() {
			var arr = [];
			arr.push("使用editor.getContent()方法可以获得编辑器的内容");
			arr.push("内容为：");
			arr.push(UE.getEditor('editor').getContent());
			alert(arr.join("\n"));
		}
		function getPlainTxt() {
			var arr = [];
			arr.push("使用editor.getPlainTxt()方法可以获得编辑器的带格式的纯文本内容");
			arr.push("内容为：");
			arr.push(UE.getEditor('editor').getPlainTxt());
			alert(arr.join('\n'))
		}
		function setContent(isAppendTo) {
			var arr = [];
			arr.push("使用editor.setContent('欢迎使用ueditor')方法可以设置编辑器的内容");
			UE.getEditor('editor').setContent('欢迎使用ueditor', isAppendTo);
			alert(arr.join("\n"));
		}
		function setDisabled() {
			UE.getEditor('editor').setDisabled('fullscreen');
			disableBtn("enable");
		}

		function setEnabled() {
			UE.getEditor('editor').setEnabled();
			enableBtn();
		}

		function getText() {
			//当你点击按钮时编辑区域已经失去了焦点，如果直接用getText将不会得到内容，所以要在选回来，然后取得内容
			var range = UE.getEditor('editor').selection.getRange();
			range.select();
			var txt = UE.getEditor('editor').selection.getText();
			alert(txt)
		}

		function getContentTxt() {
			var arr = [];
			arr.push("使用editor.getContentTxt()方法可以获得编辑器的纯文本内容");
			arr.push("编辑器的纯文本内容为：");
			arr.push(UE.getEditor('editor').getContentTxt());
			alert(arr.join("\n"));
		}
		function hasContent() {
			var arr = [];
			arr.push("使用editor.hasContents()方法判断编辑器里是否有内容");
			arr.push("判断结果为：");
			arr.push(UE.getEditor('editor').hasContents());
			alert(arr.join("\n"));
		}
		function setFocus() {
			UE.getEditor('editor').focus();
		}
		function deleteEditor() {
			disableBtn();
			UE.getEditor('editor').destroy();
		}
		function disableBtn(str) {
			var div = document.getElementById('btns');
			var btns = UE.dom.domUtils.getElementsByTagName(div, "button");
			for (var i = 0, btn; btn = btns[i++];) {
				if (btn.id == str) {
					UE.dom.domUtils.removeAttributes(btn, [ "disabled" ]);
				} else {
					btn.setAttribute("disabled", "true");
				}
			}
		}
		function enableBtn() {
			var div = document.getElementById('btns');
			var btns = UE.dom.domUtils.getElementsByTagName(div, "button");
			for (var i = 0, btn; btn = btns[i++];) {
				UE.dom.domUtils.removeAttributes(btn, [ "disabled" ]);
			}
		}

		function getLocalData() {
			alert(UE.getEditor('editor').execCommand("getlocaldata"));
		}

		function clearLocalData() {
			UE.getEditor('editor').execCommand("clearlocaldata");
			alert("已清空草稿箱")
		}
	</script>
    
    
</body>
</html>