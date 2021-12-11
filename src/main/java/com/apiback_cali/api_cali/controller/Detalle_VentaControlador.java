package com.apiback_cali.api_cali.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.apiback_cali.api_cali.API.Detalle_VentaAPI;
import com.apiback_cali.api_cali.model.Detalle_VentaModel;


@RestController
@RequestMapping("/detalle_ventas_cal")
public class Detalle_VentaControlador {

	@Autowired
	Detalle_VentaAPI userservice;
	
	@GetMapping ("/Listar")
	public List<Detalle_VentaModel> obtenerDetalle_Venta(){
		return userservice.listarDetalle_Venta();
	}
	
	@PostMapping ("/Guardar")
	public Detalle_VentaModel crearDetalle_Venta(@RequestBody Detalle_VentaModel detalle_venta) {
		return userservice.guardarDetalle_Venta(detalle_venta);
	}
	
	
}
