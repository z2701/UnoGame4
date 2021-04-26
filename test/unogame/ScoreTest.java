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
public class ScoreTest {
    
    public ScoreTest() {
    }
    
   

    /**
     * Test of setPlayerScore method, of class Score.
     */
    @Test
    public void testSetPlayerScore() {
        System.out.println("setPlayerScore");
        int playerScore = 0;
        Score instance = new Score();
        instance.setPlayerScore(playerScore);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPlayerScore method, of class Score.
     */
    @Test
    public void testGetPlayerScore() {
        System.out.println("getPlayerScore");
        Score instance = new Score();
        int expResult = 0;
        int result = instance.getPlayerScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
