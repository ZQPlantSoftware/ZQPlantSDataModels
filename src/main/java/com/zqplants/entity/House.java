/**
* 文件名：House.java
*
* 版本信息：
* 日期：2016-1-22
*
*/
package com.zqplants.entity;

import java.util.ArrayList;
import java.util.List;

import com.zqplants.entity.base.EntityBase;

/**
 * 
 * @author: GeorgeZou
 * @date: 2016-1-22 上午10:05:36
 */
public class House extends EntityBase{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3252722249288123349L;


	/**
     * 创建一个新的实例 House.
     *
     */
    public House() {
	
    }

    private String title;
    private String description;
    private String images;
    private String handImage;
    private List<String> imageUrls;
    private String h_bedNum;
    private int h_bathsNum;
    private String h_BuildUpArea;
    private String h_plotArea;
    private int h_ageOfProperty;
    private int h_money;
    private int h_money_cny;
    private HouseCategory category;
    
    private String h_address;
    private String h_city;
    
    private String h_rent;		// 月租金
    private String h_gross_rental_yield;	// 收益率
    
    /**
     * 1.公寓
     * 2.办公室
     * 3.商铺
     * 3.别墅
     */
    private String h_type;
    
    /**
     * 1.正常
     * 2.推荐
     * 3.注销 不显示
     */
    
    private int state;
	private int orderNum;
    
	
    public int getH_money_cny() {
		return h_money_cny;
	}
	public void setH_money_cny(int h_money_cny) {
		this.h_money_cny = h_money_cny;
	}
	public HouseCategory getCategory() {
		return category;
	}
	public void setCategory(HouseCategory category) {
		this.category = category;
	}
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
    public String getImages() {
        return images;
    }
    public void setImages(String images) {
        this.images = images;
        if(images != null) {
            List<String> imageUrls = new ArrayList<String>();
            imageUrls.toArray(images.split(";"));
            this.setImageUrls(imageUrls);
        }
    }
    public List<String> getImageUrls() {
        return imageUrls;
    }
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public int getH_bathsNum() {
        return h_bathsNum;
    }
    public void setH_bathsNum(int h_bathsNum) {
        this.h_bathsNum = h_bathsNum;
    }
   
    public int getH_ageOfProperty() {
        return h_ageOfProperty;
    }
    public void setH_ageOfProperty(int h_ageOfProperty) {
        this.h_ageOfProperty = h_ageOfProperty;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public int getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
    public String getH_address() {
        return h_address;
    }
    public void setH_address(String h_address) {
        this.h_address = h_address;
    }
    public String getH_city() {
        return h_city;
    }
    public void setH_city(String h_city) {
        this.h_city = h_city;
    }
    public String getHandImage() {
        return handImage;
    }
    public void setHandImage(String handImage) {
        this.handImage = handImage;
    }
    public int getH_money() {
        return h_money;
    }
    public void setH_money(int h_money) {
        this.h_money = h_money;
    }
    public String getH_bedNum() {
        return h_bedNum;
    }
    public void setH_bedNum(String h_bedNum) {
        this.h_bedNum = h_bedNum;
    }
    public String getH_plotArea() {
        return h_plotArea;
    }
    public void setH_plotArea(String h_plotArea) {
        this.h_plotArea = h_plotArea;
    }
    public String getH_BuildUpArea() {
        return h_BuildUpArea;
    }
    public void setH_BuildUpArea(String h_BuildUpArea) {
        this.h_BuildUpArea = h_BuildUpArea;
    }
    public String getH_type() {
        return h_type;
    }
    public void setH_type(String h_type) {
        this.h_type = h_type;
    }
	public String getH_rent() {
		return h_rent;
	}
	public void setH_rent(String h_rent) {
		this.h_rent = h_rent;
	}
	public String getH_gross_rental_yield() {
		return h_gross_rental_yield;
	}
	public void setH_gross_rental_yield(String h_gross_rental_yield) {
		this.h_gross_rental_yield = h_gross_rental_yield;
	}

    
}
