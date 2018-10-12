package com.chuxingbao.service.impl;

//import java.util.List;
//import java.util.Map;
//import java.util.TreeMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chuxingbao.dao.UserDAO;
import com.chuxingbao.dao.UserInfoDAO;
import com.chuxingbao.domain.User;
import com.chuxingbao.domain.UserInfo;
import com.chuxingbao.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDao ;
	@Autowired
	private UserInfoDAO userInfoDao;
//	@Autowired
//	private TopicDAO topicDao;
//	@Autowired
//	private PostDAO postDao ;
//	@Autowired
//	private CareDAO careDao;
//	@Autowired
//	private CommentDAO commentDao;
//	@Autowired 
//	private CollectionDAO collectionDao;
	

	@Override
	public boolean userRegist(User user) {
		boolean flag = false ;
		int n = 0 ;
		n = userDao.insertUser(user);
		if(n == 1){
			flag = true ;
		}
		return flag;
	}

	@Override
	public boolean isLogin(String account, String password) {
		boolean flag = false ;
		User user = userDao.findUserByAccount(account);
		if(user!=null){
			if(user.getPassword()!=null){
				if(password.equals(user.getPassword())){
					flag = true ;
				}
			}
		}
		return flag ;
	}

	@Override
	public UserInfo findUserInfoByAccount(String account) {
		UserInfo userInfo = new UserInfo();
		userInfo = userInfoDao.getUserInfoByAccount(account);

		return userInfo;
	}

	@Override
	public int updateUserInfo(UserInfo userInfo) {
		 userInfoDao.updateUserInfo(userInfo);
		return 1 ;
	}

//	@Override
//	public List<Topic> findTopicsByCares() {//根据关注度降序查询所有话题
//		 List<Topic> list = topicDao.findTopicsByCares();
//		return list;
//	}
//
//	@Override
//	public List<Post> findTopPosts() {
//		List<Post> list = postDao.findTopPosts();
//		return list ;
//	}
//
//	@Override
//	public List<Post> findNewPosts() {
//		List<Post> list = postDao.findNewPosts();
//		return list;
//	}
//
//	@Override
//	public List<Care> findCaresByAccount(String account) {
//		List<Care> list = careDao.getCaresByAccount(account);
//		return list;
//	}
//
//	@Override
//	public Topic getTopicById(int id) {
//		Topic topic = topicDao.findTopicById(id);
//		return topic;
//	}
//

//
//	@Override
//	public int addCare(Care care) {
//		int n = careDao.insertCare(care);
//		return n;
//	}
//
//	@Override
//	public Post getPostById(int id) {
//		Post post = postDao.findPostById(id);
//		return post;
//	}
//	
//	
//   /**
//    *根据帖子id查找其所有评论
//    */
//	@Override
//	public Map<Comment, UserInfo> getAllCommentsById(int post_id) {
//		List<Comment> list = commentDao.findAllCommentsByPostId(post_id);
//		Map<Comment,UserInfo> map = new TreeMap<>();
//		for (Comment comment : list) {
//			UserInfo userInfo = userInfoDao.getUserInfoByAccount(comment.getAccount());
//			map.put(comment, userInfo);
//		}
//		return map;
//	}
//
//	
//	@Override
//	public void commentPost(Comment comment) {
//      	commentDao.insertComment(comment);//插入一条评论
//      	Post post = postDao.findPostById(comment.getPost_id());
//      	post.setComment(post.getComment()+1);
//      	postDao.updatePost(post);//修改帖子表的评论数
//      	UserInfo userInfo = userInfoDao.getUserInfoByAccount(comment.getAccount());
//      	userInfo.setCredits(userInfo.getCredits()+100);
//      	userInfoDao.updateUserInfo(userInfo);//修改积分
//	}
//
//	@Override
//	public void deleteComment(Comment comment) {
//       	commentDao.deleteCommentById(comment.getId());//删除自己的一条评论
//       	Post post = postDao.findPostById(comment.getPost_id());
//       	post.setComment(post.getComment()-1);//修改帖子表的评论数
//	}
//
//	@Override
//	public List<Topic> findAllTopics() {
//		List<Topic> list = topicDao.findAllTopics();
//		return list;
//	}
//
//	@Override
//	public void addPostByAskQuestion(Post post) {
//       postDao.insertPost(post);//插入一条帖子
//       UserInfo userInfo = userInfoDao.getUserInfoByAccount(post.getAccount());
//       userInfo.setCredits(userInfo.getCredits()+100);//找到用户，积分加100
//       userInfoDao.updateUserInfo(userInfo);//持久化
//	}
//
//	@Override
//	public void careTopic(Care care) {
//        careDao.insertCare(care);	
//        //找到话题，关注度+1
//        Topic topic = topicDao.findTopicById(care.getTopic_id());
//        topic.setCared(topic.getCared()+1);
//        topicDao.updateTopic(topic);
//	}
//
//	@Override
//	public void collectionPost(Collection collection) {
//		collectionDao.insertCollection(collection);
//		//找到帖子，收藏数+1
//		Post post = postDao.findPostById(collection.getPost_id());
//		post.setCollection(post.getCollection()+1);
//		postDao.updatePost(post);
//	}
//
//	@Override
//	public List<Collection> findCollectionsByAccount(String account) {
//		List<Collection> list = collectionDao.getCollectionPostsByAccount(account);
//		return list;
//	}
//
//	@Override
//	public Long getCount(int topic_id) {
//		Long count = postDao.getCount(topic_id);
//		return count;
//	}
//
//	@Override
//	public List<Post> getCurrentPosts(int topic_id, int currentPage, int pageSize) {
//		List<Post> lists = postDao.getCurrentPosts(topic_id, currentPage, pageSize);
//		return lists;
//	}
//
//	@Override
//	public Long getCommentCount(int post_id) {
//		Long count = commentDao.getCount(post_id);
//		return count;
//	}
//
//	@Override
//	public List<Comment> getCurrentComments(int post_id, int currentPage, int pageSize) {
//		List<Comment> lists = commentDao.getCurrentComments(post_id, currentPage, pageSize);
//		return lists;
//	}



	

}
