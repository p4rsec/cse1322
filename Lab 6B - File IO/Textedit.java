import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.*;
import java.io.*;
import java.util.*;


public class Textedit extends Application  {
	@Override
	 public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Textedit");
	
		TextArea textArea = new TextArea();
		textArea.setPrefWidth(100);
		Button button = new Button("Save");
		button.setMinWidth(50);
		Button button2 = new Button("Load");
		button2.setMinWidth(50);
	
		button.setOnAction(
			action -> {
				System.out.println(textArea.getText());
				textArea.setText("Clicked!");
				try{
					File file = new File("test.txt");
				
				//Create the file
					if (file.createNewFile()){
						System.out.println("File created successfully.");
					}
					else{
						System.out.println("This file already exists.");
					}
				
				//Write Content
					FileWriter writer = new FileWriter(file);
					writer.write("The quick brown fox jumped over the lazy dog.");
					writer.close();
				}
				catch(Exception e){
					System.out.println("Error occured");
				}
			
			
			});
		button2.setOnAction(
			action -> {
				File f = new File("test.txt");
				StringBuilder sb = new StringBuilder();
			
				try( Scanner input = new Scanner(f)) {
				// Read text from the file
					while (input.hasNext()) {
						sb.append(input.nextLine());
					}
					textArea.setText(sb.toString());
				
				} catch (FileNotFoundException fe) {
					fe.printStackTrace();
				}
			});
		HBox hb = new HBox(button, button2);
		hb.setPadding(new Insets(10, 10, 10, 10));
		hb.setSpacing(10);
		VBox vb = new VBox(textArea, hb);
		vb.setPadding(new Insets(10, 50, 50, 50));
		vb.setSpacing(10);
		Scene scene = new Scene(vb, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

