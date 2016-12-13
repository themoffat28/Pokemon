package pokemon.controller;

import java.util.ArrayList;
import java.util.Map;
import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.HashMap;

public class PokemonController
{
	private PokemonFrame pokemonFrame;
	private ArrayList<Pokemon> pokedex;

	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		pokemonFrame = new PokemonFrame(this);
	}
	
	public void start()
	{
		
	}
	
	private void buildPokedex()
	{
		pokedex.add(new GeoDude("Geodude"));
		pokedex.add(new GoGoat("GoGoat"));
		pokedex.add(new Rotom("Rotom"));
		pokedex.add(new Staryu("Staryu"));
		pokedex.add(new Ponyta("Ponyta"));
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
		return pokemonNames;
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setHitPoints(health);
		current.setSpeed(speed);
	}
	
	public ArrayList<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public PokemonFrame getBaseFrame()
	{
		return pokemonFrame;
	}
}
	
