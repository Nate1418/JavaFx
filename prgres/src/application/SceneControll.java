package application;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class SceneControll implements Initializable{

	@FXML
	private ProgressBar Bprog;
	@FXML
	private Label Lprog;
	@FXML
	private Button prog;
	
	BigDecimal progress = new BigDecimal(String.format("%.2f",0.0));
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Bprog.setStyle("-fx-accent: blue");
		
	}
	
	public void LetProg() {
		if(progress.doubleValue()<1) {
			progress = new BigDecimal(String.format("%.2f", progress.doubleValue() + 0.1));
			Bprog.setProgress(progress.doubleValue());
			System.out.println(progress.doubleValue());
			Lprog.setText(Integer.toString((int)Math.round(progress.doubleValue()*100))+ "%");
		}
		
	}

}
