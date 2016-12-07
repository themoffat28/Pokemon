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
		pokedex.add(new Ponyta)
	}
}
	
