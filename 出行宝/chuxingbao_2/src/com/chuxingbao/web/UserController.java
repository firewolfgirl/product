package com.chuxingbao.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.chuxingbao.domain.Strategy;
import com.chuxingbao.domain.User;
import com.chuxingbao.domain.UserInfo;
import com.chuxingbao.service.UserService;


@Controller
public class UserController {
	@Autowired
	private UserService userService ;
	
	
	/*@RequestMapping(value="/index.do")
	public String index(){
		return "index";
	}*/
	
	@RequestMapping(value="/userLogin.do")
	public ModelAndView userLogin(HttpServletRequest request ,HttpServletResponse response ,
			String account,String password)throws IOException{
		ModelAndView mav = new ModelAndView("index");
		if(userService.isLogin(account, password)){
			request.getSession().setAttribute("account", account);
			request.getSession().setAttribute("password", password);
  		    UserInfo userInfo = userService.findUserInfoByAccount(account);
			request.getSession().setAttribute("userInfo", userInfo);
//			List<Topic> topicList = userService.findTopicsByCares();
//			List<Post> postList = userService.findNewPosts();
//			List<Care> careList = userService.findCaresByAccount(account);
//			request.getSession().setAttribute("topicList", topicList);
//			request.getSession().setAttribute("postList", postList);
//			request.getSession().setAttribute("careList", careList);
			//freshenIndex(request); // 刷新首页内容
		}else{
			mav.setViewName("redirect:login.html");
		}
		return mav ;
	}
	
	private void freshenIndex(HttpServletRequest request){
//		List<Topic> topicList = userService.findTopicsByCares();
//		List<Post> postList = userService.findNewPosts();
//		request.getSession().setAttribute("topicList", topicList);
//		request.getSession().setAttribute("postList", postList);
	}
	
	@RequestMapping(value="/personInfo.do")
	public ModelAndView personInfo(HttpServletRequest request)throws IOException{
		ModelAndView mav = new ModelAndView("personInfo");
		String account = ((UserInfo)request.getSession().getAttribute("userInfo")).getAccount();
		
//		List<Care> careList = userService.findCaresByAccount(account);
//		Map<String, List<Topic>> map = new HashMap<>();
//		List<Topic> topics = new ArrayList<>();
//		for (Care care : careList) {
//			Topic topic = userService.getTopicById(care.getTopic_id());
//			topics.add(topic);
//		}
//		map.put(account, topics);
//		
//		List<Collection> collections = userService.findCollectionsByAccount(account);
//		Map<String, List<Post>> mapPost = new HashMap<>();
//		List<Post> posts = new ArrayList<>();
//		for (Collection collection : collections) {
//			Post post = userService.getPostById(collection.getPost_id());
//			posts.add(post);
//		}
//		mapPost.put(account, posts);
//		
//		int count = careList.size();
//		mav.addObject("count",count);
//		mav.addObject("map",map);
//		mav.addObject("mapPost",mapPost);
		return mav ;
	}
	
	
//	@RequestMapping(value="/modifyUser.do")
//	public String modifyUser(HttpServletRequest request,
//			String nickname ,String address,String job,String education,String introduction)throws IOException{
//		UserInfo userInfo = (UserInfo)request.getSession().getAttribute("userInfo");
//		userInfo.setNickname(nickname);
//		userInfo.setAddress(address);
//		userInfo.setJob(job);
//		userInfo.setEducation(education);
//		userInfo.setIntroduction(introduction);
//		userService.updateUserInfo(userInfo);
//		request.getSession().setAttribute("userInfo", userInfo);
//		return "redirect:personInfo.do" ;
//	}
	
	
//	@RequestMapping(value="/upLoadHead.do")
//	public String upLoadHead(HttpServletRequest request,@RequestParam("file") MultipartFile file)throws IOException{
//		UserInfo userInfo = (UserInfo)request.getSession().getAttribute("userInfo");
//		if(!file.isEmpty()){
//			//获取服务器端的绝对路径+相对路径head
//			String filePath = request.getSession().getServletContext().getRealPath("/")+"/head/";
//			IPTimeStamp ipTimeStamp = new IPTimeStamp(file.getOriginalFilename());
//			String imgName = ipTimeStamp.getIPTimeRandName();
//			file.transferTo(new File(filePath+imgName));//将客户端文件传输至服务器端
//			/*int position = filePath.lastIndexOf("/");//定位到D:\Study\JAVA EE_Publish\zhihu_mj/head/xx.jpg
//			String head = filePath.substring(position+1);//获取真正的图片名
//*/			userInfo.setHead(imgName);//更新头像信息
//		}
//		userService.updateUserInfo(userInfo);//修改用户信息
//		request.getSession().setAttribute("userInfo", userInfo);
//		return "redirect:personInfo.do" ;
//	}
	
//	@RequestMapping(value="/addCare.do")
//	@ResponseBody
//	public void addCare(HttpServletRequest request,HttpServletResponse response,int topic_id)throws IOException{
//		UserInfo userInfo = (UserInfo)request.getSession().getAttribute("userInfo");
//		System.out.println(topic_id);
//		Care care = new Care(userInfo.getAccount(),topic_id );
//		userService.careTopic(care);
//		response.getWriter().println("关注成功");
//		/*String account = (String)request.getSession().getAttribute("account"); // 這裡其實可以直接獲取用戶名 因為你之前有把用戶胡和密碼都設在了session里
//		userService.addCare(account, topic_id);
//		freshenIndex(request); // 刷新首頁內容
//		return "redirect:index.do" ;*/
//	}
	
//	@RequestMapping(value="/collection.do")
//	@ResponseBody
//	public void collection(HttpServletRequest request,HttpServletResponse response,int post_id)throws IOException{
//		UserInfo userInfo = (UserInfo)request.getSession().getAttribute("userInfo");
//		Collection collection = new Collection(post_id, userInfo.getAccount());
//		userService.collectionPost(collection);
//		response.getWriter().println("ok");
//	}
//	
//	@RequestMapping(value="/comment.do")
//	public ModelAndView comment(HttpServletRequest request,int post_id)throws IOException{
//		ModelAndView mav = new ModelAndView("comment");
//		UserInfo userInfo = (UserInfo)request.getSession().getAttribute("userInfo");
//		List<Comment> posts = userService.getCurrentComments(post_id, 0, 3);
//		int count = Integer.parseInt(String.valueOf(userService.getCount(post_id)));
//		int pages = 0 ;
//		if(count % 2 == 0){
//			pages = count / 2 ;
//		}else{
//			pages = count / 2 + 1 ;
//		}
//		request.getSession().setAttribute("userInfo", userInfo);
//		mav.addObject("posts",posts);
//		mav.addObject("pages",pages);
//		mav.addObject("post_id",post_id);
//		Post post = userService.getPostById(post_id);
//		mav.addObject("post",post);
//		/*
//   		Map<Comment, UserInfo> map = userService.getAllCommentsById(post_id);
//		mav.addObject("map",map);*/
//		return mav;
//	}
//	
//	
//	@RequestMapping(value="/reply.do")
//	public String reply(HttpServletRequest request,Integer post_id,String content)throws IOException{
//		UserInfo userInfo = (UserInfo)request.getSession().getAttribute("userInfo");
//		Comment comment = new Comment(post_id, userInfo.getAccount(), content, new Timestamp(new Date().getTime()));
//		userService.commentPost(comment);
//		request.getSession().setAttribute("userInfo", userInfo);
//		return "redirect:comment.do?post_id="+post_id ;
//	}
//	
//	@RequestMapping(value="/askPage.do")
//	public ModelAndView askPage(HttpServletRequest request)throws IOException{
//		 ModelAndView mav = new ModelAndView("askPage");
//		 List<Topic> list = userService.findAllTopics();
//		 mav.addObject("topicList", list);
//		 return mav ;
//	}
//	
//	@RequestMapping(value="/askQuestion.do")
//	public String askQuestion(HttpServletRequest request,Integer topic_id,String title,String content)throws IOException{
//		Post post = new Post() ;
//		post.setTopic_id(topic_id);
//		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("userInfo");
//		post.setAccount(userInfo.getAccount());
//		post.setTitle(title);
//		post.setContent(content);
//		List<String> list = ImgUtil.getImageSrc(content);
//		post.setImage(list.get(0));
//		post.setPost_time(new Timestamp(new Date().getTime()));
//		post.setReaded(0);
//		post.setComment(0);
//		post.setCollection(0);
//	    System.err.println(post);
//		userService.addPostByAskQuestion(post);
//		return "askPage" ;
//	}
//	
//	@RequestMapping(value="/postPage.do")
//	public ModelAndView postPage(HttpServletRequest request,Integer topic_id)throws IOException{
//		ModelAndView mav = new ModelAndView("postPage");
//		List<Post> posts = userService.getCurrentPosts(topic_id, 0, 2);
//		int count = Integer.parseInt(String.valueOf(userService.getCount(topic_id)));
//		int pages = 0 ;
//		if(count % 2 == 0){
//			pages = count / 2 ;
//		}else{
//			pages = count / 2 + 1 ;
//		}
//		mav.addObject("posts",posts);
//		mav.addObject("pages",pages);
//		mav.addObject("topic_id",topic_id);
//		return  mav ;
//	}
//	
//	@RequestMapping(value="/page.do")
//	@ResponseBody
//	public void page(HttpServletRequest request,HttpServletResponse response,Integer topic_id,String page)throws IOException{
//		int beginPage = (Integer.parseInt(page.trim())-1)*2 ;
//		List<Post> lists = userService.getCurrentPosts(topic_id, beginPage, 2);
//		response.getWriter().print(JSON.toJSONString(lists));
//	}
	
	@RequestMapping(value="/regCheck.do")
	public String regCheck(HttpServletRequest request ,String account,String password){
		User user = new User(account,password);
		boolean flag = userService.userRegist(user);
		if(flag){
			return "redirect:login.html" ;
		}else{
			return "redirect:regist.html" ;
		}
	}

}
