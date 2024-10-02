package Part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static boolean containsKeyWord(Document doc, String keyWord) {

		return doc.getText().contains(keyWord);

	}

	public static void main(String[] args) throws FileNotFoundException {
//testing the document class
		//Document doc = new Document();
//testing the email class that derives the document class
		Email email = new Email();
		email.setSender("colin@gmail.com");
		email.setRecipient("jake");
		email.setTitle("your mom");
		email.setText("yo yo what up fool what you doing this weekend");
		System.out.println(email);

		// work with file class
		AssignFile fle = new AssignFile();
		Scanner sc = new Scanner(System.in);
		System.out.println("pleas enter file name:");
		String fileName = sc.nextLine();
		if (fileName.equals("GenFile.txt")) {
			File f = new File(fileName);
			Scanner readFile = new Scanner(f);
			String fileData = "";
			while (readFile.hasNext()) {
				fileData += readFile.nextLine() + "\n";
			}

			fle = new AssignFile(fileName);
			fle.setText(fileData);
		}

		System.out.println(fle);
		System.out.println(containsKeyWord(email, "fool"));
		System.out.println(containsKeyWord(fle, "file that has"));

		System.out.println(email.fileLenth());
		System.out.println(fle.fileLenth());
	}

}
