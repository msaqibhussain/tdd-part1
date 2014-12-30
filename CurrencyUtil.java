

public class CurrencyUtil {

	public Currency muliply(int shares, Currency rate) {
		return new Currency(shares*rate.getAmount(), rate.getSymbol());
	}

}
