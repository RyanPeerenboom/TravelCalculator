import java.util.List;

import javax.money.CurrencyUnit;
import javax.money.MonetaryAmount;
import javax.money.NumberValue;
import javax.money.convert.ConversionContext;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRate;
import javax.money.convert.ExchangeRateProvider;

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


	


