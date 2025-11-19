import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage){
		try {
			Parent root = FXMLLoader.load(getClass()
					.getResource("/FXML/WelcomeFXML.fxml"));

			primaryStage.setTitle("Three Card Poker");
			Scene s1 = new Scene(root, 700, 700);
			root.getStylesheets().add("styles/style1.css");
			primaryStage.setScene(s1);
			primaryStage.show();	
		} catch (Exception e) {
			System.out.println("Fail to start");
			e.printStackTrace();
			System.exit(1);
		}

	}


	public static void main(String[] args) {
		launch(args);
	}

}
