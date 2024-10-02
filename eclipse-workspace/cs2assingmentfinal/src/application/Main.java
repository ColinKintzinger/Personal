package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.control.ComboBox;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			VBox blist = new VBox();
			blist.setPadding(new Insets(30, 30, 30, 30));
			blist.setSpacing(15);
			blist.setAlignment(Pos.TOP_LEFT);

			Label label1 = new Label("Student Full Name");
			label1.setPrefSize(200, 20);
			TextField textField = new TextField();
			textField.setPromptText("Student Name");
			HBox hbox = new HBox(label1, textField);
			hbox.setSpacing(33);

			Label label2 = new Label("Student Email Address");
			label2.setPrefSize(130, 20);
			TextField textField2 = new TextField();
			textField2.setPromptText("Student Email");
			HBox hbox2 = new HBox(label2, textField2);
			hbox2.setSpacing(2);

			Label label3 = new Label("Student Nationality");
			label1.setPrefSize(100, 20);
			fillComboBoxFromFile();

			HBox hbox3 = new HBox(label3, myComboBox);
			hbox3.setSpacing(30);

			RadioButton rb1 = new RadioButton("Undergrad");
			RadioButton rb2 = new RadioButton("Graduate");
			HBox hbox4 = new HBox(rb1, rb2);
			hbox4.setSpacing(15);

			CheckBox cb1 = new CheckBox("Transfer Student");
			HBox hbox5 = new HBox(cb1);

			Button reset = new Button("Reset");
			Button save = new Button("Save");
			reset.setPrefSize(100, 20);
			save.setPrefSize(100, 20);
			HBox hbox6 = new HBox(reset, save);
			hbox6.setSpacing(15);
			reset.setOnAction(new EventHandler<ActionEvent>(){

				@Override
				public void handle(ActionEvent arg0) {
					textField.clear();
					textField2.clear();
					myComboBox.getSelectionModel().selectFirst();
					rb1.setSelected(false);
					rb2.setSelected(false);
					cb1.setSelected(false);
					
				}
				
			});
			save.setOnAction(new EventHandler<ActionEvent>() {

				@Override

				public void handle(ActionEvent arg0) {
					// TODO Auto-generated method stub
					try {
						saveDataFileWriter(textField.getText(), textField2.getText(), myComboBox.getValue().toString(),
								rb1.isSelected(), rb2.isSelected(), cb1.isSelected());
						saveDataPrintStream(textField.getText(), textField2.getText(), myComboBox.getValue().toString(),
								rb1.isSelected(), rb2.isSelected(), cb1.isSelected());
						textField.clear();
						textField2.clear();
						myComboBox.getSelectionModel().selectFirst();
						rb1.setSelected(false);
						rb2.setSelected(false);
						cb1.setSelected(false);

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});

			blist.getChildren().addAll(hbox, hbox2, hbox3, hbox4, hbox5, hbox6);
			root.setCenter(blist);

			VBox list = new VBox();
			list.setPadding(new Insets(30, 30, 30, 30));
			list.setSpacing(10);

			Scene scene = new Scene(root, 550, 300);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			primaryStage.setScene(scene);
			primaryStage.setTitle("Student Information");
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveDataFileWriter(String studentName, String studentEmail, String nationality, boolean undergrad,
			boolean grad, boolean transfer) throws IOException {
		try {
			FileWriter fw = new FileWriter("userData1.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(studentName + "\n");
			bw.write(studentEmail + "\n");
			bw.write(nationality + "\n");
			if (undergrad = true)
				bw.write("undergrad\n");
			else if (grad = true)
				bw.write("graduate\n");
			if(transfer = true) {
				bw.write("1");
			}
			else {
				bw.write("0");
			}
			bw.write("\n");
			bw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void saveDataPrintStream(String studentName, String studentEmail, String nationality, boolean undergrad,
			boolean grad, boolean transfer) throws IOException {
		try {
			File file = new File("userData2.txt");
			PrintStream fw = new PrintStream(file);
			fw.println(studentName);
			fw.println(studentEmail);
			fw.println(nationality);
			if (undergrad = true)
				fw.println("undergrad");
			else if (grad = true)
				fw.println("graduate");
			if(transfer = true) {
				fw.write(1);
			}
			else {
				fw.write(0);
			}
			fw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	ComboBox<String> myComboBox = new ComboBox<String>();

	private void fillComboBoxFromFile() throws FileNotFoundException {
		Scanner fileIn = new Scanner(new File("nations.txt"));
		while (fileIn.hasNext()) {
			String currentNaton = fileIn.nextLine();
			myComboBox.getItems().add(currentNaton);
		}
		fileIn.close();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
