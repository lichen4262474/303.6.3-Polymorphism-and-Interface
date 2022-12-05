package polymorphismandinterface;

public class KidUser implements LibraryUser {
	// field
	private int age;
	private String bookType;

	// constructor
	KidUser() {
	}
	KidUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	// setter and getter

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	// method
	@Override
	public void requestBook() {
		if (this.getBookType().equals("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

	@Override
	public void registerAccount() {
		if (this.getAge() <= 11) {
			System.out.println("You have successfully registered under a Kids Account");
		} else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

}
