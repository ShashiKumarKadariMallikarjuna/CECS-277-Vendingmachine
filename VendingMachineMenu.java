package assignmet4p4;
import java.util.Scanner;
/**class that shows the vending machine menu
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 2
 *@since Due:10/15/18
 */
public class VendingMachineMenu {
	static Coin coins[]= {new Coin("nickel",0.05),new Coin("dime",0.1),new Coin("quarter",0.25),new Coin("dollar",1.0)};
	/**method that is responsible for the menu to work
	 * @param v vending machine object
	 */
	public void run(VendingMachine v) {
		String option="";
		Scanner sc=new Scanner(System.in);
		while(!option.equalsIgnoreCase("Q")) {
			System.out.println("S)how products  I)nsert coin  B)uy  A)dd product  R)emove coins  Q)uit");
			option=sc.next();
			if(option.equalsIgnoreCase("S")) {
				v.showProducts();
			}
			else if(option.equalsIgnoreCase("I")) {
				int x=65;
				for(int i=0;i<coins.length;i++) {
					System.out.println(((char)x++)  +") "+coins[i].getName()+" @ "+coins[i].getValue());
				}
				String op=sc.next().toLowerCase();
					if(op.equals("a")) {
						v.coin(coins[0]);
					}
					else if(op.equals("b")) {
						v.coin(coins[1]);
					}
					else if(op.equals("c")) {
						v.coin(coins[2]);
					}
					else if(op.equals("d")) {
						v.coin(coins[3]);
					}
					else
						System.out.println("Invalid option!!");
			}
			
			else if(option.equalsIgnoreCase("B")) {
				
				int x=65;
				for(int i=0;i<v.getproductType().size();i++) {
					System.out.println((char)(x++) +") "+v.getproductType().get(i).toString());
				}
				char op=sc.next().charAt(0);
				int opt=Character.toUpperCase(op)-65;
				v.buyProduct(opt);				
			}
			else if(option.equalsIgnoreCase("A")) {
				System.out.println("Description: ");
				String des=sc.next();
				System.out.println("Price: ");
				double price=sc.nextDouble();
				System.out.println("Quantity: ");
				int quantity=sc.nextInt();
				v.addProduct(new Product(des,price),quantity);
			}
			else if(option.equalsIgnoreCase("R")) {
				v.removeCoins();
				option="Q";
			}
			else if(option.equalsIgnoreCase("Q")) {
				option="Q";
			}
			else {
				System.out.println("Select the right option:");
			}
		}
		
	}
}
