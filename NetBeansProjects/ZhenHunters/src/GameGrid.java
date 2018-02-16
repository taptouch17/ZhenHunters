
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
    private int numRows;
    private int numCols;
    GamePiece [] [] grid;
    Player Player1, Player2;
    int [] [] indexPath;
    private int numZhens;
    private int [] hunterCoord;
    private int [] hunter2Coord;
    private int numHunters;
    
    public GameGrid() {
    
    numRows = 8;
    numCols = 8;
    grid = new GamePiece[numRows][numCols];
    indexPath = new int[numRows][numRows];
}
    
    
    
    
    boolean addGamePiece(GamePiece piece, int row, int col) {
       
        for (GamePiece[] grid1 : grid) {
            if(!grid.equals(piece.getRowPos())) {
            for (GamePiece grid2 : grid1) {
                //if (!grid2.equals(piece.getColPos())) {
                    switch (piece.getSymbol()) {
                        case 'Z':
                            System.out.println(". . .");
                            System.out.println("|  Z  |");
                            break;
                        case '*':
                            System.out.println(". . .");
                            System.out.println("|  *  |");
                            break;
                        case 'H':
                            System.out.println(". . .");
                            System.out.println("|  H  |");
                            break;
                        default:
                            System.out.println(". . .");
                            System.err.println("|     |");
                            break;
                    }
                    
                    //grid[row][col] = piece;
                    return true;
                    
                //}
            }
        }
            
        }
        
 
        
        
        
        return false;
    }
    
    public void setupGrid() {
        System.out.println("Please Enter a name for Player 1: ");
        Scanner myScanner = new Scanner(System.in);
        String name1 = myScanner.next();
        Player p1 = new Player(name1);
        System.out.println("Please Enter a name for Player 2: ");
        String name2 = myScanner.next();
        Player p2 = new Player(name2);
        System.out.println("Please Enter how many Zhens to play with: ");
        int zHens = myScanner.nextInt();
        while (zHens != 18) {
            System.out.println("Please Enter how many Zhens to play with: ");
            System.out.println(zHens);
            zHens = myScanner.nextInt();
        }
        numZhens = zHens;
        Bramble b;
        b = new Bramble();
        for (int i = 1; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                b.setRowPos(i);
                b.setColPos(j);
                addGamePiece(b, i, j);
            }
            
        }
        for (int i = 1; i <= 2; i++) {
            for (int j = 7; j <= 8; j++) {
                b.setRowPos(i);
                b.setColPos(j);
                addGamePiece(b, i, j);
            }
        }
        for (int i = 7; i <= 8; i++) {
            for (int j = 1; j <= 2; j++) {
                 b.setRowPos(i);
                b.setColPos(j);
                addGamePiece(b, i, j);
            }
        }
        for (int i = 7; i <= 8; i++) {
            for (int j = 7; j <= 8; j++) {
                 b.setRowPos(i);
                b.setColPos(j);
                addGamePiece(b, i, j);
            }
        }
        Zhen z = new Zhen();
        for (int i = 1; i <= 2; i++) {
            for (int j = 3; j <= 6; j++) {
                 z.setRowPos(i);
                z.setColPos(j);
                addGamePiece(z, i, j);
            }
        }
    }
    
    public void displayGrid() {
        setupGrid();
    }


}
