package com.test.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Food {
	@Id
	private String id;
	private String foodName;
	private String foodCategory;
	private String hotelName;
	private String description;
	private double price;
	private String image;
	
	public Food(String id, String foodName, String foodCategory, String hotelName, String description, double price, String image) {
		super();
		this.id = id;
		this.foodName = foodName;
		this.foodCategory = foodCategory;
		this.hotelName = hotelName;
		this.description = description;
		this.price = price;
		this.image = image;
	}
	public Food(String foodName, String foodCategory, String hotelName, String description, double price, String image) {
		super();
		this.foodName = foodName;
		this.foodCategory = foodCategory;
		this.hotelName = hotelName;
		this.description = description;
		this.price = price;
		this.image = image;
	}
	public Food() {
		super();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodCategory() {
		return foodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Foodmenu [id=" + id + ", foodName=" + foodName + ", foodCategory=" + foodCategory + ", hotelName="
				+ hotelName + ", description=" + description + ", price=" + price + ", image=" + image + "]";
	}
	
	
}
