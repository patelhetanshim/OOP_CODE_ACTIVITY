import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class c35 extends Application {

    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.BOTTOM_CENTER);

        VBox v1 = createBar("Projects - 20%", 100, Color.RED);
        VBox v2 = createBar("Quizzes - 10%", 50, Color.BLUE);
        VBox v3 = createBar("Midterm Exams - 30%", 150, Color.GREEN);
        VBox v4 = createBar("Final Exam - 40%", 200, Color.ORANGE);

        hbox.getChildren().addAll(v1, v2, v3, v4);

        Scene scene = new Scene(hbox, 700, 350);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    public VBox createBar(String text, double height, Color color) {
        Rectangle rect = new Rectangle(80, height);
        rect.setFill(color);

        Label label = new Label(text);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().addAll(rect, label);

        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}