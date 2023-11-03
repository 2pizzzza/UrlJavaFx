package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.awt.Desktop;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private void openURL(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onOpenURLButtonClick() {
        String url = "https://google.com"; // Замените на желаемый URL
        openURL(url);
    }
}