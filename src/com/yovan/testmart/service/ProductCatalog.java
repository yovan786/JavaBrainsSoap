package com.yovan.testmart.service;

import java.util.List;

import javax.jws.WebService;

import com.yovan.testmart.business.ProductServiceImpl;
import com.yovan.testmart.model.Product;

@WebService(endpointInterface = "com.yovan.testmart.service.ProductCatalogInterface", portName = "TestMartCatalogPortName", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	private ProductServiceImpl productService = new ProductServiceImpl();

	/**
	 * @see com.yovan.testmart.service.ProductCatalogInterface#getProductCategories()
	 */
	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}

	/**
	 * @see com.yovan.testmart.service.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	/**
	 * @see com.yovan.testmart.service.ProductCatalogInterface#addProduct(java.lang.String,
	 *      java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	/**
	 * @see com.yovan.testmart.service.ProductCatalogInterface#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
}
