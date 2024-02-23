package Question5.Exercise3;

/**
 * Hello world!
 *
 */
public class App {
	public static boolean checkOut(double cart, int creditRating, statusClass.Status status) {
		boolean approved = false;

		if (status == statusClass.Status.gold) {
			if (cart < 3_500.00)
				approved = true;
			else if (creditRating > 650)
				approved = true;
		} else {
			if (status == statusClass.Status.silver) {
				if (cart < 2_500.00)
					approved = true;
				else if (creditRating > 750)
					approved = true;
			} else {
				if (cart < 1_500.00)
					approved = true;
				else if (creditRating > 800)
					approved = true;
			}
		}

		return approved;
	}

}
