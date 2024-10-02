package cs2assingment5;

import java.util.Objects;

public class Email extends Document {
	private String sender;
	private String recipient;
	private String title;

	public Email() {
		super();
	}

	public Email(String text) {
		super(text);
	}

	public Email(String sender, String recipient, String title, String text) {
		super();
		this.sender = sender;
		this.recipient = recipient;
		this.title = title;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(recipient, sender, title);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		return Objects.equals(recipient, other.recipient) && Objects.equals(sender, other.sender)
				&& Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Email Sender=" + sender + "\nrecipient=" + recipient + "\ntitle=" + title + "\n" + super.getText();
	}

}
