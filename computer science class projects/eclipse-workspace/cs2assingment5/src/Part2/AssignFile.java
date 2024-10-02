package Part2;

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


	@Override
	int fileLenth() {
		AssignFile fl=new AssignFile("GenFile.txt");
		String temp=fl.getFileName();
		int temp2=temp.length();
		return temp2;
	}
	
}
