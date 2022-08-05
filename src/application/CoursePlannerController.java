package application;

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
		private Label eightAm;
	 
	 

	 
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
    	
 
    void validCourse(Scene main, TextField courseNameTextfield, TextField courseNumberTextfield, TextField courseStartTimeTextfield, TextField courseEndTimeTextfield) {
    	
    	String courseName = courseNameTextfield.getText();
    	String courseNumber = courseNumberTextfield.getText();
    	
    	if(courseName.length() != 4 || courseNumber.length() != 3) {
    		System.out.println("Invalid Course Information. Make sure Course Name is 4 letters and Course Number is 3 digits." );
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
    	
    	//VBox courseContainers = new VBox(10);
    	Label courseStartTimeLabel = new Label("From");
    	TextField courseStartTimeTextfield = new TextField();
    	
    	Label courseEndTimeLabel = new Label("to");
    	TextField courseEndTimeTextfield = new TextField();
    	
    	Label courseDayLabel = new Label("on");
    	TextField courseDayTextfield = new TextField();
//    	ChoiceBox<String> choiceBox = new ChoiceBox<>();
//    	
//    	choiceBox.getItems().add("MWF");
//    	choiceBox.getItems().add("TTh");
    	
    	   	
    	Button done = new Button("Done");
    	done.setOnAction(doneEvent -> validCourse(main, courseNameTextfield, courseNumberTextfield, courseStartTimeTextfield, courseEndTimeTextfield ));
  
    	String courseDay = courseDayTextfield.getText();
    	String threeDays = "MWF"; 
    	
    	
    	String courseStart = (courseStartTimeLabel.getText());
    	
    	
    		if (courseDay.contains(threeDays)) {
    		if(courseStart == "8")
    			monday8.setVisible(true);
    		}	
 
    	 
    	courseContainer.getChildren().addAll(courseNameLabel, courseNameTextfield, courseNumberLabel, courseNumberTextfield, 
    	courseStartTimeLabel, courseStartTimeTextfield, courseEndTimeLabel, courseEndTimeTextfield, courseDayLabel, courseDayTextfield,  done);
    	Scene addCourseScene = new Scene(courseContainer);
    	applicationStage.setScene(addCourseScene);
    	
    	//System.out.println("Name: " + courseNameLabel + "UCID: " + courseNumberLabel);
       	
    }


    @FXML
    void addTutorial(ActionEvent event) {
    	
    	

    }  
   

}
