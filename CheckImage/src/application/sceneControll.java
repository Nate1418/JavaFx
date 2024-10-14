package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class sceneControll {

	@FXML
	ImageView Image1;
	Button ButtonI;
	
	Image image = new Image(getClass().getResourceAsStream("bb1.jpeg"));
	
	public void Change() {
		Image1.setImage(image);
	}
}
