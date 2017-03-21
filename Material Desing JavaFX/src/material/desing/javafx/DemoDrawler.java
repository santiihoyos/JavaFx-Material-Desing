package material.desing.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author santiago
 */
public class DemoDrawler extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(ClassLoader.getSystemResource("fxml/FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);

        scene.getStylesheets().add(ClassLoader.getSystemResource("fxml/estilos/material.css").toExternalForm());

        stage.initStyle(StageStyle.UNDECORATED);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
