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
import javafx.scene.control.MenuItem;


public class OptionsController implements Initializable {
    
    @FXML
    private MenuItem exitItem;

    @FXML 
    private MenuItem howToPlayItem;
    
    @FXML
    private MenuItem changeLookItem;

    @FXML 
    private MenuItem freshStartItem;

	@Override
    public void initialize(URL location, ResourceBundle resources){

    }

    // action for Fresh Start
    @FXML
    public void exitEvent(ActionEvent event){
        // reset winnings to 0
        // start new game
    }

    // action for How to Play
    @FXML
    public void howToPlayEvent(ActionEvent event){
        // display how to play
    }

    // action for New Look / Old Look
    @FXML
    public void looksEvent(ActionEvent event){
        if(changeLookItem.getText().equals("New Look")){
            changeLookItem.setText("Old Look");
        }
        else{
            changeLookItem.setText("New Look");
        }   
        
    }

    // action for How to Play
    @FXML
    public void freshStartEvent(ActionEvent event){
        
        // display how to play
    }





}