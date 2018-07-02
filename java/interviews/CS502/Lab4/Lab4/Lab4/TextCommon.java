package Lab4;

public abstract class TextCommon implements Text {
	protected StringBuffer text;

	public TextCommon() {
		this.text = new StringBuffer();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Text)) {
			return false;
		}
		Text that = (Text) obj;
		return that.toString().equals(this.text.toString());

	}

	@Override
	public int hashCode() {
		return this.text.hashCode();
	}

	@Override
	public String toString() {
		return this.text.toString();
	}
}
