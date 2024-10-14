package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SceneControll implements Initializable {
	
	@FXML 
	private Slider Temp;
	
	@FXML
	private Label nTemp;
	
	int myTemp;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myTemp = (int) Temp.getValue();
		nTemp.setText(Integer.toString(myTemp) + " °C");
		
		Temp.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				myTemp = (int) Temp.getValue();
				nTemp.setText(Integer.toString(myTemp)+ " °C");
			}
			
		});
		
	}
	
}
