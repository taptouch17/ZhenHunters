/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jelani
 */
public class GamePiece {
    
  private String type; //String describing type of game piece.
  private char symbol; //Char describing game piece symbol.
  private int rowPos; // row position of piece.
  private int colPos;// column position of piece.
  

    /**
     * Constructor to initialise the fields of GamePiece.
     */
  public GamePiece() 
  {
      type = "?";
      symbol = '?';
      rowPos = 0;
      colPos = 0;
  }
  
   

    /**
     * Accessor to get Type
     * @return type
     */
  public String getType() 
  {
      return type;
  } //getType
  
   

    /**
     * Mutator for user to set the Type
     * @param theType The type of piece.
     */
  public void setType(String theType) 
  {
      type = theType;
  }//setType
  
 

    /**
     * Accessor to get Symbol
     * @return symbol
     */
 public char getSymbol() 
 {
     return symbol;
 }//getSymbol
 
 

    /**
     * Mutator for user to set the symbol
     * @param theSymbol the symbol used to describe the GamePiece
     */
 public void setSymbol(char theSymbol) 
 {
     symbol = theSymbol;
 }//setSymbol
 
 

    /**
     * Accessor to get the rowPos field
     * @return rowPos
     */
 public int getRowPos()
 {
     return rowPos;
 }//getRowPos
 
  

    /**
     * Mutator to allow user to set rowPos
     * @param row the row position
     */
 public void setRowPos(int row) 
 {
     rowPos = row;
 }//setRowPos
 
 

    /**
     * Accessor to get the ColPos field
     * @return colPos
     */
 public int getColPos() 
 {
     return colPos;
 }//getColPos
    
 

    /**
     * Mutator to allow setting ColPos
     * @param column column of the piece.
     */
 public void setColPos(int column) 
 {
     colPos = column;
 }//setColPos   
 
 
}//GamePiece
