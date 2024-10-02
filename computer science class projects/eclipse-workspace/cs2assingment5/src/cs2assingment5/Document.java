package cs2assingment5;

import java.util.Objects;

public class Document {
	private String text;

	public Document(String text) {
		super();
		this.text = text;
	}

	public Document() {
		super();
		this.text = "";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Document [text=" + text + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		return Objects.equals(text, other.text);
	}

}
