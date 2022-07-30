package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CoursePlannerController {
	Stage applicationStage;
	
	
	 @FXML
	    private ChoiceBox<String> SemesterBox;
	 
	 @FXML
	    private Label userNameLabel;
	 @FXML
	    private Label userIdLabel;


// This part of the code activates when the user clicks the add personal info button, NOT complete, needs to change the label
	 // on the main screen.
    @FXML
    void addInfo(ActionEvent enterInfoEvent) {
    	Scene mainScene = applicationStage.getScene();
    	
    	HBox infoRow = new HBox();
    	Label inputNameLabel = new Label("Enter your name");
    	TextField inputNameTextField = new TextField();
    	Label inputIdLabel = new Label("Enter your UCID");
    	TextField inputIdTextField = new TextField();
    	Button doneButton = new Button("Done");
    	infoRow.getChildren().addAll(inputNameLabel,inputNameTextField,inputIdLabel,inputIdTextField,doneButton);
    	doneButton.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	
    	Scene infoScene = new Scene(infoRow);
    	applicationStage.setScene(infoScene);

    }
    
    
    @FXML
    void addCourse(ActionEvent event) {

    }

    @FXML
    void addTutorial(ActionEvent event) {

    }

}
