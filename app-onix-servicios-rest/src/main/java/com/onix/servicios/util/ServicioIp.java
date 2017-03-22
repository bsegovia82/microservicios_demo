package com.onix.servicios.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

@Service
public class ServicioIp implements InterfazServicioIP
{

	@Override
	public String obtenerDireccionIP() throws UnknownHostException 
	{
		return InetAddress.getLocalHost().getHostAddress();
	}
	
}
