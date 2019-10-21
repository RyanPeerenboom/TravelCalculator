
//currency class creates currency objects for manipulation by conversion class
public abstract class Currency {
	
	//currency object variables (common to all currency objects)
	protected double inputCurrencyValue;
	protected double outputCurrencyValue;
	protected String inputCurrencyType;
	protected String outputCurrencyType;
	
	
	//currency object constructor (4 parameters)
	public Currency(double inputCurrencyValue, double outputCurrencyValue, String inputCurrencyType, String outputCurrencyType) {
		this.inputCurrencyType = inputCurrencyType;
		this.outputCurrencyType = outputCurrencyType;
		this.inputCurrencyValue = inputCurrencyValue;
		this.outputCurrencyValue = outputCurrencyValue;
	
	}
	
}
