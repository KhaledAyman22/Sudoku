package Controllers;

import Main.Main;
import Main.Settings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class SettingsController {
    @FXML
    private Button backbtn;
    @FXML
    private ToggleButton timer;
    @FXML
    private ToggleButton Dup;
    @FXML
    private ToggleButton UsedNum;
    @FXML
    private ToggleButton CheckMistake;
    @FXML
    private ToggleButton MistakeLimit;
    @FXML
    private ToggleButton HIdentical;
    @FXML
    private ToggleButton HArea;

    //GETTERS & SETTERS
    @FXML
    private ToggleButton getDup() {
        return Dup;
    }
    @FXML
    private void setDup(ToggleButton dup) {
        Dup = dup;
    }
    @FXML
    private ToggleButton getUsedNum() {
        return UsedNum;
    }
    @FXML
    private void setUsedNum(ToggleButton usedNum) {
        UsedNum = usedNum;
    }
    @FXML
    private ToggleButton getCheckMistake() {
        return CheckMistake;
    }
    @FXML
    private void setCheckMistake(ToggleButton checkMistake) {
        CheckMistake = checkMistake;
    }
    @FXML
    private ToggleButton getMistakeLimit() {
        return MistakeLimit;
    }
    @FXML
    private void setMistakeLimit(ToggleButton mistakeLimit) {
        MistakeLimit = mistakeLimit;
    }
    @FXML
    private ToggleButton getHIdentical() {
        return HIdentical;
    }
    @FXML
    private void setHIdentical(ToggleButton HIdentical) {
        this.HIdentical = HIdentical;
    }
    @FXML
    private ToggleButton getHArea() {
        return HArea;
    }
    @FXML
    private void setHArea(ToggleButton HArea) {
        this.HArea = HArea;
    }
    @FXML
    private ToggleButton getTimer() {
        return timer;
    }
    @FXML
    private void setTimer(ToggleButton timer) {
         this.timer=timer;
    }

    //EFFECTS

    @FXML
    private  void SwitchTimer() {
        if(timer.isSelected())
        {
            SwitchOn(timer);
        }
        else
        {
            SwitchOff(timer);
        }
    }
    @FXML
    private  void SwitchHDuplicate() {
        if(Dup.isSelected())
        {
            SwitchOn(Dup);
        }
        else
        {
            SwitchOff(Dup);
        }
    }
    @FXML
    private  void SwitchHideNumbers() {
        if(UsedNum.isSelected())
        {
            SwitchOn(UsedNum);
        }
        else
        {
            SwitchOff(UsedNum);
        }
    }
    @FXML
    private  void SwitchAutoCheck() {
        if(CheckMistake.isSelected())
        {
            SwitchOn(CheckMistake);
        }
        else
        {
            SwitchOff(CheckMistake);
        }
    }
    @FXML
    private  void SwitchLimit() {
        if(MistakeLimit.isSelected())
        {
            SwitchOn(MistakeLimit);
        }
        else
        {
            SwitchOff(MistakeLimit);
        }
    }
    @FXML
    private  void SwitchHArea() {
        if(HArea.isSelected())
        {
            SwitchOn(HArea);
        }
        else
        {
            SwitchOff(HArea);
        }
    }
    @FXML
    private  void SwitchHIdenticalNumbers() {
        if(HIdentical.isSelected())
        {
            SwitchOn(HIdentical);
        }
        else
        {
            SwitchOff(HIdentical);
        }
    }
    @FXML
    private void SwitchOn(ToggleButton x) {
        x.setText("ON");
        DropShadow dropShadow = new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setRadius(7.31);
        dropShadow.setOffsetX(0.0);
        dropShadow.setOffsetY(8.0);
        dropShadow.setSpread(0.08);
        dropShadow.setWidth(16.23);
        dropShadow.setHeight(15.0);
        dropShadow.setColor(Color.rgb(30, 97, 204));
        x.setStyle("-fx-background-color:#287bff ");
        x.setEffect(dropShadow);
    }
    @FXML
    private void SwitchOff(ToggleButton x) {
        x.setText("OFF");
        DropShadow dropShadow=new DropShadow();
        dropShadow.setBlurType(BlurType.GAUSSIAN);
        dropShadow.setRadius(7.31);
        dropShadow.setOffsetX(0.0);
        dropShadow.setOffsetY(8.0);
        dropShadow.setSpread(0.08);
        dropShadow.setWidth(16.23);
        dropShadow.setHeight(15.0);
        dropShadow.setColor(Color.rgb(254,0,0));
        x.setStyle("-fx-background-color:#ff5353 ");
        x.setEffect(dropShadow);
    }
    @FXML
    private  void TPE() {
        timer.setTranslateY(4);
    }
    @FXML
    private  void TRE() {
        timer.setTranslateY(0);
    }
    @FXML
    private  void DPE() {
        Dup.setTranslateY(4);
    }
    @FXML
    private  void DRE() {
        Dup.setTranslateY(0);
    }
    @FXML
    private  void UNPE() {
        UsedNum.setTranslateY(4);
    }
    @FXML
    private  void UNRE() {
        UsedNum.setTranslateY(0);
    }
    @FXML
    private  void ACPE() {
        CheckMistake.setTranslateY(4);
    }
    @FXML
    private  void ACRE() {
        CheckMistake.setTranslateY(0);
    }
    @FXML
    private  void MLPE() {
        MistakeLimit.setTranslateY(4);
    }
    @FXML
    private  void MLRE() {
        MistakeLimit.setTranslateY(0);
    }
    @FXML
    private  void INPE() {
        HIdentical.setTranslateY(4);
    }
    @FXML
    private  void INRE() {
        HIdentical.setTranslateY(0);
    }
    @FXML
    private  void APE() {
        HArea.setTranslateY(4);
    }
    @FXML
    private  void ARE() {
        HArea.setTranslateY(0);
    }
    @FXML
    private void BPE() {
        backbtn.setTranslateY(2);
    }
    @FXML
    private void BRE() {
        backbtn.setTranslateY(0);
    }

    ////////////////
    //TO BE EDITED//
    ////////////////

    @FXML
    private void RedirectToHome() {
        Settings.getSettingsStage().close();
        Main.main.show();
    }

}
