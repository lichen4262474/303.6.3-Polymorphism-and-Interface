package polymorphismandinterface;

public class AdultUser implements LibraryUser {
	private int age;
	private String bookType;

	// constructor
	AdultUser() {
	}
	AdultUser(int age, String bookType) {
		this.age = age;
		this.bookType = bookType;
	}
	// setter and setter

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

	// methods
	@Override
	public void registerAccount() {
		if (this.getAge() >= 12) {
			System.out.println("You have successfully registered under an Adult Account");
		} else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}

	}
	@Override
	public void requestBook() {
		if (this.getBookType().equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		} else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}

	}

}
