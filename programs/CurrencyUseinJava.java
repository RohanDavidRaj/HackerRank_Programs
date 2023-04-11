package com.hackerrank.programs;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyUseinJava {

	public static void main(String[] args) {

		Locale locale = Locale.FRANCE;
		Currency curr = Currency.getInstance(locale);
		// get and print the symbol of the currency
		System.out.println("Currency symbol is: " + curr.getSymbol(locale));

		// Locale uss = Locale.US;
		String symbol = Currency.getInstance(Locale.FRANCE).getSymbol(Locale.FRANCE);
		System.err.println(symbol);
		// get and print the symbol of the currency
		// System.out.println("Currency symbol is: " + us.getSymbol(Locale.US));

		Double d = 12324.134;
		String str = Double.toString(d);

		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		decimalFormat.setGroupingUsed(true);
		decimalFormat.setGroupingSize(3);
		System.err.println(decimalFormat.format(d));

		System.err.println(decimalFormat.format(d).replaceAll(",", ""));
		System.err.println(decimalFormat.format(d).replace(",", " ").replace(".", ","));
	}
}
