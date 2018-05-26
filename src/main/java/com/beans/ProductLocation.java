/**
 * 
 */
package main.java.com.beans;

import java.io.Serializable;

/**
 * @author kevin
 *
 */
public class ProductLocation implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productLocationId;
	private int aisleNum;
	private String aisleGroup;
	private String aisleBayNum;

	public long getProductLocationId() {
		return productLocationId;
	}

	public void setProductLocationId(long productLocationId) {
		this.productLocationId = productLocationId;
	}

	public int getAisleNum() {
		return aisleNum;
	}

	public void setAisleNum(int aisleNum) {
		this.aisleNum = aisleNum;
	}

	public String getAisleGroup() {
		return aisleGroup;
	}

	public void setAisleGroup(String aisleGroup) {
		this.aisleGroup = aisleGroup;
	}

	public String getAisleBayNum() {
		return aisleBayNum;
	}

	public void setAisleBayNum(String aisleBayNum) {
		this.aisleBayNum = aisleBayNum;
	}

}
