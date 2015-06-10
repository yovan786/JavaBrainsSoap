package com.yovan.testmart.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.yovan.testmart.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "https://www.testmart.com")
public interface ProductCatalogInterface {

	@WebMethod
	public abstract List<String> getProductCategories();

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	public abstract List<String> getProducts(String category);

	@WebMethod(exclude = false)
	public abstract boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name = "Product")
	public abstract List<Product> getProductsv2(String category);

}