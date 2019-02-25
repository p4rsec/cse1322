package src.application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

	public class SimpleCalc {

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="nine"
	    private Button nine; // Value injected by FXMLLoader

	    @FXML // fx:id="minus"
	    private Button minus; // Value injected by FXMLLoader

	    @FXML // fx:id="six"
	    private Button six; // Value injected by FXMLLoader

	    @FXML // fx:id="one"
	    private Button one; // Value injected by FXMLLoader

	    @FXML // fx:id="display"
	    private TextField display; // Value injected by FXMLLoader

	    @FXML // fx:id="clear"
	    private Button clear; // Value injected by FXMLLoader

	    @FXML // fx:id="seven"
	    private Button seven; // Value injected by FXMLLoader

	    @FXML // fx:id="two"
	    private Button two; // Value injected by FXMLLoader

	    @FXML // fx:id="three"
	    private Button three; // Value injected by FXMLLoader

	    @FXML // fx:id="plus"
	    private Button plus; // Value injected by FXMLLoader

	    @FXML // fx:id="eight"
	    private Button eight; // Value injected by FXMLLoader

	    @FXML // fx:id="zero"
	    private Button zero; // Value injected by FXMLLoader

	    @FXML // fx:id="four"
	    private Button four; // Value injected by FXMLLoader

	    @FXML // fx:id="equals"
	    private Button equals; // Value injected by FXMLLoader

	    @FXML // fx:id="divide"
	    private Button divide; // Value injected by FXMLLoader

	    @FXML // fx:id="multiply"
	    private Button multiply; // Value injected by FXMLLoader

		@FXML // fx:id="five"
	    private Button five; // Value injected by FXMLLoader

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert display != null : "fx:id=\"display\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert clear != null : "fx:id=\"clear\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert plus != null : "fx:id=\"plus\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'SimpleCalc.fxml'.";
	        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'SimpleCalc.fxml'.";

	    }
	}