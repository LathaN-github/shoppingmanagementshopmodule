package com.cg.shoppingmanagement.Service;

import com.cg.shoppingmanagement.entities.Shop;
import com.cg.shoppingmanagement.repository.IShopRepository;
import com.cg.shoppingmanagement.repository.ShopRepositoryImpl;

public class ShopServiceImpl implements IShopService 
{
	//Step1: Establishing connection between service and repository
	private IShopRepository dao;
	
	public ShopServiceImpl()
	{
		dao = new ShopRepositoryImpl();
	}
	
	//Step2:service calls to perform CRUD operation

	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		dao.beginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = dao.searchShopById(id);
		return shop;
	}

	@Override
	public boolean addEmployee(Shop shop) {
		dao.beginTransaction();
		dao.addEmployee(shop);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean updateEmployee(Shop shop) {
		dao.beginTransaction();
		dao.updateEmployee(shop);
		dao.commitTransaction();
		return false;
	}

	@Override
	public Shop deleteShop(Shop shop) {
		dao.beginTransaction();
		dao.deleteShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop addItem(Shop shop)
	{
		dao.beginTransaction();
		dao.addItem(shop);
		dao.commitTransaction();
		return shop;
	}
}
	

	
	