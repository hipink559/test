package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import java.sql.SQLException;
import java.util.Map;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	public String execute() throws SQLException {
	BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

		buyItemCompleteDAO.buyItemeinfo(
			session.get("id").toString(),
			session.get("login_user_id").toString(),
			session.get("buyItem_price").toString(),
			session.get("stock").toString(),
			session.get("pay").toString()
			);
	String result = SUCCESS;
		return result;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
