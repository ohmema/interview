package Lab4;

public interface Text extends Standard<Text>, Iterable<Character>,
		Comparable<Text> {

	void add(int pos, char c);

	char charAt(int pos);

	int length();

	char remove(int pos);

	void append(Text t);

	void copyFrom(Text t);

	void extract(int pos1, int pos2, Text t);

	void flip();

	int indexOf(Text t);

	void insert(int pos, Text t);

	void removeFirstWord(Text prefixSeparators, Text word);

	void replaceSubstring(int pos1, int pos2, Text t);

	void setFromString(java.lang.String s);

	void split(int pos, Text t);
}
