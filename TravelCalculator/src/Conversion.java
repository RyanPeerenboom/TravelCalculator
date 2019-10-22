import javax.money.convert.*;
import javax.money.convert.RateType;
import javax.money.convert.ExchangeRate;

import java.util.List;

import javax.money.*;
//class used to manipulate a currency object
public class Conversion extends Currency implements ExchangeRate, CurrencyConversion{
	
	protected ExchangeRate exchangeRate;
	protected CurrencyConversion conv;
	
	
	//constructor for conversion object (inherits from currency)
	public Conversion(MonetaryAmount inputCurrencyValue, MonetaryAmount outputCurrencyValue, ExchangeRate exchangeRate,
			CurrencyUnit inputCurrencyType, CurrencyUnit outputCurrencyType) {
		super(inputCurrencyValue, outputCurrencyValue, inputCurrencyType, outputCurrencyType);
		
		this.exchangeRate = exchangeRate;
	}
	

	//method for assignment of exchangeRateValue;	
	
	
	@Override
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
		
		
		outputCurrencyValue = ;
		
		
		return outputCurrencyValue;
	}
	
	
	@Override
	public ConversionContext getContext() {
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
	public ExchangeRateProvider getExchangeRateProvider() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
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
