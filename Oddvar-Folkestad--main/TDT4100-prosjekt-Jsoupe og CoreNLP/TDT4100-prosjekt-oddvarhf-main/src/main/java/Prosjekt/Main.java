package Prosjekt;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent Root = FXMLLoader.load(getClass().getResource("app.fxml"));
        primaryStage.setTitle("Hello verden");
        primaryStage.setScene(new Scene(Root));
        primaryStage.show();
    }

}