package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneControl {

	@FXML
	TextField textF;
	
	
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void Log(ActionEvent event) throws IOException {
		String username = textF.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Scene2.fxml"));
		root = loader.load();
		SceneControll2 sceneControl = loader.getController();
		sceneControl.change(username);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
	}
}
