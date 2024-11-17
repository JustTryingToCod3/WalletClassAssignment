package school;

public interface WalletInterface {
	public boolean add(Note input);
	public Note removeRandom();
	public boolean removeSpecific(Note input);
	public boolean isEmpty();
	public boolean contains(Note input);
	public float getTotal();
}

