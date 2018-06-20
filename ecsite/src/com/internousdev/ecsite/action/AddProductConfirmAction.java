package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddProductConfirmAction extends ActionSupport implements SessionAware {
	private String additemName;
	private String additemPrice;
	private String additemStock;
	public Map<String,Object> session;
	private String errorMessage;

	public String execute(){
		String result =SUCCESS;

		if(!(additemName.equals(""))
				&& !(additemPrice.equals(""))
				&& !(additemStock.equals(""))){
					session.put("additemName",additemName);
					session.put("additemPrice",additemPrice);
					session.put("additemStock",additemStock);
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}
			return result;
	}
	public String getAdditemName(){
		return additemName;
	}
	public void setAdditemName(String additemName){
		this.additemName=additemName;
	}
	public String getAdditemPrice() {
		return additemPrice;
	}
	public void setAdditemPrice(String additemPrice) {
		this.additemPrice = additemPrice;
	}
	public String getAdditemStock() {
		return additemStock;
	}
	public void setAdditemStock(String additemStock) {
		this.additemStock = additemStock;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMassage) {
		this.errorMessage = errorMassage;
	}
}
