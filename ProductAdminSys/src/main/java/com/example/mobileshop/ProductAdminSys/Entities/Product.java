package com.example.mobileshop.ProductAdminSys.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
@Id
private int prodid;
private String model_name;
private String brand;
private int price;
private int stock_quantity;
private String features;
private int warranty_period;
public int getProdid() {
	return prodid;
}
public void setProdid(int prodid) {
	this.prodid = prodid;
}
public String getModel_name() {
	return model_name;
}
public void setModel_name(String model_name) {
	this.model_name = model_name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getStock_quantity() {
	return stock_quantity;
}
public void setStock_quantity(int stock_quantity) {
	this.stock_quantity = stock_quantity;
}
public String getFeatures() {
	return features;
}
public void setFeatures(String features) {
	this.features = features;
}
public int getWarranty_period() {
	return warranty_period;
}
public void setWarranty_period(int warranty_period) {
	this.warranty_period = warranty_period;
}


}
