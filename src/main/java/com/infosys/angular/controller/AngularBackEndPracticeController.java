package com.infosys.angular.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.angular.models.PokemonGOModel;

@RestController
@CrossOrigin
public class AngularBackEndPracticeController 
{
	@GetMapping(value="/get")
	public String basicGet()
	{
		return "We hit the GET backend point";
	}
	
	@PostMapping(value="/post")
	public String basicPost()
	{
		return "We hit POST on the backend";
	}
	
	@PutMapping(value="/put")
	public String basicPut()
	{
		return "We hit PUT via the put method";
	}
	
	@DeleteMapping(value="/delete")
	public String basicDelete()
	{
		return "We hit the backend via the delete request";
	}
	
	
	
	@GetMapping(value="/create/{type}")
	public PokemonGOModel createPokemon(@PathVariable String type)
	{
		return new PokemonGOModel("Frokie",2,type);
	}
	
	@PostMapping(value="/return")
	public PokemonGOModel returnPokemon(@RequestBody PokemonGOModel p) throws Exception
	{
		p.setStarRank(0);
		//throw new Exception("Blorp");
		return p;
	}
	
	@GetMapping(value="/array")
	public PokemonGOModel [] returnSetOfPokemon()
	{
		PokemonGOModel[] set= new PokemonGOModel[] {new PokemonGOModel("Gible",3,"Dragon-Ground"),new PokemonGOModel("Lapris",2,"Water"),new PokemonGOModel("Glameow",1,"Normal")};
		return set;
	}
}
