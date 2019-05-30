/**
 * The class LuckyGuessGenerator generates a number between 1 and 5
 * with use of the java.lang.Math class.
 * 
 * It is used by the Game class to generate a random number to
 * which the player's guess is compared.
 
 * @author Prashanth Kumar Reddy Lenkala
 * @version (3.7 07/09/2017)
 */
public class LuckyGuessGenerator
{
    private int randomNumber;

    /**
     * Constructor for objects of class LuckyGuessGenerator
     */
    public LuckyGuessGenerator()
    {
        randomNumber = 0;
    }
    
    /**
     * This method generates a new number between 1 and 5 (inclusive) and stores it.
     * 
     * The Math.random() method is used to generate a random double 
     * between 0.0 and less than 1.0. It is then multiplied by 5 and 
     * results an integer between 0 and 4. 
     * Then it is added to 1 to generate a number between 1 and 5.
     */
    public void generateRandomNumber()
    {
        randomNumber = 1 + (int)(Math.random()*5);
    }
       
    /**
     * Accessor method for randomNumber variable.
     */
    public int getRandomNumber()
    {
        return randomNumber;
    }
    
    /**
     * Mutator method for randomNumber variable.
     */
    public void setRandomNumber(int newNumber)
    {
        randomNumber = newNumber;
    }
          
}
