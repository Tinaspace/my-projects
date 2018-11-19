package com.oracle.biz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.oracle.dao.CommonDAO;
import com.oracle.entity.Book;
import com.oracle.entity.Member;

public class MemberBiz {
	/**
	 * ±£¥Êª·‘±
	 * 
	 * */
	private CommonDAO commonDao=new CommonDAO();
	
	public int saveMember(Member member){
		int ret=0;
		String saveMemberSql="insert into member(nickname,memberpwd,membername,membergender,membertel,memberemail) values(?,?,?,?,?,?)";
		Connection con =commonDao.getConnection();
		List<Object> params=new ArrayList<Object>();
		params.add(member.getNickname());
		params.add(member.getMemberpwd());
		params.add(member.getMembername());
		params.add(member.getMembergender());
		params.add(member.getMembertel());
		params.add(member.getMemberemail());
		
		ret=commonDao.updateTable(con, saveMemberSql, params);
		commonDao.closeAll(null, con, null);
		return ret;
	}
	public int doLoign(String nickname,String memberpwd){
		int ret=0;
		String loginSql="select *  from member where nickname=? and memberpwd=?";
		Connection con =commonDao.getConnection();
		List<Object> params=new ArrayList<Object>();
		params.add(nickname);
		params.add(memberpwd);
		
		ResultSet rs=commonDao.query(con,loginSql,params);
		try{
			if(rs.next()){
				ret=rs.getInt(1);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		commonDao.closeAll(rs, con, null);
		return ret;
	}
	public int modifyPwd(String oldpass,String newpass,String userId){
		int ret=0;
		String modifyPwdSql="update member set memberpwd=? where nickname=? and memberpwd=?";
		List<Object> params=new ArrayList<Object>();
		params.add(newpass);
		params.add(userId);
		params.add(oldpass);
		Connection con =commonDao.getConnection();
		ret=commonDao.updateTable(con, modifyPwdSql, params);
		return ret;
	}
	public List<Book> findAllBooks() throws SQLException{
		List<Book> books =new ArrayList<Book>();
		String queryString="select * from book";
		Connection con =commonDao.getConnection();
		ResultSet rs=commonDao.query(con, queryString, null);
		while(rs.next()){
			Book book=new Book(rs.getInt(1),
					rs.getString(2),
					rs.getDouble(3),
					rs.getDouble(4),
					rs.getString(5),
					rs.getString(6),
					rs.getString(7),
					rs.getString(8),
					rs.getString(9));
			books.add(book);
		}
		return books;
	}
	
	public List<Book> findAllBooksByKeyWord(String keyWord) throws SQLException{
		List<Book> books =new ArrayList<Book>();
		List<Object> params = new ArrayList<Object>();
		StringBuffer queryString=new StringBuffer("select * from book where 1=1");
		if(keyWord!=null && !"".equals(keyWord.trim())){
			queryString.append(" and bookname like ?");
			params.add("%"+keyWord+"%");
		}
		Connection con =commonDao.getConnection();
		ResultSet rs=commonDao.query(con, queryString.toString(), params);
		while(rs.next()){
			Book book=new Book(rs.getInt(1),
					rs.getString(2),
					rs.getDouble(3),
					rs.getDouble(4),
					rs.getString(5),
					rs.getString(6),
					rs.getString(7),
					rs.getString(8),
					rs.getString(9));
			books.add(book);
		}
		return books;
	}
	public Book findBookByBookId(int bookid) throws SQLException{
		Book book =null;
		String queryString="select * from book where bookid="+bookid;
		Connection con =commonDao.getConnection();
		ResultSet rs=commonDao.query(con, queryString, null);
		if(rs.next()){
			 book=new Book(rs.getInt(1),
					rs.getString(2),
					rs.getDouble(3),
					rs.getDouble(4),
					rs.getString(5),
					rs.getString(6),
					rs.getString(7),
					rs.getString(8),
					rs.getString(9)
					);
		}
		return book;
	}
	
}
