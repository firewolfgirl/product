package com.chuxingbao.service;

//import java.util.List;
//import java.util.Map;

import com.chuxingbao.domain.User;
import com.chuxingbao.domain.UserInfo;



public interface GateTicketService {
	
	
//	//获得热点话题
//	public List<Topic> findTopicsByCares();
//	
//	//获得所有话题
//	public List<Topic> findAllTopics();
//	
//	//关注话题
//	public void careTopic(Care care);
//	
//	//获得热门帖子
//	public List<Post> findTopPosts();
//	
//	//获得最新帖子
//	public List<Post> findNewPosts();
//	
//	//关注帖子
//	public void collectionPost(Collection collection);
//	
//	//根据用户账号查询所有关注(把数据的处理从controller下移到service层)
//	public List<Care> findCaresByAccount(String account);
//	
//	//根据话题id获得话题信息
//	public Topic getTopicById(int id);
//	
//	//根据帖子id获得帖子信息
//	public Post getPostById(int id);
//	
//	//通过帖子id获得评论信息(把数据的处理从controller下移到service层)
//	public Map<Comment, UserInfo> getAllCommentsById(int post_id);
//	
//	//关注话题
//	public int addCare(Care care);
//	
//	//获得用户关注的帖子
//	public List<Collection> findCollectionsByAccount(String account);
//	
//	//用户评论帖子
//	public void commentPost(Comment comment);
//	
//	//用户删除自己的帖子
//	public void  deleteComment(Comment comment);
//	
//	//增加一条帖子
//	public void addPostByAskQuestion(Post post);
//	
//	//获得某个话题下的帖子数
//		public Long getCount(int topic_id);
//		
//		//取得当前页的记录
//		//topic_id是话题id，currentPage是当前页的第一条记录，pageSize表示每页显示的记录数
//		public List<Post> getCurrentPosts(int topic_id,int currentPage,int pageSize); 
//
//		public Long getCommentCount(int post_id);
//		public List<Comment> getCurrentComments(int post_id,int currentPage,int pageSize); 
}
