package com.gzeinnumer.rajaongkir.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

//todo 7
public class Rajaongkir{

	@SerializedName("query")
	private Query query;

	@SerializedName("results")
	private List<ResultsItem> results;

	@SerializedName("status")
	private Status status;

	public void setQuery(Query query){
		this.query = query;
	}

	public Query getQuery(){
		return query;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}
}