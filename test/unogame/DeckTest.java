/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unogame;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author zunai
 */
public class DeckTest {
    
    public DeckTest() {
    }
    
    

    /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Deck instance = new Deck();
       
         instance.draw();
        
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of reset method, of class Deck.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        Deck instance = new Deck();
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
