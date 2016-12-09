package pokemon.model;

public class Ponyta extends Pokemon implements Fire
{
	public Ponyta()
	{
		super("Ponyta", 077);
	}
	
	public Ponyta(String name)
	{
		super(name, 077);
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
