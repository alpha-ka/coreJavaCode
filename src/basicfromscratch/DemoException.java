package   basicfromscratch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		// String str=br.readLine();//throw error but we confidently know it won't means
		// use throws
		int i = 8, j, k = 0;
		j = Integer.parseInt(br.readLine());
		try {
			k = i + j;
			if (k < 10) {
				throw new ArithmeticException();
			}
		} catch (ArithmeticException ae) {
			System.out.println("Maximum value is 10");
		} finally {
			System.out.println("Output value is " + k);
			br.close();
		}
	}
}
