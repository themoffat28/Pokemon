package poke.model;

public class Ponyta extends Pokemon implements Fire
{
	public Ponyta()
	{
		super("Ponyta", 077);
	}
	
	public Ponyta(String name)
	{
		super(name, 77);
	}
	
	public int fireBlast()
	{
		return 60;
	}
	
	public int magmaStorm()
	{
		return getAttackPoints() * 90;
	}
}
