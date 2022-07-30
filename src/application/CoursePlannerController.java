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
    
    void validCourse(Scene main, TextField courseNameTextfield, TextField courseNumberTextfield) {
    	
    	String courseName = courseNameTextfield.getText();
    	String courseNumber = courseNumberTextfield.getText();
    	
    	if(courseName.length() != 4 || courseNumber.length() != 3) {
    		System.out.println("Invalid Course Information. Make sure Course Name is 4 letters and Course Number is 3 digits.");
    	} 
    	
    	applicationStage.setScene(main);
		
    }
    
    @FXML
    void addCourse(ActionEvent addCourseEvent) {
    	Scene main = applicationStage.getScene();
    	
    	HBox courseContainer = new HBox();
    	Label courseNameLabel = new Label("Enter Course Name");
    	TextField courseNameTextfield = new TextField();
    	
    	Label courseNumberLabel = new Label("Enter Course #");
    	TextField courseNumberTextfield = new TextField();
    	
    	Button done = new Button("Done");
    	done.setOnAction(doneEvent -> validCourse(main, courseNameTextfield, courseNumberTextfield));
    	  	
    	courseContainer.getChildren().addAll(courseNameLabel, courseNameTextfield, courseNumberLabel, courseNumberTextfield, done);
    	Scene addCourseScene = new Scene(courseContainer);
    	applicationStage.setScene(addCourseScene);
    	
       	
    }


    @FXML
    void addTutorial(ActionEvent event) {

    }

}
