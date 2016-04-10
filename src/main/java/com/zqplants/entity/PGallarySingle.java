package com.zqplants.entity;

import com.zqplants.entity.base.EntityBase;

public class PGallarySingle extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int pgc_id;
	private String pgs_image_url;
	private String pgs_title;
	private String pgs_subtitle;
	private int pgs_order;
	private int pgs_state;
	private String pgs_subheading;
	
	public String getPgs_subheading() {
		return pgs_subheading;
	}
	public void setPgs_subheading(String pgs_subheading) {
		this.pgs_subheading = pgs_subheading;
	}
	public void setPgs_order(int pgs_order) {
		this.pgs_order = pgs_order;
	}
	public void setPgs_state(int pgs_state) {
		this.pgs_state = pgs_state;
	}
	public int getPgc_id() {
		return pgc_id;
	}
	public void setPgc_id(int pgc_id) {
		this.pgc_id = pgc_id;
	}
	public String getPgs_image_url() {
		return pgs_image_url;
	}
	public void setPgs_image_url(String pgs_image_url) {
		this.pgs_image_url = pgs_image_url;
	}
	public String getPgs_title() {
		return pgs_title;
	}
	public void setPgs_title(String pgs_title) {
		this.pgs_title = pgs_title;
	}
	public String getPgs_subtitle() {
		return pgs_subtitle;
	}
	public void setPgs_subtitle(String pgs_subtitle) {
		this.pgs_subtitle = pgs_subtitle;
	}
	public int getPgs_order() {
		return pgs_order;
	}
	public int getPgs_state() {
		return pgs_state;
	}

}
