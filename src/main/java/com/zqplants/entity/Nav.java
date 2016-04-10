/**
* 文件名：Nav.java
*
* 版本信息：
* 日期：2016-1-13
*
*/
package com.zqplants.entity;

import com.zqplants.entity.base.EntityBase;

/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-13 下午5:07:14
 */
public class Nav extends EntityBase{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
     * 创建一个新的实例 Nav.
     *
     */
    public Nav() {
    }
    
    private String title;
    private String filename;
    private String url;
    private String description;
    private int ordernum;
 
    private int site_id;
    private int n_state;
    
    public int getN_state() {
		return n_state;
	}
	public void setN_state(int n_state) {
		this.n_state = n_state;
	}
	public int getSite_id() {
		return site_id;
	}
	public void setSite_id(int site_id) {
		this.site_id = site_id;
	}
	public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getFilename() {
        return filename;
    }
    public void setFilename(String filename) {
        this.filename = filename;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getOrdernum() {
        return ordernum;
    }
    public void setOrdernum(int ordernum) {
        this.ordernum = ordernum;
    }
    

}
