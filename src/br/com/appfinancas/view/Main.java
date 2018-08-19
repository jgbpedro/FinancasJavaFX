package br.com.appfinancas.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {

		ScreenManager janela = new ScreenManager();

		janela.openScreen(primaryStage, "MainScreen.fxml");

	}

	public static void main(String[] args) {
		launch(args);
	}
}
