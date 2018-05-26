/**
 * 
 */
package main.java.com.beans;

import java.io.Serializable;

/**
 * @author kevin
 *
 */
public class ProductImage implements Serializable {

	private static final long serialVersionUID = 1L;

	private long productImageId;
	private String productImage;
	private long productId;

	public long getProductImageId() {
		return productImageId;
	}

	public void setProductImageId(long productImageId) {
		this.productImageId = productImageId;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

}
