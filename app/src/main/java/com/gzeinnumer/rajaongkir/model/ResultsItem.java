package com.gzeinnumer.rajaongkir.model;

import com.google.gson.annotations.SerializedName;

//todo 8
public class ResultsItem{

	//todo 11 pakai class ini sebagai model untuk list pada todo12
	@SerializedName("city_name")
	private String cityName;

	@SerializedName("province")
	private String province;

	@SerializedName("province_id")
	private String provinceId;

	@SerializedName("type")
	private String type;

	@SerializedName("postal_code")
	private String postalCode;

	@SerializedName("city_id")
	private String cityId;

	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	public String getCityName(){
		return cityName;
	}

	public void setProvince(String province){
		this.province = province;
	}

	public String getProvince(){
		return province;
	}

	public void setProvinceId(String provinceId){
		this.provinceId = provinceId;
	}

	public String getProvinceId(){
		return provinceId;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setPostalCode(String postalCode){
		this.postalCode = postalCode;
	}

	public String getPostalCode(){
		return postalCode;
	}

	public void setCityId(String cityId){
		this.cityId = cityId;
	}

	public String getCityId(){
		return cityId;
	}
}