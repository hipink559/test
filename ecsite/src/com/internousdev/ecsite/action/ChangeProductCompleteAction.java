package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ChangeProductCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeProductCompleteAction extends ActionSupport implements SessionAware {
	private String changeitemName;
	private String changeitemPrice;
	private String changeitemStock;
	public Map<String,Object> session;
	private ChangeProductCompleteDAO changeProductCompleteDAO=new ChangeProductCompleteDAO();

	public String execute()throws SQLException{
		changeProductCompleteDAO.changeProduct(session.get("changeitemName").toString(),
				session.get("changeitemPrice").toString(),
				session.get("changeitemStock").toString());
				String result=SUCCESS;
				return result;
	}

	public String getChangeitemName() {
		return changeitemName;
	}
	public void setChangeitemName(String changeitemName) {
	this.changeitemName = changeitemName;
	}
	public String getChangeitemPrice() {
		return changeitemPrice;
	}
	public void setChangeitemPrice(String changeitemPrice) {
		this.changeitemPrice = changeitemPrice;
	}
	public String getChangeitemStock() {
		return changeitemStock;
	}
	public void setChangeitemStock(String changeitemStock) {
		this.changeitemStock = changeitemStock;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
