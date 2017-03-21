package controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

/**
 *
 * @author santiago
 */
public class FXMLDocumentController implements Initializable {

    //<editor-fold defaultstate="collapsed" desc="MEMBERS">
    @FXML
    private Button mButtonActionDrawler;
    
    @FXML
    private VBox mVBoxDrawler;
    
    @FXML
    private Pane mPaneSobra;
    
    @FXML
    private Label mLabelSAlir;
    //</editor-fold>

    //Drawler expandido?
    private boolean expandido = false;

    /**
     *
     * @param event
     */
    @FXML
    private void handleButtonAction(ActionEvent event) {

        TranslateTransition transition = new TranslateTransition(Duration.millis(500), mVBoxDrawler);
        FadeTransition fadeTransition = new FadeTransition(Duration.millis(500), mPaneSobra);
        mPaneSobra.setOpacity(0);

        mPaneSobra.setVisible(true);

        if (expandido) {
            transition.setToX(-258);
            expandido = false;
            fadeTransition.setFromValue(0.2);
            fadeTransition.setToValue(0);
        } else {
            fadeTransition.setFromValue(0);
            fadeTransition.setToValue(0.2);
            transition.setToX(258);
            mVBoxDrawler.requestFocus();
            expandido = true;

        }

        fadeTransition.play();
        transition.play();

        mPaneSobra.setVisible(expandido);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        mPaneSobra.setOnMouseClicked((e) -> handleButtonAction(null));
        mLabelSAlir.setOnMouseClicked((e) -> System.exit(0));

    }

}
