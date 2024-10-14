package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Scene1.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
			stage.setOnCloseRequest( event ->{
				event.consume();
				logOut(stage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void logOut(Stage stage) {
		 Alert alert = new Alert(AlertType.CONFIRMATION);
		 alert.setTitle("Log Out");
		 alert.setHeaderText("You're about to log out");
		 alert.setContentText("Do you want to save before exiting?");
		 
		 if (alert.showAndWait().get() == ButtonType.OK) {
			
			 System.out.println("You have successfully logged out!!");
			 stage.close();
		 }
		 }
	
	public static void main(String[] args) {
		launch(args);
	}
}
