package assignmet4p4;
import java.util.ArrayList;
/**it stores and performs different methods on the coins
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 2
 *@since Due:10/15/18
 */
public class Coinset {
	private ArrayList <Coin>set;
	/**Constructor which initializes the ArrayList */
	public Coinset() {
		set=new ArrayList<Coin>();
	}
	/**Overloaded constructor which initializes with new value
	 * @param m Array List
	 */
	public Coinset(ArrayList <Coin> m) {
		set=m;
	}
	/** Adds the coins to the array list
	 * @param c coin object
	 */
	public void addCoin(Coin c) {
		set.add(c);
	}
	/**Adds the ArrayList of coins
	 * @param coins ArrayList of coins
	 */
	public void addCoins(Coinset coins) {
		set.addAll(coins.set);
	}
	/**calculates the value of the coins
	 * @return value of the coins
	 */
	public double getVal() {
		double value=0.0;
		for(Coin C: set) {
			value+=C.getValue();
		}
		return value;
	}
	/**Clears the array list */
	public void removeAll() {
		set.clear();
	}
}
