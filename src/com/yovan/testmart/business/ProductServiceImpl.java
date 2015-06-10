package com.yovan.testmart.business;

import java.util.ArrayList;
import java.util.List;

import com.yovan.testmart.model.Product;

public class ProductServiceImpl {

	private List<String> bookList = new ArrayList<>();
	private List<String> musicList = new ArrayList<>();
	private List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Inferno");
		bookList.add("Joyland");
		bookList.add("The Game of Thrones");

		musicList.add("Random Access Memories");
		musicList.add("Night Visions");
		musicList.add("Unorthodox Jukebox");

		movieList.add("Oz the Great and Powerful");
		movieList.add("Despicable Me");
		movieList.add("Star Trek Into Darkness");
	}

	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Movies");
		categories.add("Music");
		return categories;
	}


	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "movies":
			return movieList;
		case "music":
			return musicList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}

	public List<Product> getProductsv2(String category) {
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product("Book 1", "12347", 99.9));
		productsList.add(new Product("Book 2", "45895", 89.9));
		productsList.add(new Product("Book 3", "78945", 19.9));
		productsList.add(new Product("Book 4", "23569", 99.0));
		return productsList;
	}

}
