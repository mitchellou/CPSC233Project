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
		private Label totalTimeLabel; 
	 @FXML
	    private ChoiceBox<String> SemesterBox;
	 
	 @FXML
	    private Label userNameLabel;
	 @FXML
	    private Label userIdLabel;
	 
	 @FXML
	 	private Label courseNameLabel; 
	 @FXML
		private GridPane grid;
	 @FXML 
		private Label monday8Label;
	 @FXML
	 	private Label monday9Label;
	 @FXML
	 	private Label monday10Label;
	 @FXML
	 	private Label monday11Label;
	 @FXML
	 	private Label monday12Label;
	 @FXML
	 	private Label monday1Label;
	 @FXML
	 	private Label monday2Label;
	 @FXML
	 	private Label monday3Label;
	 @FXML
	 	private Label monday4Label;
	 @FXML
	 	private Label monday5Label;
	 @FXML
	 	private Label monday6Label;
	 @FXML
	 	private Label tuesday8Label;
	 @FXML
	 	private Label tuesday9Label;
	 @FXML
	 	private Label tuesday10Label;
	 @FXML
	 	private Label tuesday11Label;
	 @FXML
	 	private Label tuesday12Label;
	 @FXML
	 	private Label tuesday1Label;
	 @FXML
	 	private Label tuesday2Label;
	 @FXML
	 	private Label tuesday3Label;
	 @FXML
	 	private Label tuesday4Label;
	 @FXML
	 	private Label tuesday5Label;
	 @FXML
	 	private Label tuesday6Label;
	 @FXML
	 	private Label wednesday8Label;
	 @FXML
	 	private Label wednesday9Label;
	 @FXML
	 	private Label wednesday10Label;
	 @FXML
	 	private Label wednesday11Label;
	 @FXML
	 	private Label wednesday12Label;
	 @FXML
	 	private Label wednesday1Label;
	 @FXML
	 	private Label wednesday2Label;
	 @FXML
	 	private Label wednesday3Label;
	 @FXML
	 	private Label wednesday4Label;
	 @FXML
	 	private Label wednesday5Label;
	 @FXML
	 	private Label wednesday6Label;
	 @FXML
	 	private Label thursday8Label;
	 @FXML
	 	private Label thursday9Label;
	 @FXML
	 	private Label thursday10Label;
	 @FXML
	 	private Label thursday11Label;
	 @FXML
	 	private Label thursday12Label;
	 @FXML
	 	private Label thursday1Label;
	 @FXML
	 	private Label thursday2Label;
	 @FXML
	 	private Label thursday3Label;
	 @FXML
	 	private Label thursday4Label;
	 @FXML
	 	private Label thursday5Label;
	 @FXML
	 	private Label thursday6Label;
	 @FXML
	 	private Label friday8Label;
	 @FXML
	 	private Label friday9Label;
	 @FXML
	 	private Label friday10Label;
	 @FXML
	 	private Label friday11Label;
	 @FXML
	 	private Label friday12Label;
	 @FXML
	 	private Label friday1Label;
	 @FXML
	 	private Label friday2Label;
	 @FXML
	 	private Label friday3Label;
	 @FXML
	 	private Label friday4Label;
	 @FXML
	 	private Label friday5Label;
	 @FXML
	 	private Label friday6Label;
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
	 	private Rectangle tuesday8;
	 @FXML 
	 	private Rectangle tuesday9;
	 @FXML 
	 	private Rectangle tuesday10;
	 @FXML 
	 	private Rectangle tuesday11;
	 @FXML 
	 	private Rectangle tuesday12;
	 @FXML 
	 	private Rectangle tuesday1;
	 @FXML 
	 	private Rectangle tuesday2;
	 @FXML 
	 	private Rectangle tuesday3;
	 @FXML 
	 	private Rectangle tuesday4;
	 @FXML 
	 	private Rectangle tuesday5;
	 @FXML 
	 	private Rectangle tuesday6;
	 @FXML 
	 	private Rectangle wednesday8;
	 @FXML 
	 	private Rectangle wednesday9;
	 @FXML 
	 	private Rectangle wednesday10;
	 @FXML 
	 	private Rectangle wednesday11;
	 @FXML 
	 	private Rectangle wednesday12;
	 @FXML 
	 	private Rectangle wednesday1;
	 @FXML 
	 	private Rectangle wednesday2;
	 @FXML 
	 	private Rectangle wednesday3;
	 @FXML 
	 	private Rectangle wednesday4;
	 @FXML 
	 	private Rectangle wednesday5;
	 @FXML 
	 	private Rectangle wednesday6;
	 @FXML 
	 	private Rectangle thursday8;
	 @FXML 
	 	private Rectangle thursday9;
	 @FXML 
	 	private Rectangle thursday10;
	 @FXML 
	 	private Rectangle thursday11;
	 @FXML 
	 	private Rectangle thursday12;
	 @FXML 
	 	private Rectangle thursday1;
	 @FXML 
	 	private Rectangle thursday2;
	 @FXML 
	 	private Rectangle thursday3;
	 @FXML 
	 	private Rectangle thursday4;
	 @FXML 
	 	private Rectangle thursday5;
	 @FXML 
	 	private Rectangle thursday6;
	 @FXML 
	 	private Rectangle friday8;
	 @FXML 
	 	private Rectangle friday9;
	 @FXML 
	 	private Rectangle friday10;
	 @FXML 
	 	private Rectangle friday11;
	 @FXML 
	 	private Rectangle friday12;
	 @FXML 
	 	private Rectangle friday1;
	 @FXML 
	 	private Rectangle friday2;
	 @FXML 
	 	private Rectangle friday3;
	 @FXML 
	 	private Rectangle friday4;
	 @FXML 
	 	private Rectangle friday5;
	 @FXML 
	 	private Rectangle friday6;
	 @FXML 
	 	private Label studentNameLabel;
	 @FXML 
	 	private Label studentNumberLabel;
	 
	 
	
// This part of the code activates when the user clicks the add personal info button, NOT complete, needs to change the label
	 // on the main screen.
	 
	 void displayInfo(Scene main, TextField inputNameTextField, TextField inputIdTextField ){
	    	
	    	String nameEntered = inputNameTextField.getText();
	    	String numberEntered = inputIdTextField.getText();
	    	
	    	studentNameLabel.setText(nameEntered);
	    	studentNumberLabel.setText(numberEntered);
	     
	    	applicationStage.setScene(main);
	    	
	    }
	 
	 
    @FXML
    void addInfo(ActionEvent enterInfoEvent) {
    	Scene mainScene = applicationStage.getScene();
    	
    	HBox infoRow = new HBox(10);
    	infoRow.setPadding(new Insets (20,20,20,20));
    	Label inputNameLabel = new Label("Enter your name");
    	TextField inputNameTextField = new TextField();
    	
    	Label inputIdLabel = new Label("Enter your UCID");
    	TextField inputIdTextField = new TextField();
    	
    	Button doneButton = new Button("Done");
    	infoRow.getChildren().addAll(inputNameLabel,inputNameTextField,inputIdLabel,inputIdTextField,doneButton);
    	doneButton.setOnAction(doneEvent -> displayInfo(mainScene, inputNameTextField, inputIdTextField));
    	
    	applicationStage.setScene(mainScene);
    	
 	
    	Scene infoScene = new Scene(infoRow);
    	applicationStage.setScene(infoScene);
    
    		
    	}
    	
    int totalTime = 0;
 
    
    
    void validCourse(Scene main, TextField courseNameTextfield, TextField courseNumberTextfield, ChoiceBox<Integer> courseStartTimeChoiceBox, ChoiceBox<String> courseDayChoiceBox, Label errorLabel) {
    	
    	Course courseEntered = new Course(courseNameTextfield.getText(), courseNumberTextfield.getText(), courseStartTimeChoiceBox.getValue(), courseDayChoiceBox.getValue());  	
    	
    	String courseName = courseNameTextfield.getText();
    	String courseNumber = courseNumberTextfield.getText();
    	int courseStart = courseStartTimeChoiceBox.getValue();
    	String courseDay = courseDayChoiceBox.getValue();
    	    	
    	if(courseName.length() != 4 || courseNumber.length() != 3) {
    		errorLabel.setText("Invalid Course Name or Number." + "\nCourse name should be 4 letters" + "\nCourse number should be 3 digits.");
    	} else if(courseDay == "MWF") {
    		totalTime += courseEntered.getTotalCourseTime();
        	totalTimeLabel.setText("Total Course Time for the week is " + totalTime + " hours");
    		switch (courseStart) {
    		case 8:
    			monday8Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday8Label.setText(courseName.toUpperCase() + courseNumber);
    			friday8Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday8.setVisible(true);
    			wednesday8.setVisible(true);
    			friday8.setVisible(true);
    			break;
    		case 9:
    			monday9Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday9Label.setText(courseName.toUpperCase() + courseNumber);
    			friday9Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday9.setVisible(true);
    			wednesday9.setVisible(true);
    			friday9.setVisible(true);
    			break;
    		case 10:
    			monday10Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday10Label.setText(courseName.toUpperCase() + courseNumber);
    			friday10Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday10.setVisible(true);
    			wednesday10.setVisible(true);
    			friday10.setVisible(true);
    			break;
    		case 11:
    			monday11Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday11Label.setText(courseName.toUpperCase() + courseNumber);
    			friday11Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday11.setVisible(true);
    			wednesday11.setVisible(true);
    			friday11.setVisible(true);
    			break;
    		case 12:
    			monday12Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday12Label.setText(courseName.toUpperCase() + courseNumber);
    			friday12Label.setText(courseName.toUpperCase()+ courseNumber);
    			
    			monday12.setVisible(true);
    			wednesday12.setVisible(true);
    			friday12.setVisible(true);
    			break;
    		case 1:
    			monday1Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday1Label.setText(courseName.toUpperCase() + courseNumber);
    			friday1Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday1.setVisible(true);
    			wednesday1.setVisible(true);
    			friday1.setVisible(true);
    			break;
    		case 2:
    			monday2Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday2Label.setText(courseName.toUpperCase() + courseNumber);
    			friday2Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday2.setVisible(true);
    			wednesday2.setVisible(true);
    			friday2.setVisible(true);
    			break;
    		case 3:
    			monday3Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday3Label.setText(courseName.toUpperCase() + courseNumber);
    			friday3Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday3.setVisible(true);
    			wednesday3.setVisible(true);
    			friday3.setVisible(true);
    			break;
    		case 4:
    			monday4Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday4Label.setText(courseName.toUpperCase() + courseNumber);
    			friday4Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday4.setVisible(true);
    			wednesday4.setVisible(true);
    			friday4.setVisible(true);
    			break;
    		case 5:
    			monday5Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday5Label.setText(courseName.toUpperCase() + courseNumber);
    			friday5Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday5.setVisible(true);
    			wednesday5.setVisible(true);
    			friday5.setVisible(true);
    			break;
    		case 6:
    			monday6Label.setText(courseName.toUpperCase() + courseNumber);
    			wednesday6Label.setText(courseName.toUpperCase() + courseNumber);
    			friday6Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			monday6.setVisible(true);
    			wednesday6.setVisible(true);
    			friday6.setVisible(true);
    			break;
    		}
    		applicationStage.setScene(main);
    	} else {
    		totalTime += courseEntered.getTotalCourseTime();
        	totalTimeLabel.setText("Total Course Time for the week is " + totalTime + " hours");
    		switch(courseStart) {
    		case 8:
    			tuesday8Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday8Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday8.setVisible(true);
    			thursday8.setVisible(true);
    			break;
    		case 9:
    			tuesday9Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday9Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday9.setVisible(true);
    			thursday9.setVisible(true);
    			break;
    		case 10:
    			tuesday10Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday10Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday10.setVisible(true);
    			thursday10.setVisible(true);
    			break;
    		case 11:
    			tuesday11Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday11Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday11.setVisible(true);
    			thursday11.setVisible(true);
    			break;
    		case 12:
    			tuesday12Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday12Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday12.setVisible(true);
    			thursday12.setVisible(true);
    			break;
    		case 1:
    			tuesday1Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday1Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday1.setVisible(true);
    			thursday1.setVisible(true);
    			break;
    		case 2:
    			tuesday2Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday2Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday2.setVisible(true);
    			thursday2.setVisible(true);
    			break;
    		case 3:
    			tuesday3Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday3Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday3.setVisible(true);
    			thursday3.setVisible(true);
    			break;
    		case 4:
    			tuesday4Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday4Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday4.setVisible(true);
    			thursday4.setVisible(true);
    			break;
    		case 5:
    			tuesday5Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday5Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday5.setVisible(true);
    			thursday5.setVisible(true);
    			break;
    		case 6:
    			tuesday6Label.setText(courseName.toUpperCase() + courseNumber);
    			thursday6Label.setText(courseName.toUpperCase() + courseNumber);
    			
    			tuesday6.setVisible(true);
    			thursday6.setVisible(true);
    			break;
    			
    		}
    		applicationStage.setScene(main);
    	}
    	
    	 
    	
		
    }
    
    @FXML
    void addCourse(ActionEvent addCourseEvent) {
    	Scene main = applicationStage.getScene();
    	
    	VBox courseContainer = new VBox(10);
    	courseContainer.setPrefHeight(360);
    	courseContainer.setPrefWidth(250);
    	courseContainer.setPadding(new Insets (10,10,10,10));
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
    	
    	Label errorLabel = new Label("");
    	errorLabel.setTextFill(Color.RED);
    	
    	courseDayChoiceBox.getItems().addAll("MWF", "TTh");
    	
    	 	
    	Button done = new Button("Done");
    	done.setOnAction(doneEvent -> validCourse(main, courseNameTextfield, courseNumberTextfield, courseStartTimeChoiceBox, courseDayChoiceBox, errorLabel));
    	   	 
    	courseContainer.getChildren().addAll(courseNameLabel, courseNameTextfield, courseNumberLabel, courseNumberTextfield, 
    	courseStartTimeLabel, courseStartTimeChoiceBox, courseDayLabel, courseDayChoiceBox, done, errorLabel);
    	
    	Scene addCourseScene = new Scene(courseContainer);
    	applicationStage.setScene(addCourseScene);
    	       	
    }


    @FXML
    void addTutorial(ActionEvent event) {
    	
    	

    }  
   

}
