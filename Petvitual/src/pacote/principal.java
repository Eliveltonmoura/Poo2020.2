package pacote;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {

		meuPet p = new meuPet(3, 3, 3);
		Scanner sc = new Scanner(System.in);

		boolean inicio = true;

		while (inicio) {
			String ops = sc.nextLine();
			switch (ops) {
			case "show":
				p.show();
				break;
			case "play":
				p.play();
				break;
			case "shower":
				p.shower();
				break;
			case "eat":
				p.sleep();
				break;
			default:
				break;
			}
		}

	}

}
