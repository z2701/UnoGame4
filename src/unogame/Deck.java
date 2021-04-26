/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

import java.util.ArrayList;

/**
 *
 * @author zunai
 */
public class Deck {
     // Declare an array of cards
    
    private ArrayList<Unogame> deck;
    
    /**
     * Default empty constructor
     */
    public Deck() {
        this.deck = new ArrayList<Unogame>();
    }
    
    /**
     * Draw a card from the deck
     * @return a new Uno card drawn from the deck
     */
    public Unogame draw() {
        return new Unogame();
    }
    
    /**
     * Reset the deck.
     */
    public void reset() {
        this.deck = new ArrayList<Unogame>();
    }
}
