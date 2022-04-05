package com.cg.shoppingmanagement.repository;

import com.cg.shoppingmanagement.entities.Shop;

public interface IShopRepository {
	
	
	public Shop addShop(Shop shop);
	public Shop updateShop (Shop shop);
	public Shop searchShopById (int id);
	public Shop deleteShop (Shop shop);
	public boolean addEmployee (Shop shop);
	public Shop addItem (Shop shop);
	public boolean updateEmployee (Shop shop);
	
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	

}
