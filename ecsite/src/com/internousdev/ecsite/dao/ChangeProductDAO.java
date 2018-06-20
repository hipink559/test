package com.internousdev.ecsite.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.ChangeProductDTO;
import com.internousdev.ecsite.util.DBConnector;

	public class ChangeProductDAO {
		public ChangeProductDTO getBuyItemInfo(){
			DBConnector dbConnector=new DBConnector();
			Connection connection =dbConnector.getConnection();
			ChangeProductDTO ChangeProductDTO=new ChangeProductDTO();
			String sql="SELECT id,item_name,item_price,item_stock FROM item_info_transaction";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				ChangeProductDTO.setId(resultSet.getInt("id"));
				ChangeProductDTO.setItemName(resultSet.getString("item_name"));
				ChangeProductDTO.setItemPrice(resultSet.getString("item_price"));
				ChangeProductDTO.setId(resultSet.getInt("item_stock"));

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return ChangeProductDTO;
	}
}