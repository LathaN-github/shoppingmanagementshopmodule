package com.cg.shoppingmanagement.repository;

import javax.persistence.EntityManager;

import com.cg.shoppingmanagement.entities.Shop;

public class ShopRepositoryImpl implements IShopRepository
{
	
	//step 1 : Start JPA LifeCycle
	
	private EntityManager entityManager;
	public ShopRepositoryImpl()
	{
		entityManager = JPAUtil.getEntityManager();
	}
	
	//create operation Repository/DAO
	
	@Override
	public Shop addShop(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}
	@Override
	public Shop updateShop(Shop shop) {
		entityManager.merge(shop);
		return shop;
	}
	@Override
	public Shop searchShopById(int id) {
		Shop shop = entityManager.find(Shop.class, id);
		return shop;
	}
	@Override
	public Shop deleteShop(Shop shop) {
		entityManager.remove(shop);
		return shop;
	}
	@Override
	public boolean addEmployee(Shop shop) {
		entityManager.persist(shop);
		return false;
	}
	@Override
	public Shop addItem(Shop shop) {
		entityManager.persist(shop);
		return shop;
	}
	@Override
	public boolean updateEmployee(Shop shop) {
		entityManager.merge(shop);
		return false;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
}
	
	
