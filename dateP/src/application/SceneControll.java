package application;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class SceneControll {
	@FXML
	private DatePicker daat;
	@FXML
	private Label textF;
	
	public void getDate(ActionEvent event) {
		
		LocalDate mydate = daat.getValue();
		String myFormat = mydate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
		textF.setText(myFormat);
	}
}
