package com.internousdev.kagiya.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ResetPasswordAction extends ActionSupport implements SessionAware {

	private String loginId;

	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;

		//管理者ではできないようにする
		if(session.containsKey("status")) {
			return "admin";
		}

		if(session.containsKey("loginId")) {
			return result;
		}


		result = SUCCESS;
		return result;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
