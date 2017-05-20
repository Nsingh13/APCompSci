package Assignment35;

import java.text.DecimalFormat;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
		primaryStage.setTitle("Assignment 35");

		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10)); // Insets(top, right,
														// bottom, left)
		pane.setHgap(10);
		pane.setVgap(10);

		final int FOOD = 0;
		final int DRINKS = 1;
		final int SUBTOTAL = 2;
		final int TAX = 3;
		final int TOTAL = 4;

		final double TAX_RATE = .0875;

		TextField[] textBox = new TextField[5];
		Label[] label = new Label[5];

		// Food
		label[FOOD] = new Label("Food:");
		textBox[FOOD] = new TextField();

		label[DRINKS] = new Label("Drinks:");
		textBox[DRINKS] = new TextField();

		label[SUBTOTAL] = new Label("Subtotal:");
		textBox[SUBTOTAL] = new TextField();

		label[TAX] = new Label("Tax:");
		textBox[TAX] = new TextField();

		label[TOTAL] = new Label("Total:");
		textBox[TOTAL] = new TextField();

		for (int i = 0; i < 5; i++) {
			label[i].setFont(Font.font("Times New Roman", FontPosture.REGULAR, 20));
			label[i].setTextFill(Color.RED);
			pane.add(label[i], 0, i);
			pane.add(textBox[i], 1, i);
		}

		Button calculateButton = new Button("Calculate");
		pane.add(calculateButton, 0, 5);
		calculateButton.setOnAction(e -> {
			double foodValue = round(textBox[FOOD].getText());
			double drinksValue = round(textBox[DRINKS].getText());
			double sum = round(String.valueOf(foodValue + drinksValue));
			double tax = round(String.valueOf(sum * TAX_RATE));

			textBox[FOOD].setText(String.valueOf(foodValue));
			textBox[DRINKS].setText(String.valueOf(drinksValue));
			textBox[SUBTOTAL].setText(String.valueOf(sum));
			textBox[TAX].setText(String.valueOf(tax));
			textBox[TOTAL].setText(String.valueOf(tax + sum));

		});

		Scene scene = new Scene(pane, 300, 250); // Scene is the container for
													// all content
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public double round(String text) {

		if (text.matches("-?\\d+(\\.\\d+)?")) {
			double num = Double.valueOf(text);
			DecimalFormat fin = new DecimalFormat("#.##");
			String rounded = fin.format(num);
			return Double.valueOf(rounded);
		} else {
			return 0.00;
		}

	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
