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

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

	public class Controller extends Conversion {
		
		public Controller(MonetaryAmount inputCurrencyValue, MonetaryAmount outputCurrencyValue, ExchangeRate exchangeRate,
				CurrencyUnit inputCurrencyType, CurrencyUnit outputCurrencyType) {
			
			super(inputCurrencyValue, outputCurrencyValue, exchangeRate, inputCurrencyType, outputCurrencyType);
			
		}
		URL x;

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
	    private ComboBox<?> InputCurrencyDropdown;

	    @FXML
	    private ComboBox<?> OutputCurrencyDropdown;

	    @FXML
	    private Button CalculateButton;

	    @FXML
	    void CalculateClick(ActionEvent event) {
	    	double InputCurrencyValue = Double.parseDouble(InputCurrencyField.getText());
	    	/*double outputCurrencyValue = Double.parseDouble(OutputCurrencyField.getText());*/
	    	
	    	String inputCurrencyType = InputCurrencyDropdown.toString();
	    	String outputCurrencyType = OutputCurrencyDropdown.toString();
	    	
	    	
	    	
	    	
	  
	    	
	    	
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
	    	
	    }

	    @FXML
	    void OutputCurrencyPopulate(ActionEvent event) {
	    	
	    }

		@Override
		public ConversionContext getContext() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public CurrencyUnit getBaseCurrency() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public CurrencyUnit getCurrency() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public NumberValue getFactor() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<ExchangeRate> getExchangeRateChain() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ExchangeRate getExchangeRate(MonetaryAmount sourceAmount) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ExchangeRateProvider getExchangeRateProvider() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public MonetaryAmount apply(MonetaryAmount amount) {
			// TODO Auto-generated method stub
			return null;
		}

		
	    
	   /* @Override
		public ExchangeRate getExchangeRate(MonetaryAmount inputCurrencyValue) {
			
			if (inputCurrencyType.equals(getBaseCurrency()) && outputCurrencyType.equals(getCurrency()) ) {
				  
				exchangeRate = getExchangeRate(inputCurrencyValue);
				
			}

			return exchangeRate; 
		}
		
		@Override
		public CurrencyUnit getBaseCurrency() {
			
			return inputCurrencyType;
		}
		
		@Override
		public CurrencyUnit getCurrency() {
			
			return outputCurrencyType;
		}
		
		
		@Override
		public MonetaryAmount apply(MonetaryAmount inputCurrencyValue) {
			
			
			
			
			
			return outputCurrencyValue;
		}
		
		
		@Override
		public ConversionContext getContext() {
			
			return null;
		}

		

		
		

		@Override
		public NumberValue getFactor() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<ExchangeRate> getExchangeRateChain() {
			// TODO Auto-generated method stub
			return null;
		}

		

		

		@Override
		public ExchangeRateProvider getExchangeRateProvider() {
			// TODO Auto-generated method stub
			return null;
		} */
		
		
		
		
		
		
		
		//method for calculation of 'left to right' (divide) conversion
	/*	public MonetaryAmount leftToRightDivide() {
			
			
			outputCurrencyValue = inputCurrencyValue.multiply(getFactor(inputCurrencyValue));
			
			return outputCurrencyValue;
			
		}
		
		*/
		
		/* //method for calculation of 'right to left' (multiply) conversion
		public MonetaryAmount rightToLeftMultiply() {
			
			outputCurrencyValue = inputCurrencyValue.multiply((Number) getExchangeRateChain().get(1));
			
			return outputCurrencyValue;
			
		}
		*/

		

	}


	


