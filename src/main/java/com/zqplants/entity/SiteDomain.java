package com.zqplants.entity;

import com.zqplants.entity.base.EntityBase;

public class SiteDomain extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int site_id;
	private String d_domain;
	
	public int getSite_id() {
		return site_id;
	}
	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}
	public String getD_domain() {
		return d_domain;
	}
	public void setD_domain(String d_domain) {
		this.d_domain = d_domain;
	}

}
