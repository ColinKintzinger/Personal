package cs2assingment5;

public class AssignFile extends Document{
	private String fileName;

	public AssignFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public AssignFile( String fileName) {
		super();
		this.fileName = fileName;
	}


	public AssignFile(String text, String fileName) {
		super(text);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "File [fileName=" + fileName + "]\n"+super.getText();
	}
	
}
