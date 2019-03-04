package stringGUI;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.Pos;
import javafx.stage.*;

public class StringGUI extends Application implements EventHandler<ActionEvent>
{
	//Declare global elements of the window
	TextField text1, text2;
	Button one;
	Label label;

	@Override
	public void start(Stage stage) throws Exception
	{
		text1 = new TextField("");
		text2 = new TextField("");
		label = new Label();

		one = new Button("Sum");

		//Event handlers

		GridPane pane = new GridPane();
		HBox text = new HBox();
		VBox box = new VBox();
		pane.setAlignment(Pos.CENTER);


		pane.add(text1,0,2);
		pane.add(text2,1,2);
		pane.add(label,1,1);
		pane.add(one, 0,3);


		box.getChildren().addAll(text,pane);
		one.setOnAction(this);
		//Create a stage
		Scene scene = new Scene(box,150,150);
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void handle(ActionEvent e) {

		int i = Integer.parseInt(text1.getText());
		int j = Integer.parseInt(text2.getText());
		int z = i+j;
		String sum = Integer.toString(z);
		label.setText(sum);
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}