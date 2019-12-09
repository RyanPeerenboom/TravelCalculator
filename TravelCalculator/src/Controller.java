import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.*;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.NumberFormat;

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

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.time.*;

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
	    private ListView<String> pastConversionListView;
	    
	    @FXML
	    private RadioButton thirtyDaysRadioButton;

	    @FXML
	    private RadioButton sixMonthsRadioButton;

	   /* @FXML
	    private Label graphLabel;*/
	    
	    

	    @FXML
	    private LineChart<LocalDate, Number> rateHistoryGraph;
	    
	    
	    
	    @FXML
	    private TextField exchangeRateField;
	    
	    private final ObservableList<String> conversions =
    			FXCollections.observableArrayList();
	    
	    
	    
	 

	    @SuppressWarnings("unchecked")
		@FXML
	    void CalculateClick(ActionEvent event) throws JSONException, IOException {
	    	
	    	
	    	
	    	
	    	double historicalCurrent2;
	    	double historical1MonthAgo;
	    	double historical2MonthsAgo;
	    	double historical3MonthsAgo;
	    	double historical4MonthsAgo;
	    	double historical5MonthsAgo;
	    	double historical6MonthsAgo;
	    	
	    	double historicalCurrent;
	    	double historical1DayAgo;
	    	double historical2DaysAgo;
	    	double historical3DaysAgo;
	    	double historical4DaysAgo;
	    	double historical5DaysAgo;
	    	double historical6DaysAgo;
	    	double historical7DaysAgo;
	    	double historical8DaysAgo;
	    	double historical9DaysAgo;
	    	double historical10DaysAgo;
	    	double historical11DaysAgo;
	    	double historical12DaysAgo;
	    	double historical13DaysAgo;
	    	double historical14DaysAgo;
	    	double historical15DaysAgo;
	    	double historical16DaysAgo;
	    	double historical17DaysAgo;
	    	double historical18DaysAgo;
	    	double historical19DaysAgo;
	    	double historical20DaysAgo;
	    	double historical21DaysAgo;
	    	double historical22DaysAgo;
	    	double historical23DaysAgo;
	    	double historical24DaysAgo;
	    	double historical25DaysAgo;
	    	double historical26DaysAgo;
	    	double historical27DaysAgo;
	    	double historical28DaysAgo;
	    	double historical29DaysAgo;
	    	double historical30DaysAgo;
	    	
	    	LocalDate currentDate2 = LocalDate.now();
	    	LocalDate oneMonthAgo = LocalDate.now().minusMonths(1);
	    	LocalDate twoMonthsAgo = LocalDate.now().minusMonths(2);
	    	LocalDate threeMonthsAgo = LocalDate.now().minusMonths(3);
	    	LocalDate fourMonthsAgo = LocalDate.now().minusMonths(4);
	    	LocalDate fiveMonthsAgo = LocalDate.now().minusMonths(5);
	    	LocalDate sixMonthsAgo = LocalDate.now().minusMonths(6);
	    	
	    	LocalDate currentDate = LocalDate.now();
	    	LocalDate oneDayAgo = LocalDate.now().minusDays(1);
	    	LocalDate twoDaysAgo = LocalDate.now().minusDays(2);
	    	LocalDate threeDaysAgo = LocalDate.now().minusDays(3);
	    	LocalDate fourDaysAgo = LocalDate.now().minusDays(4);
	    	LocalDate fiveDaysAgo = LocalDate.now().minusDays(5);
	    	LocalDate sixDaysAgo = LocalDate.now().minusDays(6);
	    	LocalDate sevenDaysAgo = LocalDate.now().minusDays(7);
	    	LocalDate eightDaysAgo = LocalDate.now().minusDays(8);
	    	LocalDate nineDaysAgo = LocalDate.now().minusDays(9);
	    	LocalDate tenDaysAgo = LocalDate.now().minusDays(10);
	    	LocalDate elevenDaysAgo = LocalDate.now().minusDays(11);
	    	LocalDate twelveDaysAgo = LocalDate.now().minusDays(12);
	    	LocalDate thirteenDaysAgo = LocalDate.now().minusDays(13);
	    	LocalDate fourteenDaysAgo = LocalDate.now().minusDays(14);
	    	LocalDate fifteenDaysAgo = LocalDate.now().minusDays(15);
	    	LocalDate sixteenDaysAgo = LocalDate.now().minusDays(16);
	    	LocalDate seventeenDaysAgo = LocalDate.now().minusDays(17);
	    	LocalDate eighteenDaysAgo = LocalDate.now().minusDays(18);
	    	LocalDate nineteenDaysAgo = LocalDate.now().minusDays(19);
	    	LocalDate twentyDaysAgo = LocalDate.now().minusDays(20);
	    	LocalDate twentyoneDaysAgo = LocalDate.now().minusDays(21);
	    	LocalDate twentytwoDaysAgo = LocalDate.now().minusDays(22);
	    	LocalDate twentythreeDaysAgo = LocalDate.now().minusDays(23);
	    	LocalDate twentyfourDaysAgo = LocalDate.now().minusDays(24);
	    	LocalDate twentyfiveDaysAgo = LocalDate.now().minusDays(25);
	    	LocalDate twentysixDaysAgo = LocalDate.now().minusDays(26);
	    	LocalDate twentysevenDaysAgo = LocalDate.now().minusDays(27);
	    	LocalDate twentyeightDaysAgo = LocalDate.now().minusDays(28);
	    	LocalDate twentynineDaysAgo = LocalDate.now().minusDays(29);
	    	LocalDate thirtyDaysAgo = LocalDate.now().minusDays(30);
	    	
	    	double InputCurrencyValue = Double.parseDouble(InputCurrencyField.getText());
	    	double outputCurrencyValue;
	    	double exchangeRate = 0;
	    	
	    	String InputCurrencyValueString;
	    	String outputCurrencyValueString;
	    	String exchangeRateString;
	    	
	    	
	    	
	    	String inputCurrencyType = (String) InputCurrencyDropdown.getValue();
	    	String outputCurrencyType = (String) OutputCurrencyDropdown.getValue();
	    	String[] outputCurrencyType1 = outputCurrencyType.split(":");
	    	String outputCurrencyType2 = outputCurrencyType1[0].replace("\"", "");
	    			
	    	
	    	this.inputCurrencyType = inputCurrencyType;
	    	
	    	
	    	exchangeRate = ExchangeRates.getExchangeRates(inputCurrencyType, outputCurrencyType2);
	    	
	    	this.exchangeRate = exchangeRate;
	    	
	    	outputCurrencyValue = InputCurrencyValue*exchangeRate;
	    	String a = String.format("%.2f", outputCurrencyValue);
	    	
	    
	    	OutputCurrencyField.setText(a);
	    	
	    	
	    	InputCurrencyValueString = Double.toString(InputCurrencyValue);
	    	outputCurrencyValueString = Double.toString(outputCurrencyValue);
	    	exchangeRateString = Double.toString(exchangeRate);
	    	
	    	InputCurrencyDropdown.setDisable(true);
	    	/*OutputCurrencyDropdown.setDisable(true);*/
	    	
	    	conversions.add("Input Value: " + InputCurrencyValueString + "		" + "Input Currency: " + inputCurrencyType + "		" + 
	    	"Outut Currency: " + outputCurrencyType2 + "		" + "Output Value: " + outputCurrencyValueString + "		" + "Exchange Rate: " + exchangeRateString);
	    	
	    	pastConversionListView.setItems(conversions);
	    	exchangeRateField.setText(exchangeRateString);
	    	
	    	if (thirtyDaysRadioButton.isSelected()) {
	    		
	    	
	    	
	    	historical30DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, thirtyDaysAgo);
	    	historical29DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentynineDaysAgo);
	    	historical28DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentyeightDaysAgo);
	    	historical27DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentysevenDaysAgo);
	    	historical26DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentysixDaysAgo);
	    	historical25DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentyfiveDaysAgo);
	    	historical24DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentyfourDaysAgo);
	    	historical23DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentythreeDaysAgo);
	    	historical22DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentytwoDaysAgo);
	    	historical21DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentyoneDaysAgo);	 
	    	historical20DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twentyDaysAgo);
	    	historical19DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, nineteenDaysAgo);
	    	historical18DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, eighteenDaysAgo);
	    	historical17DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, seventeenDaysAgo);
	    	historical16DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, sixteenDaysAgo);
	    	historical15DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, fifteenDaysAgo);
	    	historical14DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, fourteenDaysAgo);	  
	    	historical13DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, thirteenDaysAgo);
	    	historical12DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twelveDaysAgo);
	    	historical11DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, elevenDaysAgo);
	    	historical10DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, tenDaysAgo);
	    	historical9DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, nineDaysAgo);
	    	historical8DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, eightDaysAgo);
	    	historical7DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, sevenDaysAgo);	 
	    	historical6DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, sixDaysAgo);
	    	historical5DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, fiveDaysAgo);
	    	historical4DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, fourDaysAgo);
	    	historical3DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, threeDaysAgo);
	    	historical2DaysAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twoDaysAgo);
	    	historical1DayAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, oneDayAgo);
	    	historicalCurrent = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, currentDate);	  
	    	
	    	ExchangeRateHistory exchangeRateHistory = new ExchangeRateHistory(historical30DaysAgo, historical29DaysAgo, historical28DaysAgo, 
	    			historical27DaysAgo, historical26DaysAgo, historical25DaysAgo, historical24DaysAgo, historical23DaysAgo, 
	    			historical22DaysAgo, historical21DaysAgo, historical20DaysAgo, historical19DaysAgo, historical18DaysAgo, historical17DaysAgo, 
	    			historical16DaysAgo, historical15DaysAgo, historical14DaysAgo, historical13DaysAgo, historical12DaysAgo, historical11DaysAgo,
	    			historical10DaysAgo, historical9DaysAgo, historical8DaysAgo, historical7DaysAgo, historical6DaysAgo, historical5DaysAgo, 
	    			historical4DaysAgo, historical3DaysAgo, historical2DaysAgo, historical1DayAgo, historicalCurrent);
	    	
	    	rateHistoryGraph.setTitle(inputCurrencyType + " to " + outputCurrencyType2 +  " Historical Exchange Rates");
	    	rateHistoryGraph.setHorizontalGridLinesVisible(true);
	    	
	    	XYChart.Series dataSeries = new XYChart.Series();
	    	dataSeries.setName(inputCurrencyType + " to " + outputCurrencyType2);
	    	
	    	
	    	
	    	dataSeries.getData().add(new XYChart.Data(thirtyDaysAgo.toString(), historical30DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentynineDaysAgo.toString(), historical29DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentyeightDaysAgo.toString(), historical28DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentysevenDaysAgo.toString(), historical27DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentysixDaysAgo.toString(), historical26DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentyfiveDaysAgo.toString(), historical25DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentyfourDaysAgo.toString(), historical24DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentythreeDaysAgo.toString(), historical23DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentytwoDaysAgo.toString(), historical22DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentyoneDaysAgo.toString(), historical21DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twentyDaysAgo.toString(), historical20DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(nineteenDaysAgo.toString(), historical19DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(eighteenDaysAgo.toString(), historical18DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(seventeenDaysAgo.toString(), historical17DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(sixteenDaysAgo.toString(), historical16DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(fifteenDaysAgo.toString(), historical15DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(fourteenDaysAgo.toString(), historical14DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(thirteenDaysAgo.toString(), historical13DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twelveDaysAgo.toString(), historical12DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(elevenDaysAgo.toString(), historical11DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(tenDaysAgo.toString(), historical10DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(nineDaysAgo.toString(), historical9DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(eightDaysAgo.toString(), historical8DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(sevenDaysAgo.toString(), historical7DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(sixDaysAgo.toString(), historical6DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(fiveDaysAgo.toString(), historical5DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(fourDaysAgo.toString(), historical4DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(threeDaysAgo.toString(), historical3DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(twoDaysAgo.toString(), historical2DaysAgo));
	    	dataSeries.getData().add(new XYChart.Data(oneDayAgo.toString(), historical1DayAgo));
	    	dataSeries.getData().add(new XYChart.Data(currentDate.toString(), historicalCurrent));
	    	
	    	rateHistoryGraph.getData().add(dataSeries);
	    	}
	    	
	    	if (sixMonthsRadioButton.isSelected()) {
	    		
		    	
		    	
		    	
		    	historical6MonthsAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, sixMonthsAgo);
		    	historical5MonthsAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, fiveMonthsAgo);
		    	historical4MonthsAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, fourMonthsAgo);
		    	historical3MonthsAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, threeMonthsAgo);
		    	historical2MonthsAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, twoMonthsAgo);
		    	historical1MonthAgo = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, oneMonthAgo);
		    	historicalCurrent2 = ExchangeRates.getExchangeRatesHistory(inputCurrencyType, outputCurrencyType2, currentDate2);	  
		    	
		    	ExchangeRateHistory2 exchangeRateHistory = new ExchangeRateHistory2(historical6MonthsAgo, historical5MonthsAgo, 
		    			historical4MonthsAgo, historical3MonthsAgo, historical2MonthsAgo, historical1MonthAgo, historicalCurrent2);
		    	
		    	rateHistoryGraph.setTitle(inputCurrencyType + " to " + outputCurrencyType2 +  " Historical Exchange Rates");
		    	rateHistoryGraph.setHorizontalGridLinesVisible(true);
		    	
		    	XYChart.Series dataSeries = new XYChart.Series();
		    	dataSeries.setName(inputCurrencyType + " to " + outputCurrencyType2);
		    	
		    	
		    	
		    	
		    	dataSeries.getData().add(new XYChart.Data(sixMonthsAgo.toString(), historical6MonthsAgo));
		    	dataSeries.getData().add(new XYChart.Data(fiveMonthsAgo.toString(), historical5MonthsAgo));
		    	dataSeries.getData().add(new XYChart.Data(fourMonthsAgo.toString(), historical4MonthsAgo));
		    	dataSeries.getData().add(new XYChart.Data(threeMonthsAgo.toString(), historical3MonthsAgo));
		    	dataSeries.getData().add(new XYChart.Data(twoMonthsAgo.toString(), historical2MonthsAgo));
		    	dataSeries.getData().add(new XYChart.Data(oneMonthAgo.toString(), historical1MonthAgo));
		    	dataSeries.getData().add(new XYChart.Data(currentDate2.toString(), historicalCurrent2));
		    	
		    	rateHistoryGraph.getData().add(dataSeries);
		    	}
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
	    	exchangeRateField.clear();
	    	rateHistoryGraph.getData().clear();
	    	
	    	
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
	    void sixMonthsClicked(MouseEvent event) {
	    	thirtyDaysRadioButton.setSelected(false);
	    	rateHistoryGraph.getData().clear();
	    }

	    @FXML
	    void thirtyDaysClicked(MouseEvent event) {
	    	sixMonthsRadioButton.setSelected(false);
	    	rateHistoryGraph.getData().clear();
	    }

	    
	    
	    
	    //initializes application
	    @FXML 
	    protected void initialize() throws JSONException, IOException {
	    ArrayList<String> comboBoxValuesInput = new ArrayList<String>();
	   
	    	InputCurrencyField.setPromptText("Enter Base Value");
	    	OutputCurrencyField.setPromptText("Converted Value");
	    	OutputCurrencyDropdown.setPromptText("Select Output Currency Type");
	    	InputCurrencyDropdown.setPromptText("Select Base Currency Type");
	    	exchangeRateField.setFocusTraversable(false);
	    	pastConversionListView.setFocusTraversable(false);
	    	
	    	thirtyDaysRadioButton.setSelected(true);
	    	
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