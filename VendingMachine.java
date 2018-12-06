package assignmet4p4;
import java.util.ArrayList;
/**class that contain the methods of different vending machine operations
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 2
 *@since Due:10/15/18
 */
public class VendingMachine {
	private ArrayList<Product> products;
	private ArrayList<Product> productType;
	private Coinset coins;
	private Coinset currentcoinset; 
	/**constructor that initializes the values*/
	public VendingMachine() {
		products=new ArrayList<Product>();
		productType =new ArrayList<Product>();
		coins=new Coinset();
		currentcoinset=new Coinset(); 
	}
	/**Overloaded constructor
	 * @param products 
	 * @param productType
	 * @param coins
	 * @param currentcoinset
	 */
	public VendingMachine(ArrayList<Product> products,ArrayList<Product> productType,Coinset coins,Coinset currentcoinset) {
		this.products=products;
		this.productType=productType;
		this.coins=coins;
		this.currentcoinset=currentcoinset;
	}
	/**method that assigns new value to coins
	 * @param coins
	 */
	public void setcoins(Coinset coins) {
		this.coins=coins;
	}
	/**method that assigns new value to currentcoinset
	 * @param currentcoinset
	 */
	public void setcurrentcoinset(Coinset currentcoinset) {
		this.currentcoinset=currentcoinset;
	}
	/**method that assigns new Array of products to products 
	 * @param products
	 */
	public void setProducts(ArrayList<Product> products) {
		this.products=products;
	}
	/**method that assigns new Array of productType to productType
	 * @param productType
	 */
	public void setproductType(ArrayList<Product> productType) {
		this.productType=productType;
	}
	/**method that is used to get the productType array
	 * @return poductType
	 */
	public ArrayList<Product> getproductType() {
		return productType;
	}
	/**method that is used to get the products array
	 * @return products
	 */
	public ArrayList<Product> getProducts() {
		return products;
	} 
	/**method that is used to get the coins
	 * @return coins
	 */
	public Coinset getCoins() {
		return coins;
	}
	/**method that is used to get the current coin set
	 * @return current coinset
	 */
	public Coinset getcurrentcoinset() {
		return currentcoinset;
	}
	/**method that takes the coin and stores its value in a array list
	 * @param c coin that the customer inserts
	 */
	public void coin (Coin c) {
		currentcoinset.addCoin(c);
		//coins.addCoin(c);
	}
	/**method that adds the product the into the array list which keeps track of products in the vending machine
	 * @param p product
	 * @param quantity
	 */
	public void addProduct(Product p,int quantity) {
		for(int i=0;i<quantity;i++) {
			products.add(p);
		}
		for(Product pro:productType) {
			if(pro.equals(p)) {
				return;
			}
		}
		productType.add(p);
	}
	/**method that removes all the coins in the vending machine*/
	public void removeCoins() {
		System.out.println("Removed: $"+coins.getVal());
		coins.removeAll();
	}
	
	/**method that shows the products in the vending machine*/
	public void showProducts() {
		if(productType.isEmpty()) {
			System.out.println("Vending machine is Empty :(");
		}
		else {
			for (int i=0;i<productType.size();i++) {
				System.out.println(productType.get(i).toString());
			}
		}
	}
	/**method that returns the product that the customer wishes to buy
	 * @param index the option that the customer chose
	 */
	public void buyProduct(int index) {
		Product p=(Product) productType.get(index);
		if(products.contains(p)) {
			if(p.getprice()<=currentcoinset.getVal()) {
				products.remove(p);
				coins.addCoins(currentcoinset);
				currentcoinset.removeAll();
				System.out.println("\n Purchased: "+p.toString());
			}
			else {
				System.out.println("Insufficient money");
			}
		}
		else {
			System.out.println("Product out of stock :(");
			System.out.println("Amount retured: "+ currentcoinset.getVal());
			currentcoinset.removeAll();
		}
	}
}
