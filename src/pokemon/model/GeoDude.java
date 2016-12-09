package pokemon.model;

public class GeoDude extends Pokemon implements Rock
{
	public GeoDude()
	{
		super("GeoDude", 074);
	}
	
	public GeoDude(String name)
	{
		super(name, 074);
	}
	
	public int stoneEdge()
	{
		return 30;
	}
	
	public int rockTomb()
	{
		return getAttackPoints() * 60;
	}
}
