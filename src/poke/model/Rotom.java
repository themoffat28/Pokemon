package poke.model;

public class Rotom extends Pokemon implements Electric, Grass, Fire
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
	
	public int leafBlade()
	{
		return 30;
	}
	
	public int razorLeaf()
	{
		return getAttackPoints() * 70;
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
