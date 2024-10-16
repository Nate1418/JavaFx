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

public class Scene1Controller {

	@FXML
	TextField textField;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void Login(ActionEvent event) throws IOException {
		
		String username = textField.getText();
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Scene2.fxml"));
		root = loader.load();
		Scene2Controller scene2Controller = loader.getController();
		scene2Controller.Display(username);
		
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		
		
		
		stage.setScene(scene);
		stage.show();
	}
}
