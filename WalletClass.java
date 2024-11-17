package school;
import java.util.*;

public class WalletClass implements WalletInterface{
	final private int CAPACITY = 100;
	private Note [] wallet = new Note [100];
	List<Note> money = new ArrayList<>();
	private int walletSize;
	
	public WalletClass() {
	
	}
	
	public boolean add(Note input) {
		if(walletSize>=CAPACITY) {
			return false;
		}else {			
			wallet[walletSize] = input;
			walletSize++;
			
	        money.add(input);
			return true;
		}
	}
	public List<Note> getWallet() {
		return money;
	}

	public Note removeRandom() {
		if(isEmpty()) {
			return null;
		}else {
			Random rand = new Random();
			int randRemove = rand.nextInt(walletSize);
			Note money = wallet[randRemove];
			for(int index = 0; index < walletSize; index++) {
				if(wallet[index] == wallet[randRemove]) {
					wallet[index] = wallet[walletSize -1];
					walletSize--;
				}
			}
			return money;
		}

	}

	public boolean removeSpecific(Note input) {
		if(isEmpty()) {
			return false;
		}else {
			for(int index = 0; index < walletSize; index++) {
				if(wallet[index].equals(input)) {
					wallet[index] = wallet[walletSize -1];
					walletSize--;
					return true;
				}
			}
				}	

		return false;
	}

	public boolean isEmpty() {
		if(walletSize == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean contains(Note input) {
		if(isEmpty()) {
			return false;
		}else {
			for(int i = 0; i< walletSize-1; i++) {
				if(input.equals(wallet[i])) {
					return true;
				}
			}
		}
		return false;
	}

	public float getTotal() {
		return walletSize;
	}
}
