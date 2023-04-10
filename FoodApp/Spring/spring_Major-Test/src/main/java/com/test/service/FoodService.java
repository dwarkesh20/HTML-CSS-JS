package com.test.service;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.Food;
import com.test.repo.FoodRepository;

@Service
public class FoodService {
	@Autowired
	FoodRepository repo;
	
	public List<Food> getAllFoods(){		
		
		return repo.findAll();
		
	}

	public List<Food> findByFoodName(String name) {
		// TODO Auto-generated method stub
		return repo.findByFoodName(name);
	}
	
	public void setFood(@RequestParam String foodName, String foodCategory, String hotelName,
			String description, double price, MultipartFile imgfile) throws Exception {

		String imageStr = Base64.getEncoder().encodeToString(imgfile.getBytes());
		
		Food food = new Food(foodName, foodCategory, hotelName, description, price, imageStr);

		repo.save(food);
		
		
	}
}
