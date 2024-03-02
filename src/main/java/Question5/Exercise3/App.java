package Question5.Exercise3;

/**
 * This class contains a method to check if a customer's purchase is approved
 * based on their cart total, credit rating, and membership status.
 */
public class App {
	/**
	 * Checks if a customer's purchase is approved based on their cart total, credit
	 * rating, and membership status.
	 *
	 * @param cart         The total amount of the customer's purchase.
	 * @param creditRating The credit rating of the customer.
	 * @param status       The membership status of the customer.
	 * @return True if the purchase is approved, false otherwise.
	 */
	public static boolean checkOut(double cart, int creditRating, StatusClass.Status status) {
		boolean approved = false;

		// Checking different scenarios based on the membership status
		if (status == StatusClass.Status.gold) {
			// If the status is gold, check if the cart total is below a certain threshold
			// or if the credit rating
			// is above a certain value to approve the purchase
			if (cart < 3_500.00)
				approved = true;
			else if (creditRating > 650)
				approved = true;
		} else {
			if (status == StatusClass.Status.silver) {
				// If the status is silver, check if the cart total is below a certain threshold
				// or if the credit rating
				// is above a certain value to approve the purchase
				if (cart < 2_500.00)
					approved = true;
				else if (creditRating > 750)
					approved = true;
			} else {
				// If the status is neither gold nor silver (presumably bronze), check if the
				// cart total is below
				// a certain threshold or if the credit rating is above a certain value to
				// approve the purchase
				if (cart < 1_500.00)
					approved = true;
				else if (creditRating > 800)
					approved = true;
			}
		}

		return approved;
	}

}
