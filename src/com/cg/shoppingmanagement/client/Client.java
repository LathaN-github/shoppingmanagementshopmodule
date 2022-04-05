package com.cg.shoppingmanagement.client;

import com.cg.shoppingmanagement.Service.IShopService;
import com.cg.shoppingmanagement.Service.ShopServiceImpl;
import com.cg.shoppingmanagement.entities.Shop;

public class Client {

	public static void main(String[] args)
	{
		//CRUD operation calling activity
		Shop shop = new Shop();
		IShopService service = new ShopServiceImpl();
		
		//CRUD
		
		/*shop.setShopId(4);
		shop.setShopCategory("Mall");
		shop.setShopEmployeeID(41);
		shop.setShopName("LN shopping center");
		shop.setCustomers("jaya");
		shop.setShopStatus("24 hr Open");
		shop.setShopOwner("Nagarajmanjula");
		shop.setLeaseStatus("paid");
		service.addShop(shop);*/
		
		//Retrieve operation
		/*shop = service.searchShopById(1);
		System.out.println("ShopId is:"+shop.getShopId());
		System.out.println("ShopCategory is:"+shop.getShopCategory());
		System.out.println("ShopEmployeeID is:"+shop.getShopEmployeeID());*/
		
		//update operation
		/*shop = service.searchShopById(2);
		shop.setShopOwner("Lakshmi");
		service.updateShop(shop);
		System.out.println("update is succeessfull");*/
		
		
		//Delete operation
		/*shop = service.searchShopById(1);
		service.deleteShop(shop);
		System.out.println("Deleted successfull");*/
		
		
		
		
		
		

	}

}
