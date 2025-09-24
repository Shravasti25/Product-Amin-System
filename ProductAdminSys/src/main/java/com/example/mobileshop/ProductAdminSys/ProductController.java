package com.example.mobileshop.ProductAdminSys;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.mobileshop.ProductAdminSys.Entities.Product;
import com.example.mobileshop.ProductAdminSys.Services.MobileServ;



@Controller
public class ProductController {
  @Autowired
	private MobileServ mobserv;
	
	@GetMapping("/product")
	public String allProducts(Model m) {
		List<Product> list=mobserv.getAllproduct();
		m.addAttribute("list", list);
      return "product-List.jsp";
	}

	
	    // Show the add product form (GET)
	    @GetMapping("/add")
	    public String showAddForm(Model model) {
	        model.addAttribute("product", new Product());
	        return "Newproduct.html"; 
	    }
	    // Handle form submission (POST)
	    @PostMapping("/add")
	    public String addProduct(@ModelAttribute Product product) {
	        // Save the product to DB
	        mobserv.Add(product);
	        return "redirect:/product";
	    }
	    
	    @GetMapping("/delete")
	    public String deletebyid(){
	        
	        return "delid.html"; 
	    }
	    
	    @PostMapping("/delete")
		public String deleteById(@RequestParam int proid, Model model) {
		     mobserv.Delete(proid);
		    
		    return "redirect:/product";
		}
	}

