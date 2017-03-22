package com.onix.servicios.rest;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onix.servicios.util.ServicioIp;

@RestController
public class ServicioRestDemo 
{

	private final ServicioIp lServicioIp;
	
	//Para poder probar este componente fuera del contexto spring
	@Autowired
	public ServicioRestDemo(ServicioIp pServicioIp ) {
		lServicioIp = pServicioIp;
	}
	
	@RequestMapping(value="/obtenerip")
	public String engregarDireccionIP()
	{
		try {
			return "Direccion IP : " + lServicioIp.obtenerDireccionIP();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			return "Imposible obtener la direccion IP";
		}
	}
	
}
