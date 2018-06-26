package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ChangeProductCompleteDAO {

	private DateUtil dateUtil=new DateUtil();
	private String item = "UPDATE item_info_transaction (item_name, item_price, item_stock,insert_date) VALUES(?, ? ,?, ?)";
	public void changeProduct(String changeitemName ,String changeitemPrice,String changeitemStock)
			throws SQLException{
		 DBConnector dbconnector =new DBConnector();
		 Connection connection=dbconnector.getConnection();

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(item);
			preparedStatement.setString(1, changeitemName);
			preparedStatement.setString(2, changeitemPrice);
			preparedStatement.setString(3, changeitemStock);
			preparedStatement.setString(4, dateUtil.getDate());
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
