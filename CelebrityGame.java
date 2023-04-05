public class CelebrityGame {
   

    /**
     * The framework for the Celebrity Game project
     * 
     */
      //DECLARATION SECTION

      /**
         * The GUI frame for the Celebrity game.
         */
      private CelebrityFrame gameWindow;
    
      /**
         * A reference to a Celebrity
         */
        private Celebrity gameCelebrity; 

        
        /**
         * The array of Celebrity elements that make up the game
         */

         private Celebrity[] celebArr;
         
        private int index; 

    
      //CONSTRUCTOR
        /**
         * Builds the game and starts the GUI
         */
        public CelebrityGame()
        {
          gameCelebrity = new Celebrity();

          celebArr = new Celebrity[10];

          index = 0;
        }

    


    
        /**
         * Prepares the game to start by re-initializing the celebGameArray and having the gameFrame open the start screen.
         */
        /**
       * Resets the game by changing screens.
       */
      public void prepareGame()
      {
        celebGameArray = new Celebrity[100];
        index = 0;
        gameWindow.replaceScreen("START");
      } 
    
    
        /**
         * Determines if the supplied guess is correct.
         * 
         * @param guess
         *            The supplied String
         * @return Whether it matches regardless of case or extraneous external
         *         spaces.
         */
        public boolean processGuess(String guess)
        {
         /* To be implemented */
    
        }
    
        /**
         * Asserts that the list is initialized and contains at least one Celebrity.
         * Sets the current celebrity as the first item in the list. Opens the game
         * play screen.
         */
        public void play()
       {
         if (index < (celebGameArray.length-1))
         {
           this.gameCelebrity = celebGameArray[index];
           gameWindow.replaceScreen("GAME");
         }
       }
    
    
        /**
         * Adds a Celebrity of specified type to the game list
         * 
         * @param name
         *            The name of the celebrity
         * @param guess
         *            The clue(s) for the celebrity
         * @param type
         *            What type of celebrity
         */
        public void addCelebrity(String name, String guess, String type)

        
        {
            /* To be implemented */

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
             private CelebrityGame(String initClue, String initAnswer){
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
          
                  clue = "Ace's favorite actress.";
                  answer = "Jenna Ortega";
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
    
        /**
         * Validates the name of the celebrity. It must have at least 4 characters.
         * @param name The name of the Celebrity
         * @return If the supplied Celebrity is valid
         */
        public boolean validateCelebrity(String name)
        {
         /* To be implemented */
    
        }
    
        /**
         * Checks that the supplied clue has at least 10 characters or is a series of clues
         * This method would be expanded based on your subclass of Celebrity.
         * @param clue The text of the clue(s)
         * @param type Supports a subclass of Celebrity 
         * @return If the clue is valid.
         */
        public boolean validateClue(String clue, String type)
        {
            /* To be implemented */
    
        }
    
        /**
         * Accessor method for the current size of the list of celebrities
         * 
         * @return Remaining number of celebrities
         */
        public int getCelebrityGameSize()
        {
         /* To be implemented */
    
        }
    
        /**
         * Accessor method for the games clue to maintain low coupling between
         * classes
         * 
         * @return The String clue from the current celebrity.
         */
        public String sendClue()
        {
         /* To be implemented */
    
        }
    
        /**
         * Accessor method for the games answer to maintain low coupling between
         * classes
         * 
         * @return The String answer from the current celebrity.
         */
        public String sendAnswer()
        {
         /* To be implemented */
    
        }
    }
    
    
    

