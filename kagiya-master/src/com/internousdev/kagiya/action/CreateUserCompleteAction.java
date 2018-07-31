package com.internousdev.kagiya.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kagiya.dao.CartInfoDAO;
import com.internousdev.kagiya.dao.DestinationInfoDAO;
import com.internousdev.kagiya.dao.UserInfoDAO;
import com.internousdev.kagiya.dto.DestinationInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware {

	private String family_name;
	private String first_name;
	private String family_name_kana;
	private String first_name_kana;
	private String sex;
	private String email;
	private String user_id;
	private String password;
	private Map<String, Object> session;

	//ユーザーが一件でも登録されたらsessionにuser_idを入れresultをSUCCESSにして返す
	public String execute() {
		String result = ERROR;

		if(!session.containsKey("checked")) {
			result = "home";
			return result;
		}

		UserInfoDAO UserInfoDao = new UserInfoDAO();
		int count = UserInfoDao.createUser(family_name, first_name, family_name_kana, first_name_kana, sex, email,
				user_id, password);
		if (count > 0) {
			result = SUCCESS;

			session.put("loginId", user_id);
			session.put("logined", 1);
		}


		// （仮）ユーザーでカートに入れた情報をログインした時にそのまま入れたカート情報を引き継ぐ処理
		int countNum = 0;
		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		countNum = cartInfoDAO.linkToLoginId(String.valueOf(session.get("tempUserId")), user_id);

		if (countNum > 0) {
			DestinationInfoDAO destinationInfoDao = new DestinationInfoDAO();

			try {
				List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<DestinationInfoDTO>();
				destinationInfoDtoList = destinationInfoDao.getDestinationInfo(user_id);
				Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();

				if (!(iterator.hasNext())) {
					destinationInfoDtoList = null;
				}

				session.put("destinationInfoDtoList", destinationInfoDtoList);

			} catch (SQLException e) {
				e.printStackTrace();
			}
			result = "settlement";
		}

		session.remove("checked");
		return result;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getFamily_name_kana() {
		return family_name_kana;
	}

	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}

	public String getFirst_name_kana() {
		return first_name_kana;
	}

	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
