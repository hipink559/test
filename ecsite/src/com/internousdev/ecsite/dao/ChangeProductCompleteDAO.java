package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ChangeProductCompleteDAO {

	private DateUtil dateUtil=new DateUtil();
	private String item = "UPDATE item_info_transaction SET item_name=?, item_price=?, item_stock=? ,update_date=? where id=?";
	public void updateProduct(String itemName ,String itemPrice,String itemStock)
			throws SQLException{
		 DBConnector dbconnector =new DBConnector();
		 Connection connection=dbconnector.getConnection();

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(item);
			preparedStatement.setString(1, itemName);
			preparedStatement.setString(2, itemPrice);
			preparedStatement.setString(3, itemStock);
			preparedStatement.setString(4, dateUtil.getDate());
			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}
}
