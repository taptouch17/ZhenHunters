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
    private int energyLevel;
    final private int MAXENERGY;
    private char hName;
    
    public Hunter() {
        GamePiece theHunter = new GamePiece();
        theHunter.setType("hunter");
        theHunter.setSymbol('H');
        MAXENERGY = 6;
        energyLevel = 0;
    }
    
    public int getEnergyLevel() {
        return energyLevel;
    }
    
    public void setEnergyLevel(int energy) {
        energyLevel = energy;
    }
    
    public int getMaxEnergy() {
        return MAXENERGY;
    }
    
    
    
    public char getHunterName() {
        return hName;
    }
    
    public void setHunterName(char name) {
        hName = name;
    }
}
