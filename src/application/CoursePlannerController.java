package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CoursePlannerController {
	Stage applicationStage;
	
	
	 @FXML
	    private ChoiceBox<String> SemesterBox;
	 
	 @FXML
	    private Label userNameLabel;
	 @FXML
	    private Label userIdLabel;
	 
	 @FXML
	 	private Label courseNameLabel;
	 
	 @FXML
	 	private Label studentNameLabel;
	 
	 @FXML
		private GridPane grid;
		
	 @FXML 
		private Rectangle monday8;
	 @FXML 
		private Rectangle monday9;
	 @FXML 
		private Rectangle monday10;
	 @FXML 
		private Rectangle monday11;
	 @FXML 
		private Rectangle monday12;
	 @FXML 
		private Rectangle monday1;
	 @FXML 
		private Rectangle monday2;
	 @FXML 
		private Rectangle monday3;
	 @FXML 
		private Rectangle monday4;
	 @FXML 
		private Rectangle monday5;
	 @FXML 
		private Rectangle monday6;
	 @FXML 
		private Rectangle wednesday8;
	 @FXML 
		private Label monday8Label;
	 @FXML
	 	private Label monday9Label;
	 
	 

	 
// This part of the code activates when the user clicks the add personal info button, NOT complete, needs to change the label
	 // on the main screen.
	 
	 void displayInfo(Scene mainScene, TextField inputNameTextField, TextField inputIdTextField ){
	    	
	    	String nameEntered = inputNameTextField.getText();
	    	
	    	System.out.println(nameEntered);
	    	
	    	studentNameLabel.setText((String.format("Your overall course grade" + nameEntered)));
	   
	    	applicationStage.setScene(mainScene);
	    	
	    }
	 
	 
	 
	 	 
	 
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
    	
 
    void validCourse(Scene main, TextField courseNameTextfield, TextField courseNumberTextfield, ChoiceBox<Integer> courseStartTimeChoiceBox, ChoiceBox<String> courseDayChoiceBox) {
    	
    	String courseName = courseNameTextfield.getText();
    	String courseNumber = courseNumberTextfield.getText();
    	int courseStart = courseStartTimeChoiceBox.getValue();
    	String courseDay = courseDayChoiceBox.getValue();
    	
    	if(courseName.length() != 4 || courseNumber.length() != 3) {
    		System.out.println("Invalid Course Information. Make sure Course Name is 4 letters and Course Number is 3 digits." );
    	} 
    	
    	
    	if(courseDay == "MWF") {
    		switch (courseStart) {
    		case 8:
    			monday8Label.setText(courseName + courseNumber);
    			
    			
    			break;
    		case 9:
    			monday9Label.setText(courseName + courseNumber);
    			break;
    		}
    	}
    	
    	
    	
    	 
    	applicationStage.setScene(main);
		
    }
    
    @FXML
    void addCourse(ActionEvent addCourseEvent) {
    	Scene main = applicationStage.getScene();
    	
    	HBox courseContainer = new HBox(10);
    	courseContainer.setPadding(new Insets (20,20,20,20));
    	Label courseNameLabel = new Label("Enter Course Name");
    	TextField courseNameTextfield = new TextField();
    	
    	Label courseNumberLabel = new Label("Enter Course #");
    	TextField courseNumberTextfield = new TextField();
    	
    	Label courseStartTimeLabel = new Label("Start Time");
    	ChoiceBox<Integer> courseStartTimeChoiceBox = new ChoiceBox();
    	courseStartTimeChoiceBox.getItems().addAll(8, 9, 10, 11, 12, 1, 2, 3, 4, 5, 6);
    	courseStartTimeChoiceBox.getSelectionModel().clearSelection();
    	    	
    	Label courseDayLabel = new Label("on");
    	
    	ChoiceBox<String> courseDayChoiceBox = new ChoiceBox();
   	
    	courseDayChoiceBox.getItems().addAll("MWF", "TTh");
    	 	
    	Button done = new Button("Done");
    	done.setOnAction(doneEvent -> validCourse(main, courseNameTextfield, courseNumberTextfield, courseStartTimeChoiceBox, courseDayChoiceBox));
    	   	 
    	courseContainer.getChildren().addAll(courseNameLabel, courseNameTextfield, courseNumberLabel, courseNumberTextfield, 
    	courseStartTimeLabel, courseStartTimeChoiceBox, courseDayLabel, courseDayChoiceBox,  done);
    	Scene addCourseScene = new Scene(courseContainer);
    	applicationStage.setScene(addCourseScene);
    	       	
    }


    @FXML
    void addTutorial(ActionEvent event) {
    	
    	

    }  
   

}
