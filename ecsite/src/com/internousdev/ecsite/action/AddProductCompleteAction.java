package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.AddProductCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductCompleteAction extends ActionSupport implements SessionAware {
	private String additemName;
	private String additemPrice;
	private String additemStock;
	public Map<String,Object> session;
	private AddProductCompleteDAO addProductCompleteDAO=new AddProductCompleteDAO();

	public String execute()throws SQLException{
		addProductCompleteDAO.createProduct(session.get("additemName").toString(),
				session.get("additemPrice").toString(),
				session.get("additemStock").toString());
				String result=SUCCESS;
				return result;
	}

	public String getAdditemName() {
		return additemName;
	}
	public void setAdditemName(String additemName) {
	this.additemName = additemName;
	}
	public String getAdditemPrice() {
		return additemPrice;
	}
	public void setAdditemPrice(String additemPrice) {
		this.additemPrice = additemPrice;
	}
	public String getadditemStock() {
		return additemStock;
	}
	public void setAdditemStock(String additemStock) {
		this.additemStock = additemStock;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
