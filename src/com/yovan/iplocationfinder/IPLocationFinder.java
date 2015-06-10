package com.yovan.iplocationfinder;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class IPLocationFinder {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("You must pass in one IP address");
		} else {
			String ipAddress = args[0];
			GeoIPService geoIPService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = geoIPService.getGeoIPServiceSoap();
			GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
			System.out.println("The country name for the IP " + ipAddress + ": " + geoIP.getCountryName());
		}
	}
}
