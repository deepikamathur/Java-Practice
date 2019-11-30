package CompositionExercise;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author = new Author("Ruskin Bond", "ruskinbond@gmail.com", 'm');
		System.out.println(author);

		Book book = new Book("Room on the roof", author, 20.32, 100); // Test Book's Constructor
		System.out.println(book); // Test Book's toString()

	}

}
