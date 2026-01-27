package CollectionsCncpt;

import java.util.Currency;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyCncpt {
	public static void main(String[] args) {
		Currency curr = Currency.getInstance("USD");
		System.out.println("Currency code: "+curr.getCurrencyCode());
		System.out.println("Currency symbol: "+curr.getSymbol());
		System.out.println("Currency Name: "+curr.getDisplayName());
		
		curr= Currency.getInstance("INR");
		System.out.println("Currency code: "+curr.getCurrencyCode());
		System.out.println("Currency symbol: "+curr.getSymbol());
		System.out.println("Currency Name: "+curr.getDisplayName());
		
		double amount=123456.789;
		NumberFormat inf=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		System.out.println("India: "+inf.format(amount));
		
		NumberFormat usf=NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: "+usf.format(amount));
		
		NumberFormat jpf=NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println("Japan: "+jpf.format(amount));
	}
}
