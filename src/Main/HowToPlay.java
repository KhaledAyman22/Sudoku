package Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HowToPlay {
    private static Stage HowToPlayStage;
    public static Stage getHowToPlayStage() {
        return HowToPlayStage;
    }

    public HowToPlay() throws Exception {
        HowToPlayStage=new Stage();
        HowToPlayStage.initOwner(Game.getGameStage());
        HowToPlayStage.initModality(Modality.WINDOW_MODAL);
        HowToPlayStage.initStyle(StageStyle.UNDECORATED);
        Parent HowToPlay = FXMLLoader.load(getClass().getResource("../Resources/HowToPlay.fxml"));
        HowToPlayStage.setResizable(false);
        HowToPlayStage.setTitle("Sudoku Game");
        HowToPlayStage.setScene(new Scene(HowToPlay));
        HowToPlayStage.show();
    }
}
