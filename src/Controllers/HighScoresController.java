package Controllers;

import Main.HighScores;
import Main.Main;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class HighScoresController {
    //VARS
    public GridPane grid;
    @FXML
    private Button backbtn;
    @FXML
    private Button Easy;
    @FXML
    private Button Medium;
    @FXML
    private Button Hard;

    //EFFECTS
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
        setShadow1(Easy);
        setShadow2(Hard);
        setShadow2(Medium);
    }
    @FXML
    private void MPE() {
        Medium.setTranslateY(4);
    }
    @FXML
    private void MRE() {
        Medium.setTranslateY(0);
        setShadow2(Easy);
        setShadow2(Hard);
        setShadow1(Medium);
    }
    @FXML
    private void HPE() {
        Hard.setTranslateY(4);
    }
    @FXML
    private void HRE() {
        Hard.setTranslateY(0);
        setShadow2(Easy);
        setShadow1(Hard);
        setShadow2(Medium);
    }

    private void setShadow1(Button x) {
        DropShadow dropShadow=new DropShadow();
        dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
        dropShadow.setRadius(7.46);
        dropShadow.setOffsetX(0.0);
        dropShadow.setOffsetY(8.0);
        dropShadow.setSpread(0.08);
        dropShadow.setWidth(16.23);
        dropShadow.setHeight(15.62);
        dropShadow.setColor(Color.rgb(30,99,204));
        x.setEffect(dropShadow);
    }

    private void setShadow2(Button x) {
        DropShadow dropShadow=new DropShadow();
        dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
        dropShadow.setRadius(7.46);
        dropShadow.setOffsetX(0.0);
        dropShadow.setOffsetY(8.0);
        dropShadow.setSpread(0.08);
        dropShadow.setWidth(16.23);
        dropShadow.setHeight(15.62);
        dropShadow.setColor(Color.rgb(3,179,203));
        x.setEffect(dropShadow);
    }


    private void GetData(String s) throws FileNotFoundException {
        grid.getChildren().clear();
        Scanner S=new Scanner(new File(s));
        SortedMap<Integer, Pair<String,String>> records = new TreeMap<>(Collections.reverseOrder());
        while(S.hasNext())
        {
            String line=S.nextLine();
            String[] data;
            data=line.split("--");
            Pair<String, String>p=new Pair<>(data[1],data[2]);
            records.put(Integer.parseInt(data[0]),p);
        }

        int j=0;
        for (int rec : records.keySet()) {

            TextField t1 = new TextField();
            t1.setAlignment(Pos.CENTER);
            t1.setText(records.get(rec).getValue());
            t1.setPrefWidth(170);
            t1.setPrefHeight(37);
            TextField t2 = new TextField();
            t2.setAlignment(Pos.CENTER);
            t2.setText(String.valueOf(rec));
            t2.setPrefWidth(170);
            t2.setPrefHeight(37);
            TextField t3 = new TextField();
            t3.setAlignment(Pos.CENTER);
            t3.setText(records.get(rec).getKey());
            t3.setPrefWidth(170);
            t3.setPrefHeight(37);
            grid.addRow(j,t3,t2,t1);
            j++;
        }
    }
    @FXML
    private void Hard() throws FileNotFoundException {
        //hard hs
        GetData("hard.txt");
    }
    @FXML
    private void Medium() throws FileNotFoundException {
        //medium hs
        GetData("medium.txt");
    }
    @FXML
    private void Easy() throws FileNotFoundException {
        //easy hs
        GetData("easy.txt");
    }
    @FXML
    private void RedirectToHome() {
        HighScores.getHighScoresStage().close();
        Main.main.show();
    }
}
