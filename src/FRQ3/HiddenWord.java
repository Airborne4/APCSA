package FRQ3;

public class HiddenWord {
	String word;

	public HiddenWord(String word) {
		this.word = word;
	}

	public String getHint(String guess) {
		char[] hint = new char[word.length()];

		for (int i = 0; i < guess.length() - 1; ++i) {
			if (word.charAt(i) == guess.charAt(i))
				hint[i] = guess.charAt(i);
			else {
				boolean inList = false;
				for (int j = 0; j < word.length() - 1; ++j) {
					if (word.charAt(j) == guess.charAt(i)) {
						inList = true;
						break;
					}
				}
				if (inList)
					hint[i] = '+';
				else
					hint[i] = '*';
			}
		}
		String h = hint.toString();
		return (h);
	}
}