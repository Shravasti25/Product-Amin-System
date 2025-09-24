package com.example.mobileshop.ProductAdminSys.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mobileshop.ProductAdminSys.Entities.Product;

public interface MobileRepo extends JpaRepository <Product,Integer>{
	

}
