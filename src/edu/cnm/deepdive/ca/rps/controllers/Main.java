package edu.cnm.deepdive.ca.rps.controllers;

import edu.cnm.deepdive.ca.rps.util.Constants;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *Implements the controller and runs the Rock-Paper-Scissors program.
 *
 * @author itajan
 * @version 1.0
 */
public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    ResourceBundle bundle = ResourceBundle.getBundle(Constants.UI_STRINGS);
    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource(
        Constants.MAIN_FXML), bundle);
    Parent root
        = loader.load();
    Controller controller = loader.getController();
    controller.setBundle(bundle);
    primaryStage.setTitle(bundle.getString(Constants.WINDOW_TITLE_KEY));
    primaryStage.setResizable(false);
    primaryStage.setScene(new Scene(root, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT));
    primaryStage.show();
  }

  /**
   *
   * a main method
   * @param args a string of arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
}
