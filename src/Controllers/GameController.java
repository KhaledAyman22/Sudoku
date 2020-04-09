package Controllers;

import Main.HowToPlay;
import Main.HighScores;
import Main.Game;
import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class GameController {
    //VARs
    public static boolean timer=true;
    @FXML
    private VBox WonBox;
    @FXML
    private TextField name;
    @FXML
    private Button ok;
    @FXML
    private Label score;
    @FXML
    private Label time;
    @FXML
    private HBox MistakesBox;
    @FXML
    private HBox vb1;
    @FXML
    private ImageView GameOver;
    @FXML
    private ImageView Won;
    @FXML
    private VBox vb;
    @FXML
    private Button start;
    @FXML
    private ToggleGroup level;
    @FXML
    private ToggleButton easy;
    @FXML
    private ToggleButton medium;
    @FXML
    private ToggleButton hard;
    @FXML
    private ImageView play_pause_img;
    @FXML
    private HBox TimerBox;
    @FXML
    private Button backbtn;
    @FXML
    private Button play_pause;
    @FXML
    private Button howTobtn;
    @FXML
    private Label Timer_min;
    @FXML
    private Label Timer_sec;
    @FXML
    private Label Score;
    @FXML
    private Label mistakes;
    @FXML
    private Button undo;
    @FXML
    private TextField r0c0;
    @FXML
    private TextField r1c0;
    @FXML
    private TextField r2c0;
    @FXML
    private TextField r3c0;
    @FXML
    private TextField r4c0;
    @FXML
    private TextField r5c0;
    @FXML
    private TextField r6c0;
    @FXML
    private TextField r7c0;
    @FXML
    private TextField r8c0;
    @FXML
    private TextField r0c1;
    @FXML
    private TextField r1c1;
    @FXML
    private TextField r2c1;
    @FXML
    private TextField r3c1;
    @FXML
    private TextField r4c1;
    @FXML
    private TextField r5c1;
    @FXML
    private TextField r6c1;
    @FXML
    private TextField r7c1;
    @FXML
    private TextField r8c1;
    @FXML
    private TextField r0c2;
    @FXML
    private TextField r1c2;
    @FXML
    private TextField r2c2;
    @FXML
    private TextField r3c2;
    @FXML
    private TextField r4c2;
    @FXML
    private TextField r5c2;
    @FXML
    private TextField r6c2;
    @FXML
    private TextField r7c2;
    @FXML
    private TextField r8c2;
    @FXML
    private TextField r0c3;
    @FXML
    private TextField r1c3;
    @FXML
    private TextField r2c3;
    @FXML
    private TextField r3c3;
    @FXML
    private TextField r4c3;
    @FXML
    private TextField r5c3;
    @FXML
    private TextField r6c3;
    @FXML
    private TextField r7c3;
    @FXML
    private TextField r8c3;
    @FXML
    private TextField r0c4;
    @FXML
    private TextField r1c4;
    @FXML
    private TextField r2c4;
    @FXML
    private TextField r3c4;
    @FXML
    private TextField r4c4;
    @FXML
    private TextField r5c4;
    @FXML
    private TextField r6c4;
    @FXML
    private TextField r7c4;
    @FXML
    private TextField r8c4;
    @FXML
    private TextField r0c5;
    @FXML
    private TextField r1c5;
    @FXML
    private TextField r2c5;
    @FXML
    private TextField r3c5;
    @FXML
    private TextField r4c5;
    @FXML
    private TextField r5c5;
    @FXML
    private TextField r6c5;
    @FXML
    private TextField r7c5;
    @FXML
    private TextField r8c5;
    @FXML
    private TextField r0c6;
    @FXML
    private TextField r1c6;
    @FXML
    private TextField r2c6;
    @FXML
    private TextField r3c6;
    @FXML
    private TextField r4c6;
    @FXML
    private TextField r5c6;
    @FXML
    private TextField r6c6;
    @FXML
    private TextField r7c6;
    @FXML
    private TextField r8c6;
    @FXML
    private TextField r0c7;
    @FXML
    private TextField r1c7;
    @FXML
    private TextField r2c7;
    @FXML
    private TextField r3c7;
    @FXML
    private TextField r4c7;
    @FXML
    private TextField r5c7;
    @FXML
    private TextField r6c7;
    @FXML
    private TextField r7c7;
    @FXML
    private TextField r8c7;
    @FXML
    private TextField r0c8;
    @FXML
    private TextField r1c8;
    @FXML
    private TextField r2c8;
    @FXML
    private TextField r3c8;
    @FXML
    private TextField r4c8;
    @FXML
    private TextField r5c8;
    @FXML
    private TextField r6c8;
    @FXML
    private TextField r7c8;
    @FXML
    private TextField r8c8;
    @FXML
    private Button hint;
    @FXML
    private ToggleButton notes;
    @FXML
    private ToggleButton one;
    @FXML
    private ToggleGroup EntryNumbers;
    @FXML
    private ToggleButton two;
    @FXML
    private ToggleButton three;
    @FXML
    private ToggleButton four;
    @FXML
    private ToggleButton five;
    @FXML
    private ToggleButton six;
    @FXML
    private ToggleButton seven;
    @FXML
    private ToggleButton eight;
    @FXML
    private ToggleButton nine;
    @FXML
    private ToggleButton eraser;
    private ToggleButton last=null;
    private TextField current=null;
    private TextField previous=null;
    private List<TextField>row0;
    private List<TextField>row1;
    private List<TextField>row2;
    private List<TextField>row3;
    private List<TextField>row4;
    private List<TextField>row5;
    private List<TextField>row6;
    private List<TextField>row7;
    private List<TextField>row8;
    private List<TextField>col0;
    private List<TextField>col1;
    private List<TextField>col2;
    private List<TextField>col3;
    private List<TextField>col4;
    private List<TextField>col5;
    private List<TextField>col6;
    private List<TextField>col7;
    private List<TextField>col8;
    boolean found= false;
    int i=0;
    int uno=0,dos=0,tres=0,quatro=0,cinco=0,seis=0,siete=0,ocho=0,nueve=0;
    //SETTERS & GETTERS
    public Button getPlay_pause() {
        return play_pause;
    }

    public void setPlay_pause(Button play_pause) {
        this.play_pause = play_pause;
    }

    public Label getTimer_min() {
        return Timer_min;
    }

    public void setTimer_min(Label timer_min) {
        Timer_min = timer_min;
    }

    public Label getTimer_sec() {
        return Timer_sec;
    }

    public void setTimer_sec(Label timer_sec) {
        Timer_sec = timer_sec;
    }

    public Label getScore() {
        return Score;
    }

    public void setScore(Label score) {
        Score = score;
    }

    //EFFECTS
    @FXML
    private void PPE() {
        play_pause.setTranslateY(2);
    }

    @FXML
    private void PRE() {
        play_pause.setTranslateY(0);
    }

    @FXML
    private void BPE() {
        backbtn.setTranslateY(2);
    }

    @FXML
    private void BRE() {
        backbtn.setTranslateY(0);
    }

    @FXML
    private void HTPE() {
        howTobtn.setTranslateY(2);
    }

    @FXML
    private void HTRE() {
        howTobtn.setTranslateY(0);
    }

    @FXML
    private void EraserPE() {
        eraser.setTranslateY(4);
    }

    @FXML
    private void EraserRE() {
        eraser.setTranslateY(0);
        if(eraser.isSelected())
        {
            SwitchOff(last);
            SwitchOn(eraser);
        }
        else
        {
            SwitchOff(eraser);
        }
        last=eraser;
    }

    @FXML
    private void okRE() {
        ok.setTranslateY(4);
    }
    
    @FXML
    private void okPE() {
        ok.setTranslateY(0);
    }
    
    @FXML
    private void HintPE() {
        hint.setTranslateY(4);
    }

    @FXML
    private void HintRE() {
        hint.setTranslateY(0);
    }

    @FXML
    private void NoteRE() {
        notes.setTranslateY(0);
        if(notes.isSelected())
        {
            SwitchOn(notes);
        }
        else
        {
            SwitchOff(notes);
        }
    }

    @FXML
    private void NotesPE() {
        notes.setTranslateY(4);
    }

    @FXML
    private void UndoPE() {
        undo.setTranslateY(4);
    }

    @FXML
    private void UndoRE() {
        undo.setTranslateY(0);
    }

    @FXML
    private void onePE() {
        one.setTranslateY(4);
    }

    @FXML
    private void oneRE() {
        one.setTranslateY(0);
        if(one.isSelected())
        {
            SwitchOff(last);
            SwitchOn(one);
        }
        else
        {
            SwitchOff(one);
        }
        last=one;
    }

    @FXML
    private void twoPE() {
        two.setTranslateY(4);
    }

    @FXML
    private void twoRE() {
        two.setTranslateY(0);
        if(two.isSelected())
        {
            SwitchOff(last);
            SwitchOn(two);
        }
        else
        {
            SwitchOff(two);
        }
        last=two;
    }

    @FXML
    private void threePE() {
        three.setTranslateY(4);
    }

    @FXML
    private void threeRE() {
        three.setTranslateY(0);
        if(three.isSelected())
        {
            SwitchOff(last);
            SwitchOn(three);
        }
        else
        {
            SwitchOff(three);
        }
        last=three;
    }

    @FXML
    private void fourPE() {
        four.setTranslateY(4);
    }

    @FXML
    private void fourRE() {
        four.setTranslateY(0);
        if(four.isSelected())
        {
            SwitchOff(last);
            SwitchOn(four);
        }
        else
        {
            SwitchOff(four);
        }
        last=four;
    }

    @FXML
    private void fivePE() {
        five.setTranslateY(4);
    }

    @FXML
    private void fiveRE() {
        five.setTranslateY(0);
        if(five.isSelected())
        {
            SwitchOff(last);
            SwitchOn(five);
        }
        else
        {
            SwitchOff(five);
        }
        last=five;
    }

    @FXML
    private void sixPE() {
        six.setTranslateY(4);
    }

    @FXML
    private void sixRE() {
        six.setTranslateY(0);
        if(six.isSelected())
        {
            SwitchOff(last);
            SwitchOn(six);
        }
        else
        {
            SwitchOff(six);
        }
        last=six;
    }

    @FXML
    private void sevenPE() {
        seven.setTranslateY(4);
    }

    @FXML
    private void sevenRE() {
        seven.setTranslateY(0);
        if(seven.isSelected())
        {
            SwitchOff(last);
            SwitchOn(seven);
        }
        else
        {
            SwitchOff(seven);
        }
        last=seven;
    }

    @FXML
    private void eightPE() {
        eight.setTranslateY(4);
    }

    @FXML
    private void eightRE() {
        eight.setTranslateY(0);
        if(eight.isSelected())
        {
            SwitchOff(last);
            SwitchOn(eight);
        }
        else
        {
            SwitchOff(eight);
        }
        last=eight;
    }

    @FXML
    private void ninePE() {
        nine.setTranslateY(4);
    }

    @FXML
    private void nineRE() {
        nine.setTranslateY(0);
        if(nine.isSelected())
        {
            SwitchOff(last);
            SwitchOn(nine);
        }
        else
        {
            SwitchOff(nine);
        }
        last=nine;
    }

    //TypingInGrid
    @FXML
    private void r0c0() {
        setText(r0c0);
    }
    @FXML
    private void r0c1() {
        setText(r0c1);
    }
    @FXML
    private void r0c2() {
        setText(r0c2);
    }
    @FXML
    private void r0c3() {
        setText(r0c3);
    }
    @FXML
    private void r0c4() {
        setText(r0c4);
    }
    @FXML
    private void r0c5() {
        setText(r0c5);
    }
    @FXML
    private void r0c6() {
        setText(r0c6);
    }
    @FXML
    private void r0c7() {
        setText(r0c7);
    }
    @FXML
    private void r0c8() {
        setText(r0c8);
    }
    @FXML
    private void r1c0() {
        setText(r1c0);
    }
    @FXML
    private void r1c1() {
        setText(r1c1);
    }
    @FXML
    private void r1c2() {
        setText(r1c2);
    }
    @FXML
    private void r1c3() {
        setText(r1c3);
    }
    @FXML
    private void r1c4() {
        setText(r1c4);
    }
    @FXML
    private void r1c5() {
        setText(r1c5);
    }
    @FXML
    private void r1c6() {
        setText(r1c6);
    }
    @FXML
    private void r1c7() {
        setText(r1c7);
    }
    @FXML
    private void r1c8() {
        setText(r1c8);
    }
    @FXML
    private void r2c0() {
        setText(r2c0);
    }
    @FXML
    private void r2c1() {
        setText(r2c1);
    }
    @FXML
    private void r2c2() {
        setText(r2c2);
    }
    @FXML
    private void r2c3() {
        setText(r2c3);
    }
    @FXML
    private void r2c4() {
        setText(r2c4);
    }
    @FXML
    private void r2c5() {
        setText(r2c5);
    }
    @FXML
    private void r2c6() {
        setText(r2c6);
    }
    @FXML
    private void r2c7() {
        setText(r2c7);
    }
    @FXML
    private void r2c8() {
        setText(r2c8);
    }
    @FXML
    private void r3c0() {
        setText(r3c0);
    }
    @FXML
    private void r3c1() {
        setText(r3c1);
    }
    @FXML
    private void r3c2() {
        setText(r3c2);
    }
    @FXML
    private void r3c3() {
        setText(r3c3);
    }
    @FXML
    private void r3c4() {
        setText(r3c4);
    }
    @FXML
    private void r3c5() {
        setText(r3c5);
    }
    @FXML
    private void r3c6() {
        setText(r3c6);
    }
    @FXML
    private void r3c7() {
        setText(r3c7);
    }
    @FXML
    private void r3c8() {
        setText(r3c8);
    }
    @FXML
    private void r4c0() {
        setText(r4c0);
    }
    @FXML
    private void r4c1() {
        setText(r4c1);
    }
    @FXML
    private void r4c2() {
        setText(r4c2);
    }
    @FXML
    private void r4c3() {
        setText(r4c3);
    }
    @FXML
    private void r4c4() {
        setText(r4c4);
    }
    @FXML
    private void r4c5() {
        setText(r4c5);
    }
    @FXML
    private void r4c6() {
        setText(r4c6);
    }
    @FXML
    private void r4c7() {
        setText(r4c7);
    }
    @FXML
    private void r4c8() {
        setText(r4c8);
    }
    @FXML
    private void r5c0() {
        setText(r5c0);
    }
    @FXML
    private void r5c1() {
        setText(r5c1);
    }
    @FXML
    private void r5c2() {
        setText(r5c2);
    }
    @FXML
    private void r5c3() {
        setText(r5c3);
    }
    @FXML
    private void r5c4() {
        setText(r5c4);
    }
    @FXML
    private void r5c5() {
        setText(r5c5);
    }
    @FXML
    private void r5c6() {
        setText(r5c6);
    }
    @FXML
    private void r5c7() {
        setText(r5c7);
    }
    @FXML
    private void r5c8() {
        setText(r5c8);
    }
    @FXML
    private void r6c0() {
        setText(r6c0);
    }
    @FXML
    private void r6c1() {
        setText(r6c1);
    }
    @FXML
    private void r6c2() {
        setText(r6c2);
    }
    @FXML
    private void r6c3() {
        setText(r6c3);
    }
    @FXML
    private void r6c4() {
        setText(r6c4);
    }
    @FXML
    private void r6c5() {
        setText(r6c5);
    }
    @FXML
    private void r6c6() {
        setText(r6c6);
    }
    @FXML
    private void r6c7() {
        setText(r6c7);
    }
    @FXML
    private void r6c8() {
        setText(r6c8);
    }
    @FXML
    private void r7c0() {
        setText(r7c0);
    }
    @FXML
    private void r7c1() {
        setText(r7c1);
    }
    @FXML
    private void r7c2() {
        setText(r7c2);
    }
    @FXML
    private void r7c3() {
        setText(r7c3);
    }
    @FXML
    private void r7c4() {
        setText(r7c4);
    }
    @FXML
    private void r7c5() {
        setText(r7c5);
    }
    @FXML
    private void r7c6() {
        setText(r7c6);
    }
    @FXML
    private void r7c7() {
        setText(r7c7);
    }
    @FXML
    private void r7c8() {
        setText(r7c8);
    }
    @FXML
    private void r8c0() {
        setText(r8c0);
    }
    @FXML
    private void r8c1() {
        setText(r8c1);
    }
    @FXML
    private void r8c2() {
        setText(r8c2);
    }
    @FXML
    private void r8c3() {
        setText(r8c3);
    }
    @FXML
    private void r8c4() {
        setText(r8c4);
    }
    @FXML
    private void r8c5() {
        setText(r8c5);
    }
    @FXML
    private void r8c6() {
        setText(r8c6);
    }
    @FXML
    private void r8c7() {
        setText(r8c7);
    }
    @FXML
    private void r8c8() {
        setText(r8c8);
    }

    int Mistakes=0;
    List<TextField>r,c;
    int w1=0,w2=0,w3=0;
    TextField t1=null,t2=null,t3=null;
    Stack<Pair<TextField,String>>Undo=new Stack<>();
    String difficulty;
    private void SaveData() throws FileNotFoundException {
        Formatter f =new Formatter(difficulty+".txt");
        String s=name.getText();
        if(s.contains(" "))
            s=s.replace(" ","_");
        f.format("%s%s%s",score.getText()+" ",name.getText()+" ",time.getText());
        f.close();
    }
    private void setRowCol() {
        row0= Arrays.asList(r0c0, r0c1, r0c2, r0c3, r0c4, r0c5, r0c6, r0c7, r0c8);
        row1= Arrays.asList(r1c0, r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8);
        row2= Arrays.asList(r2c0, r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8);
        row3= Arrays.asList(r3c0, r3c1, r3c2, r3c3, r3c4, r3c5, r3c6, r3c7, r3c8);
        row4= Arrays.asList(r4c0, r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8);
        row5= Arrays.asList(r5c0, r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8);
        row6= Arrays.asList(r6c0, r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8);
        row7= Arrays.asList(r7c0, r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8);
        row8= Arrays.asList(r8c0, r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8);

        col0= Arrays.asList(r0c0, r1c0, r2c0, r3c0, r4c0, r5c0, r6c0, r7c0, r8c0);
        col1= Arrays.asList(r0c1, r1c1, r2c1, r3c1, r4c1, r5c1, r6c1, r7c1, r8c1);
        col2= Arrays.asList(r0c2, r1c2, r2c2, r3c2, r4c2, r5c2, r6c2, r7c2, r8c2);
        col3= Arrays.asList(r0c3, r1c3, r2c3, r3c3, r4c3, r5c3, r6c3, r7c3, r8c3);
        col4= Arrays.asList(r0c4, r1c4, r2c4, r3c4, r4c4, r5c4, r6c4, r7c4, r8c4);
        col5= Arrays.asList(r0c5, r1c5, r2c5, r3c5, r4c5, r5c5, r6c5, r7c5, r8c5);
        col6= Arrays.asList(r0c6, r1c6, r2c6, r3c6, r4c6, r5c6, r6c6, r7c6, r8c6);
        col7= Arrays.asList(r0c7, r1c7, r2c7, r3c7, r4c7, r5c7, r6c7, r7c7, r8c7);
        col8= Arrays.asList(r0c8, r1c8, r2c8, r3c8, r4c8, r5c8, r6c8, r7c8, r8c8);
    }
    private void SwitchOn(ToggleButton x) {
        try{ DropShadow dropShadow = new DropShadow();
            dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
            dropShadow.setRadius(7.46);
            dropShadow.setOffsetX(0.0);
            dropShadow.setOffsetY(8.0);
            dropShadow.setSpread(0.08);
            dropShadow.setWidth(16.23);
            dropShadow.setHeight(15.62);
            dropShadow.setColor(Color.rgb(117, 170, 255));
            x.setEffect(dropShadow);}catch(Exception ignored){}
    }
    private void SwitchOff(ToggleButton x) {
        try{ DropShadow dropShadow=new DropShadow();
            dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
            dropShadow.setRadius(7.46);
            dropShadow.setOffsetX(0.0);
            dropShadow.setOffsetY(8.0);
            dropShadow.setSpread(0.08);
            dropShadow.setWidth(16.23);
            dropShadow.setHeight(15.62);
            dropShadow.setColor(Color.rgb(30,99,204));
            x.setEffect(dropShadow);}catch (Exception ignored){}
    }
    private void delete(TextField x) {
        if(!x.getText().equals(""))
        {
            HighlightRCB(x);
            DisableNumber(x.getText(),'-');
            Check();
            Undo.push(new Pair<>(x,x.getText()));
            x.setText("");
            x.setPromptText("");
        }
        else
        {
            Reset();
        }
    }
    private void setText(TextField x) {
        previous = current;
        current = x;
        if(!Sudoku.getGiven().contains(x)) {
            String s;
            try {
                s = String.valueOf(EntryNumbers.getSelectedToggle().toString().charAt(EntryNumbers.getSelectedToggle().toString().length() - 2));
            } catch (Exception ignored) {
                HighlightRCB(current);
                return;
            }

            try {
                if (s.equals("'")) {
                    delete(current);
                } else {
                    if (notes.isSelected()) {
                        if (!x.getText().equals(""))
                            DisableNumber(x.getText(), '-');
                        x.setText("");
                        x.setPromptText(s);
                    } else {
                        if (!x.getText().equals("") && !x.getText().equals(s))
                            delete(current);
                        else if (!x.getText().equals(s))
                            Undo.push(new Pair<>(x, ""));
                        DisableNumber(s, '+');
                        x.setPromptText("");
                        x.setText(s);
                        //check for mistakes if mistakes are on if = 3 vb.diable=true GameOver.visible=true
                        if (MainController.MistakeLimit) {
                            if (Mistakes == 3) {
                                vb.setDisable(true);
                                GameOver.setVisible(true);
                                play_pause.setDisable(true);
                                howTobtn.setDisable(true);
                            }
                        }
                    }
                }
                HighlightRCB(current);
            } catch (Exception ignored) {
            }
        }
        else
            HighlightRCB(current);

    }
    private void DisableNumber(String x,char y) {
      if(MainController.HideUsed) {
          if (y == '+') {
              switch (x) {
                  case "1": {
                      uno++;
                      if (uno == 9) {
                          one.setDisable(true);
                          one.setSelected(false);
                      }
                      break;
                  }
                  case "2": {
                      dos++;
                      if (dos == 9) {
                          two.setDisable(true);
                          two.setSelected(false);
                      }
                      break;
                  }
                  case "3": {
                      tres++;
                      if (tres == 9) {
                          three.setDisable(true);
                          three.setSelected(false);
                      }
                      break;
                  }
                  case "4": {
                      quatro++;
                      if (quatro == 9) {
                          four.setDisable(true);
                          four.setSelected(false);
                      }
                      break;
                  }
                  case "5": {
                      cinco++;
                      if (cinco == 9) {
                          five.setDisable(true);
                          five.setSelected(false);
                      }
                      break;
                  }
                  case "6": {
                      seis++;
                      if (seis == 9) {
                          six.setDisable(true);
                          six.setSelected(false);
                      }
                      break;
                  }
                  case "7": {
                      siete++;
                      if (siete == 9) {
                          seven.setDisable(true);
                          seven.setSelected(false);
                      }
                      break;
                  }
                  case "8": {
                      ocho++;
                      if (ocho == 9) {
                          eight.setDisable(true);
                          eight.setSelected(false);
                      }
                      break;
                  }
                  case "9": {
                      nueve++;
                      if (nueve == 9) {
                          nine.setDisable(true);
                          nine.setSelected(false);
                      }
                      break;
                  }
              }
          }
          else if (y == '-') {
              switch (x) {
                  case "1": {
                      uno--;
                      if (one.isDisabled()) one.setDisable(false);
                      break;
                  }
                  case "2": {
                      dos--;
                      if (two.isDisabled()) two.setDisable(false);
                      break;
                  }
                  case "3": {
                      tres--;
                      if (three.isDisabled()) three.setDisable(false);
                      break;
                  }
                  case "4": {
                      quatro--;
                      if (four.isDisabled()) four.setDisable(false);
                      break;
                  }
                  case "5": {
                      cinco--;
                      if (five.isDisabled()) five.setDisable(false);
                      break;
                  }
                  case "6": {
                      seis--;
                      if (six.isDisabled()) six.setDisable(false);
                      break;
                  }
                  case "7": {
                      siete--;
                      if (seven.isDisabled()) seven.setDisable(false);
                      break;
                  }
                  case "8": {
                      ocho--;
                      if (eight.isDisabled()) eight.setDisable(false);
                      break;
                  }
                  case "9": {
                      nueve--;
                      if (nine.isDisabled()) nine.setDisable(false);
                      break;
                  }
              }
          }
      }
    }
    private List<TextField> getRow(TextField x) {
        int row=Character.getNumericValue(x.toString().charAt(14));
        switch (row){
            case 0:{return(row0);}
            case 1:{return(row1);}
            case 2:{return(row2);}
            case 3:{return(row3);}
            case 4:{return(row4);}
            case 5:{return(row5);}
            case 6:{return(row6);}
            case 7:{return(row7);}
            case 8:{return(row8);}
            default:return(null);
        }
    }
    private List<TextField> getColumn(TextField x) {
        int column=Character.getNumericValue(x.toString().charAt(16));
        switch (column){
            case 0:{return(col0);}
            case 1:{return(col1);}
            case 2:{return(col2);}
            case 3:{return(col3);}
            case 4:{return(col4);}
            case 5:{return(col5);}
            case 6:{return(col6);}
            case 7:{return(col7);}
            case 8:{return(col8);}
            default:return(null);
        }
    }
    private void HighlightRCB(TextField x) {
        //Resetting
        Reset();
        if(current==previous && i==0)
        {i++;return;}
        else
            i=0;
        //highlighting row,col,and box
        if(MainController.HighArea || MainController.HighDup) {
            HighlightR(getRow(current));
            HighlightC(getColumn(current));
            HighlightB(current);
        }
        if(MainController.HighIdentical)
            HighlightNumber();
    }
    private void HighlightR(List<TextField> x) {
        HL(x);
        r=x;
    }
    private void HighlightC(List<TextField> x) {
        HL(x);
        c=x;
    }
    private void HL(List<TextField> x) {
        for (TextField textField : x)
        {
            if(textField.getText().equals("")) {
                if (MainController.HighArea)
                    textField.setStyle("-fx-background-color: #d0c4e8");
            }
            else
            {
                if(textField.getText().equals(current.getText()) && !textField.getId().equals(current.getId()) && !current.getText().equals(""))
                {
                    if(MainController.HighDup) {
                        found = true;
                        textField.setStyle("-fx-background-color: #fc4e4e");
                    }
                }
                else
                {
                    if(!textField.getStyle().equals("-fx-background-color: #fc4e4e"))
                        if(MainController.HighArea)
                            textField.setStyle("-fx-background-color: #7d4efc");
                }
            }
        }
    }
    private void Reset() {
        List<List<TextField>>lists;
        lists=Arrays.asList(row0,row1,row2,row3,row4,row5,row6,row7,row8);
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                try
                {
                    if(lists.get(i).get(j).getText().equals(""))
                        lists.get(i).get(j).setStyle("-fx-background-color: #e3e3e3");
                    else
                    {
                        if(lists.get(i).get(j).getStyle().equals("-fx-background-color: #fc4e4e")) ;
                        else if(lists.get(i).get(j).getStyle().equals("-fx-background-color: #00e8f2") && found)
                        {
                            lists.get(i).get(j).setStyle("-fx-background-color: #fc4e4e");
                            found=false;
                        }
                        else
                            lists.get(i).get(j).setStyle("-fx-background-color: #207bff");
                    }
                }catch(Exception ignored){}
            }
        }
    }
    private void HighlightB(TextField x) {
        for (Node n1 : x.getParent().getChildrenUnmodifiable()) {
            if(((TextField)n1).getText().equals("")) {
                if (MainController.HighArea)
                    n1.setStyle("-fx-background-color: #d0c4e8");
            }
            else
            {
                if(((TextField)n1).getText().equals(current.getText()) && !n1.getId().equals(current.getId()) && !current.getText().equals(""))
                {
                    if(MainController.HighDup) {
                        found = true;
                        n1.setStyle("-fx-background-color: #fc4e4e");
                    }
                }
                else {
                    if (!n1.getStyle().equals("-fx-background-color: #fc4e4e"))
                        if(MainController.HighArea)
                            n1.setStyle("-fx-background-color: #7d4efc");
                }
            }
        }
            current.setStyle("-fx-background-color: #00e8f2");
    }
    private void HighlightNumber() {
        List<List<TextField>>lists;
        lists=Arrays.asList(row0,row1,row2,row3,row4,row5,row6,row7,row8);
        for(int i=0;i<9;i++)
        {
           for(int j=0;j<9;j++)
           {
               try
               {
                   if(lists.get(i).get(j).getText().equals(current.getText()) && !lists.get(i).get(j).getText().equals("")
                           && !lists.get(i).get(j).getStyle().equals("-fx-background-color: #fc4e4e"))
                       lists.get(i).get(j).setStyle("-fx-background-color: #7a49a5");

               }catch(Exception ignored){}
           }
        }
        current.setStyle("-fx-background-color: #00e8f2");
    }
    private int CheckRow(List<TextField> r) {
        int w=0;
        for(int j=0;j<9;j++)
        {
            if(r.get(j).getText().equals(current.getText()) && !r.get(j).getId().equals(current.getId()))
            {w++;t1=r.get(j);}
        }
        return w;
    }
    private int CheckColumn(List<TextField> c) {
        int w=0;
        for(int j=0;j<9;j++)
        {
            if(c.get(j).getText().equals(current.getText()) && !c.get(j).getId().equals(current.getId()))
            {w++;t2=c.get(j);}
        }
        return w;
    }
    private int CheckBox(TextField x) {
        int w=0;
        for(Node n : x.getParent().getChildrenUnmodifiable() )
        {
            if(((TextField)n).getText().equals(current.getText()) && !n.getId().equals(current.getId()))
            {w++;t3=(TextField) n;}
        }
        return w;
    }
    private void Check() {
        w1=CheckRow(r);
        if(w1==1)
        {
            w2=CheckColumn(getColumn(t1));
            w3=CheckBox(t1);
            if(w2<=1&&w3<=1)
                t1.setStyle("-fx-background-color: #7d4efc");
        }

        w2=CheckColumn(c);
        if(w2==1)
        {
            w1=CheckRow(getRow(t2));
            w3=CheckBox(t2);
            if(w1<=1&&w3<=1)
                t2.setStyle("-fx-background-color: #7d4efc");
        }

        w3=CheckBox(current);
        if(w3==1)
        {
            w2=CheckColumn(getColumn(t3));
            w1=CheckRow(getRow(t3));
            if(w2<=1&&w1<=1)
                t3.setStyle("-fx-background-color: #7d4efc");
        }
    }
    @FXML
    public void PauseTimerEvent() {
        PauseTimer();
        Image i;
        if(!timer)
            i=new Image(new File("out/production/Sudoku/images/play.png").toURI().toString());
        else
            i=new Image(new File("out/production/Sudoku/images/pause.png").toURI().toString());

        play_pause_img.setImage(i);
        play_pause_img.setFitHeight(47);
        play_pause_img.setFitWidth(35);
    }
    @FXML
    private void RedirectToHTP() throws Exception {
        PauseTimer();
        new HowToPlay();
        Game.getGameStage().setOpacity(0.7);
    }
    @FXML
    private void RedirectToHome() {
        Game.getGameStage().close();
        Main.main.show();
    }
    @FXML
    private void Undo() {
        //preform undo
        if(!Undo.isEmpty()) {                                                              //lw l stack b null dis deleted delete set
            current = Undo.peek().getKey();
            if (Undo.peek().getKey().getText().equals(""))
                DisableNumber(Undo.peek().getValue(), '+');
            else {
                Reset();
                delete(current);
                Undo.pop();
                if(!Undo.peek().getValue().equals(""))
                    DisableNumber(Undo.peek().getValue(), '+');
            }
            Undo.peek().getKey().setPromptText("");
            Undo.peek().getKey().setText(Undo.peek().getValue());
            HighlightRCB(current);
            Undo.pop();
        }
    }
    @FXML
    private void ok() throws Exception {
        if(!name.getText().equals(""))
        {
            SaveData();
            new HighScores();
            Game.getGameStage().close();
        }
        else
        {
            name.setPromptText("Please enter your name");
        }
    }
    @FXML
    private void Won()  {
        Won.setVisible(true);
        WonBox.setVisible(true);
        vb.setDisable(true);
        vb1.setDisable(true);
        score.setText(Score.getText());
        time.setText(Timer_min.getText()+":"+Timer_sec.getText());
    }
    public void start( ){
        if(level.getSelectedToggle()==null)
        {
            easy.setTranslateY(20);
            medium.setTranslateY(4);
            hard.setTranslateY(4);
            easy.setTranslateY(0);
            medium.setTranslateY(0);
            hard.setTranslateY(0);
        }
        else {
            if(easy.isSelected())
                difficulty="easy";
            else if(medium.isSelected())
                difficulty="medium";
            else if(hard.isSelected())
                difficulty="hard";
            setRowCol();
            // one object for the game

            Sudoku game = new Sudoku();
            game.generate();
            game.solve_grid();
            switch (difficulty)
            {
                case "easy":{game.easy_mode();break;}
                case "medium":{game.medium_mode();break;}
                case "hard":{game.hard_mode();break;}
            }
            game.call(row0,row1,row2,row3,row4,row5,row6,row7,row8);

            for(int i=0;i<Sudoku.getGiven().size();i++)
            {
                DisableNumber(Sudoku.getGiven().get(i).getText(),'+');
            }
            Reset();
            vb.setDisable(false);
            vb1.setDisable(false);
            start.setVisible(false);
            easy.setVisible(false);
            medium.setVisible(false);
            hard.setVisible(false);
            TimerBox.setVisible(MainController.Timer);
            MistakesBox.setVisible(MainController.MistakeLimit);
        }
    }
    //TODO
    // Hazem apply won case,check for mistake if there increment Mistakes change label mistakes to Mistakes where Mistakes is the number of mistakes if Mistakes==3 set gameover visible
    // David Timer,PauseTimer
    // Amgad Score score will be calculated at the end during the game any cell written +50 any cell deleted -50 if he won final score will be  ((score*1000)/time in seconds *NOT TIMER_SEC , (TIMER_SEC+60*TIMER_MIN)*) neglect decimals
    ////////////////
    //TO BE EDITED//
    ////////////////

    @FXML
    private void Hint() {
        Won();
        //give hint "reveal one random cell solution" MAKE SURE random output isn't already given
    }
    public static void PauseTimer() {
        timer= !timer;
        if(!timer)
        {
            //stop counting
        }
        else
        {
            //count
        }
    }

}