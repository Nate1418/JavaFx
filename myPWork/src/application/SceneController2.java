package application;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneController2 {
	@FXML
	 Label nameText;
	@FXML
	Button logOut;
	@FXML 
	AnchorPane pane;
	
	Stage stage;
	
	public void display(String username) {
		nameText.setText("Hi "+ username);
	}
	
	public void Log(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setTitle("Log Out");
		alert.setHeaderText("You're about to log out");
		alert.setContentText("Do you want to save before exiting");
		
		if(alert.showAndWait().get()==ButtonType.OK) {
			stage = (Stage) pane.getScene().getWindow();
			System.out.println("you have successfully Logged out");
			stage.close();
		}
	}
	
	
}
