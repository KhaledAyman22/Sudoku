package Controllers;
import Main.Main;
import Main.Settings;
import Main.Game;
import Main.HighScores;
import Main.HowToPlay;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label label;
    @FXML
    private Button playbtn;
    @FXML
    private Button hsbtn;
    @FXML
    private Button htpbtn;

    @FXML
    private void PlayPE() {
        playbtn.setTranslateY(4);
    }
    @FXML
    private void PlayRE() {
        playbtn.setTranslateY(0);
    }
    @FXML
    private void HSPE() {
        hsbtn.setTranslateY(4);
    }
    @FXML
    private void HSRE() {
        hsbtn.setTranslateY(0);
    }
    @FXML
    private void OPE() {
        htpbtn.setTranslateY(4);
    }
    @FXML
    private void ORE() {
        htpbtn.setTranslateY(0);
    }
    @FXML
    private void Jump() {
        label.setTranslateY(-5);
    }
    @FXML
    private void Return() {
        label.setTranslateY(0);
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

}
