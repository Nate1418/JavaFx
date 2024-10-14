package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneControll2 {
	@FXML
	Label labelF;
	
	@FXML
	private Button exit;
	@FXML
	private Button change;
	@FXML
	private AnchorPane aView;
	@FXML
	private ImageView pic;
	
	Stage stage;
	
	public void change(String username) {
		labelF.setText("Hi "+ username);
	}
	Image image = new Image(getClass().getResourceAsStream("book15.png"));
	public void next() {
		pic.setImage(image);
	}
	
	
	
	public void exit(ActionEvent event) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Log Out");
		alert.setHeaderText("You are Logging out");
		alert.setContentText("Do you want to save before logging out");
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			stage = (Stage) aView.getScene().getWindow();
			System.out.println("You have Successfully Logged out");
			stage.close();
		}
	}
}
