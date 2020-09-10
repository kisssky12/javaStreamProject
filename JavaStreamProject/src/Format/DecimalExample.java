package Format;

import java.text.DecimalFormat;

public class DecimalExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0"); 
		System.out.println(df.format(num)); //1234568 (반올림)
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num)); //1234567.9
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num)); //000.1234567.89000
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num)); //1234568 (반올림)
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num)); //1234567.9
		
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num)); //1234567.89
		
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num)); //1234567.9
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num)); //+1234567.9
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num)); //-1234567.9
		
		df = new DecimalFormat("#,##.0");
		System.out.println(df.format(num)); //1,23,45,67,9
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num)); //1.2E6
		
		df = new DecimalFormat("+#,### ; -#,###");
		System.out.println(df.format(num)); //+1,234,568
		
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num)); //123456789%
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num)); //￦1,234,568
		
	}
}
