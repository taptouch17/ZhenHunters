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
    
  private String type;
  private char symbol;
  private int rowPos;
  private int colPos;
  
  // Constructor to initialize type and sumbol

    /**
     *
     */
  public GamePiece() {
      type = "?";
      symbol = '?';
  }
  
  // Accessor to get Type

    /**
     *
     * @return
     */
  public String getType() {
      return type;
  }
  
  // Mutator for user to set the Type
  public void setType(String theType) {
      type = theType;
  }
  
 // Accessor to get Symbol 
 public char getSymbol() {
     return symbol;
 }
 
 // Mutator for user to set the symbol
 public void setSymbol(char theSymbol) {
     symbol = theSymbol;
 }
 
 // Accessor to get the rowPos field
 public int getRowPos() {
     return rowPos;
 }
 
 // Mutator to allow user to set rowPos
 public void setRowPos(int row) {
     rowPos = row;
 }
 
 // Accessor to get the ColPos field
 public int getColPos() {
     return colPos;
 }
    
 // Mutator to allow setting ColPos
 public void setColPos(int column) {
     colPos = column;
 }   
 
 
}
