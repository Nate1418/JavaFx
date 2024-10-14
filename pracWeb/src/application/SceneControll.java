package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class SceneControll implements Initializable {
	@FXML
	private WebView myWeb;
	
	@FXML
	private TextField textField;
	@FXML
	private Button backButton;
	@FXML
	private Button forwardButton;
	@FXML
	private Button rload;
	@FXML
	private Button plus;
	@FXML
	private Button minus;
	
	private WebEngine engine;
	private String homePage;
	private WebHistory history;
	private double zoom;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		engine = myWeb.getEngine();
		homePage = "www.google.com";
		textField.setText(homePage);
		
		Image image = new Image("file:C:/Users/Nathan/Pictures/bk.png");
		Image image2 = new Image("file:C:/Users/Nathan/Pictures/ra.png");
		Image image3 = new Image("file:C:/Users/Nathan/Pictures/reL.png");
		Image image4 = new Image("file:C:/Users/Nathan/Pictures/plus.png");
		Image image5 = new Image("file:C:/Users/Nathan/Pictures/minus.png");
		ImageView myImage = new ImageView();
		ImageView myImage1 = new ImageView();
		ImageView myImage2 = new ImageView();
		ImageView myImage3 = new ImageView();
		ImageView myImage4 = new ImageView();
		
		myImage4.setImage(image4);
		myImage3.setImage(image5);
		myImage2.setImage(image3);
		myImage.setImage(image);
		myImage1.setImage(image2);
		backButton.setGraphic(myImage);
		forwardButton.setGraphic(myImage1);
		rload.setGraphic(myImage2);
		plus.setGraphic(myImage4);
		minus.setGraphic(myImage3);
		zoom = 1;
	
		reloadPage();
		
		
	}

	
	
	public void reloadPage() {
		engine.load("https://" + textField.getText());
		
		
	}
	
	public void back(ActionEvent event) {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(-1);
		textField.setText(entries.get(history.getCurrentIndex()).getUrl());
		
	}
	
	public void forward() {
		history = engine.getHistory();
		ObservableList<WebHistory.Entry> entries = history.getEntries();
		history.go(1);
		textField.setText(entries.get(history.getCurrentIndex()).getUrl());
	}
	
	public void zoomIn() {
		zoom+= 0.25;
		myWeb.setZoom(zoom);;
	}
	
	public void zoomOut() {
		zoom-= 0.25;
		myWeb.setZoom(zoom);
	}
}




























