package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.initStyle(StageStyle.UNDECORATED);
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/view/ventana.fxml"));
			Scene scene = new Scene(root,500,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Manejo de eventos");
			primaryStage.show();
			scene.setOnMousePressed((e)->{
                double x1 = primaryStage.getX() - e.getScreenX();
                double y1 = primaryStage.getY() - e.getScreenY();
             
            scene.setOnMouseDragged((a)->{
                double x = a.getScreenX()+x1;
                double y = a.getScreenY()+y1;
                primaryStage.setX(x);
                primaryStage.setY(y);
                });
             
            });
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
