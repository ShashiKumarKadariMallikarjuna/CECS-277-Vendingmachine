package assignmet4p4;
/**class that runs the vending machine
 * @author Shashi Kumar Kadari Mallikarjuna
 *@version Assignment 4 part 2
 *@since Due:10/15/18
 */
public class VendingMachineSimulation {
	public static void main(String[]args) {
	VendingMachine v=new VendingMachine();
	VendingMachineMenu vm=new VendingMachineMenu();
	vm.run(v);
	}
}
