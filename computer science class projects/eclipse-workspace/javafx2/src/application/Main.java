package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.scene.control.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			VBox blist= new VBox();
			blist.setPadding(new Insets(30, 30, 30, 30));
			blist.setSpacing(10);
			blist.setStyle("-fx-background-color: #336699");
			
			Button buttonLogin=new Button("Login");
			buttonLogin.setPrefSize(100,20);
			
			Button buttonLogout=new Button("Logout");
			buttonLogout.setPrefSize(100,20);
			
			blist.getChildren().addAll(buttonLogin, buttonLogout);
			
			root.setLeft(blist);
			
			VBox vbox=new VBox();
			vbox.setPadding(new Insets(30, 30, 30, 30));
			vbox.setSpacing(5);
			
			HBox hbox= new HBox();
			hbox.setPadding(new Insets(10, 10, 10, 18));
			hbox.setSpacing(10);
			Label label= new Label("password");
			PasswordField password=new PasswordField();
			
			hbox.getChildren().addAll(label, password);
			
			HBox hbox2= new HBox();
			hbox2.setPadding(new Insets(10, 10, 10, 18));
			hbox2.setSpacing(10);
			Label label2= new Label("username");
			TextField userName=new TextField();
			
			hbox2.getChildren().addAll(label2, userName);
			
			vbox.getChildren().addAll(hbox2, hbox);
			vbox.setAlignment(Pos.CENTER);
			root.setCenter(vbox);
			
//			buttonLogin.setOnAction(new EventHandler<ActionEvent>(){
//
//				@Override
//				public void handle(ActionEvent arg0) {
//					System.out.println("yay");
//					javafx.application.Platform.exit();
//					
//				}
//				
//			});
			
			Scene scene = new Scene(root,600,200);
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
