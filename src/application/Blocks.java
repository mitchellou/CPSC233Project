package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;


import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Blocks {
	Stage applicationStage;
	
	
	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private GridPane grid;
	
	@FXML 
	private Rectangle monday10Am;
	

	
	
	public void initialize(URL url, ResourceBundle resourceBundle)  {
		
		//Scene main = applicationStage.getScene();
//		
//		Label label = new Label("A");
//	
//		grid.add(label,0, 0, 1,1);
//		grid.setStyle("fx-background-color: red ;"  );
//		
//		applicationStage.setScene(mainScene);
//		GridPane grid = new GridPane();
//
//		grid.setGridLinesVisible(true);
//
//		Group group = new Group();
//		
//		Rectangle rect = new Rectangle(20,20, Color.BLACK);
//		rect.setStroke(Color.BLACK);
//		grid.add(rect, 0, 0);
		monday10Am.setVisible(false);

		
		//applicationStage.setScene(main);
		
		
	}



		
	}
	
	
	
	


