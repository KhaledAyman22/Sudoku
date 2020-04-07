package Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Won {
    private static Stage WonStage;
    public static Stage getWonStageStage() {
        return WonStage;
    }

    public Won() throws Exception {
        WonStage=new Stage();
        WonStage.initOwner(Game.getGameStage());
        WonStage.initModality(Modality.WINDOW_MODAL);
        WonStage.initStyle(StageStyle.UNDECORATED);
        Parent HowToPlay = FXMLLoader.load(getClass().getResource("../Resources/Won.fxml"));
        WonStage.setResizable(false);
        WonStage.setTitle("Sudoku Game");
        WonStage.setScene(new Scene(HowToPlay));
        WonStage.show();
    }
}
