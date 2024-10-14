package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class SceneControll implements Initializable {
	@FXML 
	private TreeView<String> tree;
	
	@FXML
	private Label Tlabel;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> rootItem = new TreeItem<String>("Files");
		
		
		TreeItem<String> branchItem1 = new TreeItem<String>("Music");
		TreeItem<String> branchItem2 = new TreeItem<String>("Pictures");
		TreeItem<String> branchItem3 = new TreeItem<String>("Videos");
		
		TreeItem<String> Leafitem1 = new TreeItem<String>("Music1");
		TreeItem<String> Leafitem2 = new TreeItem<String>("Music2");
		TreeItem<String> Leafitem3 = new TreeItem<String>("Pictures1");
		TreeItem<String> Leafitem4 = new TreeItem<String>("Picture2");
		TreeItem<String> Leafitem5 = new TreeItem<String>("Video1");
		TreeItem<String> Leafitem6 = new TreeItem<String>("Video2");
		
		
		branchItem1.getChildren().addAll(Leafitem1,Leafitem2);
		branchItem2.getChildren().addAll(Leafitem3,Leafitem4);
		branchItem3.getChildren().addAll(Leafitem5,Leafitem6);
		
		rootItem.getChildren().addAll(branchItem1, branchItem2,branchItem3);
		
		tree.setRoot(rootItem);
		
		
		
	}
	
	public void selectItem() {
		TreeItem<String> item = tree.getSelectionModel().getSelectedItem();
		
		if(item != null) {
			Platform.runLater(()->Tlabel.setText(item.getValue()));
		}
	}
}
