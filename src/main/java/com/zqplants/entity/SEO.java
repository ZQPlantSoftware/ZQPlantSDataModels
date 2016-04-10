/**
* 文件名：SEO.java
*
* 版本信息：
* 日期：2016-1-11
*
*/
package com.zqplants.entity;

import com.zqplants.entity.base.EntityBase;

/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-11 下午2:04:50
 */
public class SEO extends EntityBase{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * 创建一个新的实例 SEO.
     *
     */
    public SEO() {}

    public SEO(String pageUrl,String keyword,String description,String title) {
	
	this.setDescription(description);
	this.setKeyword(keyword);
	this.setPageUrl(pageUrl);
	this.setTitle(title);
    }

    private String pageUrl;
    private String keyword;
    private String description;
    private String title;

    public String getPageUrl() {
        return pageUrl;
    }
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }
    public String getKeyword() {
        return keyword;
    }
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
