package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ChangeProductConfirmDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ChangeProductConfirmDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<ChangeProductConfirmDTO> getProductInfo
	() throws SQLException {
	ArrayList<ChangeProductConfirmDTO> changeProductConfirmDTO = new ArrayList<ChangeProductConfirmDTO>();
	String sql ="SELECT * FROM item_info_transaction";

	try {

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {

			//取得したものをDTOに格納し、そのDTOをArrayListに格納
		ChangeProductConfirmDTO dto = new ChangeProductConfirmDTO();
		dto.setId(resultSet.getString("id"));
		dto.setItemName(resultSet.getString("item_name"));
		dto.setItemPrice(resultSet.getString("item_price"));
		dto.setItemStock(resultSet.getString("item_stock"));
		dto.setInsert_date(resultSet.getString("insert_date"));
		dto.setUpdate_date(resultSet.getString("update_date"));
		changeProductConfirmDTO.add(dto);
	}
	} catch(Exception e) {

		e.printStackTrace();
		} finally {
		connection.close();

		}
		return changeProductConfirmDTO;

		}
//↓DBから購入履歴を削除するメソッド
		public int ProductDelete
		(String id, String itemname, String itemprice, String itemstock) throws SQLException {
			String sql ="DELETE FROM item_info_transaction WHERE id = ? AND itemname = ? AND itemprice = ? AND itemstock = ?";
					PreparedStatement preparedStatement;
				int result =0;
				try {
					preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, id);
					preparedStatement.setString(2, itemname);
					preparedStatement.setString(3, itemprice);
					preparedStatement.setString(4, itemstock);
					result = preparedStatement.executeUpdate();
				} catch (SQLException e) {
						e.printStackTrace();
				} finally {
						connection.close();

				}
						return result;//Actionに削除した件数を返す
	}
}