package Controllers;

import Main.HowToPlay;
import Main.Game;
import Main.Main;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class GameController {
    //VARs
    public static boolean timer=true;
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
    private ToggleGroup NoteErase;
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

    public Label getMistakes() {
        return mistakes;
    }

    public void setMistakes(Label mistakes) {
        this.mistakes = mistakes;
    }

    public Button getUndo() {
        return undo;
    }

    public void setUndo(Button undo) {
        this.undo = undo;
    }

    public TextField getR0c0() {
        return r0c0;
    }

    public void setR0c0(TextField r0c0) {
        this.r0c0 = r0c0;
    }

    public TextField getR1c0() {
        return r1c0;
    }

    public void setR1c0(TextField r1c0) {
        this.r1c0 = r1c0;
    }

    public TextField getR2c0() {
        return r2c0;
    }

    public void setR2c0(TextField r2c0) {
        this.r2c0 = r2c0;
    }

    public TextField getR3c0() {
        return r3c0;
    }

    public void setR3c0(TextField r3c0) {
        this.r3c0 = r3c0;
    }

    public TextField getR4c0() {
        return r4c0;
    }

    public void setR4c0(TextField r4c0) {
        this.r4c0 = r4c0;
    }

    public TextField getR5c0() {
        return r5c0;
    }

    public void setR5c0(TextField r5c0) {
        this.r5c0 = r5c0;
    }

    public TextField getR6c0() {
        return r6c0;
    }

    public void setR6c0(TextField r6c0) {
        this.r6c0 = r6c0;
    }

    public TextField getR7c0() {
        return r7c0;
    }

    public void setR7c0(TextField r7c0) {
        this.r7c0 = r7c0;
    }

    public TextField getR8c0() {
        return r8c0;
    }

    public void setR8c0(TextField r8c0) {
        this.r8c0 = r8c0;
    }

    public TextField getR0c1() {
        return r0c1;
    }

    public void setR0c1(TextField r0c1) {
        this.r0c1 = r0c1;
    }

    public TextField getR1c1() {
        return r1c1;
    }

    public void setR1c1(TextField r1c1) {
        this.r1c1 = r1c1;
    }

    public TextField getR2c1() {
        return r2c1;
    }

    public void setR2c1(TextField r2c1) {
        this.r2c1 = r2c1;
    }

    public TextField getR3c1() {
        return r3c1;
    }

    public void setR3c1(TextField r3c1) {
        this.r3c1 = r3c1;
    }

    public TextField getR4c1() {
        return r4c1;
    }

    public void setR4c1(TextField r4c1) {
        this.r4c1 = r4c1;
    }

    public TextField getR5c1() {
        return r5c1;
    }

    public void setR5c1(TextField r5c1) {
        this.r5c1 = r5c1;
    }

    public TextField getR6c1() {
        return r6c1;
    }

    public void setR6c1(TextField r6c1) {
        this.r6c1 = r6c1;
    }

    public TextField getR7c1() {
        return r7c1;
    }

    public void setR7c1(TextField r7c1) {
        this.r7c1 = r7c1;
    }

    public TextField getR8c1() {
        return r8c1;
    }

    public void setR8c1(TextField r8c1) {
        this.r8c1 = r8c1;
    }

    public TextField getR0c2() {
        return r0c2;
    }

    public void setR0c2(TextField r0c2) {
        this.r0c2 = r0c2;
    }

    public TextField getR1c2() {
        return r1c2;
    }

    public void setR1c2(TextField r1c2) {
        this.r1c2 = r1c2;
    }

    public TextField getR2c2() {
        return r2c2;
    }

    public void setR2c2(TextField r2c2) {
        this.r2c2 = r2c2;
    }

    public TextField getR3c2() {
        return r3c2;
    }

    public void setR3c2(TextField r3c2) {
        this.r3c2 = r3c2;
    }

    public TextField getR4c2() {
        return r4c2;
    }

    public void setR4c2(TextField r4c2) {
        this.r4c2 = r4c2;
    }

    public TextField getR5c2() {
        return r5c2;
    }

    public void setR5c2(TextField r5c2) {
        this.r5c2 = r5c2;
    }

    public TextField getR6c2() {
        return r6c2;
    }

    public void setR6c2(TextField r6c2) {
        this.r6c2 = r6c2;
    }

    public TextField getR7c2() {
        return r7c2;
    }

    public void setR7c2(TextField r7c2) {
        this.r7c2 = r7c2;
    }

    public TextField getR8c2() {
        return r8c2;
    }

    public void setR8c2(TextField r8c2) {
        this.r8c2 = r8c2;
    }

    public TextField getR0c3() {
        return r0c3;
    }

    public void setR0c3(TextField r0c3) {
        this.r0c3 = r0c3;
    }

    public TextField getR1c3() {
        return r1c3;
    }

    public void setR1c3(TextField r1c3) {
        this.r1c3 = r1c3;
    }

    public TextField getR2c3() {
        return r2c3;
    }

    public void setR2c3(TextField r2c3) {
        this.r2c3 = r2c3;
    }

    public TextField getR3c3() {
        return r3c3;
    }

    public void setR3c3(TextField r3c3) {
        this.r3c3 = r3c3;
    }

    public TextField getR4c3() {
        return r4c3;
    }

    public void setR4c3(TextField r4c3) {
        this.r4c3 = r4c3;
    }

    public TextField getR5c3() {
        return r5c3;
    }

    public void setR5c3(TextField r5c3) {
        this.r5c3 = r5c3;
    }

    public TextField getR6c3() {
        return r6c3;
    }

    public void setR6c3(TextField r6c3) {
        this.r6c3 = r6c3;
    }

    public TextField getR7c3() {
        return r7c3;
    }

    public void setR7c3(TextField r7c3) {
        this.r7c3 = r7c3;
    }

    public TextField getR8c3() {
        return r8c3;
    }

    public void setR8c3(TextField r8c3) {
        this.r8c3 = r8c3;
    }

    public TextField getR0c4() {
        return r0c4;
    }

    public void setR0c4(TextField r0c4) {
        this.r0c4 = r0c4;
    }

    public TextField getR1c4() {
        return r1c4;
    }

    public void setR1c4(TextField r1c4) {
        this.r1c4 = r1c4;
    }

    public TextField getR2c4() {
        return r2c4;
    }

    public void setR2c4(TextField r2c4) {
        this.r2c4 = r2c4;
    }

    public TextField getR3c4() {
        return r3c4;
    }

    public void setR3c4(TextField r3c4) {
        this.r3c4 = r3c4;
    }

    public TextField getR4c4() {
        return r4c4;
    }

    public void setR4c4(TextField r4c4) {
        this.r4c4 = r4c4;
    }

    public TextField getR5c4() {
        return r5c4;
    }

    public void setR5c4(TextField r5c4) {
        this.r5c4 = r5c4;
    }

    public TextField getR6c4() {
        return r6c4;
    }

    public void setR6c4(TextField r6c4) {
        this.r6c4 = r6c4;
    }

    public TextField getR7c4() {
        return r7c4;
    }

    public void setR7c4(TextField r7c4) {
        this.r7c4 = r7c4;
    }

    public TextField getR8c4() {
        return r8c4;
    }

    public void setR8c4(TextField r8c4) {
        this.r8c4 = r8c4;
    }

    public TextField getR0c5() {
        return r0c5;
    }

    public void setR0c5(TextField r0c5) {
        this.r0c5 = r0c5;
    }

    public TextField getR1c5() {
        return r1c5;
    }

    public void setR1c5(TextField r1c5) {
        this.r1c5 = r1c5;
    }

    public TextField getR2c5() {
        return r2c5;
    }

    public void setR2c5(TextField r2c5) {
        this.r2c5 = r2c5;
    }

    public TextField getR3c5() {
        return r3c5;
    }

    public void setR3c5(TextField r3c5) {
        this.r3c5 = r3c5;
    }

    public TextField getR4c5() {
        return r4c5;
    }

    public void setR4c5(TextField r4c5) {
        this.r4c5 = r4c5;
    }

    public TextField getR5c5() {
        return r5c5;
    }

    public void setR5c5(TextField r5c5) {
        this.r5c5 = r5c5;
    }

    public TextField getR6c5() {
        return r6c5;
    }

    public void setR6c5(TextField r6c5) {
        this.r6c5 = r6c5;
    }

    public TextField getR7c5() {
        return r7c5;
    }

    public void setR7c5(TextField r7c5) {
        this.r7c5 = r7c5;
    }

    public TextField getR8c5() {
        return r8c5;
    }

    public void setR8c5(TextField r8c5) {
        this.r8c5 = r8c5;
    }

    public TextField getR0c6() {
        return r0c6;
    }

    public void setR0c6(TextField r0c6) {
        this.r0c6 = r0c6;
    }

    public TextField getR1c6() {
        return r1c6;
    }

    public void setR1c6(TextField r1c6) {
        this.r1c6 = r1c6;
    }

    public TextField getR2c6() {
        return r2c6;
    }

    public void setR2c6(TextField r2c6) {
        this.r2c6 = r2c6;
    }

    public TextField getR3c6() {
        return r3c6;
    }

    public void setR3c6(TextField r3c6) {
        this.r3c6 = r3c6;
    }

    public TextField getR4c6() {
        return r4c6;
    }

    public void setR4c6(TextField r4c6) {
        this.r4c6 = r4c6;
    }

    public TextField getR5c6() {
        return r5c6;
    }

    public void setR5c6(TextField r5c6) {
        this.r5c6 = r5c6;
    }

    public TextField getR6c6() {
        return r6c6;
    }

    public void setR6c6(TextField r6c6) {
        this.r6c6 = r6c6;
    }

    public TextField getR7c6() {
        return r7c6;
    }

    public void setR7c6(TextField r7c6) {
        this.r7c6 = r7c6;
    }

    public TextField getR8c6() {
        return r8c6;
    }

    public void setR8c6(TextField r8c6) {
        this.r8c6 = r8c6;
    }

    public TextField getR0c7() {
        return r0c7;
    }

    public void setR0c7(TextField r0c7) {
        this.r0c7 = r0c7;
    }

    public TextField getR1c7() {
        return r1c7;
    }

    public void setR1c7(TextField r1c7) {
        this.r1c7 = r1c7;
    }

    public TextField getR2c7() {
        return r2c7;
    }

    public void setR2c7(TextField r2c7) {
        this.r2c7 = r2c7;
    }

    public TextField getR3c7() {
        return r3c7;
    }

    public void setR3c7(TextField r3c7) {
        this.r3c7 = r3c7;
    }

    public TextField getR4c7() {
        return r4c7;
    }

    public void setR4c7(TextField r4c7) {
        this.r4c7 = r4c7;
    }

    public TextField getR5c7() {
        return r5c7;
    }

    public void setR5c7(TextField r5c7) {
        this.r5c7 = r5c7;
    }

    public TextField getR6c7() {
        return r6c7;
    }

    public void setR6c7(TextField r6c7) {
        this.r6c7 = r6c7;
    }

    public TextField getR7c7() {
        return r7c7;
    }

    public void setR7c7(TextField r7c7) {
        this.r7c7 = r7c7;
    }

    public TextField getR8c7() {
        return r8c7;
    }

    public void setR8c7(TextField r8c7) {
        this.r8c7 = r8c7;
    }

    public TextField getR0c8() {
        return r0c8;
    }

    public void setR0c8(TextField r0c8) {
        this.r0c8 = r0c8;
    }

    public TextField getR1c8() {
        return r1c8;
    }

    public void setR1c8(TextField r1c8) {
        this.r1c8 = r1c8;
    }

    public TextField getR2c8() {
        return r2c8;
    }

    public void setR2c8(TextField r2c8) {
        this.r2c8 = r2c8;
    }

    public TextField getR3c8() {
        return r3c8;
    }

    public void setR3c8(TextField r3c8) {
        this.r3c8 = r3c8;
    }

    public TextField getR4c8() {
        return r4c8;
    }

    public void setR4c8(TextField r4c8) {
        this.r4c8 = r4c8;
    }

    public TextField getR5c8() {
        return r5c8;
    }

    public void setR5c8(TextField r5c8) {
        this.r5c8 = r5c8;
    }

    public TextField getR6c8() {
        return r6c8;
    }

    public void setR6c8(TextField r6c8) {
        this.r6c8 = r6c8;
    }

    public TextField getR7c8() {
        return r7c8;
    }

    public void setR7c8(TextField r7c8) {
        this.r7c8 = r7c8;
    }

    public TextField getR8c8() {
        return r8c8;
    }

    public void setR8c8(TextField r8c8) {
        this.r8c8 = r8c8;
    }

    public Button getHint() {
        return hint;
    }

    public void setHint(Button hint) {
        this.hint = hint;
    }

    public ToggleButton getNotes() {
        return notes;
    }

    public void setNotes(ToggleButton notes) {
        this.notes = notes;
    }

    public ToggleGroup getNoteErase() {
        return NoteErase;
    }

    public void setNoteErase(ToggleGroup noteErase) {
        NoteErase = noteErase;
    }

    public ToggleButton getOne() {
        return one;
    }

    public void setOne(ToggleButton one) {
        this.one = one;
    }

    public ToggleGroup getEntryNumbers() {
        return EntryNumbers;
    }

    public void setEntryNumbers(ToggleGroup entryNumbers) {
        EntryNumbers = entryNumbers;
    }

    public ToggleButton getTwo() {
        return two;
    }

    public void setTwo(ToggleButton two) {
        this.two = two;
    }

    public ToggleButton getThree() {
        return three;
    }

    public void setThree(ToggleButton three) {
        this.three = three;
    }

    public ToggleButton getFour() {
        return four;
    }

    public void setFour(ToggleButton four) {
        this.four = four;
    }

    public ToggleButton getFive() {
        return five;
    }

    public void setFive(ToggleButton five) {
        this.five = five;
    }

    public ToggleButton getSix() {
        return six;
    }

    public void setSix(ToggleButton six) {
        this.six = six;
    }

    public ToggleButton getSeven() {
        return seven;
    }

    public void setSeven(ToggleButton seven) {
        this.seven = seven;
    }

    public ToggleButton getEight() {
        return eight;
    }

    public void setEight(ToggleButton eight) {
        this.eight = eight;
    }

    public ToggleButton getNine() {
        return nine;
    }

    public void setNine(ToggleButton nine) {
        this.nine = nine;
    }

    public ToggleButton getEraser() {
        return eraser;
    }

    public void setEraser(ToggleButton eraser) {
        this.eraser = eraser;
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
    private void EraserPE(MouseEvent event) {
        eraser.setTranslateY(4);
    }

    @FXML
    private void EraserRE(MouseEvent event) {
        eraser.setTranslateY(0);
    }

    @FXML
    private void HintPE(MouseEvent event) {
        hint.setTranslateY(4);
    }

    @FXML
    private void HintRE(MouseEvent event) {
        hint.setTranslateY(0);
    }

    @FXML
    private void NoteRE(MouseEvent event) {
        notes.setTranslateY(0);
    }

    @FXML
    private void NotesPE(MouseEvent event) {
        notes.setTranslateY(4);
    }

    @FXML
    private void UndoPE(MouseEvent event) {
        undo.setTranslateY(4);
    }

    @FXML
    private void UndoRE(MouseEvent event) {
        undo.setTranslateY(0);
    }

    @FXML
    private void onePE() {
        one.setTranslateY(4);
    }

    @FXML
    private void oneRE() {
        one.setTranslateY(0);
    }

    @FXML
    private void twoPE() {
        two.setTranslateY(4);
    }

    @FXML
    private void twoRE() {
        two.setTranslateY(0);
    }

    @FXML
    private void threePE() {
        three.setTranslateY(4);
    }

    @FXML
    private void threeRE() {
        three.setTranslateY(0);
    }

    @FXML
    private void fourPE() {
        four.setTranslateY(4);
    }

    @FXML
    private void fourRE() {
        four.setTranslateY(0);
    }

    @FXML
    private void fivePE() {
        five.setTranslateY(4);
    }

    @FXML
    private void fiveRE() {
        five.setTranslateY(0);
    }

    @FXML
    private void sixPE() {
        six.setTranslateY(4);
    }

    @FXML
    private void sixRE() {
        six.setTranslateY(0);
    }

    @FXML
    private void sevenPE() {
        seven.setTranslateY(4);
    }

    @FXML
    private void sevenRE() {
        seven.setTranslateY(0);
    }

    @FXML
    private void eightPE() {
        eight.setTranslateY(4);
    }

    @FXML
    private void eightRE() {
        eight.setTranslateY(0);
    }

    @FXML
    private void ninePE() {
        nine.setTranslateY(4);
    }

    @FXML
    private void nineRE() {
        nine.setTranslateY(0);
    }


    private void setText(TextField x) {
        //we have to check if the cell is given or not before we change the value (i.e. the cell is filled by the game)
        String s = null;

       try{s=String.valueOf(EntryNumbers.getSelectedToggle().toString().charAt(EntryNumbers.getSelectedToggle().toString().length() - 2));}
       catch (Exception ignored){};

       try{
           assert s != null;
           if(s.equals("'"))
            x.setText("");
       else
           x.setText(s);
       }
       catch(Exception ignored){};
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

    @FXML
    public void PauseTimerEvent() {
        PauseTimer();
    }

    ////////////////
    //TO BE EDITED//
    ////////////////

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
    }
    @FXML
    private void Hint() {
        //give hint "reveal one random cell solution" MAKE SURE random output isn't already given
    }
    public static void PauseTimer()
    {
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