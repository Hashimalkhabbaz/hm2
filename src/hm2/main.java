package hm2;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		System.out.println("enter a name");
		Scanner input = new Scanner(System.in); 
		String name = input.nextLine();
		System.out.println("wolcome "+ name);
		System.out.println("how much Saudi Ryial you want to conf to Euro ?");
		double ryal = input.nextDouble();
		System.out.println(ryal * 0.262);
		System.out.println("how much Euro you want to conf to  Saudi ryal?");
		double euro = input.nextDouble();
		System.out.println(euro/  0.2621);


		
		
	}

}
