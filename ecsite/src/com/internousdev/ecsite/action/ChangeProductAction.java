package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ChangeProductDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeProductAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	public String execute() throws SQLException {
		ChangeProductDAO ChangeProductDAO = new ChangeProductDAO();

		ChangeProductDAO.buyIteminfo(
			session.get("id").toString(),
			session.get("buyItem_price").toString(),
			session.get("buyItem_stock").toString()
			);
	String result = SUCCESS;
		return result;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
