package com.abhi.netflix.microservices.currencyconversion.netflixclientcurrencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.abhi.netflix.microservices.currencyconversion.netflixclientcurrencyconversionservice")
@EnableDiscoveryClient
public class NetflixClientCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixClientCurrencyConversionServiceApplication.class, args);
	}

}
