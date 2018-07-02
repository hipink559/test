package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ChangeProductCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeProductCompleteAction extends ActionSupport implements SessionAware {
	private String id;
	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String,Object> session;

	private ChangeProductCompleteDAO changeProductCompleteDAO=new ChangeProductCompleteDAO();

	public String execute()throws SQLException{
		changeProductCompleteDAO.updateProduct(
				session.get(itemName).toString(),
				session.get(itemPrice).toString(),
				session.get(itemStock).toString());
				String result=SUCCESS;
				return result;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
	    this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
	    this.itemName = itemName;
	}
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemStock() {
		return itemStock;
	}
	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
