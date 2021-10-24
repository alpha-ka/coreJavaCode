package enumtutorial;

import java.math.BigDecimal;

public class TestEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Currency.EURO);
		System.out.println(Client.PRIVATE);
		
		BigDecimal value=new BigDecimal("5.0");
		BigDecimal temp=BigDecimal.ZERO;
		System.out.println(value+" "+temp);
	}

}
