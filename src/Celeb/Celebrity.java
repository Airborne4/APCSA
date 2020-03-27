package Celeb;


/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	String ans;
	String hint;
	String type;
	
	/**
	 * The clue to determine the celebrity
	 */
	
	/**
	 * The answer or name of the celebrity.
	 */
	
	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */

	public Celebrity(String answer, String clue)
	{
		setClue(clue);
		setAnswer(answer);
	}
	public Celebrity(String answer)
	{

		setAnswer(answer);
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getType()
	{
		return type;
	}
	public String getClue()
	{
		
		return hint;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return ans;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setType(String type)
	{
		this.type=type;
	}
	public void setClue(String clue)
	{
		hint=clue;
		//String hintArray[] = clue.split(",");
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		ans=answer;
	}
	
	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return ans+" "+hint;
	}
	
}
