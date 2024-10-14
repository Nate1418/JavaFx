package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Scene1.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			primaryStage.setOnCloseRequest(event -> {
				event.consume();
				Log(primaryStage);
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void Log(Stage stage) {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Log Out");
		alert.setHeaderText("You're about to log out");
		alert.setContentText("Do you want to save before exiting");
		
		if(alert.showAndWait().get()==ButtonType.OK) {
			
			System.out.println("you have successfully Logged out");
			stage.close();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
