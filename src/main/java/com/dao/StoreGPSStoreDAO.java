/**
 * 
 */
package main.java.com.dao;

import java.util.List;

import main.java.com.beans.Store;

/**
 * @author kevin
 *
 */
public interface StoreGPSStoreDAO {

	public List<Store> getAllStores();

	public Store getStoreById(long storeId);

}
