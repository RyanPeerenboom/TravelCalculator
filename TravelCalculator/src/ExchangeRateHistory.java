
public class ExchangeRateHistory {
	
	
	private double sixMonthsAgo;
	private double fiveMonthsAgo;
	private double fourMonthsAgo;
	private double threeMonthsAgo;
	private double twoMonthsAgo;
	private double oneMonthAgo;
	private double current;
	
	public ExchangeRateHistory(double sixMonthsAgo, double fiveMonthsAgo, double fourMonthsAgo, double threeMonthsAgo, double twoMonthsAgo,
			double oneMonthsAgo, double current) {
		this.sixMonthsAgo = sixMonthsAgo;
		this.fiveMonthsAgo = fiveMonthsAgo;
		this.fourMonthsAgo = fourMonthsAgo;
		this.threeMonthsAgo = threeMonthsAgo;
		this.twoMonthsAgo = twoMonthsAgo;
		this.twoMonthsAgo = twoMonthsAgo;
		this.current = current;
	}

	public double getSixMonthsAgo() {
		return sixMonthsAgo;
	}

	public void setSixMonthsAgo(double sixMonthsAgo) {
		this.sixMonthsAgo = sixMonthsAgo;
	}

	public double getFiveMonthsAgo() {
		return fiveMonthsAgo;
	}

	public void setFiveMonthsAgo(double fiveMonthsAgo) {
		this.fiveMonthsAgo = fiveMonthsAgo;
	}

	public double getFourMonthsAgo() {
		return fourMonthsAgo;
	}

	public void setFourMonthsAgo(double fourMonthsAgo) {
		this.fourMonthsAgo = fourMonthsAgo;
	}

	public double getThreeMonthsAgo() {
		return threeMonthsAgo;
	}

	public void setThreeMonthsAgo(double threeMonthsAgo) {
		this.threeMonthsAgo = threeMonthsAgo;
	}

	public double getTwoMonthsAgo() {
		return twoMonthsAgo;
	}

	public void setTwoMonthsAgo(double twoMonthsAgo) {
		this.twoMonthsAgo = twoMonthsAgo;
	}

	public double getOneMonthAgo() {
		return oneMonthAgo;
	}

	public void setOneMonthAgo(double oneMonthAgo) {
		this.oneMonthAgo = oneMonthAgo;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}
	
	
}

