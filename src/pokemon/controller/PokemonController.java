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
		pokedex.add(new GeoDude("Hands with a face"));
		pokedex.add(new GoGoat("Leaf Dog"));
		pokedex.add(new Ponyta("Pony that stepped on a wire"));
		pokedex.add(new Rotom("Flying Candle"));
		pokedex.add(new Staryu("Metal Starfish"));
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
		current.setSpeed(speed);
		current.setHitPoints(health);
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
	
