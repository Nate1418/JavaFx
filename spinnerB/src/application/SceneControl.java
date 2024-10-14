package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class SceneControl implements Initializable {

	@FXML 
	private Spinner<Integer> mySpinner;
	@FXML
	private Label myLabel;
	int value;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFact = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20);
		valueFact.getValue();
		mySpinner.setValueFactory(valueFact);
		
		value = mySpinner.getValue();
		myLabel.setText(Integer.toString(value));
		
		mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {

			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				
				value = mySpinner.getValue();
				myLabel.setText(Integer.toString(value));
				
			}
			
		});
	}
	
	
	
}
