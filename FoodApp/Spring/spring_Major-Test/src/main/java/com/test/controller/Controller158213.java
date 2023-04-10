package com.test.controller;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;
import com.test.model.Food;
import com.test.repo.FoodRepository;
import com.test.service.FoodService;

@RestController
@CrossOrigin("http://localhost:3000")
public class Controller158213 {
	@Autowired
	FoodService foodService;
	@Autowired
	FoodRepository repo;

	@GetMapping("")
	public List<Food> getFood() {

		return foodService.getAllFoods();

	}

	@PostMapping("/insertfood")
	public ModelAndView setFood(@RequestParam String foodName, String foodCategory, String hotelName,
			String description, double price, MultipartFile image) throws Exception {

		
		foodService.setFood(foodName, foodCategory, hotelName, description, price, image);

		return new ModelAndView("success");
	}

	@GetMapping("/registerfood")
	public ModelAndView getaddFood() {
		return new ModelAndView("registerfood");
	}

	@GetMapping("/viewallfoods")
	public List<Food> getallFood() {
		return repo.findAll();
	}

	@GetMapping("viewfoodbyname/{name}")
	public List<Food> getFood(@PathVariable String name) {

		return foodService.findByFoodName(name);
	}

	@GetMapping("/viewfoodbyid/{id}")
	public Optional<Food> getFoodByID(@PathVariable String id) {
		return repo.findById(id);
	}

	@GetMapping("/viewfoodbyhotelname/{hotel}")
	public List<Food> getFoodByHotelName(@PathVariable String hotel) {
		return repo.findByHotelName(hotel);
	}

	@GetMapping("/viewfoodbycategory/{foodCategory}")
	public List<Food> getFoodByCategory(@PathVariable String foodCategory) {
		return repo.findByFoodCategory(foodCategory);
	}

}
