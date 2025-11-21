import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class ShowOptions {

    public void showOption(String fxmlPath, String stageTitle){
            Stage secondaryStage = new Stage();
        	try {
			Parent root = FXMLLoader.load(getClass()
					.getResource(fxmlPath));
			

			secondaryStage.setTitle(stageTitle);
			Scene s1 = new Scene(root, 700, 700);
			root.getStylesheets().add("styles/style1.css");
			secondaryStage.setScene(s1);
			secondaryStage.show();	

			

		} catch (Exception e) {
			System.out.println("Fail to load secondary stage");
			e.printStackTrace();
			System.exit(1);
		}

    }






}