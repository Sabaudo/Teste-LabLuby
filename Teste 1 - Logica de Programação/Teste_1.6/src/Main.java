import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String data1, data2;
		System.out.println("Informe duas datas: ");
		data1 = input.next();
		data2 = input.next();
		System.out.println("Diferença de dias entre as duas datas: " + calcularDiferencaData(data1, data2) + " dias");
		
		input.close();
	}
	public static long calcularDiferencaData(String data1, String data2) {
		try {
			Date dt1 = new SimpleDateFormat("ddMMyyyy").parse(data1);
			Date dt2 = new SimpleDateFormat("ddMMyyyy").parse(data2);
			
			String dataFormatada1 = new SimpleDateFormat("yyyy-MM-dd").format(dt1);
			String dataFormatada2 = new SimpleDateFormat("yyyy-MM-dd").format(dt2);
			System.out.println(dataFormatada1);
			System.out.println(dataFormatada2);
			
			long diferencaDias = (dt1.getTime() - dt2.getTime()) / (1000*60*60*24);
			return diferencaDias;

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
