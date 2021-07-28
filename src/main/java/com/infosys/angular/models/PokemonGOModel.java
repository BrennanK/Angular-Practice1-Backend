package com.infosys.angular.models;

public class PokemonGOModel 
{
	private String name;
	private int starRank;
	private String type;
	
	public PokemonGOModel()
	{
		
	}
	
	public PokemonGOModel(String name,int starRank,String type)
	{
		this.name=name;
		this.starRank=starRank;
		this.type=type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStarRank() {
		return starRank;
	}

	public void setStarRank(int starRank) {
		this.starRank = starRank;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
