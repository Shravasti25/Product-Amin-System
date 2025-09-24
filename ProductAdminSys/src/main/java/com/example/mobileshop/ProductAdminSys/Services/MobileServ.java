package com.example.mobileshop.ProductAdminSys.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mobileshop.ProductAdminSys.Entities.Product;
import com.example.mobileshop.ProductAdminSys.Repository.MobileRepo;
@Service
public class MobileServ {
	@Autowired
	private MobileRepo mobrepo;
	
	public List<Product> getAllproduct(){
		return mobrepo.findAll();
	}

	public void Add(Product prdt) {
		mobrepo.save(prdt);
		
	}
	public void  Delete(int proid) {
		mobrepo.deleteById(proid);
	}
}
