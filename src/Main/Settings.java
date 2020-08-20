package Main;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Settings {
    private static Stage SettingsStage;
    public static Stage getSettingsStage() {
        return SettingsStage;
    }

    public Settings() throws Exception {
        SettingsStage=new Stage();
        SettingsStage.getIcons().add(new Image("images/sudoku.png"));
        SettingsStage.initStyle(StageStyle.DECORATED);
        Parent Settings = FXMLLoader.load(getClass().getResource("../Resources/Settings.fxml"));
        SettingsStage.setResizable(false);
        SettingsStage.setTitle("Sudoku Game");
        SettingsStage.setScene(new Scene(Settings));
        SettingsStage.show();
        SettingsStage.setOnCloseRequest(windowEvent -> Main.main.show());
    }
}
