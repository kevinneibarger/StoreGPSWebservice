/**
 * 
 */
package main.java.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import main.java.com.beans.Store;
import main.java.com.dao.impl.StoreGPSStoreDAOImpl;

/**
 * @author kevin
 *
 */

@Service("storeGPSService")
public class StoreGPSStoreService {

	@Autowired
	StoreGPSStoreDAOImpl storeGPSDAOImpl;

	@Transactional
	public List<Store> getAllStores() {
		return storeGPSDAOImpl.getAllStores();
	}
}
