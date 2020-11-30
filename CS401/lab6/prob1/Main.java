import java.net.URL;
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        URL url = new File("addressForm.xml").toURI().toURL();
        Parent root = FXMLLoader.load( url );

        primaryStage.setTitle("Address Form");
        primaryStage.setScene(new Scene(root, 500, 250));
        primaryStage.show();
    }

}