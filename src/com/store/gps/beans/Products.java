/**
 * 
 */
package com.store.gps.beans;

import java.io.Serializable;
import java.util.List;

/**
 * @author kevin
 *
 */
public class Products implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productsId;
	private String productName;
	private String productGroup;
	private double productPrice;
	private long productLocationId;
	private List<String> storeIds;

	public long getProductsId() {
		return productsId;
	}

	public void setProductsId(long productsId) {
		this.productsId = productsId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(String productGroup) {
		this.productGroup = productGroup;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public long getProductLocationId() {
		return productLocationId;
	}

	public void setProductLocationId(long productLocationId) {
		this.productLocationId = productLocationId;
	}

	public List<String> getStoreIds() {
		return storeIds;
	}

	public void setStoreIds(List<String> storeIds) {
		this.storeIds = storeIds;
	}
}
