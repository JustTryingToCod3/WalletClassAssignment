package school;
import java.util.Scanner;
public class WalletMain {
	public static void main(String [] args) {
		WalletClass myWallet = new WalletClass();
		Scanner scnr = new Scanner(System.in);
		Note note = new Note();
		
		int capacity =0;
		float inputCount = 0;
		
		while(capacity <= 100) {
			System.out.println("Enter a floating point value or enter 0 to quit");
			float input = scnr.nextFloat();
			if(input == 0) {
				break;
			}
			else if (input == 0.01f) {
			    note.getPenny();
				inputCount+= note.getPennyValue();
			} else if (input == 0.05f) {
				note.getNickel();
				inputCount += note.getNickelValue();
			} else if (input == 0.10f) {
				note.getDime();
				inputCount += note.getDimeValue();
			} else if (input == 0.25f) {
				note.getQuarter();
				inputCount += note.getQuarterValue();
			} else if (input == 1.0f) {
				note.getOneDollarBill();
				inputCount += note.getOneDollar();
			} else if (input == 5.0f) {
				note.getFiveDollarBill();
				inputCount += note.getFiveDollar();
			} else if (input == 10.0f) {
				note.getTenDollarBill();
				inputCount += note.getTenDollar();
			} else if (input == 20.0f) {
				note.getTwentyDollarBill();
				inputCount += note.getTwentyDollar();
			} else if (input == 50.0f) {
				note.getFiftyDollarBill();
				inputCount += note.getFiftyDollar();
			} else {
				note.getUndetermined();
				inputCount+=input;
				continue;
			}
			myWallet.add(note);
			inputCount++;
		}
		
		myWallet.getWallet();
		System.out.println(inputCount);
		scnr.close();
	}
}
