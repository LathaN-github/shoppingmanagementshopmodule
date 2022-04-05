package com.cg.shoppingmanagement.Service;

import com.cg.shoppingmanagement.entities.Shop;

public interface IShopService {
	public Shop addShop(Shop shop);
	public Shop updateShop(Shop shop);
	public Shop searchShopById(int id);
	public boolean addEmployee(Shop shop);
	public boolean updateEmployee(Shop shop);
	public Shop deleteShop(Shop shop);
	public Shop addItem (Shop shop);
	
	

}
