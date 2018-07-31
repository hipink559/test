package com.internousdev.kagiya.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kagiya.dao.MCategoryDAO;
import com.internousdev.kagiya.dto.MCategoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoLoginAction extends ActionSupport implements SessionAware {

		private String categoryId;

		private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();

	private Map<String, Object> session;

	public String execute() {
		if(!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}
		session.remove("loginIdErrorMessageList");
		session.remove("passwordErrorMessageList");
		session.remove("passwordCheckMessage");

		//管理者として買い物できないようにする
		if(session.containsKey("status")) {
			return LOGIN;
		}

		if (session.containsKey("logined")) {
			if (session.get("logined").hashCode() == 1) {
				return ERROR;
			}
		}

		return SUCCESS;
	}

		public String getCategoryId() {
			return categoryId;
		}
		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public List<MCategoryDTO> getmCategoryDtoList() {
			return mCategoryDtoList;
		}
		public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
			this.mCategoryDtoList = mCategoryDtoList;
		}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}