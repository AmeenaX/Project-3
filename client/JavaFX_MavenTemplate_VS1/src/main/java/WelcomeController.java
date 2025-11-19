import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
//import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;


public class WelcomeController implements Initializable {
	
	@FXML
	private BorderPane root;

    @FXML
    private Label welcomeLabel1;

    @FXML
    private Label welcomeLabel2;

    @FXML
    private Label portLabel;

    @FXML
    private Label ipLabel;

    @FXML
    private TextField ipText;

    @FXML
    private TextField portText;

    @FXML
    private Button connectButton;

    @FXML
    public OptionsController optionsController;

    // store user portNumber
    int portNum;

    // store user ipAddress
    String ipAddress;
    
	
	@Override
    public void initialize(URL location, ResourceBundle resources){

    }



    // action for connect button
    public void connectEvent(){
        connectButton.setOnAction(e -> {
            // try to connect to server
            // give warning for invalid inputs
            // change to game scene
            
        });
    }


}
