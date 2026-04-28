import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class c34 extends Application {

    @Override
    public void start(Stage stage) {
        Label l1 = new Label("Roll No:");
        Label l2 = new Label("Name:");
        Label l3 = new Label("Age:");
        Label l4 = new Label("Email:");

        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();

        Button b = new Button("Submit");

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(10);

        gp.add(l1, 0, 0);
        gp.add(t1, 1, 0);

        gp.add(l2, 0, 1);
        gp.add(t2, 1, 1);

        gp.add(l3, 0, 2);
        gp.add(t3, 1, 2);

        gp.add(l4, 0, 3);
        gp.add(t4, 1, 3);

        gp.add(b, 1, 4);

        b.setOnAction(e -> {
            try {
                int rollNo = Integer.parseInt(t1.getText());
                String name = t2.getText();
                int age = Integer.parseInt(t3.getText());
                String email = t4.getText();

                if (!email.contains("@") || !email.contains(".")) {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setTitle("Error");
                    a.setHeaderText(null);
                    a.setContentText("Invalid Email Format");
                    a.showAndWait();
                    return;
                }

                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setTitle("Success");
                a.setHeaderText(null);
                a.setContentText(
                        "Registration Successful\n\n" +
                        "Roll No: " + rollNo + "\n" +
                        "Name: " + name + "\n" +
                        "Age: " + age + "\n" +
                        "Email: " + email
                );
                a.showAndWait();

            } catch (NumberFormatException ex) {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("Error");
                a.setHeaderText(null);
                a.setContentText("Roll No and Age must be integers");
                a.showAndWait();
            }
        });

        Scene scene = new Scene(gp, 400, 300);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}