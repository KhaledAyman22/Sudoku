package Main;

import Controllers.MainController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.stage.Stage;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class Main extends Application {
    public static Stage main;
    private static MediaPlayer MP;
    @Override
    public void start(Stage MainStage) throws Exception{
        Parent Main = FXMLLoader.load(getClass().getResource("../Resources/Main.fxml"));
        MainStage.getIcons().add(new Image("images/sudoku.png"));
        MainStage.setResizable(false);
        MainStage.setTitle("Sudoku Game");
        MainStage.setScene(new Scene(Main));
        MainStage.show();
        main=MainStage;
        Media BG = new Media(new File("BG.mp3").toURI().toString());
        MP = new MediaPlayer(BG);
        MP.setAutoPlay(true);
        MainStage.setOnCloseRequest(event -> Platform.exit());
    }
    public static void main(String[] args) {
        launch(args);
    }
}
