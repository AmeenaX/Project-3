import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.application.Platform;

public class GamePlayController implements Initializable{
	public static boolean WinLoose = false;
	@FXML
    private Button DealButton;
	@FXML
    private Button PlayButton;
	@FXML
    private Button FoldButton;
	
	
	@FXML
	private Label GamePlayHeader;
	@FXML
	private Label ThreeCardPokerHeader;
	@FXML
    private Label AnteLabel;
	@FXML
    private Label PairPlus;
	@FXML
    private Label PlayWager;
	@FXML
    private Label Winnings;
	@FXML
    private Label Status;
	@FXML
    private Text DealersHand;
	@FXML
    private Text PlayersHand;
	@FXML
    private TextField AntePromptText;
	@FXML
    private TextField PairPlusPromptText;
	@FXML
    private TextField PlayWagerPromtText;
	@FXML
    private Text StatusText;
	@FXML
    private Text WinningsText;
	@FXML
	public OptionsController optionsController;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		GamePlayHeader.setText("Game Play");
		ThreeCardPokerHeader.setText("Three Card Poker");
		
		AnteLabel.setText("Ante");
		PairPlus.setText("Pair Plus");
		PlayWager.setText("Play Wager");
		Winnings.setText("Winnings");
		
		Status.setText("Status");
		DealersHand.setText("--------------------Dealers Hand--------------------");
		PlayersHand.setText("----------------------Your Hand----------------------");
		
		AntePromptText.setText("");
		PairPlusPromptText.setText("");
		PlayWagerPromtText.setText("");
		StatusText.setText("Pending game status Message");
		WinningsText.setText("$XX.XX");
		
		
		WinLoose = false;
		PlayButton.setText("Play");
		DealButton.setText("Deal");
		FoldButton.setText("Fold");
	}
	
	//WinCheck Pending CLient/PokerInfo Logic
	//public void WinCheck(ActionEvent event) {
		
			//Client.resultsUpdate(WinLoose);
			//String FXMLString;
		    
			//if(WinLoose) {
			//	FXMLString = "/FXML/WinFXML.fxml";
		    //}else {
		    	//FXMLString = "/FXML/LooseFXML.fxml";
		    //}
		
	//try {
        //Parent root = FXMLLoader.load(getClass().getResource(FXMLString));
        
        //Scene ResultScene = new Scene(root, 900,900);
        //ResultScene.getStylesheets().add("/Styles/style1.css");
        //Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //stage.setScene(ResultScene);
     
    //} catch(Exception e) {
       // e.printStackTrace();
        //System.exit(1);
    	//}
	//}
	
	
	//Play, Deal & Fold Event Handlers
	public void PlayGame(ActionEvent Event) {}
	public void FoldGame(ActionEvent Event) {}
	public void DealGame(ActionEvent Event) {}
	
}