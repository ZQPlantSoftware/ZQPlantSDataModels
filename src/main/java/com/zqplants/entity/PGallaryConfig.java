package com.zqplants.entity;

import java.util.List;

import com.zqplants.entity.base.EntityBase;

public class PGallaryConfig extends EntityBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String pgc_title;
	private String pgc_description;
	
	private List<PGallarySingle> gallarys;

	public String getPgc_title() {
		return pgc_title;
	}

	public void setPgc_title(String pgc_title) {
		this.pgc_title = pgc_title;
	}

	public String getPgc_description() {
		return pgc_description;
	}

	public void setPgc_description(String pgc_description) {
		this.pgc_description = pgc_description;
	}

	public List<PGallarySingle> getGallarys() {
		return gallarys;
	}

	public void setGallarys(List<PGallarySingle> gallarys) {
		this.gallarys = gallarys;
	}
}
