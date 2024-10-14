package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Scene2Controller {
   @FXML
   Label labelF;
   
   public void Display(String username) {
	   labelF.setText("HI "+ username);
   }
}
