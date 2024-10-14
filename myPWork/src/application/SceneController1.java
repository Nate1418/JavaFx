package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController1 {

	@FXML 
	 TextField textF;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void max(ActionEvent event) throws IOException {
		String username = textF.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Scene2.fxml"));
		root = loader.load();
		SceneController2 con2 = loader.getController();
		con2.display(username);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
		
		
	}
}
