package com.oracle.dao;

import java.sql.*;
import java.util.List;

public class CommonDAO {
	//�������Ӷ���
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
	//�ر���Դ
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
	//ִ�жԱ�ĸ��²���
	public int updateTable(Connection con,String sqlString,List<Object> params){
		int ret=0;
		try{
			//����������
			PreparedStatement pst=con.prepareStatement(sqlString);
			//������е�ռλ��ֵ
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
	//ִ�жԱ�Ĳ�ѯ����
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
