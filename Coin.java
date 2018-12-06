package assignmet4p4;
/**describes the coin value and name
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 2
 *@since Due:10/15/18
 */
public class Coin {
	private String name;
	private double value;
	/**constructor for the coin class*/
	public Coin() {
		name="";
		value=0.0;
	}
	/**Overloaded constructor which replaces the old values with the new ones
	 * @param name name of the coin
	 * @param value value of the coin
	 */
	public Coin(String name, double value) {
		this.name=name;
		this.value=value;
	}
	/** gets the name of the coin
	 * @return name of the coin
	 */
	public String getName() {
		return name;
	}
	/**gets the value of the coin
	 * @return the value of the coin
	 */
	public double getValue() {
		return value;
	}
	/**replaces the value of the coin
	 * @param value new value of the coin
	 */
	public void setValue(double value) {
		this.value=value;
	}
	/**replaces the name of the coin
	 * @param name new name of the coin
	 */
	public void setName(String name) {
		this.name=name;
	}
}
