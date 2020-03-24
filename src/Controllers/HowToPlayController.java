package Controllers;

import Main.Game;
import Main.HowToPlay;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HowToPlayController {

    @FXML
    private Button backbtn;
    @FXML
    private void BackPE() {
        backbtn.setTranslateY(2);
    }
    @FXML
    private void BackRE() {
        backbtn.setTranslateY(0);
    }

    ////////////////
    //TO BE EDITED//
    ////////////////

    @FXML
    private void RedirectToGame() {
        //DONT forget to pause the timer if is on "option turned on by player"
        HowToPlay.getHowToPlayStage().close();
        Game.getGameStage().setOpacity(1);
        GameController.PauseTimer();
    }
}
