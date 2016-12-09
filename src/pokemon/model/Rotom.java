package pokemon.model;

public class Rotom extends Pokemon implements Electric
{
	public Rotom()
	{
		super("Rotom", 479);
	}
	
	public Rotom(String name)
	{
		super(name, 479);
	}
	
	public int thunder()
	{
		return 20;
	}
	
	public int boltStrike()
	{
		return getAttackPoints() * 100;
	}
}
