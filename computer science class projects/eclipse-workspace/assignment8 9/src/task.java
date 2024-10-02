import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task {
	private String description;
	private String time;
	private String time2;
	private String date;
	private int priority;

	public task() {
		super();
		this.description = "";
		this.time = "";
		this.time2 = ""; 
		this.date = "";
		this.priority = 0;
	}

	public task(String description, String time, String time2, String date, int priority) {
		super();
		this.description = description;
		this.time = time;
		this.time2 = time2;
		this.date = date;
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
}
	
