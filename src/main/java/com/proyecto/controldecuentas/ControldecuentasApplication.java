package com.proyecto.controldecuentas;

import java.io.IOException;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@SpringBootApplication
public class ControldecuentasApplication extends Application{

	private static Scene scene;
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) throws Exception {
		scene = new Scene(loadFXML("PantallaLista"), 640, 480);
		stage.setScene(scene);
		stage.show();
	}

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ControldecuentasApplication.class.getResource("/FXML/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }
}
