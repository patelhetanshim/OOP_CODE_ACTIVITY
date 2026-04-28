import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.Random;

public class c33 extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);

        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            Text text = new Text("Text " + i);

            text.setFont(Font.font(
                    "Times New Roman",
                    FontWeight.BOLD,
                    FontPosture.ITALIC,
                    22
            ));

            Color randomColor = Color.color(
                    random.nextDouble(),
                    random.nextDouble(),
                    random.nextDouble()
            );

            text.setFill(randomColor);

            double opacity = 0.3 + (random.nextDouble() * 0.7);
            text.setOpacity(opacity);

            vbox.getChildren().add(text);
        }

        Scene scene = new Scene(vbox, 400, 300);

        stage.setTitle("Five Text Nodes");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}