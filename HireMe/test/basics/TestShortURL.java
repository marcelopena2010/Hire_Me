package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TestShortURL {

	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("^(http://|https://)?(www.)?([a-zA-Z0-9]+).[a-zA-Z0-9]*.[a-zA-Z]{2}.?([a-zA-Z]+)?$");
		
		List<String> list = new ArrayList<>();
		list.add("www.good.com/UJKJD");

		

		for (String string : list) {
			if (pattern.matcher(string).matches()) {
				System.out.println("URL APROVADO: " + string );
			}else {
				System.out.println("URL REPROVADO: " + string);
			}
		}
		
		
		
		
	}
}
