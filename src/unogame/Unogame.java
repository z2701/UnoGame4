

package unogame;

/**
 *
 * This class +++Insert Description Here+++
*
*@author Zunaira Malik
 */
public class Unogame {

    /**
     * @param args the command line arguments
     */
    
    private String value, suit;
    
    /**
     * Default empty constructor
     */
    public Unogame() {}
    
    /**
     * Get the value of the card
     * @return the value of the card
     */
    public String getValue() {
        return this.value;
    }
    
    /**
     * Get the suit of the card
     * @return the suit of the card
     */
    public String getSuit() {
        return this.suit;
    }
    
    /**
     * Set the value of the card with the provided parameter value
     * @param value the value of the card 
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * Set the suit of the card with the provided parameter suit
     * @param suit the suit of the card
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
}

    


