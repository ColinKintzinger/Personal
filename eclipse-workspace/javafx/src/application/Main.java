package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;


public class Main extends Application {
	Text myText;
	@Override
	public void start(Stage primaryStage) {
		
		try {
			myText=new Text();
			Text myText2=new Text();
			myText2.setText("colin");
			myText2.setX(10);
			myText2.setY(10);
			myText.setText("welcome to cs 145");
			myText.setX(100);
			myText.setY(100);
			BorderPane root = new BorderPane();
			root.getChildren().add(myText);
			root.getChildren().add(myText2);
			Scene scene = new Scene(root,1000,700);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
