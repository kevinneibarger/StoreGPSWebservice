/**
 * 
 */
package com.store.gps.beans;

import java.io.Serializable;

/**
 * @author kevin
 *
 */
public class Store implements Serializable {

	private static final long serialVersionUID = 1L;

	private int storeId;
	private String storeName;
	private String storeLocation;
	private String storeType;
	private String storeNum;
	private String storeHours;
	private String storePhone;

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(String storeLocation) {
		this.storeLocation = storeLocation;
	}

	public String getStoreType() {
		return storeType;
	}

	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}

	public String getStoreNum() {
		return storeNum;
	}

	public void setStoreNum(String storeNum) {
		this.storeNum = storeNum;
	}

	public String getStoreHours() {
		return storeHours;
	}

	public void setStoreHours(String storeHours) {
		this.storeHours = storeHours;
	}

	public String getStorePhone() {
		return storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

	public String toString() {

		return "Store ID: " + this.storeId + "\nStore Name: " + this.storeName + "\nStore Location: "
				+ this.storeLocation + "\nStore Type: " + this.storeType + "\nStore Number: " + this.storeNum
				+ "\nStore Hours; " + this.storeHours + "\nStore Phone: " + this.storePhone;
	}

}
