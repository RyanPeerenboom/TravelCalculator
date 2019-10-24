import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import java.net.URL;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExchangeRates {
	
	protected String base;
	protected String  symbols;
	public static double exchangeRateMain;
	
	
	
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
	    	public String getBase() {
	    		return base;
	    	}

	    	public void setBase(String base) {
	    		this.base = base;
	    	}

	    	public String getSymbols() {
	    		return symbols;
	    	}

	    	public void setSymbols(String symbols) {
	    		this.symbols = symbols;
	    	}
	    	
	public static double getExchangeRates(String base, String symbols) throws IOException, JSONException {
		
String baseUrl = "http://data.fixer.io/api/latest?access_key=44839b35108b8a92dd3df98b1ab66593";
		
		
		
		JSONObject json = readJsonFromUrl(baseUrl + "&base=" + base + "&symbols=" + symbols);

		JSONArray jsonArr = new JSONArray();
		jsonArr.put(json);
		for (int i = 0; i <jsonArr.length(); i++) {
			jsonArr.getJSONObject(i);
			
			String s = jsonArr.toString();
			String[] rates = s.split(",");
			String[] exchangeRatePlusEndBracket = rates[2].split(":");
			String exchangeRateFinal = exchangeRatePlusEndBracket[2].replace("}", "");
			double exchangeRate = Double.parseDouble(exchangeRateFinal);
			exchangeRateMain = exchangeRate;
		}	
		return exchangeRateMain;
	}

	
}
