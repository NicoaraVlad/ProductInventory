package ProductInventory;
import java.util.*;
public class Main {

	private static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) {
		String decizion;
		double price;
		int id;
		double quantity;
	
		while(true) {
			System.out.println("Select the command: \n addChocolate \n addBiscuit  \n addJuice"
					+ "\n removeChocolate  \n removeBiscuit  \n removeJuice  \n sumChocolate  \n sumJuice  \n sumBiscuit"
					+ "\n exit");
			
			decizion=sc.nextLine();
			switch(decizion) {
			
			case("addChocolate"):
				Chocolate c=new Chocolate();
				System.out.println("Give the price:");
			price=sc.nextDouble(); sc.nextLine();
			c.setPrice(price);
			System.out.println("Give the id");
			id=sc.nextInt(); sc.nextLine();
			c.setId(id);
			System.out.println("Give the quantity");
			quantity=sc.nextDouble(); sc.nextLine();
			c.setQuantity(quantity);
			Inventory.getInstance().listChocolate.add(c);
			break;
			
			case("addJuice"):
				Juice j=new Juice();
			System.out.println("Give the price:");
		price=sc.nextDouble(); sc.nextLine();
		j.setPrice(price);
		System.out.println("Give the id");
		id=sc.nextInt(); sc.nextLine();
		j.setId(id);
		System.out.println("Give the quantity");
		quantity=sc.nextDouble(); sc.nextLine();
		j.setQuantity(quantity);
		Inventory.getInstance().listJuice.add(j);
		break;
		
			case("addBiscuit"):
				Biscuit b=new Biscuit();
			System.out.println("Give the price:");
		price=sc.nextDouble(); sc.nextLine();
		b.setPrice(price);
		System.out.println("Give the id");
		id=sc.nextInt(); sc.nextLine();
		b.setId(id);
		System.out.println("Give the quantity");
		quantity=sc.nextDouble(); sc.nextLine();
		b.setQuantity(quantity);
		Inventory.getInstance().listBiscuit.add(b);
		break;
		
			case("sumChocolate"):
				Inventory.getInstance().sumChocolate();
			break;
			
			case("sumBiscuit"):
				Inventory.getInstance().sumBiscuit();
			break;
			
			case("sumJuice"):
				Inventory.getInstance().sumJuice();
			break;
			
			case("sumAll"):
				Inventory.getInstance().sumAll();
			
			case("exit"):
				return;
			}
	}
}
}
