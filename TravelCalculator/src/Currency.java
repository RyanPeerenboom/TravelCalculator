import javax.money.*;

//currency class creates currency objects for manipulation by conversion class
<<<<<<< Updated upstream
public class Currency {
	
=======
public abstract class Currency {


>>>>>>> Stashed changes
	public static final com.tunyk.currencyconverter.api.Currency USD = null;
	public static final com.tunyk.currencyconverter.api.Currency EUR = null;
	//currency object variables (common to all currency objects)
	protected double inputCurrencyValue;
	protected double outputCurrencyValue;
	protected String inputCurrencyType;
	protected String  outputCurrencyType;


	//currency object constructor (4 parameters)
	public Currency(double inputCurrencyValue, double outputCurrencyValue, String inputCurrencyType, String outputCurrencyType) {
		this.inputCurrencyType = inputCurrencyType;
		this.outputCurrencyType = outputCurrencyType;
		this.inputCurrencyValue = inputCurrencyValue;
		this.outputCurrencyValue = outputCurrencyValue;

	}
}
