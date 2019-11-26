import javafx.application.Application;

public abstract class Conversions extends Application{

	protected String InputCurrencyValue;
	protected String outputCurrencyValue;
	protected String exchangeRate;
	protected String inputCurrencyType;
	protected String outputCurrencyType;
	protected String[] outputCurrencyType1;
	protected String outputCurrencyType2;

	public Conversions(String InputCurrencyValue, String outputCurrencyValue, String exchangeRate, String inputCurrencyType, String outputCurrencyType) {


	}


	
	
	public String getInputCurrencyValue() {
		return InputCurrencyValue;
	}


	public void setInputCurrencyValue(String inputCurrencyValue) {
		InputCurrencyValue = inputCurrencyValue;
	}

	
	public void setOutputCurrencyValue(String outputCurrencyValue) {
		this.outputCurrencyValue = outputCurrencyValue;
	}
	
	public String outputCurrencyValue() {
		return outputCurrencyValue;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}


	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}


	public String getInputCurrencyType() {
		return inputCurrencyType;
	}


	public void setInputCurrencyType(String inputCurrencyType) {
		this.inputCurrencyType = inputCurrencyType;
	}


	public String getOutputCurrencyType() {
		return outputCurrencyType;
	}


	public void setOutputCurrencyType(String outputCurrencyType) {
		this.outputCurrencyType = outputCurrencyType;
	}


	public String[] getOutputCurrencyType1() {
		return outputCurrencyType1;
	}


	public void setOutputCurrencyType1(String[] outputCurrencyType1) {
		this.outputCurrencyType1 = outputCurrencyType1;
	}


	public String getOutputCurrencyType2() {
		return outputCurrencyType2;
	}


	public void setOutputCurrencyType2(String outputCurrencyType2) {
		this.outputCurrencyType2 = outputCurrencyType2;
	}

	







}
