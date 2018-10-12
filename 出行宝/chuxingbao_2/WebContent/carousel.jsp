<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<title>轮播jsp</title>


<style>
*{ padding:0; margin:0; list-style:none;}
.banner{ margin:100px auto; /* border:5px solid #000; */ width:1350px; height:500px; overflow:hidden; position:relative;}
/* .banner{ margin:100px auto; border:5px solid #000; width:550px; height:300px; overflow:hidden; position:relative;} */
.banner .img{ width:5000px; position:absolute; left:0px; top:0;}
.banner .img li{ float:left;}

.banner .num{ position:absolute; width:100%; bottom:10px; left:0; text-align:center; font-size:0px;}
.banner .num li{ width:10px;height:10px; background:#888; border-radius:50%; display:inline-block; margin:0 3px; cursor:pointer;}
.banner .num li.on{ background:#F60;}

.banner .btn{ width:30px; height:50px; background:rgba(0,0,0,0.5); position:absolute; top:50%; margin-top:-25px; cursor:pointer; text-align:center; line-height:50px; color:#fff; font-size:40px; font-family:"宋体"; display:none;}
.banner:hover .btn{ display:block;}

.banner .btn_l{ left:0;}
.banner .btn_r{ right:0;}

</style>
<script type="text/javascript" src="js/jquery-1.12.0.min.js"></script>
<script type="text/javascript">

$(function(){
	
	var i=0;
	var clone=$(".banner .img li").first().clone();
	$(".banner .img").append(clone);	
	var size=$(".banner .img li").size();	
	for(var j=0;j<size-1;j++){
		$(".banner .num").append("<li></li>");
	}
	$(".banner .num li").first().addClass("on");
	
	/*鼠标划入圆点*/
	$(".banner .num li").hover(function(){
		var index=$(this).index();
		i=index;
		$(".banner .img").stop().animate({left:-index*1350},500)	
		$(this).addClass("on").siblings().removeClass("on")		
	})
	
	/*自动轮播*/
	var t=setInterval(function(){
		i++;
		move()
	},2000)
	
	
	/*对banner定时器的操作*/
	$(".banner").hover(function(){
		clearInterval(t);
	},function(){
		t=setInterval(function(){
			i++;
			move()
		},2000)
	})
	
	/*向左的按钮*/
	$(".banner .btn_l").click(function(){
		i++
		move();	
	})
	
	/*向右的按钮*/
	$(".banner .btn_r").click(function(){
		i--
		move()				
	})
	

	function move(){
		
		if(i==size){
			$(".banner  .img").css({left:0})			
			i=1;
		}
		
		
		if(i==-1){
			$(".banner .img").css({left:-(size-1)*1350})
			i=size-2;
		}
		
		$(".banner .img").stop().animate({left:-i*1350},500)
		
		
		if(i==size-1){
			$(".banner .num li").eq(0).addClass("on").siblings().removeClass("on")	
		}else{		
			$(".banner .num li").eq(i).addClass("on").siblings().removeClass("on")	
		}
	}
})
</script>

</head>
<body>
<div class="banner">
	<ul class="img">
    	<li><a href="#"><img src="images/c1.jpg"></a></li>
        <li><a href="#"><img src="images/c2.jpg"></a></li>
        <li><a href="#"><img src="images/c3.jpg"></a></li>
        <li><a href="#"><img src="images/c4.jpg"></a></li>
    </ul>
    
    <ul class="num">    	
    </ul>
    
    <div class="btn btn_l">&lt;</div>
    <div class="btn btn_r">&gt;</div>

</div>

</body>
</html>