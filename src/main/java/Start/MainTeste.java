package Start;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

public class MainTeste {

	public static void main(String[] args) throws ParseException {

		DecimalFormat f = (DecimalFormat) DecimalFormat.getInstance(new Locale("pt", "BR"));
		BigDecimal d = (BigDecimal) f.parse("1.234,56");
		System.out.println(d);

	}

}
