package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.ChangeProductConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeProductInfoAction extends ActionSupport implements SessionAware{
	private List<ChangeProductConfirmDTO> changeProductConfirmDtoList = new ArrayList<ChangeProductConfirmDTO>();
	private String id;
	private Map<String, Object> session;
	public String execute() {
		String result = ERROR;

		ChangeProductConfirmDTO changeProductConfirmDTO = new ChangeProductConfirmDTO();
		session.put("itemName", changeProductConfirmDTO.getItemName());
		session.put("itemPrice", changeProductConfirmDTO.getItemPrice());
		session.put("itemStock", changeProductConfirmDTO.getItemStock());

		List<Integer> productCountList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		session.put("productCountList", productCountList);

		Iterator<ChangeProductConfirmDTO> iterator = changeProductConfirmDtoList.iterator();
		if(!(iterator.hasNext())) {
			productCountList = null;
		}
		if(!changeProductConfirmDtoList.isEmpty() || productCountList==null) {
			session.put("changeProductConfirmDtoList", changeProductConfirmDtoList);
			result = SUCCESS;
		}
		return result;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<ChangeProductConfirmDTO> getChangeProductConfirmDtoList() {
		return changeProductConfirmDtoList;
	}
	public void setChangeProductConfirmDtoList(List<ChangeProductConfirmDTO> changeProductConfirmDtoList) {
		this.changeProductConfirmDtoList = changeProductConfirmDtoList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

