package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ChangeProductConfirmDAO;
import com.internousdev.ecsite.dto.ChangeProductConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeProductConfirmAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	private ChangeProductConfirmDAO changeProductConfirmDAO=new ChangeProductConfirmDAO();
	private ArrayList<ChangeProductConfirmDTO>productList=new ArrayList<ChangeProductConfirmDTO>();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {
		if (!session.containsKey("id")) {
			return ERROR;
		}
		if(deleteFlg == null) {
			String id = session.get("id").toString();
			String itemname = session.get("item_name").toString();
			String itemprice = session.get("item_price").toString();
			String itemstock = session.get("item_stock").toString();
			productList = changeProductConfirmDAO.getProductInfo();
		} else if(deleteFlg.equals("1")) {
			delete();
		}
		String result = SUCCESS;
			return result;
		}
	public void delete() throws SQLException {
		String id = session.get("id").toString();
		String itemname = session.get("item_name").toString();
		String itemprice = session.get("item_price").toString();
		String itemstock = session.get("item_stock").toString();

		int res = changeProductConfirmDAO.ProductDelete(id, itemname, itemprice, itemstock);
	if(res > 0) {
		productList = null;
		setMessage("商品情報を正しく削除しました。");
		} else if(res == 0) {
		setMessage("商品情報の削除に失敗しました");
		}
		}
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public ArrayList<ChangeProductConfirmDTO> getProductList() {
		return this.productList;
	}
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
