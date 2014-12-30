

public class Currency {

	protected double amount;
	private String symbol;
	
	public Currency(double amount, String symbol) {
		this.amount=amount;
		this.symbol=symbol;
	}

	public double getAmount() {
		return amount;
	}
	
	
	public String getSymbol() {
		return symbol;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		Currency currency2=(Currency)obj;
		return this.getSymbol().equals(currency2.getSymbol()) && this.getAmount()==currency2.getAmount();
	}

	public String toString() {
		return amount+" "+symbol;
	}

}
