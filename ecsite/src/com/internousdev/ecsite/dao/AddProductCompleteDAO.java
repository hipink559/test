package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class AddProductCompleteDAO {

	private DateUtil dateUtil=new DateUtil();
	private String item = "INSERT INTO item_info_transaction (item_name, item_price, item_stock,insert_date) VALUES(?, ? ,?, ?)";
	public void createProduct(String additemName ,String additemPrice,String additemStock)
			throws SQLException{
		 DBConnector dbconnector =new DBConnector();
		 Connection connection=dbconnector.getConnection();

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(item);
			preparedStatement.setString(1, additemName);
			preparedStatement.setString(2, additemPrice);
			preparedStatement.setString(3, additemStock);
			preparedStatement.setString(4, dateUtil.getDate());
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
