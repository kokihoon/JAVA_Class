import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class W07P03 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        root.setPrefWidth(350);
        root.setPrefHeight(150);



        root.setAlignment(Pos.CENTER);

        Button button = new Button();
        button.setText("로또번호생성");
        button.setOnAction(event -> {
            Set<Integer> lotte = new HashSet<>();
            Random random = new Random();
            String str = "";

            while(lotte.size() < 6) {
                lotte.add(random.nextInt(45)+1);
            }

            Iterator<Integer> iterator = lotte.iterator();

            while(iterator.hasNext()) {

                str += iterator.next()+", ";
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("로또 번호");
            alert.setContentText(str);
            alert.showAndWait();
        });

        root.getChildren().add(button);

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
