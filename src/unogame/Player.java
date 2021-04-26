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
public class Player {
    
    
    // Declare name and password attributes
    private String name, password;
    
    /**
     * Initialize player object
     * @param name username of the player
     * @param password password of the player
     */
    public Player(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    /**
     * Return the name of the player
     * @return the name of the player
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Return the password of the player
     * @return the password of the player
     */
    public String getPassword() {
        return this.password;
    }
    
    /**
     * Set the name of the player provided in the parameter name
     * @param name the name of player
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
