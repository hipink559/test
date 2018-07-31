package com.internousdev.kagiya.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kagiya.dao.PurchaseHistoryInfoDAO;
import com.internousdev.kagiya.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {

		//管理者として買い物できないようにする
				if(session.containsKey("status")) {
					return LOGIN;
				}

		if(!session.containsKey("loginId")) {
			return ERROR;
		}

		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList = new ArrayList<PurchaseHistoryInfoDTO>();

		//メソッド呼び出し
		purchaseHistoryInfoDTOList = purchaseHistoryInfoDAO.getPurchaseHistoryInfo(session.get("loginId").toString());


		Iterator<PurchaseHistoryInfoDTO> iterator = purchaseHistoryInfoDTOList.iterator(); //次のif文の為iterator型に変換
		if (!(iterator.hasNext())) { //要素がなかった場合
			purchaseHistoryInfoDTOList = null;
		}
		session.put("purchaseHistoryInfoDTOList", purchaseHistoryInfoDTOList); //purchaseHistoryInfoDTOListをsessionに追加
		return SUCCESS; //SUCCESSを返す

	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
