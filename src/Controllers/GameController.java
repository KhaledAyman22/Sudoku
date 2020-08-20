package Controllers;

import Main.HowToPlay;
import Main.HighScores;
import Main.Game;
import Main.Main;
import javafx.application.Platform;
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
    Sudoku game = new Sudoku();
    //VARs
    @FXML
    private Button solve;
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
    private HBox vb2;
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
    private ToggleButton create;
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
    private ToggleButton last = null;
    private TextField current = null;
    private TextField previous = null;
    private List<TextField> row0;
    private List<TextField> row1;
    private List<TextField> row2;
    private List<TextField> row3;
    private List<TextField> row4;
    private List<TextField> row5;
    private List<TextField> row6;
    private List<TextField> row7;
    private List<TextField> row8;
    private List<TextField> col0;
    private List<TextField> col1;
    private List<TextField> col2;
    private List<TextField> col3;
    private List<TextField> col4;
    private List<TextField> col5;
    private List<TextField> col6;
    private List<TextField> col7;
    private List<TextField> col8;
    boolean found = false;
    public static boolean timer = true;
    boolean ML,ACM;
    int i = 0;
    int uno = 0, dos = 0, tres = 0, quatro = 0, cinco = 0, seis = 0, siete = 0, ocho = 0, nueve = 0;
    private int  sec=0,min=0;
    private int hint_count;
    private int Mistakes = 0;
    private TextField t1 = null, t2 = null, t3 = null;
    private Stack<Pair<TextField, String>> Undo = new Stack<>();
    private String difficulty;
    private int countScore=0;
    private String mode;
    private int cells;

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
        if (eraser.isSelected()) {
            SwitchOff(last);
            SwitchOn(eraser);
        } else {
            SwitchOff(eraser);
        }
        last = eraser;
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
        if (notes.isSelected()) {
            SwitchOn(notes);
        } else {
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
        if (one.isSelected()) {
            SwitchOff(last);
            SwitchOn(one);
        } else {
            SwitchOff(one);
        }
        last = one;
    }

    @FXML
    private void twoPE() {
        two.setTranslateY(4);
    }

    @FXML
    private void twoRE() {
        two.setTranslateY(0);
        if (two.isSelected()) {
            SwitchOff(last);
            SwitchOn(two);
        } else {
            SwitchOff(two);
        }
        last = two;
    }

    @FXML
    private void threePE() {
        three.setTranslateY(4);
    }

    @FXML
    private void threeRE() {
        three.setTranslateY(0);
        if (three.isSelected()) {
            SwitchOff(last);
            SwitchOn(three);
        } else {
            SwitchOff(three);
        }
        last = three;
    }

    @FXML
    private void fourPE() {
        four.setTranslateY(4);
    }

    @FXML
    private void fourRE() {
        four.setTranslateY(0);
        if (four.isSelected()) {
            SwitchOff(last);
            SwitchOn(four);
        } else {
            SwitchOff(four);
        }
        last = four;
    }

    @FXML
    private void fivePE() {
        five.setTranslateY(4);
    }

    @FXML
    private void fiveRE() {
        five.setTranslateY(0);
        if (five.isSelected()) {
            SwitchOff(last);
            SwitchOn(five);
        } else {
            SwitchOff(five);
        }
        last = five;
    }

    @FXML
    private void sixPE() {
        six.setTranslateY(4);
    }

    @FXML
    private void sixRE() {
        six.setTranslateY(0);
        if (six.isSelected()) {
            SwitchOff(last);
            SwitchOn(six);
        } else {
            SwitchOff(six);
        }
        last = six;
    }

    @FXML
    private void sevenPE() {
        seven.setTranslateY(4);
    }

    @FXML
    private void sevenRE() {
        seven.setTranslateY(0);
        if (seven.isSelected()) {
            SwitchOff(last);
            SwitchOn(seven);
        } else {
            SwitchOff(seven);
        }
        last = seven;
    }

    @FXML
    private void eightPE() {
        eight.setTranslateY(4);
    }

    @FXML
    private void eightRE() {
        eight.setTranslateY(0);
        if (eight.isSelected()) {
            SwitchOff(last);
            SwitchOn(eight);
        } else {
            SwitchOff(eight);
        }
        last = eight;
    }

    @FXML
    private void ninePE() {
        nine.setTranslateY(4);
    }

    @FXML
    private void nineRE() {
        nine.setTranslateY(0);
        if (nine.isSelected()) {
            SwitchOff(last);
            SwitchOn(nine);
        } else {
            SwitchOff(nine);
        }
        last = nine;
    }

    @FXML
    private void EPE() {
        easy.setTranslateY(4);
    }

    @FXML
    private void ERE() {
        easy.setTranslateY(0);
        if (easy.isSelected()) {
            SwitchOn(easy);
            SwitchOff(last);
        } else {
            SwitchOff(easy);
        }
        last = easy;
    }

    @FXML
    private void MPE() {
        medium.setTranslateY(4);
    }

    @FXML
    private void MRE() {
        medium.setTranslateY(0);
        if (medium.isSelected()) {
            SwitchOn(medium);
            SwitchOff(last);
        } else {
            SwitchOff(medium);
        }
        last = medium;
    }

    @FXML
    private void HPE() {
        hard.setTranslateY(4);
    }

    @FXML
    private void HRE() {
        hard.setTranslateY(0);
        if (hard.isSelected()) {
            SwitchOn(hard);
            SwitchOff(last);
        } else {
            SwitchOff(hard);
        }
        last = hard;
    }

    @FXML
    private void CPE() {
        create.setTranslateY(4);
    }

    @FXML
    private void CRE() {
        create.setTranslateY(0);
        if (create.isSelected()) {
            SwitchOn(create);
            SwitchOff(last);
        } else {
            SwitchOff(create);
        }
        last = create;
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

    //SAVES THE SCORE INTO FILES
    private void SaveData() throws FileNotFoundException {
        Formatter f = new Formatter(difficulty + ".txt");
        String s = name.getText();
        if (s.contains(" "))
            s = s.replace(" ", "_");
        f.format("%s%s%s", score.getText() + "--", s + "--", time.getText());
        f.close();
    }
    //SETS THE ROW GIVEN NUMBERS
    private void setRowCol() {
        row0 = Arrays.asList(r0c0, r0c1, r0c2, r0c3, r0c4, r0c5, r0c6, r0c7, r0c8);
        row1 = Arrays.asList(r1c0, r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8);
        row2 = Arrays.asList(r2c0, r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8);
        row3 = Arrays.asList(r3c0, r3c1, r3c2, r3c3, r3c4, r3c5, r3c6, r3c7, r3c8);
        row4 = Arrays.asList(r4c0, r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8);
        row5 = Arrays.asList(r5c0, r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8);
        row6 = Arrays.asList(r6c0, r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8);
        row7 = Arrays.asList(r7c0, r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8);
        row8 = Arrays.asList(r8c0, r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8);

        col0 = Arrays.asList(r0c0, r1c0, r2c0, r3c0, r4c0, r5c0, r6c0, r7c0, r8c0);
        col1 = Arrays.asList(r0c1, r1c1, r2c1, r3c1, r4c1, r5c1, r6c1, r7c1, r8c1);
        col2 = Arrays.asList(r0c2, r1c2, r2c2, r3c2, r4c2, r5c2, r6c2, r7c2, r8c2);
        col3 = Arrays.asList(r0c3, r1c3, r2c3, r3c3, r4c3, r5c3, r6c3, r7c3, r8c3);
        col4 = Arrays.asList(r0c4, r1c4, r2c4, r3c4, r4c4, r5c4, r6c4, r7c4, r8c4);
        col5 = Arrays.asList(r0c5, r1c5, r2c5, r3c5, r4c5, r5c5, r6c5, r7c5, r8c5);
        col6 = Arrays.asList(r0c6, r1c6, r2c6, r3c6, r4c6, r5c6, r6c6, r7c6, r8c6);
        col7 = Arrays.asList(r0c7, r1c7, r2c7, r3c7, r4c7, r5c7, r6c7, r7c7, r8c7);
        col8 = Arrays.asList(r0c8, r1c8, r2c8, r3c8, r4c8, r5c8, r6c8, r7c8, r8c8);
    }
    //SWITCH EFFECT FOR TOGGLE BUTTONS
    private void SwitchOn(ToggleButton x) {
        try {
            DropShadow dropShadow = new DropShadow();
            dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
            dropShadow.setRadius(7.46);
            dropShadow.setOffsetX(0.0);
            dropShadow.setOffsetY(8.0);
            dropShadow.setSpread(0.08);
            dropShadow.setWidth(16.23);
            dropShadow.setHeight(15.62);
            dropShadow.setColor(Color.rgb(117, 170, 255));
            x.setEffect(dropShadow);
        } catch (Exception ignored) {
        }
    }
    //SWITCH EFFECT FOR TOGGLE BUTTONS
    private void SwitchOff(ToggleButton x) {
        try {
            DropShadow dropShadow = new DropShadow();
            dropShadow.setBlurType(BlurType.THREE_PASS_BOX);
            dropShadow.setRadius(7.46);
            dropShadow.setOffsetX(0.0);
            dropShadow.setOffsetY(8.0);
            dropShadow.setSpread(0.08);
            dropShadow.setWidth(16.23);
            dropShadow.setHeight(15.62);
            dropShadow.setColor(Color.rgb(30, 99, 204));
            x.setEffect(dropShadow);
        } catch (Exception ignored) {
        }
    }
    //DELETES INPUT FROM THE CELL
    private void delete(TextField x) {
        if (!x.getText().equals("")) {
            HighlightRCB();
            DisableNumber(x.getText(), '-');
            Check();
            Undo.push(new Pair<>(x, x.getText()));
            x.setText("");
            x.setPromptText("");
            countScore-=50;
            Score.setText(String.valueOf(countScore));
            cells--;

        } else {
            Reset();
        }
    }
    //WRITES INPUT TO THE CELL
    private void setText(TextField x) {
        previous = current;
        current = x;
        if (!Sudoku.getGiven().contains(x)) {
            String s;
            try {
                s = String.valueOf(EntryNumbers.getSelectedToggle().toString().charAt(EntryNumbers.getSelectedToggle().toString().length() - 2));
            } catch (Exception ignored) {
                HighlightRCB();
                return;
            }

            try {
                boolean m=false;
                if (s.equals("'")) {
                    delete(current);
                } else {
                    if (notes.isSelected()) {
                        if (!x.getText().equals(""))
                            delete(x);
                        x.setText("");
                        x.setPromptText(s);
                    } else {
                        if (!x.getText().equals("") && !x.getText().equals(s))
                        {
                            delete(current);
                            DisableNumber(s, '+');
                            countScore+=50;
                            cells++;
                        }
                        else if (x.getText().equals(""))
                        {
                            Undo.push(new Pair<>(x, ""));
                            DisableNumber(s, '+');
                            countScore+=50;
                            cells++;
                        }

                        String xx=x.getText();
                        x.setPromptText("");
                        x.setText(s);
                        Score.setText(String.valueOf(countScore));
                        if(Matched())
                            Won();
                        if (MainController.ACMistakes && !x.getText().equals(xx)) {
                            m=IsMistake(current);
                            if (Mistakes == 3) {
                                timer=!timer;
                                PauseTimer();
                                vb.setDisable(true);
                                GameOver.setVisible(true);
                                play_pause.setDisable(true);
                                howTobtn.setDisable(true);
                            }
                        }
                    }
                }
                HighlightRCB();
                if(m)
                    current.setStyle("-fx-background-color: #fc4e4e");

            } catch (Exception ignored) {}
        } else
            HighlightRCB();
    }
    //DISABLES THE NUMBER BUTTON AFTER BEING USED 9 TIMES
    private void DisableNumber(String x, char y) {
        if (MainController.HideUsed) {
            if (y == '+') {
                switch (x) {
                    case "1": {
                        uno++;
                        if (uno == 9) {
                            one.setDisable(true);
                            one.setSelected(false);
                            SwitchOff(one);
                        }
                        break;
                    }
                    case "2": {
                        dos++;
                        if (dos == 9) {
                            two.setDisable(true);
                            two.setSelected(false);
                            SwitchOff(two);
                        }
                        break;
                    }
                    case "3": {
                        tres++;
                        if (tres == 9) {
                            three.setDisable(true);
                            three.setSelected(false);
                            SwitchOff(three);
                        }
                        break;
                    }
                    case "4": {
                        quatro++;
                        if (quatro == 9) {
                            four.setDisable(true);
                            four.setSelected(false);
                            SwitchOff(four);
                        }
                        break;
                    }
                    case "5": {
                        cinco++;
                        if (cinco == 9) {
                            five.setDisable(true);
                            five.setSelected(false);
                            SwitchOff(five);
                        }
                        break;
                    }
                    case "6": {
                        seis++;
                        if (seis == 9) {
                            six.setDisable(true);
                            six.setSelected(false);
                            SwitchOff(six);
                        }
                        break;
                    }
                    case "7": {
                        siete++;
                        if (siete == 9) {
                            seven.setDisable(true);
                            seven.setSelected(false);
                            SwitchOff(seven);
                        }
                        break;
                    }
                    case "8": {
                        ocho++;
                        if (ocho == 9) {
                            eight.setDisable(true);
                            eight.setSelected(false);
                            SwitchOff(eight);
                        }
                        break;
                    }
                    case "9": {
                        nueve++;
                        if (nueve == 9) {
                            nine.setDisable(true);
                            nine.setSelected(false);
                            SwitchOff(nine);
                        }
                        break;
                    }
                }

            } else if (y == '-') {
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
    //TAKES A CELL AND RETURNS THE ROW LIST IT BELONGS TO
    private List<TextField> getRow(TextField x) {
        int row = Character.getNumericValue(x.toString().charAt(14));
        switch (row) {
            case 0: {
                return (row0);
            }
            case 1: {
                return (row1);
            }
            case 2: {
                return (row2);
            }
            case 3: {
                return (row3);
            }
            case 4: {
                return (row4);
            }
            case 5: {
                return (row5);
            }
            case 6: {
                return (row6);
            }
            case 7: {
                return (row7);
            }
            case 8: {
                return (row8);
            }
            default:
                return (null);
        }
    }
    //TAKES A CELL AND RETURNS THE COLUMN LIST IT BELONGS TO
    private List<TextField> getColumn(TextField x) {
        int column = Character.getNumericValue(x.toString().charAt(16));
        switch (column) {
            case 0: {
                return (col0);
            }
            case 1: {
                return (col1);
            }
            case 2: {
                return (col2);
            }
            case 3: {
                return (col3);
            }
            case 4: {
                return (col4);
            }
            case 5: {
                return (col5);
            }
            case 6: {
                return (col6);
            }
            case 7: {
                return (col7);
            }
            case 8: {
                return (col8);
            }
            default:
                return (null);
        }
    }
    //HIGHLIGHTS THE ROW, COLUMN AND BOX OF A SELECTED CELL
    private void HighlightRCB() {
        //Resetting
        Reset();

        //highlighting row,col,and box
        if (MainController.HighArea || MainController.HighDup) {
            HL(Objects.requireNonNull(getRow(current)));
            HL(Objects.requireNonNull(getColumn(current)));
            HighlightB(current);
        }
        if (MainController.HighIdentical)
            HighlightNumber();

        if (current == previous && i == 0) {
            i++;
            Reset();
        } else
            i = 0;
    }
    //MANAGES HIGHLIGHT COLORS FOR ROWS AND COLUMNS
    private void HL(List<TextField> x) {
        for (TextField textField : x) {
            if (textField.getText().equals("")) {
                if (MainController.HighArea)
                    textField.setStyle("-fx-background-color: #d0c4e8");
            } else {
                if (textField.getText().equals(current.getText()) && !textField.getId().equals(current.getId()) && !current.getText().equals("")) {
                    if (MainController.HighDup) {
                        found = true;
                        textField.setStyle("-fx-background-color: #fc4e4e");
                    }
                } else {
                    if (!textField.getStyle().equals("-fx-background-color: #fc4e4e"))
                        if (MainController.HighArea)
                            textField.setStyle("-fx-background-color: #7d4efc");
                }
            }
        }
    }
    //RESETS THE HIGHLIGHTING
    private void Reset() {
        List<List<TextField>> lists;
        lists = Arrays.asList(row0, row1, row2, row3, row4, row5, row6, row7, row8);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                try {
                    if (lists.get(i).get(j).getText().equals(""))
                        lists.get(i).get(j).setStyle("-fx-background-color: #e3e3e3");
                    else {
                        if (lists.get(i).get(j).getStyle().equals("-fx-background-color: #fc4e4e"))
                            continue;
                        else if (lists.get(i).get(j).getStyle().equals("-fx-background-color: #00e8f2") && found) {
                            lists.get(i).get(j).setStyle("-fx-background-color: #fc4e4e");
                            found = false;
                        }
                        else
                            lists.get(i).get(j).setStyle("-fx-background-color: #207bff");
                    }
                } catch (Exception ignored) {
                }
            }
        }
    }
    //HIGHLIGHTS THE BOX OF A SELECTED CELL
    private void HighlightB(TextField x) {
        for (Node n1 : x.getParent().getChildrenUnmodifiable()) {
            if (((TextField) n1).getText().equals("")) {
                if (MainController.HighArea)
                    n1.setStyle("-fx-background-color: #d0c4e8");
            } else {
                if (((TextField) n1).getText().equals(current.getText()) && !n1.getId().equals(current.getId()) && !current.getText().equals("")) {
                    if (MainController.HighDup) {
                        found = true;
                        n1.setStyle("-fx-background-color: #fc4e4e");
                    }
                } else {
                    if (!n1.getStyle().equals("-fx-background-color: #fc4e4e"))
                        if (MainController.HighArea)
                            n1.setStyle("-fx-background-color: #7d4efc");
                }
            }
        }
        if(!current.getStyle().equals("-fx-background-color: #fc4e4e"))
            current.setStyle("-fx-background-color: #00e8f2");
    }
    //HIGHLIGHTS THE NUMBERS SIMILAR TO A SELECTED NUMBER
    private void HighlightNumber() {
        List<List<TextField>> lists;
        lists = Arrays.asList(row0, row1, row2, row3, row4, row5, row6, row7, row8);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                try {
                    if (lists.get(i).get(j).getText().equals(current.getText()) && !lists.get(i).get(j).getText().equals("")
                            && !lists.get(i).get(j).getStyle().equals("-fx-background-color: #fc4e4e"))
                        lists.get(i).get(j).setStyle("-fx-background-color: #7a49a5");

                } catch (Exception ignored) {
                }
            }
        }
        if(!current.getStyle().equals("-fx-background-color: #fc4e4e"))
            current.setStyle("-fx-background-color: #00e8f2");
    }
    //CHECKS A ROW FOR MISTAKES
    private int CheckRow(List<TextField> r) {
        int w = 0;
        for (int j = 0; j < 9; j++) {
            if (r.get(j).getText().equals(current.getText()) && !r.get(j).getId().equals(current.getId())) {
                w++;
                t1 = r.get(j);
            }
        }
        return w;
    }
    //CHECKS A COLUMN FOR MISTAKES
    private int CheckColumn(List<TextField> c) {
        int w = 0;
        for (int j = 0; j < 9; j++) {
            if (c.get(j).getText().equals(current.getText()) && !c.get(j).getId().equals(current.getId())) {
                w++;
                t2 = c.get(j);
            }
        }
        return w;
    }
    //CHECKS A BOX FOR MISTAKES
    private int CheckBox(TextField x) {
        int w = 0;
        for (Node n : x.getParent().getChildrenUnmodifiable()) {
            if (((TextField) n).getText().equals(current.getText()) && !n.getId().equals(current.getId())) {
                w++;
                t3 = (TextField) n;
            }
        }
        return w;
    }
    //TOO COMPLICATED TO EXPLAIN :"D
    private void Check() {
        int [][]arr=game.getCopy();
        int row,col;
        int w1 = CheckRow(getRow(current));
        int w2 = 0;
        int w3 = 0;
        if (w1 == 1) {
            w2 = CheckColumn(getColumn(t1));
            w3 = CheckBox(t1);
            row=Integer.parseInt(String.valueOf(t1.toString().charAt(14)));
            col=Integer.parseInt(String.valueOf(t1.toString().charAt(16)));
            if (w2 <= 1 && w3 <= 1 && Integer.parseInt(t1.getText())==arr[row][col])
                t1.setStyle("-fx-background-color: #7d4efc");
        }

        w2 = CheckColumn(getColumn(current));
        if (w2 == 1) {
            w1 = CheckRow(getRow(t2));
            w3 = CheckBox(t2);
            row=Integer.parseInt(String.valueOf(t2.toString().charAt(14)));
            col=Integer.parseInt(String.valueOf(t2.toString().charAt(16)));
            if (w1 <= 1 && w3 <= 1 && Integer.parseInt(t2.getText())==arr[row][col])
                t2.setStyle("-fx-background-color: #7d4efc");
        }

        w3 = CheckBox(current);
        if (w3 == 1) {
            w2 = CheckColumn(getColumn(t3));
            w1 = CheckRow(getRow(t3));
            row=Integer.parseInt(String.valueOf(t3.toString().charAt(14)));
            col=Integer.parseInt(String.valueOf(t3.toString().charAt(16)));
            if (w2 <= 1 && w1 <= 1 && Integer.parseInt(t3.getText())==arr[row][col])
                t3.setStyle("-fx-background-color: #7d4efc");
        }
    }
    //CALCULATES THE FINAL SCORE
    private void finalScore() {
        int FinalScore;
        FinalScore=(Integer.parseInt(Score.getText())*1000)/(Integer.parseInt(Timer_sec.getText())+60*Integer.parseInt(Timer_min.getText()));
        score.setText(String.valueOf(FinalScore));
    }
    //PAUSES THE TIMER
    private void PauseTimer() {
        Timer Game_Timer=new Timer();
        Game_Timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(() -> {
                    if (!timer)
                        Game_Timer.cancel();
                    if (timer) {

                        if (sec == 59) {
                            min++;
                            sec = 0;
                        }
                        if (min < 10) {
                            Timer_min.setText("0" + min);
                        } else
                            Timer_min.setText(String.valueOf(min));
                        if (sec < 10) {
                            Timer_sec.setText("0" + sec);
                        } else
                            Timer_sec.setText(String.valueOf(sec));
                        sec++;
                    }
                });
            }
        }, 0, 1000);
    }
    //CHECKS IF ALL THE 81 CELLS ARE CORRECTLY FILLED
    private boolean Matched(){

        if(cells==81){
            int [][]arr=game.getCopy();
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row0.get(i).getText())!=arr[0][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row1.get(i).getText())!=arr[1][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row2.get(i).getText())!=arr[2][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row3.get(i).getText())!=arr[3][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row4.get(i).getText())!=arr[4][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row5.get(i).getText())!=arr[5][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row6.get(i).getText())!=arr[6][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row7.get(i).getText())!=arr[7][i])
                    return false;
            }
            for(int i=0;i<9;i++){
                if(Integer.parseInt(row8.get(i).getText())!=arr[8][i])
                    return false;
            }
            return true;
        }
        return false;
    }
    //LOCATES AN EMPTY CELL AND FILL IT WITH THE ANSWER (HINT)
    private boolean Locate(List<TextField> x,int y){
        int[][] arr =game.getCopy();
        for (int i = 0; i < 9; i++) {
            if (x.get(i).getText().isEmpty()) {
                x.get(i).setText(String.valueOf(arr[y][i]));
                DisableNumber(String.valueOf(arr[y][i]),'+');
                cells++;
                hint_count--;
                game.AddGiven(x.get(i));
                x.get(i).setStyle("-fx-background-color: #207bff");
                return true;
            }
        }
        return false;
    }
    //COMPARES THE ANSWER WITH THE FINAL ANSWER
    private boolean IsMistake(TextField x){
        int [][]arr=game.getCopy();
        int row,col ;
        int s=Integer.parseInt(x.getText());
        row=Integer.parseInt(String.valueOf(x.toString().charAt(14)));
        col=Integer.parseInt(String.valueOf(x.toString().charAt(16)));


        if(arr[row][col]!=s){
            if(MainController.MistakeLimit) {
                Mistakes++;
                mistakes.setText(Mistakes+"/3");
            }
            return true;
        }
        return false;
    }

    //OTHER EFFECTS
    @FXML
    private void PauseTimerEvent() {
        timer = !timer;
        PauseTimer();
        Image i;
        if (!timer)
            i = new Image(new File("out/production/Sudoku/images/play.png").toURI().toString());
        else
            i = new Image(new File("out/production/Sudoku/images/pause.png").toURI().toString());

        play_pause_img.setImage(i);
        play_pause_img.setFitHeight(47);
        play_pause_img.setFitWidth(35);
    }

    @FXML
    private void RedirectToHTP() throws Exception {
        if (timer){
            timer=false;
            PauseTimer();
            new HowToPlay();
            Game.getGameStage().setOpacity(0.7);
            HowToPlay.getHowToPlayStage().setOnHiding(windowEvent -> {
                timer= true;
                PauseTimer();});
        } else{
            new HowToPlay();
            Game.getGameStage().setOpacity(0.7);
        }
    }

    @FXML
    private void RedirectToHome() {
        if(mode.equals("create"))
        {
            MainController.MistakeLimit=ML;
            MainController.ACMistakes=ACM;
        }
        Game.getGameStage().close();
        Main.main.show();
    }

    @FXML
    private void Undo() {
        if (!Undo.isEmpty()) {
            current = Undo.peek().getKey();
            if (!Undo.peek().getKey().getText().equals("")) {
                Reset();
                delete(current);
                Undo.pop();
            }
            if (!Undo.peek().getValue().equals(""))
            {
                DisableNumber(Undo.peek().getValue(), '+');
                countScore+=50;
                Score.setText(String.valueOf(countScore));
            }
            Undo.peek().getKey().setPromptText("");
            Undo.peek().getKey().setText(Undo.peek().getValue());
            HighlightRCB();
            Undo.pop();
        }
    }

    @FXML
    private void ok() throws Exception {
        if (!name.getText().equals("")) {
            SaveData();
            new HighScores();
            Game.getGameStage().close();
        } else {
            name.setPromptText("Please enter your name");
        }
    }

    @FXML
    private void Won() {
        timer=!timer;
        PauseTimer();
        finalScore();
        Won.setVisible(true);
        WonBox.setVisible(true);
        vb.setDisable(true);
        vb1.setDisable(true);
        time.setText(Timer_min.getText() + ":" + Timer_sec.getText());
    }

    @FXML
    private void start() {
        if (level.getSelectedToggle() == null) {
            easy.setTranslateY(20);
            medium.setTranslateY(4);
            hard.setTranslateY(4);
            easy.setTranslateY(0);
            medium.setTranslateY(0);
            hard.setTranslateY(0);
        }
        else if (create.isSelected()) {
            mode="create";
            ML=MainController.MistakeLimit;
            ACM=MainController.ACMistakes;
            MainController.MistakeLimit=false;
            MainController.ACMistakes=false;
            setRowCol();
            vb.setDisable(false);
            vb1.setDisable(false);
            vb2.setVisible(false);
            start.setVisible(false);
            easy.setVisible(false);
            medium.setVisible(false);
            hard.setVisible(false);
            create.setVisible(false);
            solve.setDisable(false);
            TimerBox.setVisible(false);
            MistakesBox.setVisible(false);
            notes.setDisable(true);
            hint.setDisable(true);
            play_pause.setDisable(true);
            howTobtn.setDisable(true);
            last = null;
        }
        else {
            timer=true;
            mode="play";
            if (easy.isSelected())
                difficulty = "easy";
            else if (medium.isSelected())
                difficulty = "medium";
            else if (hard.isSelected())
                difficulty = "hard";

            setRowCol();
            Sudoku.getGiven().clear();
            game.Play();
            switch (difficulty) {
                case "easy": {
                    game.mode(40);
                    cells=81-40;
                    hint_count=3;
                    break;
                }
                case "medium": {
                    game.mode(50);
                    cells=81-50;
                    hint_count=2;
                    break;
                }
                case "hard": {
                    game.mode(60);
                    cells=81-60;
                    hint_count=1;
                    break;
                }
            }
            game.SettingAllData(row0, row1, row2, row3, row4, row5, row6, row7, row8, 0);

            for (int i = 0; i < Sudoku.getGiven().size(); i++) {
                DisableNumber(Sudoku.getGiven().get(i).getText(), '+');
            }
            Reset();
            vb.setDisable(false);
            vb1.setDisable(false);
            start.setVisible(false);
            easy.setVisible(false);
            medium.setVisible(false);
            hard.setVisible(false);
            solve.setDisable(false);
            TimerBox.setVisible(MainController.Timer);
            MistakesBox.setVisible(MainController.MistakeLimit);
            create.setVisible(false);
            last = null;
            PauseTimer();
        }
    }

    @FXML
    private void solveSudoku() throws NoSolution {
        one.setDisable(true);
        two.setDisable(true);
        three.setDisable(true);
        four.setDisable(true);
        five.setDisable(true);
        six.setDisable(true);
        seven.setDisable(true);
        eight.setDisable(true);
        nine.setDisable(true);
        undo.setDisable(true);
        solve.setDisable(true);
        eraser.setDisable(true);
        hint.setDisable(true);
        notes.setDisable(true);
        play_pause.setDisable(true);
        timer=false;
        PauseTimer();
        sec=min=0;
        Timer_sec.setText("00");
        Timer_min.setText("00");
        countScore=0;
        Score.setText("0");
        score.setText("0");
        if(mode.equals("create"))
        {
            int[][] grid = new int[9][9];
            List<List<TextField>> x = new ArrayList<>(Arrays.asList(row0, row1, row2, row3, row4, row5, row6, row7, row8));
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (!x.get(i).get(j).getText().equals(""))
                        grid[i][j] = Integer.parseInt(x.get(i).get(j).getText());
                    else
                        grid[i][j] = 0;
                }
            }
            game.setGrid(grid);
            if (!game.solve_grid()){
                throw new NoSolution();
            }

            game.SettingAllData(row0, row1, row2, row3, row4, row5, row6, row7, row8, 0);
        }
        else
        {
            game.SettingAllData(row0, row1, row2, row3, row4, row5, row6, row7, row8, 1);
        }
        Reset();
    }

    @FXML
    private void Hint() {
        Random r= new Random();
        boolean found=false;
        while (!found)
        {
            int row = r.nextInt(9);
            switch (row) {
                case 0: {found = Locate(row0,0);break;}
                case 1: {found = Locate(row1,1);break;}
                case 2: {found = Locate(row2,2);break;}
                case 3: {found = Locate(row3,3);break;}
                case 4: {found = Locate(row4,4);break;}
                case 5: {found = Locate(row5,5);break;}
                case 6: {found = Locate(row6,6);break;}
                case 7: {found = Locate(row7,7);break;}
                case 8: {found = Locate(row8,8);break;}
            }
        }

        if (hint_count==0)
            hint.setDisable(true);

        if(Matched())
            Won();
    }

    private static class NoSolution extends Exception {
        NoSolution() {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setResizable(false);
            alert.setTitle("UNSOLVABLE");
            alert.setHeaderText("SOLVER FAILED");
            alert.setContentText("YOUR GRID DOESN'T APPLY TO SUDOKU RULES");
            alert.initOwner(Game.getGameStage());
            alert.setHeight(150);
            alert.showAndWait();
            Game.getGameStage().close();
            Main.main.show();
        }
    }
}