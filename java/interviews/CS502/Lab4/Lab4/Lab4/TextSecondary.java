package Lab4;

public abstract class TextSecondary extends TextCommon {

	public TextSecondary() {
		super();
	}

	@Override
	public int compareTo(Text t) {
		return this.toString().compareTo(t.toString());
	}

	@Override
	public void setFromString(String s) {
		this.text = new StringBuffer(s);
	}

	@Override
	public void copyFrom(Text t) {
		this.text = new StringBuffer(t.toString());
	}

	@Override
	public void append(Text t) {
		this.text.append(t.toString());
	}

	@Override
	public void flip() {
		this.text.reverse();
	}

	@Override
	public void insert(int pos, Text t) {
		this.text.insert(pos, t.toString());
	}

	@Override
	public void extract(int pos1, int pos2, Text t) {
		Text subString = new Text1L(this.text.substring(pos1, pos2));
		t.append(subString);
		this.text = new StringBuffer(subString.toString());
	}

	@Override
	public void split(int pos, Text t) {
		this.extract(0, pos, t);
	}

	/**
	 * Replaces with t the substring of this starting at position pos1 and
	 * ending at position pos2-1, while also replacing t with that substring.
	 */
	@Override
	public void replaceSubstring(int pos1, int pos2, Text t) {
		Text subString = new Text1L(this.text.substring(pos1, pos2));
		this.text.replace(pos1, pos2, t.toString());
		t.copyFrom(subString);
	}

	@Override
	public int indexOf(Text t) {
		return this.text.toString().indexOf(t.toString());
	}

	/**
	 * Removes the first "word" (maximal length string of non-separator
	 * characters), and the separators before it, from this, putting the string
	 * of separators immediately before the first word into prefixSeparators and
	 * the first word into word.
	 */
	@Override
	public void removeFirstWord(Text prefixSeparators, Text word) {
		String[] words = this.toString().split(prefixSeparators.toString());
		if (words[0] != null) {
			int pos1 = this.indexOf(new Text1L(words[0]));
			int pos2 = pos1 + words[0].length() + 1;
			this.text.replace(pos1, pos2, "");
			word.setFromString(words[0]);
		}
	}

}
