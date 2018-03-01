/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jelani
 */
public class Player {
    private String name;
    
    /**
     * Constructor to initialise the variable(s).
     * @param theName - The name the player sets.
     */
    public Player(String theName) 
    {
        name = theName;
    } //Player
    
    /**
     * This method is the accessor for the Name.
     * @return name
     */
    public String getName() 
    {
        return name;
    } //getName
    
    /**
     * Mutator to set the private variable of name.
     * @param theName: Name of the player wants to use.
     */
    public void setName(String theName) 
    {
        name = theName;
    } //setName
    
}//Player
