package com.test.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.test.model.Food;



public interface FoodRepository extends MongoRepository<Food, String>{

	List<Food> findByFoodName(String foodName);
	List<Food> findByHotelName(String hotelName);
	List<Food> findByFoodCategory(String foodCategory);
}
