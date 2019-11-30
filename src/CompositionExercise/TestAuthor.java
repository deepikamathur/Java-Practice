package CompositionExercise;

public class TestAuthor {

	public static void main(String[] args) {

		Author author = new Author("J. K. Rowling", "J.K.Rowling@gmail.com", 'e');
		System.out.println(author);
		author.setEmail("sdfdsfsdf@nowhere.com");
		System.out.println("name is: " + author.getName());
		System.out.println("eamil is: " + author.getEmail());
		System.out.println("gender is: " + author.getGender());
	}

}
