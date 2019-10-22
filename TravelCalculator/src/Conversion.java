import javax.money.convert.*;

import java.util.List;

import javax.money.*;
//class used to manipulate a currency object
public class Conversion extends Currency implements ExchangeRate, CurrencyConversion{
	
	protected ExchangeRate exchangeRate;
	
	
	//constructor for conversion object (inherits from currency)
	public Conversion(MonetaryAmount inputCurrencyValue, MonetaryAmount outputCurrencyValue, ExchangeRate exchangeRate, CurrencyUnit inputCurrencyType, CurrencyUnit outputCurrencyType) {
		super(inputCurrencyValue, outputCurrencyValue, inputCurrencyType, outputCurrencyType);
		
		this.exchangeRate = exchangeRate;
	}
	

	//method for assignment of exchangeRateValue;
	public ExchangeRate ExchangeRate() {
		
		if (inputCurrencyType.equals(getCurrency()) && outputCurrencyType.equals(getCurrency()) ) {
			  
			exchangeRate = getExchangeRate(inputCurrencyValue);
			
		}

		return exchangeRate; 
	}
	
	//method for calculation of 'left to right' (divide) conversion
	public MonetaryAmount leftToRightDivide() {
		
		outputCurrencyValue = ;
		
		return outputCurrencyValue;
		
	}
	
	//method for calculation of 'right to left' (multiply) conversion
	public MonetaryAmount rightToLeftMultiply() {
		
		outputCurrencyValue = ;
		
		return outputCurrencyValue;
		
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
	public MonetaryAmount apply(MonetaryAmount amount) {
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

}
