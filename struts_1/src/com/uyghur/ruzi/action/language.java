package com.uyghur.ruzi.action;

import com.opensymphony.xwork2.Action;

public class language implements Action {

	private String locale;


	public String getLocale() {
		return locale;
	}


	public void setLocale(String locale) {
		this.locale = locale;
	}


	public String execute() throws Exception {

		String lang = "";

		if (locale.equals("zh_CN")) {
			
			lang = "zh_CN";
			
			
		}
		
		if (locale.equals("ug_CN")) {
			
			lang = "ug_CN";
			
		}
		
		return lang;

	}

}
