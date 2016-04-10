package com.zqplants.entity;

import com.zqplants.entity.base.EntityBase;

public class HouseCategory extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hc_chineseName;
	private String hc_englishName;
	private String hc_icon_url;
	
	public String getHc_chineseName() {
		return hc_chineseName;
	}
	public void setHc_chineseName(String hc_chineseName) {
		this.hc_chineseName = hc_chineseName;
	}
	public String getHc_englishName() {
		return hc_englishName;
	}
	public void setHc_englishName(String hc_englishName) {
		this.hc_englishName = hc_englishName;
	}
	public String getHc_icon_url() {
		return hc_icon_url;
	}
	public void setHc_icon_url(String hc_icon_url) {
		this.hc_icon_url = hc_icon_url;
	}

}
