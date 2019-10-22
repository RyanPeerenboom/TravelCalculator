import javax.money.*;

//currency class creates currency objects for manipulation by conversion class
public abstract class Currency implements CurrencySupplier {
	
	//currency object variables (common to all currency objects)
	protected MonetaryAmount inputCurrencyValue;
	protected MonetaryAmount outputCurrencyValue;
	protected CurrencyUnit inputCurrencyType;
	protected CurrencyUnit outputCurrencyType;
	
	
	//currency object constructor (4 parameters)
	public Currency(MonetaryAmount inputCurrencyValue, MonetaryAmount outputCurrencyValue, CurrencyUnit inputCurrencyType, CurrencyUnit outputCurrencyType) {
		this.inputCurrencyType = inputCurrencyType;
		this.outputCurrencyType = outputCurrencyType;
		this.inputCurrencyValue = inputCurrencyValue;
		this.outputCurrencyValue = outputCurrencyValue;
	
	}
	
}
