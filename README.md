# Sudoku Game in Java with JavaFX
This is a Sudoku game implemented in Java using object-oriented programming (OOP) concepts and JavaFX library for the graphical user interface (GUI). The game features easy, medium, and hard modes, a how-to-play screen, and various settings including the ability to solve the game, remove last play, and make notes. Additionally, the game has 1 player and 2 player modes.

# Requirements
Java SE Development Kit 8 or later
JavaFX library
# How to Play
Clone or download the repository to your local machine.
Navigate to the directory containing the downloaded files.
Compile the source code by running the following command in the terminal:
Copy code
javac SudokuGame.java
Run the game by executing the following command:
Copy code
java SudokuGame
The main menu of the game will appear. Choose the game mode you want to play: Easy, Medium, or Hard. You can also access the How to Play screen or Settings menu by clicking on the corresponding buttons.
Once you've chosen a game mode, the Sudoku board will appear. Use the mouse to click on an empty cell and enter a number from 1 to 9. You can use the settings menu to solve the game, remove your last play, or make notes.
If you get stuck or want to start over, you can click on the Reset button to clear the board and start again.
Classes and OOP Concepts
The implementation of the Sudoku game is organized into several classes, each responsible for a specific aspect of the game. These classes demonstrate the use of OOP concepts such as inheritance, encapsulation, and polymorphism.

# SudokuGame
The main class of the game that handles the initialization of the game, the creation of the GUI, and the interaction with the user.

# Board
A class that represents the Sudoku board and stores the values of the cells.

# Cell
A class that represents a single cell on the Sudoku board.

# GameMode
An abstract class that defines the common behavior of the Easy, Medium, and Hard game modes.

# EasyMode, MediumMode, HardMode
Classes that extend the GameMode class and implement the specific behavior of each game mode.

# HowToPlayScreen, SettingsScreen
Classes that represent the How to Play and Settings screens of the game, respectively.

# JavaFX
JavaFX is a GUI library for Java that allows developers to create rich and interactive applications. In this Sudoku game, JavaFX was used to create the various screens and elements of the game, including the main menu, the Sudoku board, and the settings menu.

# Conclusion
This Sudoku game demonstrates the use of object-oriented programming concepts and JavaFX library to create an interactive and engaging application. The various game modes, settings, and screens provide a complete and enjoyable gaming experience.
