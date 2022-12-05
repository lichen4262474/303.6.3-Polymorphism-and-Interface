package polymorphismandinterface;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser sampleKid = new KidUser(10, "Kids");
		sampleKid.registerAccount();
		sampleKid.requestBook();
		sampleKid.setAge(18);
		sampleKid.setBookType("Fiction");
		sampleKid.registerAccount();
		sampleKid.requestBook();

		AdultUser sampleAdult = new AdultUser(5, "Kids");
		sampleAdult.registerAccount();
		sampleAdult.requestBook();
		sampleAdult.setAge(23);
		sampleAdult.setBookType("Fiction");
		sampleAdult.registerAccount();
		sampleAdult.requestBook();

	}

}
