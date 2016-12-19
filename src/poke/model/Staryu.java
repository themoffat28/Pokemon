package poke.model;

public class Staryu extends Pokemon implements Water
{
	public Staryu()
	{
		super("Staryu", 120);
	}
	
	public Staryu(String name)
	{
		super(name, 120);
	}
	
	public int hydroCannon()
	{
		return 80;
	}
	
	public int waterSpout()
	{
		return getAttackPoints() * 120;
	}
}
