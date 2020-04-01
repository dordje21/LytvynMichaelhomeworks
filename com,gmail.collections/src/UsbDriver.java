
public class UsbDriver {
	int razm;
	String name;
	
	public UsbDriver(int razm, String name) {
		super();
		this.razm = razm;
		this.name = name;
	}

	@Override
	public String toString() {
		return "UsbDriver" + razm + " Gb" + (name != null ? name : "no name");
	}
	
	

}
