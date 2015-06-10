package com.yovan.testmart.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.yovan.testmart.util.InvalidInputException;

@WebService
@SOAPBinding(style = Style.RPC)
public class ShopInfo {

	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(
			@WebParam(partName = "lookupInput") String property) throws InvalidInputException {
		String response = null;
		switch (property) {
		case "shopName":
			response = "Test Mart";
			break;
		case "since":
			response = "since 2012";
			break;
		default:
			throw new InvalidInputException("Invalid Input", property + " is not a valid input");
		}
		return response;
	}
}
