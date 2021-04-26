/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

/**
 *
 * @author zunai
 */
public class Score {
     // Declare the playerScore attribute
    protected int playerScore;
    
    /**
     * Default empty constructor
     */
    public Score() {}
    
    /**
     * Set the player score with the provided parameter playerScore
     * @param playerScore the players score
     */
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
        
    }
    
    /**
     * Get the value of the player score
     * @return the value of the player score
     */
    public int getPlayerScore() {
        return this.playerScore;
    }
    
}
    

