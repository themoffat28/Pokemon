package pokemon.model;

public class GoGoat extends Pokemon implements Grass
{
	public GoGoat()
	{
		super("GoGoat", 673);
	}
	
	public GoGoat(String name)
	{
		super(name, 673);
	}
	
	public int leafBlade()
	{
		return 30;
	}
	
	public int razorLeaf()
	{
		return getAttackPoints() * 70;
	}
}
