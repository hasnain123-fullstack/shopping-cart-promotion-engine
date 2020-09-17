package testsForSolutionForCheckout;
import mainSolutionForCheckout.*;

public class program {
	public static void main(String[] args){
		// Test case secnario b
		checkoutKart ck = new checkoutKart();
		ck.addItem("A", 5);
		ck.addItem("B", 5);
		ck.addItem("C", 1);
		if(ck.calculateTotalPrice(ck.itemsListMap) == 370.0) System.out.println("Senario B Passed");
		else System.out.println("Senario B Failed");
		System.out.println("total B:" +ck.calculateTotalPrice(ck.itemsListMap));
		
		// Test case secnario a
		try {
			ck.removeItem("A", 4);
			ck.removeItem("B", 4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(ck.calculateTotalPrice(ck.itemsListMap) == 100.0) System.out.println("Senario A Passed");
		else System.out.println("Senario A Failed");
		System.out.println("total A:" +ck.calculateTotalPrice(ck.itemsListMap));
		
		// Test case secnario c
		try {
				ck.addItem("A", 2);
				ck.addItem("B", 4);
				ck.addItem("D", 1);
		} catch (Exception e) {
				e.printStackTrace();
		}
		if(ck.calculateTotalPrice(ck.itemsListMap) == 280.0) System.out.println("Senario C Passed");
		else System.out.println("Senario C Failed");
		System.out.println("total C:" +ck.calculateTotalPrice(ck.itemsListMap));
	}
}
