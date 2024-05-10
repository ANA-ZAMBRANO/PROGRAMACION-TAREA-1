import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane anchorPane = new AnchorPane();

        Label label1 = new Label("Anna Zambrano");
        Label label2 = new Label("Jose Alvarado");
        Label label3 = new Label("Carlos Veliz");
        Label label4 = new Label("Ashley Centeno");
        Label label5 = new Label("Michelle Zambrano");

        TextField textfield = new TextField();
        ImageView imagen1 = new ImageView("arana.jpg");
        ImageView imagen2 = new ImageView("luigui.jpg");
        ImageView imagen3 = new ImageView("batman.jpg");
        ImageView imagen4 = new ImageView("princesa.jpg");
        ImageView imagen5 = new ImageView("sofia.jpg");
        
        
        
        
        imagen1.setFitHeight(30);
        imagen1.setFitWidth(30);
        imagen2.setFitHeight(30);
        imagen2.setFitWidth(30);
        imagen3.setFitHeight(30);
        imagen3.setFitWidth(30);
        imagen4.setFitHeight(30);
        imagen4.setFitWidth(30);
        imagen5.setFitHeight(30);
        imagen5.setFitWidth(30);
        ListView<String> listview = new ListView<>();
        anchorPane.getChildren().addAll(label1, label2,label3,label4,label5,textfield, listview, imagen1,imagen2,imagen3,imagen4,imagen5);
        
        AnchorPane.setTopAnchor(label1,10d);
        AnchorPane.setLeftAnchor(label1, 80d);

        AnchorPane.setTopAnchor(label2, 60d);
        AnchorPane.setLeftAnchor(label2, 80d);

        AnchorPane.setTopAnchor(label3, 100d);
        AnchorPane.setLeftAnchor(label3, 80d);

        AnchorPane.setTopAnchor(label4, 140d);
        AnchorPane.setLeftAnchor(label4, 80d);

        AnchorPane.setTopAnchor(label5, 180d);
        AnchorPane.setLeftAnchor(label5, 80d);

        AnchorPane.setBottomAnchor(textfield, 10d);
        AnchorPane.setRightAnchor(textfield, 10d);

        AnchorPane.setTopAnchor(listview, 10d);
        AnchorPane.setRightAnchor(listview, 10d);

        AnchorPane.setTopAnchor(imagen1, 10d);
        AnchorPane.setLeftAnchor(imagen1, 10d);

        AnchorPane.setTopAnchor(imagen2, 50d);
        AnchorPane.setLeftAnchor(imagen2, 10d);

        AnchorPane.setTopAnchor(imagen3, 90d);
        AnchorPane.setLeftAnchor(imagen3, 10d);

        
        AnchorPane.setTopAnchor(imagen4, 130d);
        AnchorPane.setLeftAnchor(imagen4, 10d);

        AnchorPane.setTopAnchor(imagen5, 170d);
        AnchorPane.setLeftAnchor(imagen5, 10d);

        Scene scene = new Scene(anchorPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("AnchorPane con ListView");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
