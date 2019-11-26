import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;
import java.nio.charset.Charset;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;
import javax.money.MonetaryAmountFactory;
import javax.money.NumberValue;
import javax.money.convert.ConversionContext;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRate;
import javax.money.convert.ExchangeRateProvider;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.tunyk.currencyconverter.BankUaCom;
import com.tunyk.currencyconverter.api.CurrencyConverterException;

<<<<<<< Updated upstream
=======
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
>>>>>>> Stashed changes
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

	public class Controller {


		String inputCurrencyType;
		Double exchangeRate;
		 ObservableList<String> comboBox;


	   @FXML
	    private Label InputCurrencyLabel;

	    @FXML
	    private Label InputCurrencyDropdownLabel;

	    @FXML
	    private Label OutputCurrencyDropdownLabel;

	    @FXML
	    private TextField InputCurrencyField;

	    @FXML
	    private TextField OutputCurrencyField;

	    @FXML
	    private Label OutputCurrencyFieldLabel;

	    @FXML
	    private ComboBox<String> InputCurrencyDropdown;

	    @FXML
	    private ComboBox<String> OutputCurrencyDropdown;

	    @FXML
	    private Button CalculateButton;

	    @FXML
	    private Button ClearButton;



	    @FXML
	    void CalculateClick(ActionEvent event) throws JSONException, IOException {

	    	String a;


	    	double InputCurrencyValue = Double.parseDouble(InputCurrencyField.getText());
	    	double outputCurrencyValue;

	    	double exchangeRate = 0;



	    	String inputCurrencyType = (String) InputCurrencyDropdown.getValue();
	    	String outputCurrencyType = (String) OutputCurrencyDropdown.getValue();
	    	String[] outputCurrencyType1 = outputCurrencyType.split(":");
	    	String outputCurrencyType2 = outputCurrencyType1[0].replace("\"", "");


	    	this.inputCurrencyType = inputCurrencyType;


	    }
	    
	   public void testing() throws JsonIOException, JsonSyntaxException, IOException, CurrencyConverterException { 
	 // Setting URL
		   
		   // Testing ExchangeRape-API with the example they have on their website. 
	    String url_str = "https://api.exchangerate-api.com/v4/latest/USD";

	    // Making Request
	    URL url = new URL(url_str);
	    HttpURLConnection request = (HttpURLConnection) url.openConnection();
	    request.connect();

	    // Convert to JSON
	    JsonParser jp = new JsonParser();
	   
	    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
	    JsonObject jsonobj = root.getAsJsonObject();

	    // Accessing object
	    String req_result = jsonobj.get("result").getAsString();
	    
	    System.out.println(req_result);
	    
	    
	   }
	   
	   
	   
	   
	   private static String readAll(Reader rd) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    int cp;
		    while ((cp = rd.read()) != -1) {
		      sb.append((char) cp);
		    }
		    return sb.toString();
		  }

		  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		    InputStream is = new URL(url).openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		      JSONObject json = new JSONObject(jsonText);
		      return json;
		    } finally {
		      is.close();
		    }
		  }

	   
	   public static void main(String[] args) throws IOException, JSONException {
		    JSONObject json = readJsonFromUrl("https://api.exchangerate-api.com/v4/latest/USD");
		    String jsonString = json.toString();
		    System.out.println(jsonString);
		    
	   }
		    

	   public void testing() throws JsonIOException, JsonSyntaxException, IOException, CurrencyConverterException {
	 // Setting URL

		   // Testing ExchangeRape-API with the example they have on their website.
	    String url_str = "https://api.exchangerate-api.com/v4/latest/USD";

	    // Making Request
	    URL url = new URL(url_str);
	    HttpURLConnection request = (HttpURLConnection) url.openConnection();
	    request.connect();

	    // Convert to JSON
	    JsonParser jp = new JsonParser();

	    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
	    JsonObject jsonobj = root.getAsJsonObject();

	    // Accessing object
	    String req_result = jsonobj.get("result").getAsString();

	    System.out.println(req_result);


	   }




	   private static String readAll(Reader rd) throws IOException {
		    StringBuilder sb = new StringBuilder();
		    int cp;
		    while ((cp = rd.read()) != -1) {
		      sb.append((char) cp);
		    }
		    return sb.toString();
		  }

		  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		    InputStream is = new URL(url).openStream();
		    try {
		      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
		      String jsonText = readAll(rd);
		      JSONObject json = new JSONObject(jsonText);
		      return json;
		    } finally {
		      is.close();
		    }
		  }


	   public static void main(String[] args) throws IOException, JSONException {
		    JSONObject json = readJsonFromUrl("https://api.exchangerate-api.com/v4/latest/USD");
		    String jsonString = json.toString();
		    System.out.println(jsonString);

	   }


	    @FXML
	    void InputCurrencyPopulate(ActionEvent event) {

	    	InputCurrencyDropdown.setDisable(true);
	    	OutputCurrencyDropdown.setDisable(true);

	    }

	    @FXML
	    void ClearClick(ActionEvent event) throws IOException {




	    	InputCurrencyField.clear();
	    	OutputCurrencyField.clear();
	    	OutputCurrencyDropdown.autosize();
	    	InputCurrencyDropdown.valueProperty().set(null);
	    	OutputCurrencyDropdown.valueProperty().set(null);
	    	InputCurrencyDropdown.getItems().removeAll(InputCurrencyDropdown.getItems());
	    	OutputCurrencyDropdown.getItems().removeAll(OutputCurrencyDropdown.getItems());




	    	OutputCurrencyDropdown.autosize();

	    	InputCurrencyDropdown.getItems().addAll(comboBox);
	    	OutputCurrencyDropdown.setDisable(false);
	    	InputCurrencyDropdown.setDisable(false);

	    	/*InputCurrencyField.setText("");
	    	OutputCurrencyField.setText("");
	    	OutputCurrencyDropdown.getItems().clear();
	    	InputCurrencyDropdown.getItems().clear();

	    	InputCurrencyDropdown.setDisable(true);
	    	OutputCurrencyDropdown.setDisable(true);

	    	InputCurrencyDropdown.hide();
	    	InputCurrencyDropdown.getSelectionModel().clearSelection();
	    	OutputCurrencyDropdown.hide();

	    	InputCurrencyDropdown.setPrefSize(0, 0);
	    	OutputCurrencyDropdown.setPrefHeight(0);
	    	OutputCurrencyDropdown.setPrefWidth(0);*/



	}


	    @FXML
	    void InputCurrencySelect(ActionEvent event) throws JSONException, IOException {

	    	OutputCurrencyDropdown.getItems().clear();

	    	 ArrayList<String> comboBoxValuesOutput = new ArrayList<String>();

	    	 comboBoxValuesOutput = ComboBoxValues.getOutputComboBoxValues(inputCurrencyType);
	    	 ObservableList<String> comboBoxOutput  =  FXCollections.observableArrayList(comboBoxValuesOutput);
			OutputCurrencyDropdown.getItems().addAll(comboBoxOutput);

		}



	    @FXML
	    void OutputCurrencyPopulate(ActionEvent event) {
	    }

	    @FXML
	    protected void initialize() throws JSONException, IOException {
	    ArrayList<String> comboBoxValuesInput = new ArrayList<String>();

	    	InputCurrencyField.setPromptText("Enter Base Value");
	    	OutputCurrencyField.setPromptText("Converted Value");
	    	OutputCurrencyDropdown.setPromptText("Select Output Currency Type");
	    	InputCurrencyDropdown.setPromptText("Select Base Currency Type");



	    	String inputCurrencyTypes = "AED,AFN,ALL,AMD,ANG,AOA,ARS,AUD,AWG,AZN,BAM,BBD,BDT,BGN,BHD,BIF,BMD,BND,BOB,BRL,BSD,BTC,BTN,BWP,"
					+ "BYN,BYR,BZD,CAD,CDF,CHF,CLF,CLP,CNY,COP,CRC,CUC,CUP,CVE,CZK,DJF,DKK,DOP,DZD,EGP,ERN,ETB,EUR,FJD,FKP,GBP,GEL,GGP,GHS,"
					+ "GIP,GMD,GNF,GTQ,GYD,HKD,HNL,HRK,HTG,HUF,IDR,ILS,IMP,INR,IQD,IRR,ISK,JEP,JMD,JOD,JPY,KES,KGS,KHR,KMF,KPW,KRW,KWD,KYD,"
					+ "KZT,LAK,LBP,LKR,LRD,LSL,LTL,LVL,LYD,MAD,MDL,MGA,MKD,MMK,MNT,MOP,MRO,MUR,MVR,MWK,MXN,MYR,MZN,NAD,NGN,NIO,NOK,NPR,NZD,"
					+ "PAB,PEN,PGK,PHP,PKR,PLN,PYG,QAR,RON,RSD,RUB,RWF,SAR,SBD,SCR,SDG,SEK,SGD,SHP,SLL,SOS,SRD,STD,SVC,SYP,SZL,THB,TJS,TMT,"
					+ "TND,TOP,TRY,TTD,TWD,TZS,UAH,UGX,USD,UYU,,UZS,VEF,VND,VUV,WST,XAF,XAG,XAU,XCD,XDR,XOF,XPF,YER,ZAR,ZMK,ZMW,ZWL";



			String[] codes = inputCurrencyTypes.split(",");



			for(int i = 0; i <codes.length; i++) {

				comboBoxValuesInput.add(codes[i]);



				}
			 ObservableList<String> comboBox  =  FXCollections.observableArrayList(comboBoxValuesInput);
			InputCurrencyDropdown.getItems().addAll(comboBox);
			this.comboBox = comboBox;

	    }

	}
