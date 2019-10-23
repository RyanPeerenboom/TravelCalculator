import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExchangeRates {
	
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
	    	
	public static void getExchangeRates() throws IOException, JSONException {
		
		String base;
		String symbols;
		
		
		
		JSONObject json = readJsonFromUrl("http://data.fixer.io/api/latest?access_key=44839b35108b8a92dd3df98b1ab66593&symbols=USD&base=EUR&format=1");

		JSONArray jsonArr = new JSONArray();
		jsonArr.put(json);
		for (int i = 0; i <jsonArr.length(); i++) {
			jsonArr.getJSONObject(i);
			
			String s = jsonArr.toString();
			String[] rates = s.split(",");
			String[] exchangeRatePlusEndBracket = rates[2].toString().split(":");
			String[] exchangeRateFinal = exchangeRatePlusEndBracket[2].toString().split("}");
			double exchangeRate = Double.parseDouble(exchangeRateFinal[0].toString());;
		}	
	}
}
