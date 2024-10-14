package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class SceneControll implements Initializable{
	@FXML
	private ListView<String> myList;
	@FXML
	private Label myLabel;
	
	String[] food = {"Bread", "Cake","Pie"};
	String myFood;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myList.getItems().addAll(food);
		
	
		
		myList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				// TODO Auto-generated method stub
				myFood = myList.getSelectionModel().getSelectedItem();
				myLabel.setText(myFood);
			}
			
		});
			
	
		
	}
	
	
}
