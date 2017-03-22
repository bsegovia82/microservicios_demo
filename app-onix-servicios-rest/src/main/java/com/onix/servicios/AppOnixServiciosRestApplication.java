package com.onix.servicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Ojo es importante los prefijos o dominios del paquete sobre el cual estamos trabajando??? tener en cuenta eso para la creacion de sus microservicios

@SpringBootApplication
public class AppOnixServiciosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppOnixServiciosRestApplication.class, args);
	}
}
