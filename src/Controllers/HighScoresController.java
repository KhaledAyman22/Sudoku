package Controllers;

import Main.HighScores;
import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class HighScoresController {
    @FXML
    private Button backbtn;
    @FXML
    private Button Easy;
    @FXML
    private Button Medium;
    @FXML
    private Button Hard;

    @FXML
    private void BackPE() {
        backbtn.setTranslateY(2);
    }
    @FXML
    private void BackRE() {
        backbtn.setTranslateY(0);
    }
    @FXML
    private void EPE() {
        Easy.setTranslateY(4);
    }
    @FXML
    private void ERE() {
        Easy.setTranslateY(0);
    }
    @FXML
    private void MPE() {
        Medium.setTranslateY(4);
    }
    @FXML
    private void MRE() {
        Medium.setTranslateY(0);
    }
    @FXML
    private void HPE() {
        Hard.setTranslateY(4);
    }
    @FXML
    private void HRE() {
        Hard.setTranslateY(0);
    }

    ////////////////
    //TO BE EDITED//
    ////////////////
    
    @FXML
    private void RedirectToHome() {
        HighScores.getHighScoresStage().close();
        Main.main.show();
    }
    @FXML
    private void Hard() {
        //hard hs
    }
    @FXML
    private void Medium() {
        //medium hs
    }
    @FXML
    private void Easy() {
        //easy hs
    }
}
