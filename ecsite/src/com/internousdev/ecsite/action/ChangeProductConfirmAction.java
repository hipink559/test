package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.ChangeProductConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeProductConfirmAction extends ActionSupport implements SessionAware{
	private List<ChangeProductConfirmDTO> ChangeProductDtoList = new ArrayList<ChangeProductConfirmDTO>();
	private String id;
	private String itemName;
	private String itemPrice;
	private String itemStock;

	private Map<String, Object> session;
	public String execute() {
		String result = SUCCESS;
		ChangeProductConfirmDTO changeProductConfirmDTO = new ChangeProductConfirmDTO();
		session.put("itemName", changeProductConfirmDTO.getItemName());
		session.put("itemPrice", changeProductConfirmDTO.getItemPrice());
		session.put("itemStock", changeProductConfirmDTO.getItemStock());


		List<Integer> productList = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		session.put("productList", productList);

		Iterator<ChangeProductConfirmDTO> iterator = ChangeProductDtoList.iterator();
		if(!(iterator.hasNext())) {
			productList = null;
		}
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
	public List<ChangeProductConfirmDTO> getChangeProductDtoList() {
		return ChangeProductDtoList;
	}
	public void setChangeProductDtoList(List<ChangeProductConfirmDTO> ChangeProductDtoList) {
		this.ChangeProductDtoList =ChangeProductDtoList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
