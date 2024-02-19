interface Printable {
	void print();
}

interface Showable {
	void print();
}

class TestInterface3 implements Printable, Showable {
	

	public static void main(String args[]) {
		TestInterface3 obj = new TestInterface3();
		obj.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("----------------------------------------s");
		
		
	}
}