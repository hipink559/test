package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ChangeCustomerConfirmDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ChangeCustomerConfirmDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<ChangeCustomerConfirmDTO> getCustomerInfo

	() throws SQLException {
	ArrayList<ChangeCustomerConfirmDTO> changeCustomerConfirmDTO = new ArrayList<ChangeCustomerConfirmDTO>();
	String sql ="select * from login_user_transaction";

	try {

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {

			//取得したものをDTOに格納し、そのDTOをArrayListに格納
		ChangeCustomerConfirmDTO dto = new ChangeCustomerConfirmDTO();
		dto.setId(resultSet.getString("id"));
		dto.setLoginId(resultSet.getString("login_id"));
		dto.setLoginPass(resultSet.getString("login_pass"));
		dto.setUserName(resultSet.getString("user_name"));
		dto.setInsert_date(resultSet.getString("insert_date"));
		dto.setUpdate_date(resultSet.getString("update_date"));
		changeCustomerConfirmDTO.add(dto);
	}
	} catch(Exception e) {

		e.printStackTrace();
		} finally {
		connection.close();

		}
		return changeCustomerConfirmDTO;

		}
//↓DBから購入履歴を削除するメソッド
		public int CustomerDelete
		(String id, String loginid, String loginpass, String username) throws SQLException {
			String sql ="DELETE FROM login_user_transaction WHERE iid = ? AND login_id=? AND login_pass=? AND user_name=? = ?";
					PreparedStatement preparedStatement;
				int result =0;
				try {
					preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, id);
					preparedStatement.setString(2, loginid);
					preparedStatement.setString(3, loginpass);
					preparedStatement.setString(4, username);
					result = preparedStatement.executeUpdate();
				} catch (SQLException e) {
						e.printStackTrace();
				} finally {
						connection.close();

				}
						return result;//Actionに削除した件数を返す
	}
}