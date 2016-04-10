package com.zqplants.entity;

import com.zqplants.entity.base.EntityBase;

public class SiteConfig extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String s_name;
	private String s_title;
	private String s_subtitle;
	private String s_domain;
	private String[] s_photoUrl;
	private String[] s_photoTitle;
	private String[] s_photoSubTitle;
	private String s_logo_url;
	private String s_state;
	private int country_id;

	public String getS_state() {
		return s_state;
	}
	public void setS_state(String s_state) {
		this.s_state = s_state;
	}

	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_title() {
		return s_title;
	}
	public void setS_title(String s_title) {
		this.s_title = s_title;
	}
	public String getS_subtitle() {
		return s_subtitle;
	}
	public void setS_subtitle(String s_subtitle) {
		this.s_subtitle = s_subtitle;
	}
	public String getS_domain() {
		return s_domain;
	}
	public void setS_domain(String s_domain) {
		this.s_domain = s_domain;
	}
	public String[] getS_photoUrl() {
		return s_photoUrl;
	}
	public void setS_photoUrl(String s_photoUrl) {
		if(s_photoUrl != null){
			this.s_photoUrl = s_photoUrl.split("&&");
		}
	}
	public String[] getS_photoTitle() {
		return s_photoTitle;
	}
	public void setS_photoTitle(String s_photoTitle) {
		if(s_photoTitle != null){
			this.s_photoTitle = s_photoTitle.split("&&");
		}
	}
	public String[] getS_photoSubTitle() {
		return s_photoSubTitle;
	}
	public void setS_photoSubTitle(String s_photoSubTitle) {
		if(s_photoSubTitle != null){
			this.s_photoSubTitle = s_photoSubTitle.split("&&");
		}
	}
	public String getS_logo_url() {
		return s_logo_url;
	}
	public void setS_logo_url(String s_logo_url) {
		this.s_logo_url = s_logo_url;
	}
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	
	
}
