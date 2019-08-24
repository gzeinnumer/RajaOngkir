package com.gzeinnumer.rajaongkir.model;

import com.google.gson.annotations.SerializedName;
//todo 6
public class Query{

	@SerializedName("key")
	private String key;

	public void setKey(String key){
		this.key = key;
	}

	public String getKey(){
		return key;
	}
}