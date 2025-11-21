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

    // used to show certain option
    ShowOptions showThis = new ShowOptions();

    // action for Exit
    @FXML
    public void exitEvent(ActionEvent event){
        showThis.showOption("/FXML/ExitFXML.fxml", "You have left Three Card Poker...");
    }

    // action for How to Play
    @FXML
    public void howToPlayEvent(ActionEvent event){
        showThis.showOption("/FXML/RulesFXML.fxml", "Three Card Poker Rules");
    }

    // action for New Look / Old Look
    @FXML
    public void looksEvent(ActionEvent event){
        // change text of menu item to opposite
        if(changeLookItem.getText().equals("New Look")){
            changeLookItem.setText("Old Look");
        }
        else{
            changeLookItem.setText("New Look");
        }   
        
    }

    // action for Fresh Start
    @FXML
    public void freshStartEvent(ActionEvent event){
        
        //restart game to original
    }





}