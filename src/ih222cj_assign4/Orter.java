package ih222cj_assign4;


public class Orter implements Comparable<Orter> {
	String name;
	int postCode;
	public Orter(String name, int postCode) {
		this.name = name;
		this.postCode = postCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	@Override
	public int compareTo(Orter ort) {
		return this.postCode-ort.getPostCode();
	}
	public String toString(){
		return name + " " +postCode;
	}
}

