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
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Scene1.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setOnCloseRequest(event -> {
				event.consume();
				exit(primaryStage);
			});
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void exit(Stage stage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Log Out");
		alert.setHeaderText("You are Logging out");
		alert.setContentText("Do you want to save before logging out");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			
			System.out.println("You have Successfully Logged out");
			stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
