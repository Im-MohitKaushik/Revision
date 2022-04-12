package sprint1Day4;

public class sutudant {

	private int roll;
	private String name;
	private String address;
	private String collageName;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public static sutudant getStudent(boolean isFromNIT) {
		sutudant s1 = new sutudant();

		if (isFromNIT == true) {
			s1.setName("ankit");
			s1.setCollageName("NIT");
			s1.setRoll(12);
			System.out.println("name is : " + s1.getName());
			System.out.println("roll no is : " + s1.getRoll());
			System.out.println("college is : " + s1.getCollageName());
			System.out.println("--------------------------------------------------------------");
		} else {
			s1.setName("ankur");
			s1.setCollageName("NOT NIT");
			s1.setRoll(19);
			s1.setAddress("MADHUVAN COLONY");
			System.out.println("name is " + s1.getName());
			System.out.println("roll no is : " + s1.getRoll());
			System.out.println("college is : " + s1.getCollageName());
			System.out.println("address is : " + s1.getAddress());
			System.out.println("--------------------------------------------------------------");
		}

		return s1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getStudent(true);
		getStudent(false);

	}

}
