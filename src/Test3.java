import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
   // Choose a random number from 0-100 

   int ran = (int)((Math.random() * (100)));
   // Get the first guess using scan.nextInt();
   System.out.println("Guess a number between 0 and 100");
   int guess = scanner.nextInt();
   // Loop while the guess does not equal the random number,
  while(guess != ran){
    if(guess < ran){
       System.out.println("Too low!");    
    }
    if(guess > ran){
      System.out.println("Too high!");    
    }
    ran = (int)((Math.random() * (100)));
  }

  System.out.println("You got it!");
     // If the guess is less than the random number, print out "Too low!"
   
     // If the guess is greater than the random number, print out "Too high!"
   
     // Get a new guess (save it into the same variable)
   

  // Print out something like "You got it!"


  }
}