import javax.money.convert.*;

import java.util.List;

import javax.money.*;
//class used to manipulate a currency object
public class Conversion extends Currency implements ExchangeRate, CurrencyConversion{
	
	protected MonetaryAmount exchangeRate;
	
	
	//constructor for conversion object (inherits from currency)
	public Conversion(MonetaryAmount inputCurrencyValue, MonetaryAmount outputCurrencyValue, MonetaryAmount exchangeRate, CurrencyUnit inputCurrencyType, CurrencyUnit outputCurrencyType) {
		super(inputCurrencyValue, outputCurrencyValue, inputCurrencyType, outputCurrencyType);
		
		this.exchangeRate = exchangeRate;
	}
	

	//method for assignment of exchangeRateValue;
	public ExchangeRate ExchangeRate() {
		
		if (inputCurrencyType == getCurrency() && outputCurrencyType == getCurrency()) {
			  
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
