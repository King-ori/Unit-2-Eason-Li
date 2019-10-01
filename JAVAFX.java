import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Ellipse;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;


public class JAVAFX extends Application {

  public void start(Stage stage){
    Font f = new Font(24);


    Text school = new Text(780, 549, "School is hard!");
    Text question = new Text(700, 350, "How can I pass the quiz this week?");
    Text main_Idea=new Text(720,200,"How do you learn coding better?");
    main_Idea.setFont(f);
    Ellipse box = new Ellipse(800, 350, 160, 100);
    Circle circle=new Circle(800,549,100);
    box.setStroke(Color.SILVER);
    circle.setStroke(Color.GREEN);
    box.setFill(null);
    circle.setFill(null);

    Group root = new Group(school, question, box,circle,main_Idea);
    Scene scene = new Scene(root, 300, 120, Color.GOLD);

    stage.setTitle("FXPractice");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args){
    launch(args);
  }
}
