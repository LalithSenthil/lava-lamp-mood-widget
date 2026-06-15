import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.example.lavalamp.ui.WidgetWindow;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lava Lamp Mood Widget");
        
        WidgetWindow widgetWindow = new WidgetWindow();
        Scene scene = new Scene(widgetWindow.getRoot(), 800, 600);
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}