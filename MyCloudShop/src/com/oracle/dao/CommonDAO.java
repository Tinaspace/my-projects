package com.oracle.dao;

import java.sql.*;
import java.util.List;

public class CommonDAO {
	//创建链接对象
	public Connection getConnection(){
		Connection con=null;
		String className="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mycloudshop";
		String user="root";
		String password="123456";
		try{
			Class.forName(className);
			con=DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			e.printStackTrace();
			}
		return con;
	}
	//关闭资源
	public void closeAll(ResultSet rs,Connection con,PreparedStatement pst){
		try{
			if(rs!=null){
				rs.close();
			}
			if(con!=null){
				con.close();
			}
			if(pst!=null){
				pst.close();
			}
		}catch (Exception e) {
			e.printStackTrace();
			}
	}
	//执行对表的更新操作
	public int updateTable(Connection con,String sqlString,List<Object> params){
		int ret=0;
		try{
			//创建语句对象
			PreparedStatement pst=con.prepareStatement(sqlString);
			//对语句中的占位赋值
			if(params!=null){
				for(int i=0;i<params.size();i++){
					pst.setObject(i+1, params.get(i));
				}
			}
			ret=pst.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
			}
		return ret;
	}
	//执行对表的查询操作
	public ResultSet query(Connection con,String sqlString,List<Object> params){
		ResultSet rs=null;
		try{
			PreparedStatement prepareStatement=con.prepareStatement(sqlString);
			if(params!=null){
				for(int i=0;i<params.size();i++){
					prepareStatement.setObject(i+1,params.get(i));
				}
			}
			rs=prepareStatement.executeQuery();
		}catch (Exception e) {
			e.printStackTrace();
			}
		return rs;
	}
}
