package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ChangeCustomerConfirmDAO;
import com.internousdev.ecsite.dto.ChangeCustomerConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeCustomerAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	private ChangeCustomerConfirmDAO changeCustomerConfirmDAO=new ChangeCustomerConfirmDAO();
	private ArrayList<ChangeCustomerConfirmDTO>customerList=new ArrayList<ChangeCustomerConfirmDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {
		if (!session.containsKey("id")) {
			return ERROR;
		}
		if(deleteFlg == null) {

			customerList = changeCustomerConfirmDAO.getCustomerInfo();
		} else if(deleteFlg.equals("1")) {
			delete();
		}
		String result = SUCCESS;
			return result;
		}
	public void delete() throws SQLException {
		String id = session.get("id").toString();
		String loginId = session.get("login_id").toString();
		String loginPass = session.get("login_pass").toString();
		String userName= session.get("user_name").toString();

		int res = changeCustomerConfirmDAO.CustomerDelete(id, loginId, loginPass, userName);
	if(res > 0) {
		customerList = null;
		setMessage("顧客情報を正しく削除しました。");
		} else if(res == 0) {
		setMessage("顧客情報の削除に失敗しました");
		}
		}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public ArrayList<ChangeCustomerConfirmDTO> getCustomerList() {
		return this.customerList;
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
