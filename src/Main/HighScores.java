package Main;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class HighScores{
    private static Stage HighScoresStage;
    public static Stage getHighScoresStage() {
        return HighScoresStage;
    }

    public HighScores() throws Exception {
        HighScoresStage= new Stage();
        HighScoresStage.getIcons().add(new Image("images/sudoku.png"));
        HighScoresStage.initStyle(StageStyle.UNDECORATED);
        Parent highScores = FXMLLoader.load(getClass().getResource("../Resources/HighScores.fxml"));
        HighScoresStage.setResizable(false);
        HighScoresStage.setTitle("Sudoku Game");
        HighScoresStage.setScene(new Scene(highScores));
        HighScoresStage.show();
    }
}
