package Controllers;
import Main.Main;
import Main.Settings;
import Main.Game;
import Main.HighScores;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private Button playbtn;
    @FXML
    private Button opbtn;
    @FXML
    private Button hsbtn;

    public static boolean Timer=true,MistakeLimit=true,ACMistakes=true,HideUsed=true,HighDup=true,HighArea=true,HighIdentical=true;
    @FXML
    private void PlayPE() {
        playbtn.setTranslateY(4);
    }
    @FXML
    private void PlayRE() {
        playbtn.setTranslateY(0);
    }
    @FXML
    private void OPE() {
        opbtn.setTranslateY(4);
    }
    @FXML
    private void ORE() {
        opbtn.setTranslateY(0);
    }
    @FXML
    private void Jump() {
        label.setTranslateY(-5);
    }
    @FXML
    private void Return() {
        label.setTranslateY(0);
    }
    @FXML
    private void HSPE( ) {
        hsbtn.setTranslateY(0);
    }
    @FXML
    private void HSRE() {
        hsbtn.setTranslateY(0);
    }

    ////////////////
    //TO BE EDITED//
    ////////////////

    @FXML
    private void RedirectToSettings() throws Exception {
        new Settings();
        Main.main.hide();
    }
    @FXML
    private void RedirectToGame() throws Exception {
        new Game();
        Main.main.hide();
    }
    @FXML
    private void RedirectToHS() throws Exception {
        new HighScores();
        Main.main.hide();
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    public void init(boolean Timer,boolean MistakeLimit,boolean ACMistakes,boolean HideUsed, boolean HighDup, boolean HighArea, boolean HighIdentical) {
       MainController.Timer =Timer;
       MainController.MistakeLimit =MistakeLimit;
       MainController.ACMistakes =ACMistakes;
       MainController.HideUsed =HideUsed;
       MainController.HighDup =HighDup;
       MainController.HighArea =HighArea;
       MainController.HighIdentical =HighIdentical;
    }
}
