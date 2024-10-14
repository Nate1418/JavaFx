package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class SceneControll {
	@FXML
	private Label labelF;
	@FXML
	private RadioButton rButton1, rButton2, rButton3;
	
	public void getFood(ActionEvent event) {
		
		if(rButton1.isSelected()) {
			labelF.setText(rButton1.getText());
		}
		else if (rButton2.isSelected()) {
			labelF.setText(rButton2.getText());
		}
		else if(rButton3.isSelected()) {
			labelF.setText(rButton3.getText());
		}
		
	}
}
