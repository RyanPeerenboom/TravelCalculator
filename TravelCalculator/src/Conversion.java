import javax.money.convert.CurrencyConversion;
import javax.money.convert.ExchangeRate;
import javax.money.*;
//class used to manipulate a currency object
public abstract class Conversion implements ExchangeRate, CurrencyConversion{
	
	//currency object variables (common to all currency objects)
	protected MonetaryAmount inputCurrencyValue;
	protected MonetaryAmount outputCurrencyValue;
	protected CurrencyUnit inputCurrencyType;
	protected CurrencyUnit outputCurrencyType;
	protected ExchangeRate exchangeRate;
	
	
	
	public Conversion(MonetaryAmount inputCurrencyValue, MonetaryAmount outputCurrencyValue, ExchangeRate exchangeRate,
			CurrencyUnit inputCurrencyType, CurrencyUnit outputCurrencyType) {
		
		this.inputCurrencyType = inputCurrencyType;
		this.outputCurrencyType = outputCurrencyType;
		this.inputCurrencyValue = inputCurrencyValue;
		this.outputCurrencyValue = outputCurrencyValue;
		this.exchangeRate = exchangeRate;
	
	}
}

	

	//method for assignment of exchangeRateValue;	
	
	
	