
package ProductInventory;
import java.util.*;
public class Inventory {

	ArrayList<Chocolate> listChocolate=new ArrayList();
	ArrayList<Juice> listJuice=new ArrayList();
	ArrayList<Biscuit> listBiscuit=new ArrayList();
	ArrayList allProducts=new ArrayList();
	private static Inventory inv=new Inventory();
	
	private Inventory() {
		
	}
	
	public static Inventory getInstance() {
		if(inv==null) {
			Inventory inv=new Inventory();
		}
		return inv;
		
	}
	
	public void addChocolate(Chocolate c) {
		listChocolate.add(c);
	}
	public void addJuice(Juice j) {
		listJuice.add(j);
	}
	public void addBiscuit(Biscuit b) {
		listBiscuit.add(b);
	}
	public void removeChocolate(Chocolate c) {
		listChocolate.remove(c);
	}
	public void removeJuice(Juice j) {
		listJuice.remove(j);
	}
	public void removeBiscuit(Biscuit b) {
		listBiscuit.remove(b);
	}
	public void printChocolate() {
		listChocolate.forEach(System.out::println);
	}
	public void printJuice() {
		listJuice.forEach(System.out::println);
	}
	public void printBiscuit() {
		listBiscuit.forEach(System.out::println);
	}
	public void sumChocolate() {
		double sumC=0;
		Iterator<Chocolate> itr=listChocolate.iterator();
		while(itr.hasNext()) {
			Chocolate c=itr.next();
			sumC=sumC+c.price;
		}
		System.out.println("Total chocolate price: "+sumC);
	}
	public void sumJuice() {
		double sumJ=0;
		Iterator<Juice> it=listJuice.iterator();
		while(it.hasNext()) {
			Juice j=it.next();
			sumJ=sumJ+j.price;
		}
		System.out.println("Total juice price: "+sumJ);
	}
	public void sumBiscuit() {
		double sumB=0;
		Iterator<Biscuit> ite=listBiscuit.iterator();
		while(ite.hasNext()) {
			Biscuit b=ite.next();
			sumB=sumB+b.price;
		}
		System.out.println("Total biscuit price: "+sumB);
	}
	public void sumAll() {
		double sumA=0;
		Iterator<Biscuit> ite=listBiscuit.iterator();
		while(ite.hasNext()) {
			Biscuit b=ite.next();
			sumA=sumA+b.price;
		}
		
		Iterator<Juice> it=listJuice.iterator();
		while(it.hasNext()) {
			Juice j=it.next();
			sumA=sumA+j.price;
		}
		
		Iterator<Chocolate> itr=listChocolate.iterator();
		while(itr.hasNext()) {
			Chocolate c=itr.next();
			sumA=sumA+c.price;
		}
		
		
	}
	
}
