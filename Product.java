package assignmet4p4;
/**deals with products and its prices
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 2
 *@since Due:10/15/18
 */
public class Product {
	private String discription;
	public double price;
	/**constructor that initializes the values*/
	public Product() {
		discription="";
		price=0.0;
	}
	/**overloaded constructor
	 * @param des product description
	 * @param price product price
	 */
	public Product(String des,double price) {
		discription=des;
		this.price=price;
	}
	/**formatted string of product description with its price */
	public String toString() {
		return discription+" @ $"+price;
	}
	/**method that gets the product description 
	 * @return product description
	 */
	public String getdes() {
		return discription;
	}
	/**method that returns the product price
	 * @return products price
	 */
	public double getprice() {
		return price;
	}
	/**overridden equals method that compares the product description and returns true or false
	 * @param p Product
	 * @return boolean
	 */
	public boolean equals(Product p) {
		if(p.discription.equals(discription)) {
			return true;
		}
		return false;
	}
}
