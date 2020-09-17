package mainSolutionForCheckout;
import mainSolutionForCheckout.*;

public class program {
	public static void main(String[] args) {
		checkoutKart ck = new checkoutKart();
		
		// When the cart is empty check the contents
		// This should throw an exception because the cart is empty
		try {
			ck.reviewCart();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("Checking promotion 1");
		ck.addItem("A", 3);
		try {
			ck.reviewCart();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
		Double totalPrice = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice);

		System.out.println("Checking promotion 2");
		ck.addItem("B", 2);
		try {
			ck.removeItem("A", 3);
			ck.reviewCart();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double totalPrice2 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice2);
		
		System.out.println("Checking promotion 1 & 2");
		ck.addItem("A", 3);
		try {
			ck.reviewCart();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		Double totalPrice3 = ck.calculateTotalPrice(ck.itemsListMap);
		System.out.println("Total Price: " + totalPrice3);
		
	}
}
