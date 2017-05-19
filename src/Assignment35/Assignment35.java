package Assignment35;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.stage.Stage;

public class Assignment35 extends Application {
	@Override
	public void start(Stage primaryStage) // Stage is the top-level JavaFX
											// container (window)
	{
		primaryStage.setTitle("Buttons and Labels");
		// StackPane pane = new StackPane(); // Root node for all objects
		// (buttons, labels, etc.) in this resizeable layout

		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10)); // Insets(top, right,
														// bottom, left)
		pane.setHgap(10);
		pane.setVgap(10);

		TextField num = new TextField();
		pane.add(num, 1, 0);

		Label text1 = new Label("Food:");
		text1.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
		text1.setTextFill(Color.RED);
		pane.add(text1, 0, 0);

		TextField num2 = new TextField();
		pane.add(num2, 1, 1);

		Label text2 = new Label("Drinks:");
		text2.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
		text2.setTextFill(Color.RED);
		pane.add(text2, 0, 1);

		TextField num3 = new TextField();
		pane.add(num3, 1, 2);

		Label text3 = new Label("Subtotal:");
		text3.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
		text3.setTextFill(Color.RED);
		pane.add(text3, 0, 2);

		TextField num4 = new TextField();
		pane.add(num4, 1, 3);

		Label text4 = new Label("Tax:");
		text4.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
		text4.setTextFill(Color.RED);
		pane.add(text4, 0, 3);

		TextField num5 = new TextField();
		pane.add(num5, 1, 4);

		Label text5 = new Label("Total:");
		text5.setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
		text5.setTextFill(Color.RED);
		pane.add(text5, 0, 4);

		// okBtn.setOnAction(e -> num.setText("Clicked"));

		Scene scene = new Scene(pane, 300, 250); // Scene is the container for
													// all content
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
