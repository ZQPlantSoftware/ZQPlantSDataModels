/**
* 文件名：Contents.java
*
* 版本信息：
* 日期：2016-1-29
*
*/
package com.zqplants.entity;

import java.sql.Date;

import com.zqplants.entity.base.EntityBase;

/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-29 下午6:48:38
 */
public class Contents extends EntityBase{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;
    private String description;
    private String contents;
    private String hand_img;
    private Date presend_date;
    private boolean status;
    private String link;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public String getHand_img() {
        return hand_img;
    }
    public void setHand_img(String hand_img) {
        this.hand_img = hand_img;
    }
    public Date getPresend_date() {
        return presend_date;
    }
    public void setPresend_date(Date presend_date) {
        this.presend_date = presend_date;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    
    
    

}
