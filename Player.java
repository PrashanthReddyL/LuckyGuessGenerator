/**
 * The Player class creates a new player and stores their name, 
 * prizes they have won, total worth of their prizes won, and total 
 * money they have spent.
 * 
 * It is used by the Game class to store information pertaining to
 * the current player.
 * 
 * @author Prashanth Kumar Reddy Lenkala 
 * @version (3.7 07/09/2017)
 */
public class Player
{
    private String name;
    private String prizesWon;
    private int totalSpent;
    private int prizesWorth;  
        /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        name = "";
        prizesWon = "";
        totalSpent = 0;
        prizesWorth = 0;               
    }

    /**
     * Constructor for player class which takes all fields as parameters.
     */
    public Player(String newName, String newPrizesWon, int newPrizesWorth, int newTotalSpent)
    {
        name = newName;
        prizesWon = newPrizesWon;
        totalSpent = newTotalSpent;
        prizesWorth = newPrizesWorth;      
    }
          
    /**
     * This method adds a prize to the player's current list of prizes.
     */
    public void addPrize(String newPrize)
    {
        prizesWon += "{" + newPrize + "}" ;
    }
    
    /**
     * This method adds the player's guess to the total amount that the 
     * player has spent.
     */
    public void addSpent(int newSpent)
    {
        totalSpent += newSpent;
    }
    
    /**
     * This method adds a prize's worth to the total worth off all the 
     * player's won prizes.
     */
    public void addWorth(int newWorth)
    {
        prizesWorth += newWorth;
    }
    
    /**
     * This method displays the player statistics.. 
     */
    public void playerStats()
    {
        System.out.println("\nName: " + name);
        System.out.println("Prizes won:" + prizesWon);
        System.out.println("Total value of prizes won: $" + prizesWorth);
        System.out.println("Total spent: $" + totalSpent);
    }
    
    /**
     * Accessor method for name variable.
     */
    public String getName()
    {
        return name;
    }
     
     /**
     * Accessor method for prizesWon variable.
     */
    public String getPrizesWon()
    {
        return prizesWon;
    }
    
    /**
     * Accessor method for totalSpent variable.
     */
    public int getTotalSpent()
    {
        return totalSpent;
    }
      
    /**
     * Accessor method for prizesWorth variable.
     */
    public int getPrizesWorth()
    {
        return prizesWorth;
    }
    
    /**
     * Mutator method for name variable.
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Mutator method for prizesWon variable.
     */
    public void setPrizesWon(String newPrizesWon)
    {
        prizesWon = newPrizesWon;
    }
    
    /**
     * Mutator method for totalSpent variable.
     */
    public void setTotalSpent(int newTotalSpent)
    {
        totalSpent = newTotalSpent;
    }
    
    /**
     * Mutator method for prizesWorth variable.
     */
    public void setPrizesWorth(int newPrizesWorth)
    {
        prizesWorth = newPrizesWorth;
    }
    
    /**
     * Validation method for the name attribute.
     */
    public boolean verifyName(String newName)
    {
        boolean verify = false;
        if (newName.trim().length() > 0)
            verify = true;
        return verify;
    }
    
    
    
    
}
