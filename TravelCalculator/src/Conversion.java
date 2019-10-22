import javax.money.convert.*;
import javax.money.*;
import javax.money.convert.ExchangeRate;
//class used to manipulate a currency object
public class Conversion extends Currency{
	
	protected double exchangeRate;
	
	
	//constructor for conversion object (inherits from currency)
	public Conversion(double inputCurrencyValue, double outputCurrencyValue, double exchangeRate, String inputCurrencyType, String outputCurrencyType) {
		super(inputCurrencyValue, outputCurrencyValue, inputCurrencyType, outputCurrencyType);
		
		this.exchangeRate = exchangeRate;
	}
	
	//method for assignment of exchangeRateValue;
	public double exchangeRate() {
		
		if (inputCurrencyType ==  && outputCurrencyType == ) {
			  
			exchangeRate = getExchangeRate();
			
		}

		return exchangeRate; 
	}
	
	//method for calculation of 'left to right' (divide) conversion
	public double leftToRightDivide() {
		
		outputCurrencyValue = inputCurrencyValue/exchangeRate;
		
		return outputCurrencyValue;
		
	}
	
	//method for calculation of 'right to left' (multiply) conversion
	public double rightToLeftMultiply() {
		
		outputCurrencyValue = inputCurrencyValue*exchangeRate;
		
		return outputCurrencyValue;
		
	}

}
