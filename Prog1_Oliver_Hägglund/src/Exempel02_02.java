import java.util.Scanner;

public class Exempel02_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("skriv dit namn :");

		String namn = input.nextLine();

		System.out.println(namn);
		
		System.out.println("skriv �lder");
		int �lder=input.nextInt();
		
		System.out.println("Skriv l�ngd");
		
		double l�ngd=input.nextDouble();
		
		System.out.println(namn+" �r "+�lder+"�r gammal och "+ l�ngd +"m l�ng.");
		System.out.println("St�mmer det?");
		

	}
}