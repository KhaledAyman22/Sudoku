package Controllers;

import Main.Game;
import Main.HighScores;
import Main.Won;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Timer;

public class WonController {
    public TextField name;
    @FXML
    private Button ok;
    @FXML
    public static Label score;
    @FXML
    public static Label time;
    public static String diff;

    public void okRE() {
        ok.setTranslateY(4);
    }

    public void ok() throws Exception {
        getData();
        new HighScores();
        Won.getWonStageStage().close();
        Game.getGameStage().close();
    }

    public void okPE() {
        ok.setTranslateY(0);
    }

    private void getData() throws FileNotFoundException {
        Formatter f =new Formatter(diff+".txt");
        f.format("%s%s%s",score+" ",name.getText()+" ",time);
        f.close();
    }
}
