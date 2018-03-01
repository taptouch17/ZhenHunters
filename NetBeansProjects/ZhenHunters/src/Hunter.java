/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jelani
 */
public class Hunter extends GamePiece {
    private int energyLevel; //Stores Hunter's energy level.
    final private int MAXENERGY = 6; //Max energy of hunter
    private char hName; // First char of Hunter's name
    
    /**
     * Constructor to initialise the variables.
     */
    public Hunter() 
    {
        GamePiece theHunter = new GamePiece();
        theHunter.setType("hunter");
        theHunter.setSymbol('H');
        energyLevel = 0;
        hName = ' ';
    }//Hunter
    
    /**
     * Accessor of the energy level.
     * @return EnergyLevel
     */
    public int getEnergyLevel() 
    {
        return energyLevel;
    }//getEnergyLevel
    
    /**
     * Mutator to set the energy level.
     * @param energy the energy of the hunter.
     */
    public void setEnergyLevel(int energy) 
    {
        energyLevel = energy;
    }//setEnergyLevel
    
    /**
     * Accessor to get the maximum energy of the hunter.
     * @return MAXENERGY
     */
    public int getMaxEnergy() 
    {
        return MAXENERGY;
    }//getMaxEnergy
    
    /**
     * Accessor to get the Hunter's name.
     * @return hName
     */
    public char getHunterName() 
    {
        return hName;
    }//getHunterName
    
    /**
     * Mutator to set the name of the hunter.
     * @param name: The name the user would like to use.
     */
    public void setHunterName(char name) 
    {
        hName = name;
    }//setHunterName
}//Hunter
