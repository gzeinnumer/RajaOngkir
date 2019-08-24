package com.gzeinnumer.rajaongkir.model;

import com.google.gson.annotations.SerializedName;

//todo 5
public class ResponseCity{

	@SerializedName("rajaongkir")
	private Rajaongkir rajaongkir;

	public void setRajaongkir(Rajaongkir rajaongkir){
		this.rajaongkir = rajaongkir;
	}

	public Rajaongkir getRajaongkir(){
		return rajaongkir;
	}
}