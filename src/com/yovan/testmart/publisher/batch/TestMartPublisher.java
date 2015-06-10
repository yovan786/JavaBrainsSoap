package com.yovan.testmart.publisher.batch;

import javax.xml.ws.Endpoint;

import com.yovan.testmart.service.ProductCatalog;

public class TestMartPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://Yovan:9999/productCatalog", new ProductCatalog());
	}
}
