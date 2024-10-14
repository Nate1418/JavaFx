package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class SceneControll implements Initializable {
	@FXML
	private Label labelF;
	@FXML
	private ChoiceBox<String> myChoice;
	
	private String[] food = {"Burger", "Fries", "Hot dogs"};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoice.getItems().addAll(food);
		myChoice.setOnAction(this::getChoice);
	}
	
	
	public void getChoice(ActionEvent event) {
		String myFood = myChoice.getValue();
		labelF.setText(myFood);
	}
	
	
}
