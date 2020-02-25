public class Test4
{
   // 2 instance variables for Riddle's question and answer: private type variableName;
    String question = "";
    String answer = "";
   // constructor
   public Test4(String initQuestion, String initAnswer)
   {
      // set the instance variables to the init parameter variables
	   question = initQuestion;
	   answer = initAnswer; 
   }

   // Print riddle question
   public void printQuestion()
   {
     // print out the riddle question with System.out.println
    System.out.println(question);
   }

   // Print riddle answer
   public void printAnswer()
   {
     // print out the riddle answer with System.out.println
       System.out.println(answer);
   }

   // main method for testing
   public static void main(String[] args)
   {
      // call the constructor to create 3 new Riddle objects
       Test4 r1 = new Test4("Why did the chicken cross the road?", "Wait this isn't a riddle...");
       Test4 r2 = new Test4("What goes up but never comes down?", "Your age");
       Test4 r3 = new Test4("Test riddle","Test answer");

      // call their printQuestion() and printAnswer methods
        r1.printQuestion();
   }
}
