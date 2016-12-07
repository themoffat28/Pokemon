package pokemon.view;

import java.awt.Color;
import javax.swing.*;
import java.awt.Dimension;
import pokemon.controller.PokemonController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokemonPanel extends JPanel
{
	private PokemonController baseController;
	private ImageIcon pokemonIcon;
	private SpringLayout baseLayout;
	private JButton updateButton;
	private JComboBox pokedexSelector;
	private JLabel healthLabel;
	private JLabel combatLabel;
	private JLabel speedLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel pokemonLabel;
	private JLabel advancedLabel;
	private JTextField healthField;
	private JTextField combatField;
	private JTextField speedField;
	private JTextField nameField;
	private JTextField numberField;
	private JTextArea advancedArea;
	
	public PokemonPanel(PokemonController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/Pokeball.png"));
		this.updateButton = new JButton("Update Stats");
		
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		this.nameField = new JTextField(5);
		this.combatField = new JTextField(5);
		this.healthField = new JTextField(5);
		this.speedField = new JTextField(5);
		this.numberField = new JTextField(5);
		this.advancedArea = new JTextArea(10,25);
		this.pokedexSelector = new JComboBox(new String [] {"GeoDude", "GoGoat", "Rotom", "Staryu", "Ponyta"});
		this.advancedLabel = new JLabel ("Advanced Information: ");
		this.combatLabel = new JLabel ("Combat Points: ");
		this.healthLabel = new JLabel ("Health Points: ");
		this.speedLabel = new JLabel ("Speed Rate: ");
		this.numberLabel = new JLabel ("Pokemon Number: ");
		this.nameLabel = new JLabel ("Pokemon Name: ");
		this.pokemonLabel = new JLabel ("The current Pokemon: ", pokemonIcon, SwingConstants.CENTER);
		
	    setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPrefferedSize(new Dimension(900,600));
		this.setBackground(Color.RED);
		
		numberField.setEditable(false);
		advancedArea.setEditable(false);
		advancedArea.setWrapStyleWord(true);
		advancedArea.setLineWrap(true);
		
		pokemonLabel.setVerticalTextPosition(JLabel.BOTTOM);
		pokemonLabel.setHorizontalAlignment(JLabel.CENTER);
		
		this.add(pokedexSelector);
		this.add(updateButton);
		this.add(nameField);
		this.add(healthLabel);
		this.add(combatLabel);
		this.add(speedLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(pokemonLabel);
		this.add(advancedLabel);
		this.add(healthField);
		this.add(combatField);
		this.add(speedField);
		this.add(numberField);
		this.add(advancedArea);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, speedField, 42, SpringLayout.SOUTH, combatField);
		
		baseLayout.putConstraint(SpringLayout.NORTH, pokedexSelector, 21, SpringLayout.NORTH, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, speedLabel, 298, SpringLayout.NORTH, this);
		
		baseLayout.putConstraint(SpringLayout.SOUTH, pokedexSelector, -179, SpringLayout.NORTH, pokemonLabel);
		baseLayout.putConstraint(SpringLayout.WEST, pokemonLabel, 48, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, pokemonLabel, -34, SpringLayout.SOUTH, this);
		
		baseLayout.putConstraint(SpringLayout.SOUTH, updateButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, updateButton, -106, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.WEST, combatField, 627, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, combatField, -127, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.EAST, healthField, -127, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, healthField);
		
		baseLayout.putConstraint(SpringLayout.WEST, speedField, 629, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, speedField, -127, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.EAST, numberField, -127, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, nameField, 413, SpringLayout.EAST, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameField, 0, SpringLayout.SOUTH, pokedexSelector);
		baseLayout.putConstraint(SpringLayout.WEST, pokedexSelector, 21, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, pokedexSelector, 216, SpringLayout.WEST, this);
		
		baseLayout.putConstraint(SpringLayout.SOUTH, advancedLabel, -217, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, advancedLabel, -163, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, advancedArea, 6, SpringLayout.SOUTH, advancedLabel);
		baseLayout.putConstraint(SpringLayout.WEST, advancedArea, 0, SpringLayout.WEST, advancedLabel);
		
		baseLayout.putConstraint(SpringLayout.EAST, combatLabel, -4, SpringLayout.WEST, combatField);
		baseLayout.putConstraint(SpringLayout.NORTH, combatField, -6, SpringLayout.NORTH, combatLabel);
		
		baseLayout.putConstraint(SpringLayout.NORTH, healthField, -6, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.WEST, healthField, 6, SpringLayout.EAST, healthLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, healthLabel, -48, SpringLayout.NORTH, combatLabel);
		baseLayout.putConstraint(SpringLayout.EAST, healthLabel, 0, SpringLayout.EAST, combatLabel);
		
		baseLayout.putConstraint(SpringLayout.EAST, speedLabel, -6, SpringLayout.WEST, speedField);
		baseLayout.putConstraint(SpringLayout.SOUTH, combatLabel, -46, SpringLayout.NORTH, speedLabel);
		
		baseLayout.putConstraint(SpringLayout.NORTH, numberField, -6, SpringLayout.NORTH, numberLabel);
		baseLayout.putConstraint(SpringLayout.WEST, numberField, 6, SpringLayout.EAST, numberLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, numberLabel, -36, SpringLayout.NORTH, healthLabel);
		baseLayout.putConstraint(SpringLayout.EAST, numberLabel, 0, SpringLayout.EAST, healthLabel);
		
		baseLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, combatLabel);
		baseLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 0, SpringLayout.SOUTH, pokedexSelector);
	}
}
