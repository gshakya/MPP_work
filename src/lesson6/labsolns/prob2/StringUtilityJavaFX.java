package lesson6.labsolns.prob2;

import java.util.HashMap;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class StringUtilityJavaFX extends Application {

	final double rem = Font.getDefault().getSize();
	final String WINDOW_TITLE = "String Utility";
	final String COUNT_BUTTON = "Count Letters";
	final String REMOVE_BUTTON = "Remove Duplicates";
	final String REVERSE_BUTTON = "Reverse Letters";
	final String INPUT = "Input";
	final String OUTPUT = "Output";
	
	private VBox leftPanel;
	private VBox rightPanel;
	private TextField input;
	private TextField output;
	private Button countButton;
	private Button reverseButton;
	private Button removeDupButton;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle(WINDOW_TITLE);
		defineLeftPanel();
		defineRightPanel();

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		grid.add(leftPanel, 0, 0);
		grid.add(rightPanel, 1, 0);

		removeDupButton.setOnAction( evt -> {
			clearOutput();
			String inputStr = input.getText();
			HashMap<Character, Character> h = new HashMap<>();
			StringBuffer buf  = new StringBuffer();
			for(int i = 0; i < inputStr.length(); ++i){
				char c = inputStr.charAt(i);
				if(!h.containsKey(c)){
					h.put(c,c);
					buf.append(c);
				}
			}
			output.setText(buf.toString());
			
		});
		
		countButton.setOnAction( ActionEvent -> {
				clearOutput();
				int size = input.getText().length();
				output.setText(""+size);
		});
		
		reverseButton.setOnAction( ActionEvent -> {

			clearOutput();
			String inputStr = input.getText();
			StringBuffer buf = new StringBuffer();
			for(int i = inputStr.length()-1; i >=0 ; --i){
				buf.append(inputStr.charAt(i));
			}
			output.setText(buf.toString());
			
		});
		Scene scene = new Scene(grid, 500, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void defineRightPanel() {
		Label inputLabel = new Label(INPUT);
		Label outputLabel = new Label(OUTPUT);

		rightPanel = new VBox(0.2 * rem);

		input = new TextField();
		output = new TextField();
		
		rightPanel.getChildren().addAll(inputLabel, input, outputLabel, output);
		
	}

	private void defineLeftPanel() {

		leftPanel = new VBox(0.7 * rem);
		countButton = new Button(COUNT_BUTTON);
		countButton.setMinWidth(rem * 10);
		removeDupButton = new Button(REMOVE_BUTTON);
		removeDupButton.setMinWidth(rem * 10);
		reverseButton = new Button(REVERSE_BUTTON);
		reverseButton.setMinWidth(rem * 10);
		leftPanel.getChildren().addAll(countButton, reverseButton, removeDupButton);
	}

	private void clearOutput() {
		output.setText("");
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
