public class Celebrity {
  /**
   * The clue to determine the celebrity
   */
  
 private String clue;

  /**
   * The answer or name of the celebrity.
   */
  private String answer; 
  
  /**
   * Creates a Celebrity instance with the supplied answer and clue
   * @param answer
   * @param clue
   */
   public Celebrity(String initClue, String initAnswer){
 clue = initClue;
 answer = initAnswer;
   }
  /**
   * Supplies the clue for the celebrity
   * @return
   */

 public String getClue(){
        return clue;
    }
    public int getAnswer(){
        return answer;
    }

        clue = "Ace's favorite actress."
        answer = "Jenna Ortega"
  /**
   * Supplies the answer for the celebrity.
   * @return
   */
  
   public void setClue(String newClue){
        clue = newClue;
    }

    public void setAnswer(String newAnswer){
        answer = newAnswer;
    }
  /**
   * Updates the clue to the provided String.
   * @param clue The new clue.
   */
    
  /**
   * Updates the answer to the provided String.
   * @param answer The new answer.
   */
    
  /**
   * Provides a String representation of the Celebrity.
   */
  @Override
  public String toString() {
    String description = "The Celebrity's name is: " + answer + ". The clue for this celebrity is: " + clue;
    
    return description;
  }
}

