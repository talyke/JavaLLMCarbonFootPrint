package src.java.main.com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CarbonFootprintCalculatorGUI extends CarbonFootprintCalculator {
    private TemporalField numWordsField, complexityFactorField, modelSizeFactorField, resultField;

    @Override
    public void start(Stage primaryStage) {
        // Create GUI elements
        Label numWordsLabel = new Label("Number of Words:");
        numWordsField = new TextField();
        Label complexityFactorLabel = new Label("Complexity Factor:");
        complexityFactorField = new TextField();
        Label modelSizeFactorLabel = new Label("Model Size Factor:");
        modelSizeFactorField = new TextField();
        Label resultLabel = new Label("Estimated Carbon Footprint:");
        resultField = new TextField();
        resultField.setEditable(false); // Make the result field non-editable

        // Create a grid pane to organize elements
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add elements to the grid pane
        gridPane.add(numWordsLabel, 0, 0);
        gridPane.add(numWordsField, 1, 0);
        gridPane.add(complexityFactorLabel, 0, 1);
        gridPane.add(complexityFactorField, 1, 1);
        gridPane.add(modelSizeFactorLabel, 0, 2);
        gridPane.add(modelSizeFactorField, 1, 2);
        gridPane.add(resultLabel, 0, 3);
        gridPane.add(resultField, 1, 3);

        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(event -> {
            try {
                int numWords = Integer.parseInt(numWordsField.getText());
                int complexityFactor = Integer.parseInt(complexityFactorField.getText());
                int modelSizeFactor = Integer.parseInt(modelSizeFactorField.getText());

                // Assuming a fixed energy consumption factor (adjust as needed)
                double energyConsumptionFactor = 0.0001;

                double carbonFootprint = numWords * complexityFactor * modelSizeFactor * energyConsumptionFactor;
                resultField.setText(String.format("%.4f units", carbonFootprint));
            } catch (NumberFormatException e) {
                resultField.setText("Invalid input");
            }
        });

        gridPane.add(calculateButton, 1, 4);

        // Create a scene and set it to the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Carbon Footprint Calculator");
        primaryStage.show();
    }
}