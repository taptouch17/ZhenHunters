
import java.util.Scanner;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jelani
 */
public class GameGrid {
    
    // properties defined by game instructions.
    private int numRows; // number of rows
    private int numCols; // number of columns
    private GamePiece [] [] grid; // GamePiece array.
    private Player Player1, Player2; // Player objects
    private int numZhens; // number of Zhens
    private int [] hunterCoord; // hunter 1 Coordinates
    private Hunter hunter1, hunter2; // Hunter objects.
    private int [] hunter2Coord; // hunter 2 coordinates.
    private int numHunters; // number of hunters.
   
    // constants defined by me.
    private final int ROW_THE_COLUMNS = 8; //Constant containing the amount of rows and Columns.
    private final int CHOICE_OF_ZHENS1 = 16; // Constant of the first choice of Zhens permitted.
    private final int CHOICE_OF_ZHENS2 = 18; // Constant of the second choice of Zhens permitted.
    private final int CHOICE_OF_ZHENS3 = 20; // Constant of the third choice of Zhens permitted.
    private char Player_One_Char; // Char holding the first letter of the first player.
    private char Player_Two_Char; // Char holding the first letter of the second player.
    
    /**
     * This is a constructor which initialises all variables which are not marked as final.
     */
    public GameGrid() 
    {
    
    numRows = numCols = ROW_THE_COLUMNS;
    grid = new GamePiece[ROW_THE_COLUMNS][ROW_THE_COLUMNS];
    Player1 = new Player(" ");
    Player2 = new Player(" ");
    hunter2Coord = new int[2];
    hunterCoord = new int[2];
    hunter1 = new Hunter();
    hunter2 = new Hunter();
    Player_One_Char = ' ';
    Player_Two_Char = ' ';
    }//GameGrid    
    
    boolean addGamePiece(GamePiece piece, int row, int col) 
    {
       
        if (grid[row][col] == null) {
            piece.setRowPos(row);
            piece.setColPos(col);
            grid[row][col] = piece;
            return true;
        }
        return false;
    }//addGamePiece
    
    /**
     * This is the initial setup for the grid. This methods adds the pieces to the GamePiece grid
     * if no piece is at the specified location. First this methods asks for the player's names and also
     * ask for the number of Zhens the player would like to play with. Call this method in DisplayGrid.
     */
    public void setupGrid() 
    {
        System.out.println("Please Enter a name for Player 1: ");
        Scanner myScanner = new Scanner(System.in);
        String name1 = myScanner.next();
        Player_One_Char = name1.charAt(0);
        Player p1 = new Player(name1);
        Player1 = p1;
        System.out.println("Please Enter a name for Player 2: ");
        String name2 = myScanner.next();
        Player_Two_Char = name2.charAt(0);
        Player p2 = new Player(name2);
        Player2 = p2;
        System.out.println("Welcome to the Game " + Player1.getName() + " and " + Player2.getName());
        System.out.println("The number of Zens can be either only 16, 18 or 20!");
        System.out.println("Preferably 20 if you want the grid to look right ..");
        System.out.println("Please Enter how many Zhens to play with: ");
        int zHens = myScanner.nextInt();
        if (zHens == CHOICE_OF_ZHENS1 || zHens == CHOICE_OF_ZHENS2) 
        {
            System.out.println("Ha! You thought it wouldn't look right either ways..?");
        }
        while (!(zHens == CHOICE_OF_ZHENS1 || zHens == CHOICE_OF_ZHENS2 || zHens == CHOICE_OF_ZHENS3)) 
        {
            System.out.println("Please Enter how many Zhens to play with: ");
            System.out.println(zHens);
            zHens = myScanner.nextInt();
        }
        
        
        numZhens = zHens;
        
        
        
        for (int row = 0; row <= 7; row++) 
        {
            for (int column = 0; column <= 7; column++) 
            {
              if (row == 0 && column == 0 || row == 0 && column == 1 || row == 1 && column == 0 || row == 1 && column == 1 || row == 0 && column == 6 || row == 0 && column == 7 || row == 1 && column == 6 || row == 1 && column == 7) 
              {
                  Bramble theBramble = new Bramble();
                  if (addGamePiece(theBramble, row, column)) {
                  theBramble.setType("Bramble");
                  theBramble.setSymbol('*');
                  theBramble.setColPos(column);
                  theBramble.setRowPos(row);
                  }
                  else 
                  {
                      return;
                  }
                
                  
            }
              if (row == 0 || row == 1) 
              {
                  if (column > 1 && column <= 5) 
                  {
                      Zhen theZhen = new Zhen();
                      if (addGamePiece(theZhen, row, column)) 
                      {
                      theZhen.setType("Zhen");
                      theZhen.setSymbol('Z');
                      theZhen.setColPos(column);
                      theZhen.setRowPos(row);   
                  }
                      else 
                      {
                      System.exit(99);
                  }
                  }
              }
              if (row == 2 && column > 0 || row == 2 && column <= 8) 
              {
                  Zhen theZhen = new Zhen();
                  if (addGamePiece(theZhen, row, column)) 
                  {
                      
                  theZhen.setType("Zhen");
                  theZhen.setSymbol('Z');
                  theZhen.setRowPos(row);
                  theZhen.setColPos(column);  
                  }
                  else 
                  {
                      System.exit(99);
                  }
                }
                
                    if (row == 3 && column == 0 || row == 3 && column == 7) 
                    {
                        if (numZhens == 18 || numZhens == 20) 
                        {
                            Zhen theZhen = new Zhen();
                        if (addGamePiece(theZhen, row, column)) {
                        theZhen.setType("Zhen");
                        theZhen.setSymbol('Z');
                        theZhen.setRowPos(row);
                        theZhen.setColPos(column);
                        }
                    }
                }
                
                    if (row == 4 && column == 0 || row == 4 && column == 7) 
                    {
                        Zhen theZhen = new Zhen();
                        if (addGamePiece(theZhen, row, column)) 
                        {
                            if (numZhens == 20) 
                            {
                            theZhen.setType("Zhen");
                            theZhen.setSymbol('Z');
                            theZhen.setRowPos(row);
                            theZhen.setColPos(column);
                        }
                    }
                }
                    if (row == 4 && column == 3 || row == 4 && column == 4) 
                    {
                        if (column == 3) 
                        {
                          if (addGamePiece(hunter1, row, column)) 
                          {
                            hunter1.setType("hunter");
                            hunter1.setHunterName('F');
                            hunter1.setEnergyLevel(4);
                            hunter1.setColPos(column);
                            hunter1.setRowPos(row);
                            hunterCoord[0] = row;
                            hunterCoord[1] = column;
                            
                        }  
                        }
                        if (column == 4) 
                        {
                            if (addGamePiece(hunter1, row, column)) 
                            {
                            hunter2.setType("hunter");
                            hunter2.setHunterName('B');
                            hunter2.setEnergyLevel(4);
                            hunter2.setColPos(column);
                            hunter2.setRowPos(row);
                            hunter2Coord[0] = row;
                            hunter2Coord[1] = column;
                            
                        }
                        }
                        
                }
                
                if (row == 6 && column == 0 || row == 6 && column == 1 || row == 7 && column == 0 || row == 7 && column == 1 || row == 6 && column == 6 || row == 6 && column == 7 || row == 7 && column == 6 || row == 7 && column == 7) 
                {
                    Bramble theBramble = new Bramble();
                if (addGamePiece(theBramble, row, column)) 
                {
                  theBramble.setType("Bramble");
                  theBramble.setSymbol('*');
                  theBramble.setColPos(column);
                  theBramble.setRowPos(row);
                }
            }
                
                
            }
            
            
            
            
        }
    }//setupGrid
    
    /**
     * This method takes one parameter which is a string. The method then output's the 
     * string to the console.
     * @param whatToPrint - What is to be printed to the screen.
     */
    public void printPiece(String whatToPrint) 
    {
        System.out.print(whatToPrint);
    }//printPiece
    
    /**
     *  After the initial setup for the grid is done, this method then displays the board as it was setup.
     */
    public void displayGrid() 
    {
        setupGrid();
        printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
        for (int row = 0; row <= 7; row++) 
        {
            for (int col = 0; col <= 7; col++) 
            {
                
                
                if (row == 0 && col <= 7) 
                {
                    if (row == 0) 
                    {
                        
                        if (col == 0 || col == 1) 
                        {
                            if (col == 0) 
                            {
                               if (grid[row][col].getType().equals("Bramble")) 
                               {
                            printPiece("|  " + grid[row][col].getSymbol() + "  |");
                        }  
                            }
                            else 
                            {
                                if (grid[row][col].getType().equals("Bramble")) 
                                {
                            printPiece("  " + grid[row][col].getSymbol() + "  |");
                        } 
                            }
                              
                    }
                    if (col > 1 && col <= 5) 
                    {
                           if (grid[row][col].getType().equals("Zhen")) 
                           {
                               printPiece("  " + grid[row][col].getSymbol() + "  |");
                           }
                        }
                        if (col == 6 || col == 7) 
                        {
                            
                            if (grid[row][col].getType().equals("Bramble")) 
                            {
                            printPiece("  " + grid[row][col].getSymbol() + "  |");
                        }
                            if (col == 7) 
                            {
                                printPiece("\n");
                                printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                                
                            }
                        }        
                } // Ends row 1
                    
                    
               
       }// Ends row 1 && col 8
                if (row == 1 && col <= 7) 
                {
                    if (row == 1) 
                    {
                        
                        if (col == 0 || col == 1) 
                        {
                            if (col == 0) 
                            {
                               if (grid[row][col].getType().equals("Bramble")) {
                            printPiece("|  " + grid[row][col].getSymbol() + "  |");
                        }  
                            }
                            if (col == 1) 
                            {
                                if (grid[row][col].getType().equals("Bramble")) 
                                {
                            printPiece("  " + grid[row][col].getSymbol() + "  |");
                        } 
                            }
                              
                    }
                        if (col > 1 && col <= 5) 
                        {
                           if (grid[row][col].getType().equals("Zhen")) 
                           {
                               printPiece("  " + grid[row][col].getSymbol() + "  |");
                           }
                        }
                    
                        if (col == 6 || col == 7) 
                        {
                            
                            if (grid[row][col].getType().equals("Bramble")) 
                            {
                            printPiece("  " + grid[row][col].getSymbol() + "  |");
                        }
                            if (col == 7) 
                            {
                                printPiece("\n");
                                printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                            }
                        }
                    }
                } // Ends row 2 and Col 8
                if (row == 2 && col <= 7) 
                {
                    if (col == 0) 
                    {
                       if (grid[row][col].getType().equals("Zhen")) 
                       {
                        printPiece("|  " + grid[row][col].getSymbol() + "  |");
                    } 
                    }
               
                    else 
                    {
                        printPiece("  " + grid[row][col].getSymbol() + "  |");
                    }
                    if (col == 7) 
                    {
                        printPiece("\n");
                        printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                    }
                } // Ends row 3 && Col 8
                
                
                if (row == 3 && col <= 7) 
                {
                    if (numZhens == 18 || numZhens == 20) 
                    {
                        if (col == 0 || col == 7) 
                        {
                            if (col == 0) 
                            {
                               if (grid[row][col].getType().equals("Zhen")) 
                               {
                            printPiece("|  " + grid[row][col].getSymbol() + "  |");
                        }  
                            }
                          else 
                            {
                            printPiece("  " + grid[row][col].getSymbol() + "  |");
                        }  
                        }
                        else 
                        {
                            printPiece("     |");
                        }
                        
                        
                    }
                    else  
                    {
                        if (col == 0) 
                        {
                            printPiece("|     |");
                        }
                        else 
                        {
                        printPiece("     |");
                        }
                    }
                        
                    if (col == 7) 
                    {
                        printPiece("\n");
                        printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                    }
                } // Ends row 4 && Col 8
                if (row == 4 && col <= 7) 
                {
                    if (numZhens == 20) 
                    {
                        if (col == 0 || col == 7) 
                        {
                            if (col == 0) {
                              if (grid[row][col].getType().equals("Zhen")) 
                              {
                                printPiece("|  " + grid[row][col].getSymbol() + "  |");
                            }  
                            }
                            else {
                                if (grid[row][col].getType().equals("Zhen")) 
                                {
                                printPiece("  " + grid[row][col].getSymbol() + "  |");
                            }
                            }
                            
                        }
                        
                        else {
                            if (col == 3 || col == 4) 
                            {
                                if (col == 3) 
                                {
                                   if (grid[row][col].getType().equals("hunter")) 
                                   {
                                   printPiece("  " + hunter1.getHunterName() + "  |"); 
                                } 
                                }
                                if (col == 4) 
                                {
                                    if (grid[row][col].getType().equals("hunter")) {
                                   printPiece("  " + hunter2.getHunterName() + "  |"); 
                                }
                                }
                                
                            }
                            else 
                            {
                            printPiece("     |");
                            }
                        }
                        
                    }
                    else 
                    {
                        if (col == 3 || col == 4) 
                        {
                                if (col == 3) 
                                {
                                   if (grid[row][col].getType().equals("hunter")) {
                                   printPiece("  " + hunter1.getHunterName() + "  |"); 
                                } 
                                }
                                if (col == 4) 
                                {
                                    if (grid[row][col].getType().equals("hunter")) {
                                   printPiece("  " + hunter2.getHunterName() + "  |"); 
                                }
                                }
                                
                        
                                
                        }
                        else {
                            if (col == 0) 
                            {
                                printPiece("|     |");
                            }
                            else 
                            {
                                printPiece("     |");
                            }
                        }
                    }
                    if (col == 7) 
                    {
                        printPiece("\n");
                        printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                    }
                } // Ends row 5 && col 8
                if (row == 5 && col <= 7) 
                {
                    if (col == 0) 
                    {
                        printPiece("|     |");
                    }
                    else 
                    {
                        printPiece("     |");
                    }
                    if (col == 7) {
                        printPiece("\n");
                        printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                    }
                } // Ends row 6 and col 8
                if (row == 6 && col <= 7) 
                {
                    if (col == 0 || col == 1 || col == 6 || col == 7) 
                    {
                        if (col == 0) 
                        {
                          if (grid[row][col].getType().equals("Bramble")) 
                          {
                            printPiece("|  " + grid[row][col].getSymbol() + "  |");
                        }  
                        }
                        else 
                        {
                        if (grid[row][col].getType().equals("Bramble")) 
                        {
                            printPiece("  " + grid[row][col].getSymbol() + "  |");
                        }
                        }
                    }
                    else 
                    {
                        printPiece("     |");
                    }
                    if (col == 7) 
                    {
                        printPiece("\n");
                        printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                    }
                } // Ends row 6 and col 8
                if (row == 7 && col <= 7) 
                {
                    if (col == 0 || col == 1 || col == 6 || col == 7) 
                    {
                        if (col == 0) 
                        {
                            if (grid[row][col].getType().equals("Bramble")) 
                            {
                            printPiece("|  " + grid[row][col].getSymbol() + "  |");
                        }
                        }
                        else 
                        {
                       if (grid[row][col].getType().equals("Bramble")) 
                       {
                            printPiece("  " + grid[row][col].getSymbol() + "  |");
                        } 
                        }
                    }
                    else 
                    {
                        printPiece("     |");
                    }
                    if (col == 7) 
                    {
                        printPiece("\n");
                        printPiece("  ...   ...   ...   ...   ...   ...   ...   ...\n");
                    }
                }
            }
            
        }
        System.out.println("Hunter "+ hunter1.getHunterName() + " energy: " + hunter1.getEnergyLevel());
        System.out.println("Hunter "+ hunter2.getHunterName() + " energy: " + hunter2.getEnergyLevel());
        System.out.println("Number of Zhens: " + numZhens);
       
        
    }// displayGrid


}// GameGrid
