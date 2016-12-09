package pokemon.model;

public abstract class Pokemon
{
	private int hitPoints;
	private int attackPoints;
	private int number;
	private double speed;
	private String name;
	
	public Pokemon(String name, int number)
	{
		this.name = name;
		this.number = number;
	}

	public int getHitPoints()
	{
		return hitPoints;
	}

	public void setHitPoints(int hitPoints)
	{
		this.hitPoints = hitPoints;
	}

	public int getAttackPoints()
	{
		return attackPoints;
	}

	public void setAttackPoints(int attackPoints)
	{
		this.attackPoints = attackPoints;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public double getSpeed()
	{
		return speed;
	}

	public void setSpeed(double speed)
	{
		this.speed = speed;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getPokemonTypes()
	{
		String pokemonTypes = "-----\nTYPES:\n";
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		for(int index = 0; index < types.length; index++);
		{
			String temp = types[index].getCanonicalName();
			pokeTypes[index] = temp;
		}
		
		for(String current: pokeTypes)
		{
			String temp = current.replace(this.getClass().getPackage().getName() + ".", "");
			pokemonTypes += temp += "\n";
		}
		
		return pokemonTypes;
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
	}
	
}
