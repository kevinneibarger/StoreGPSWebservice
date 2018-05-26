/**
 * 
 */
package main.java.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.beans.Store;
import main.java.com.service.StoreGPSStoreService;

/**
 * @author kevin
 *
 */

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class StoreGPSController {

	@Autowired
	StoreGPSStoreService storeGPSStoreService;

	@RequestMapping(value = "/getAllStores", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Store> getAllPeopleViewed() {
		return storeGPSStoreService.getAllStores();
	}

}
