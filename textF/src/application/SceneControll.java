package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SceneControll {
	@FXML
	private Button submit;
	@FXML 
	private TextField textF;
	@FXML
	private Label resp;
	
	public void sub() {
		
		try {
		int ans = Integer.parseInt(textF.getText());
		
		if(ans <= 18) {
			resp.setText("You are too young my niggs");
		}
		else if (ans>18) {
			resp.setText("Welcome my nigga you qualify");
		}
		
		}
		catch(NumberFormatException n) {
			resp.setText("Please insert a number");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
