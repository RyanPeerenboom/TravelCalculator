import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//class used to manipulate inputCurrencyValue and return  outputCurrencyValue
public class ComboBoxValues{
	
	private static String base;
	

	private static ArrayList<String> comboBoxValuesOutput = new ArrayList<String>();
	private static ArrayList<String> comboBoxValuesInput = new ArrayList<String>();
	private static ObservableList<String> comboBox  =  FXCollections.observableArrayList(comboBoxValuesInput);
	
	
	 private static String readAll(Reader rd) throws IOException{
	    	StringBuilder sb = new StringBuilder();
	    	int cp;
	    	while((cp = rd.read()) != -1){
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
	    	}
	    	finally {
	    	is.close();
	    	 
	    }
	    	
	    	}
	    	
	public static ArrayList<String> getOutputComboBoxValues(String base) throws IOException, JSONException {
		
		String apiURL = "https://data.fixer.io/api/symbols?access_key=44839b35108b8a92dd3df98b1ab66593&base=";





		JSONObject json = readJsonFromUrl(apiURL + base);
		
		String jsonOutput = json.toString();
		
		String [] outputs = jsonOutput.split(",");
		
		
		
			
			for(int i = 2; i < outputs.length; i++) {
				
				
				comboBoxValuesOutput.add(outputs[i]);
				
				
			}
			return comboBoxValuesOutput;
		}
			
	
	
	public static ArrayList<String> getInputComboBoxValues() throws IOException, JSONException {
		

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
			return comboBoxValuesInput;
		}
		
	
	}
	

	
	


	

	//method for assignment of exchangeRateValue;	
	
	
	