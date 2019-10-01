/*6. Write a program that draws a snowman (or woman).
There should be a blue sky and a white ground in the background.
Then give the snowman three distinct sections for the lower body, torso, and head.
Also include arms, nose, eyes, and a top hat.
The parts of the snowman should be appropriate colors.
Uses variables and constants to avoid magic numbers!*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;

import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class snowman extends Application {

  public void start(Stage stage){


    Scene scene = new Scene( 300, 120, Color.LIGHTBLUE);

    stage.setTitle("snowman");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
