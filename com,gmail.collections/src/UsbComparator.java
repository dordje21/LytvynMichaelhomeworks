import java.util.Comparator;

public class UsbComparator implements Comparator<UsbDriver> {
	public int compare(UsbDriver a, UsbDriver b) {
		if (a.razm < b.razm) {
			return -1;
		} else if (a.razm > b.razm) {
			return 1;
		} else {
			return 0;
		}
	}
}
